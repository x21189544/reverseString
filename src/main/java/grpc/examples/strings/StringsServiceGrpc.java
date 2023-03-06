package grpc.examples.strings;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: strings.proto")
public final class StringsServiceGrpc {

  private StringsServiceGrpc() {}

  public static final String SERVICE_NAME = "strings.StringsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.examples.strings.StringRequest,
      grpc.examples.strings.StringResponse> getReverseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reverse",
      requestType = grpc.examples.strings.StringRequest.class,
      responseType = grpc.examples.strings.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.examples.strings.StringRequest,
      grpc.examples.strings.StringResponse> getReverseMethod() {
    io.grpc.MethodDescriptor<grpc.examples.strings.StringRequest, grpc.examples.strings.StringResponse> getReverseMethod;
    if ((getReverseMethod = StringsServiceGrpc.getReverseMethod) == null) {
      synchronized (StringsServiceGrpc.class) {
        if ((getReverseMethod = StringsServiceGrpc.getReverseMethod) == null) {
          StringsServiceGrpc.getReverseMethod = getReverseMethod = 
              io.grpc.MethodDescriptor.<grpc.examples.strings.StringRequest, grpc.examples.strings.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "strings.StringsService", "reverse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.strings.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.strings.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StringsServiceMethodDescriptorSupplier("reverse"))
                  .build();
          }
        }
     }
     return getReverseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.examples.strings.Message,
      grpc.examples.strings.Empty> getEmptyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "empty",
      requestType = grpc.examples.strings.Message.class,
      responseType = grpc.examples.strings.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.examples.strings.Message,
      grpc.examples.strings.Empty> getEmptyMethod() {
    io.grpc.MethodDescriptor<grpc.examples.strings.Message, grpc.examples.strings.Empty> getEmptyMethod;
    if ((getEmptyMethod = StringsServiceGrpc.getEmptyMethod) == null) {
      synchronized (StringsServiceGrpc.class) {
        if ((getEmptyMethod = StringsServiceGrpc.getEmptyMethod) == null) {
          StringsServiceGrpc.getEmptyMethod = getEmptyMethod = 
              io.grpc.MethodDescriptor.<grpc.examples.strings.Message, grpc.examples.strings.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "strings.StringsService", "empty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.strings.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.strings.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new StringsServiceMethodDescriptorSupplier("empty"))
                  .build();
          }
        }
     }
     return getEmptyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.examples.strings.StringRequest,
      grpc.examples.strings.StringResponse> getReverseStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reverseStream",
      requestType = grpc.examples.strings.StringRequest.class,
      responseType = grpc.examples.strings.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.examples.strings.StringRequest,
      grpc.examples.strings.StringResponse> getReverseStreamMethod() {
    io.grpc.MethodDescriptor<grpc.examples.strings.StringRequest, grpc.examples.strings.StringResponse> getReverseStreamMethod;
    if ((getReverseStreamMethod = StringsServiceGrpc.getReverseStreamMethod) == null) {
      synchronized (StringsServiceGrpc.class) {
        if ((getReverseStreamMethod = StringsServiceGrpc.getReverseStreamMethod) == null) {
          StringsServiceGrpc.getReverseStreamMethod = getReverseStreamMethod = 
              io.grpc.MethodDescriptor.<grpc.examples.strings.StringRequest, grpc.examples.strings.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "strings.StringsService", "reverseStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.strings.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.strings.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StringsServiceMethodDescriptorSupplier("reverseStream"))
                  .build();
          }
        }
     }
     return getReverseStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.examples.strings.StringRequest,
      grpc.examples.strings.LengthResponse> getLengthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "length",
      requestType = grpc.examples.strings.StringRequest.class,
      responseType = grpc.examples.strings.LengthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.examples.strings.StringRequest,
      grpc.examples.strings.LengthResponse> getLengthMethod() {
    io.grpc.MethodDescriptor<grpc.examples.strings.StringRequest, grpc.examples.strings.LengthResponse> getLengthMethod;
    if ((getLengthMethod = StringsServiceGrpc.getLengthMethod) == null) {
      synchronized (StringsServiceGrpc.class) {
        if ((getLengthMethod = StringsServiceGrpc.getLengthMethod) == null) {
          StringsServiceGrpc.getLengthMethod = getLengthMethod = 
              io.grpc.MethodDescriptor.<grpc.examples.strings.StringRequest, grpc.examples.strings.LengthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "strings.StringsService", "length"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.strings.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.strings.LengthResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StringsServiceMethodDescriptorSupplier("length"))
                  .build();
          }
        }
     }
     return getLengthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.examples.strings.StringRequest,
      grpc.examples.strings.StringResponse> getSplitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "split",
      requestType = grpc.examples.strings.StringRequest.class,
      responseType = grpc.examples.strings.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.examples.strings.StringRequest,
      grpc.examples.strings.StringResponse> getSplitMethod() {
    io.grpc.MethodDescriptor<grpc.examples.strings.StringRequest, grpc.examples.strings.StringResponse> getSplitMethod;
    if ((getSplitMethod = StringsServiceGrpc.getSplitMethod) == null) {
      synchronized (StringsServiceGrpc.class) {
        if ((getSplitMethod = StringsServiceGrpc.getSplitMethod) == null) {
          StringsServiceGrpc.getSplitMethod = getSplitMethod = 
              io.grpc.MethodDescriptor.<grpc.examples.strings.StringRequest, grpc.examples.strings.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "strings.StringsService", "split"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.strings.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.strings.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StringsServiceMethodDescriptorSupplier("split"))
                  .build();
          }
        }
     }
     return getSplitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StringsServiceStub newStub(io.grpc.Channel channel) {
    return new StringsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StringsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StringsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StringsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StringsServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class StringsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void reverse(grpc.examples.strings.StringRequest request,
        io.grpc.stub.StreamObserver<grpc.examples.strings.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReverseMethod(), responseObserver);
    }

    /**
     */
    public void empty(grpc.examples.strings.Message request,
        io.grpc.stub.StreamObserver<grpc.examples.strings.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEmptyMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.examples.strings.StringRequest> reverseStream(
        io.grpc.stub.StreamObserver<grpc.examples.strings.StringResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getReverseStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.examples.strings.StringRequest> length(
        io.grpc.stub.StreamObserver<grpc.examples.strings.LengthResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLengthMethod(), responseObserver);
    }

    /**
     */
    public void split(grpc.examples.strings.StringRequest request,
        io.grpc.stub.StreamObserver<grpc.examples.strings.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSplitMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReverseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.examples.strings.StringRequest,
                grpc.examples.strings.StringResponse>(
                  this, METHODID_REVERSE)))
          .addMethod(
            getEmptyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.examples.strings.Message,
                grpc.examples.strings.Empty>(
                  this, METHODID_EMPTY)))
          .addMethod(
            getReverseStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.examples.strings.StringRequest,
                grpc.examples.strings.StringResponse>(
                  this, METHODID_REVERSE_STREAM)))
          .addMethod(
            getLengthMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.examples.strings.StringRequest,
                grpc.examples.strings.LengthResponse>(
                  this, METHODID_LENGTH)))
          .addMethod(
            getSplitMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.examples.strings.StringRequest,
                grpc.examples.strings.StringResponse>(
                  this, METHODID_SPLIT)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class StringsServiceStub extends io.grpc.stub.AbstractStub<StringsServiceStub> {
    private StringsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StringsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StringsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StringsServiceStub(channel, callOptions);
    }

    /**
     */
    public void reverse(grpc.examples.strings.StringRequest request,
        io.grpc.stub.StreamObserver<grpc.examples.strings.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReverseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void empty(grpc.examples.strings.Message request,
        io.grpc.stub.StreamObserver<grpc.examples.strings.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.examples.strings.StringRequest> reverseStream(
        io.grpc.stub.StreamObserver<grpc.examples.strings.StringResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getReverseStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.examples.strings.StringRequest> length(
        io.grpc.stub.StreamObserver<grpc.examples.strings.LengthResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getLengthMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void split(grpc.examples.strings.StringRequest request,
        io.grpc.stub.StreamObserver<grpc.examples.strings.StringResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSplitMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class StringsServiceBlockingStub extends io.grpc.stub.AbstractStub<StringsServiceBlockingStub> {
    private StringsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StringsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StringsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StringsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.examples.strings.StringResponse reverse(grpc.examples.strings.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getReverseMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.examples.strings.Empty empty(grpc.examples.strings.Message request) {
      return blockingUnaryCall(
          getChannel(), getEmptyMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<grpc.examples.strings.StringResponse> split(
        grpc.examples.strings.StringRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSplitMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class StringsServiceFutureStub extends io.grpc.stub.AbstractStub<StringsServiceFutureStub> {
    private StringsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StringsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StringsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StringsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.examples.strings.StringResponse> reverse(
        grpc.examples.strings.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReverseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.examples.strings.Empty> empty(
        grpc.examples.strings.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REVERSE = 0;
  private static final int METHODID_EMPTY = 1;
  private static final int METHODID_SPLIT = 2;
  private static final int METHODID_REVERSE_STREAM = 3;
  private static final int METHODID_LENGTH = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StringsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StringsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REVERSE:
          serviceImpl.reverse((grpc.examples.strings.StringRequest) request,
              (io.grpc.stub.StreamObserver<grpc.examples.strings.StringResponse>) responseObserver);
          break;
        case METHODID_EMPTY:
          serviceImpl.empty((grpc.examples.strings.Message) request,
              (io.grpc.stub.StreamObserver<grpc.examples.strings.Empty>) responseObserver);
          break;
        case METHODID_SPLIT:
          serviceImpl.split((grpc.examples.strings.StringRequest) request,
              (io.grpc.stub.StreamObserver<grpc.examples.strings.StringResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REVERSE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.reverseStream(
              (io.grpc.stub.StreamObserver<grpc.examples.strings.StringResponse>) responseObserver);
        case METHODID_LENGTH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.length(
              (io.grpc.stub.StreamObserver<grpc.examples.strings.LengthResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StringsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StringsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.examples.strings.StringsServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StringsService");
    }
  }

  private static final class StringsServiceFileDescriptorSupplier
      extends StringsServiceBaseDescriptorSupplier {
    StringsServiceFileDescriptorSupplier() {}
  }

  private static final class StringsServiceMethodDescriptorSupplier
      extends StringsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StringsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StringsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StringsServiceFileDescriptorSupplier())
              .addMethod(getReverseMethod())
              .addMethod(getEmptyMethod())
              .addMethod(getReverseStreamMethod())
              .addMethod(getLengthMethod())
              .addMethod(getSplitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
