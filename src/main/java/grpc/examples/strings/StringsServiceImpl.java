// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: strings.proto

package grpc.examples.strings;

public final class StringsServiceImpl {
  private StringsServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_strings_LengthResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_strings_LengthResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_strings_ReplaceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_strings_ReplaceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_strings_StringRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_strings_StringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_strings_MultiStringRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_strings_MultiStringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_strings_MultiMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_strings_MultiMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_strings_StringResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_strings_StringResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_strings_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_strings_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_strings_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_strings_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rstrings.proto\022\007strings\" \n\016LengthRespon" +
      "se\022\016\n\006length\030\001 \001(\005\",\n\016ReplaceRequest\022\014\n\004" +
      "text\030\001 \001(\t\022\014\n\004char\030\002 \001(\t\"\034\n\rStringReques" +
      "t\022\013\n\003val\030\001 \001(\t\"\"\n\022MultiStringRequest\022\014\n\004" +
      "text\030\001 \003(\t\"C\n\023MultiMessageRequest\022,\n\014mul" +
      "tirequest\030\001 \003(\0132\026.strings.StringRequest\"" +
      "\035\n\016StringResponse\022\013\n\003val\030\001 \001(\t\"X\n\007Messag" +
      "e\022%\n\006detail\030\001 \001(\0162\025.strings.Message.Enum" +
      "\"&\n\004Enum\022\013\n\007UNKNOWN\020\000\022\007\n\003LOW\020\001\022\010\n\004HIGH\020\002" +
      "\"\007\n\005Empty2\274\002\n\016StringsService\022<\n\007reverse\022" +
      "\026.strings.StringRequest\032\027.strings.String" +
      "Response\"\000\022+\n\005empty\022\020.strings.Message\032\016." +
      "strings.Empty\"\000\022F\n\rreverseStream\022\026.strin" +
      "gs.StringRequest\032\027.strings.StringRespons" +
      "e\"\000(\0010\001\022;\n\006length\022\026.strings.StringReques" +
      "t\032\027.strings.LengthResponse(\001\022:\n\005split\022\026." +
      "strings.StringRequest\032\027.strings.StringRe" +
      "sponse0\001B-\n\025grpc.examples.stringsB\022Strin" +
      "gsServiceImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_strings_LengthResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_strings_LengthResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_strings_LengthResponse_descriptor,
        new java.lang.String[] { "Length", });
    internal_static_strings_ReplaceRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_strings_ReplaceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_strings_ReplaceRequest_descriptor,
        new java.lang.String[] { "Text", "Char", });
    internal_static_strings_StringRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_strings_StringRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_strings_StringRequest_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_strings_MultiStringRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_strings_MultiStringRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_strings_MultiStringRequest_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_strings_MultiMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_strings_MultiMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_strings_MultiMessageRequest_descriptor,
        new java.lang.String[] { "Multirequest", });
    internal_static_strings_StringResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_strings_StringResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_strings_StringResponse_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_strings_Message_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_strings_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_strings_Message_descriptor,
        new java.lang.String[] { "Detail", });
    internal_static_strings_Empty_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_strings_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_strings_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
