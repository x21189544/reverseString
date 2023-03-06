package grpc.examples.strings;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import grpc.examples.strings.Message.Enum;
import io.grpc.stub.StreamObserver;


public class StringClient {
	private static  Logger logger = Logger.getLogger(StringClient.class.getName());

	private static StringsServiceGrpc.StringsServiceBlockingStub blockingStub;
	private static StringsServiceGrpc.StringsServiceStub asyncStub;
	
	public static void main(String[] args) throws Exception {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = StringsServiceGrpc.newBlockingStub(channel);
		asyncStub = StringsServiceGrpc.newStub(channel);

		reverse();

		//empty(); 	//passing an empty message - no server reply, error message

		reverseStream();

		length();
		
	    //splitAsync();
		
	    split();
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);

	}

	//unary rpc
	public static void reverse() {

		StringRequest req = StringRequest.newBuilder().setVal("Hello").build();

		StringResponse response = blockingStub.reverse(req);

		System.out.println(response.getVal());
	}
	
	//bidrectional streaming
	public static void reverseStream() {
		StreamObserver<StringResponse> responseObserver =  new StreamObserver<StringResponse>() {
			public void onNext(StringResponse value) {
				System.out.println("received" +value.getVal());
			}
			public void onCompleted() {
				System.out.println("Server Completed the task");
			}
			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}
		};

		StreamObserver<StringRequest> requestObserver =  asyncStub.reverseStream(responseObserver);
		try {
			requestObserver.onNext(StringRequest.newBuilder().setVal("Hello").build());
			requestObserver.onNext(StringRequest.newBuilder().setVal("Divyaa").build());
			requestObserver.onNext(StringRequest.newBuilder().setVal("Welcome").build());
			requestObserver.onNext(StringRequest.newBuilder().setVal("To The").build());
			requestObserver.onNext(StringRequest.newBuilder().setVal("Class").build());
			
			System.out.println("SENDING MESSAGES");
			requestObserver.onCompleted();
			Thread.sleep(new Random().nextInt(1000)+500);
			
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	public static void length() {
		StreamObserver<LengthResponse> responseObserver =  new StreamObserver<LengthResponse>() {
			public void onNext(LengthResponse value) {
				System.out.println("received" +value.getLength());
			}
			public void onCompleted() {
				System.out.println("Server Completed the task");
			}
			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}
		};

		StreamObserver<StringRequest> requestObserver =  asyncStub.length(responseObserver);
		try {
			requestObserver.onNext(StringRequest.newBuilder().setVal("H").build());
			requestObserver.onNext(StringRequest.newBuilder().setVal("E").build());
			requestObserver.onNext(StringRequest.newBuilder().setVal("L").build());
			requestObserver.onNext(StringRequest.newBuilder().setVal("L").build());
			requestObserver.onNext(StringRequest.newBuilder().setVal("o").build());
			
			System.out.println("SENDING MESSAGES");
			requestObserver.onCompleted();
			Thread.sleep(new Random().nextInt(1000)+500);
			
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void split() {
		StringRequest request = StringRequest.newBuilder().setVal("DistributedSystems").build();
		try {
			Iterator<StringResponse> response = blockingStub.split(request);
			while(response.hasNext()) {
				StringResponse temp = response.next();
				System.out.println(temp.getVal());
			}
		}
		catch(StatusRuntimeException e) {
			e.printStackTrace();
		}
	}
}
