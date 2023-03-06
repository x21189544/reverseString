package grpc.examples.strings;

import java.io.IOException;
import java.util.logging.Logger;

import grpc.examples.strings.StringsServiceGrpc.StringsServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ReverseServer extends StringsServiceImplBase{
	
	private static final Logger logger = Logger.getLogger(ReverseServer.class.getName());
	
	public static void main(String[] args) throws InterruptedException {
		
		ReverseServer reverseserver = new ReverseServer();
		
		int port = 50051;
		
		try {
			Server server = ServerBuilder.forPort(port).addService(reverseserver).build().start();
			System.out.println("server running on port: " + port);
			server.awaitTermination();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		logger.info("Server started, listening on " + port);
	}
	
	@Override
	public void reverse(StringRequest request, StreamObserver<StringResponse> responseObserver){
		//logic taken from https://www.w3schools.com/Java/java_howto_reverse_string.asp
		System.out.println("recieving request");
		System.out.println("Input from client: " + request.getVal());
		String originalStr = request.getVal();
		String reversedStr = "";
		
		for (int i = 0; i < originalStr.length(); i++) {
			  reversedStr = originalStr.charAt(i) + reversedStr;
			}
		System.out.println("result of logic to be passed to client: " + reversedStr);
		StringResponse reply = StringResponse.newBuilder().setVal(reversedStr).build();
		
		responseObserver.onNext(reply);
		
		responseObserver.onCompleted();
	}

}