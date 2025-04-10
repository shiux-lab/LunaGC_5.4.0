// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MarkMapReq.proto

package emu.grasscutter.net.proto;

public final class MarkMapReqOuterClass {
  private MarkMapReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MarkMapReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MarkMapReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MapMarkPoint mark = 5;</code>
     * @return Whether the mark field is set.
     */
    boolean hasMark();
    /**
     * <code>.MapMarkPoint mark = 5;</code>
     * @return The mark.
     */
    emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint getMark();
    /**
     * <code>.MapMarkPoint mark = 5;</code>
     */
    emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder getMarkOrBuilder();

    /**
     * <code>.MapMarkPoint old = 9;</code>
     * @return Whether the old field is set.
     */
    boolean hasOld();
    /**
     * <code>.MapMarkPoint old = 9;</code>
     * @return The old.
     */
    emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint getOld();
    /**
     * <code>.MapMarkPoint old = 9;</code>
     */
    emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder getOldOrBuilder();

    /**
     * <code>.MarkMapReq.Operation op = 6;</code>
     * @return The enum numeric value on the wire for op.
     */
    int getOpValue();
    /**
     * <code>.MarkMapReq.Operation op = 6;</code>
     * @return The op.
     */
    emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.Operation getOp();
  }
  /**
   * Protobuf type {@code MarkMapReq}
   */
  public static final class MarkMapReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MarkMapReq)
      MarkMapReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MarkMapReq.newBuilder() to construct.
    private MarkMapReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MarkMapReq() {
      op_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MarkMapReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MarkMapReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 42: {
              emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.Builder subBuilder = null;
              if (mark_ != null) {
                subBuilder = mark_.toBuilder();
              }
              mark_ = input.readMessage(emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(mark_);
                mark_ = subBuilder.buildPartial();
              }

              break;
            }
            case 48: {
              int rawValue = input.readEnum();

              op_ = rawValue;
              break;
            }
            case 74: {
              emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.Builder subBuilder = null;
              if (old_ != null) {
                subBuilder = old_.toBuilder();
              }
              old_ = input.readMessage(emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(old_);
                old_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MarkMapReqOuterClass.internal_static_MarkMapReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MarkMapReqOuterClass.internal_static_MarkMapReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.class, emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.Builder.class);
    }

    /**
     * Protobuf enum {@code MarkMapReq.Operation}
     */
    public enum Operation
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>OPERATION_ADD = 0;</code>
       */
      OPERATION_ADD(0),
      /**
       * <code>OPERATION_MOD = 1;</code>
       */
      OPERATION_MOD(1),
      /**
       * <code>OPERATION_DEL = 2;</code>
       */
      OPERATION_DEL(2),
      /**
       * <code>OPERATION_GET = 3;</code>
       */
      OPERATION_GET(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>OPERATION_ADD = 0;</code>
       */
      public static final int OPERATION_ADD_VALUE = 0;
      /**
       * <code>OPERATION_MOD = 1;</code>
       */
      public static final int OPERATION_MOD_VALUE = 1;
      /**
       * <code>OPERATION_DEL = 2;</code>
       */
      public static final int OPERATION_DEL_VALUE = 2;
      /**
       * <code>OPERATION_GET = 3;</code>
       */
      public static final int OPERATION_GET_VALUE = 3;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Operation valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Operation forNumber(int value) {
        switch (value) {
          case 0: return OPERATION_ADD;
          case 1: return OPERATION_MOD;
          case 2: return OPERATION_DEL;
          case 3: return OPERATION_GET;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Operation>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Operation> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Operation>() {
              public Operation findValueByNumber(int number) {
                return Operation.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final Operation[] VALUES = values();

      public static Operation valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Operation(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:MarkMapReq.Operation)
    }

    public static final int MARK_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint mark_;
    /**
     * <code>.MapMarkPoint mark = 5;</code>
     * @return Whether the mark field is set.
     */
    @java.lang.Override
    public boolean hasMark() {
      return mark_ != null;
    }
    /**
     * <code>.MapMarkPoint mark = 5;</code>
     * @return The mark.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint getMark() {
      return mark_ == null ? emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : mark_;
    }
    /**
     * <code>.MapMarkPoint mark = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder getMarkOrBuilder() {
      return getMark();
    }

    public static final int OLD_FIELD_NUMBER = 9;
    private emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint old_;
    /**
     * <code>.MapMarkPoint old = 9;</code>
     * @return Whether the old field is set.
     */
    @java.lang.Override
    public boolean hasOld() {
      return old_ != null;
    }
    /**
     * <code>.MapMarkPoint old = 9;</code>
     * @return The old.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint getOld() {
      return old_ == null ? emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : old_;
    }
    /**
     * <code>.MapMarkPoint old = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder getOldOrBuilder() {
      return getOld();
    }

    public static final int OP_FIELD_NUMBER = 6;
    private int op_;
    /**
     * <code>.MarkMapReq.Operation op = 6;</code>
     * @return The enum numeric value on the wire for op.
     */
    @java.lang.Override public int getOpValue() {
      return op_;
    }
    /**
     * <code>.MarkMapReq.Operation op = 6;</code>
     * @return The op.
     */
    @java.lang.Override public emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.Operation getOp() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.Operation result = emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.Operation.valueOf(op_);
      return result == null ? emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.Operation.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (mark_ != null) {
        output.writeMessage(5, getMark());
      }
      if (op_ != emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.Operation.OPERATION_ADD.getNumber()) {
        output.writeEnum(6, op_);
      }
      if (old_ != null) {
        output.writeMessage(9, getOld());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mark_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getMark());
      }
      if (op_ != emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.Operation.OPERATION_ADD.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, op_);
      }
      if (old_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getOld());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq other = (emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq) obj;

      if (hasMark() != other.hasMark()) return false;
      if (hasMark()) {
        if (!getMark()
            .equals(other.getMark())) return false;
      }
      if (hasOld() != other.hasOld()) return false;
      if (hasOld()) {
        if (!getOld()
            .equals(other.getOld())) return false;
      }
      if (op_ != other.op_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMark()) {
        hash = (37 * hash) + MARK_FIELD_NUMBER;
        hash = (53 * hash) + getMark().hashCode();
      }
      if (hasOld()) {
        hash = (37 * hash) + OLD_FIELD_NUMBER;
        hash = (53 * hash) + getOld().hashCode();
      }
      hash = (37 * hash) + OP_FIELD_NUMBER;
      hash = (53 * hash) + op_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MarkMapReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MarkMapReq)
        emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MarkMapReqOuterClass.internal_static_MarkMapReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MarkMapReqOuterClass.internal_static_MarkMapReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.class, emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (markBuilder_ == null) {
          mark_ = null;
        } else {
          mark_ = null;
          markBuilder_ = null;
        }
        if (oldBuilder_ == null) {
          old_ = null;
        } else {
          old_ = null;
          oldBuilder_ = null;
        }
        op_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MarkMapReqOuterClass.internal_static_MarkMapReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq build() {
        emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq buildPartial() {
        emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq result = new emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq(this);
        if (markBuilder_ == null) {
          result.mark_ = mark_;
        } else {
          result.mark_ = markBuilder_.build();
        }
        if (oldBuilder_ == null) {
          result.old_ = old_;
        } else {
          result.old_ = oldBuilder_.build();
        }
        result.op_ = op_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq) {
          return mergeFrom((emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq other) {
        if (other == emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.getDefaultInstance()) return this;
        if (other.hasMark()) {
          mergeMark(other.getMark());
        }
        if (other.hasOld()) {
          mergeOld(other.getOld());
        }
        if (other.op_ != 0) {
          setOpValue(other.getOpValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint mark_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint, emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.Builder, emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder> markBuilder_;
      /**
       * <code>.MapMarkPoint mark = 5;</code>
       * @return Whether the mark field is set.
       */
      public boolean hasMark() {
        return markBuilder_ != null || mark_ != null;
      }
      /**
       * <code>.MapMarkPoint mark = 5;</code>
       * @return The mark.
       */
      public emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint getMark() {
        if (markBuilder_ == null) {
          return mark_ == null ? emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : mark_;
        } else {
          return markBuilder_.getMessage();
        }
      }
      /**
       * <code>.MapMarkPoint mark = 5;</code>
       */
      public Builder setMark(emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint value) {
        if (markBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          mark_ = value;
          onChanged();
        } else {
          markBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MapMarkPoint mark = 5;</code>
       */
      public Builder setMark(
          emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.Builder builderForValue) {
        if (markBuilder_ == null) {
          mark_ = builderForValue.build();
          onChanged();
        } else {
          markBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MapMarkPoint mark = 5;</code>
       */
      public Builder mergeMark(emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint value) {
        if (markBuilder_ == null) {
          if (mark_ != null) {
            mark_ =
              emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.newBuilder(mark_).mergeFrom(value).buildPartial();
          } else {
            mark_ = value;
          }
          onChanged();
        } else {
          markBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MapMarkPoint mark = 5;</code>
       */
      public Builder clearMark() {
        if (markBuilder_ == null) {
          mark_ = null;
          onChanged();
        } else {
          mark_ = null;
          markBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MapMarkPoint mark = 5;</code>
       */
      public emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.Builder getMarkBuilder() {
        
        onChanged();
        return getMarkFieldBuilder().getBuilder();
      }
      /**
       * <code>.MapMarkPoint mark = 5;</code>
       */
      public emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder getMarkOrBuilder() {
        if (markBuilder_ != null) {
          return markBuilder_.getMessageOrBuilder();
        } else {
          return mark_ == null ?
              emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : mark_;
        }
      }
      /**
       * <code>.MapMarkPoint mark = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint, emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.Builder, emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder> 
          getMarkFieldBuilder() {
        if (markBuilder_ == null) {
          markBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint, emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.Builder, emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder>(
                  getMark(),
                  getParentForChildren(),
                  isClean());
          mark_ = null;
        }
        return markBuilder_;
      }

      private emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint old_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint, emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.Builder, emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder> oldBuilder_;
      /**
       * <code>.MapMarkPoint old = 9;</code>
       * @return Whether the old field is set.
       */
      public boolean hasOld() {
        return oldBuilder_ != null || old_ != null;
      }
      /**
       * <code>.MapMarkPoint old = 9;</code>
       * @return The old.
       */
      public emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint getOld() {
        if (oldBuilder_ == null) {
          return old_ == null ? emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : old_;
        } else {
          return oldBuilder_.getMessage();
        }
      }
      /**
       * <code>.MapMarkPoint old = 9;</code>
       */
      public Builder setOld(emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint value) {
        if (oldBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          old_ = value;
          onChanged();
        } else {
          oldBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MapMarkPoint old = 9;</code>
       */
      public Builder setOld(
          emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.Builder builderForValue) {
        if (oldBuilder_ == null) {
          old_ = builderForValue.build();
          onChanged();
        } else {
          oldBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MapMarkPoint old = 9;</code>
       */
      public Builder mergeOld(emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint value) {
        if (oldBuilder_ == null) {
          if (old_ != null) {
            old_ =
              emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.newBuilder(old_).mergeFrom(value).buildPartial();
          } else {
            old_ = value;
          }
          onChanged();
        } else {
          oldBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MapMarkPoint old = 9;</code>
       */
      public Builder clearOld() {
        if (oldBuilder_ == null) {
          old_ = null;
          onChanged();
        } else {
          old_ = null;
          oldBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MapMarkPoint old = 9;</code>
       */
      public emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.Builder getOldBuilder() {
        
        onChanged();
        return getOldFieldBuilder().getBuilder();
      }
      /**
       * <code>.MapMarkPoint old = 9;</code>
       */
      public emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder getOldOrBuilder() {
        if (oldBuilder_ != null) {
          return oldBuilder_.getMessageOrBuilder();
        } else {
          return old_ == null ?
              emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : old_;
        }
      }
      /**
       * <code>.MapMarkPoint old = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint, emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.Builder, emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder> 
          getOldFieldBuilder() {
        if (oldBuilder_ == null) {
          oldBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint, emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPoint.Builder, emu.grasscutter.net.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder>(
                  getOld(),
                  getParentForChildren(),
                  isClean());
          old_ = null;
        }
        return oldBuilder_;
      }

      private int op_ = 0;
      /**
       * <code>.MarkMapReq.Operation op = 6;</code>
       * @return The enum numeric value on the wire for op.
       */
      @java.lang.Override public int getOpValue() {
        return op_;
      }
      /**
       * <code>.MarkMapReq.Operation op = 6;</code>
       * @param value The enum numeric value on the wire for op to set.
       * @return This builder for chaining.
       */
      public Builder setOpValue(int value) {
        
        op_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MarkMapReq.Operation op = 6;</code>
       * @return The op.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.Operation getOp() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.Operation result = emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.Operation.valueOf(op_);
        return result == null ? emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.Operation.UNRECOGNIZED : result;
      }
      /**
       * <code>.MarkMapReq.Operation op = 6;</code>
       * @param value The op to set.
       * @return This builder for chaining.
       */
      public Builder setOp(emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq.Operation value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        op_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MarkMapReq.Operation op = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearOp() {
        
        op_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MarkMapReq)
    }

    // @@protoc_insertion_point(class_scope:MarkMapReq)
    private static final emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq();
    }

    public static emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MarkMapReq>
        PARSER = new com.google.protobuf.AbstractParser<MarkMapReq>() {
      @java.lang.Override
      public MarkMapReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MarkMapReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MarkMapReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MarkMapReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MarkMapReqOuterClass.MarkMapReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MarkMapReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MarkMapReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020MarkMapReq.proto\032\022MapMarkPoint.proto\"\301" +
      "\001\n\nMarkMapReq\022\033\n\004mark\030\005 \001(\0132\r.MapMarkPoi" +
      "nt\022\032\n\003old\030\t \001(\0132\r.MapMarkPoint\022!\n\002op\030\006 \001" +
      "(\0162\025.MarkMapReq.Operation\"W\n\tOperation\022\021" +
      "\n\rOPERATION_ADD\020\000\022\021\n\rOPERATION_MOD\020\001\022\021\n\r" +
      "OPERATION_DEL\020\002\022\021\n\rOPERATION_GET\020\003B\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MapMarkPointOuterClass.getDescriptor(),
        });
    internal_static_MarkMapReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MarkMapReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MarkMapReq_descriptor,
        new java.lang.String[] { "Mark", "Old", "Op", });
    emu.grasscutter.net.proto.MapMarkPointOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
