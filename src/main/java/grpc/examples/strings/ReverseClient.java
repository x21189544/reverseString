package grpc.examples.strings;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import grpc.examples.strings.StringsServiceGrpc.StringsServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class ReverseClient{
	
	private static final Logger logger = Logger.getLogger(ReverseClient.class.getName());
	
	public static void main(String[] args) throws Exception {
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		StringsServiceBlockingStub blockingStub = StringsServiceGrpc.newBlockingStub(channel);
		
		ReverseClient client = new ReverseClient();
		
		try {
			String originalStr  = "David Scallan-Walsh";
			
			logger.info("Original String: " + originalStr);
			
			StringRequest request = StringRequest.newBuilder().setVal(originalStr).build();
			
			StringResponse response = blockingStub.reverse(request);
			
			logger.info("Reversing String: " + response.getVal());
			
		}
		catch(StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			
			return;
		}
		finally {
			//shutdown channel
			channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		}
				
	}
	
}