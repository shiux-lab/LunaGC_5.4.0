// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoopPoint.proto

package emu.grasscutter.net.proto;

public final class CoopPointOuterClass {
  private CoopPointOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoopPointOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CoopPoint)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 9;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>uint32 self_confidence = 11;</code>
     * @return The selfConfidence.
     */
    int getSelfConfidence();

    /**
     * <code>.CoopPoint.State state = 14;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.CoopPoint.State state = 14;</code>
     * @return The state.
     */
    emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.State getState();
  }
  /**
   * Protobuf type {@code CoopPoint}
   */
  public static final class CoopPoint extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoopPoint)
      CoopPointOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoopPoint.newBuilder() to construct.
    private CoopPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoopPoint() {
      state_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CoopPoint();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CoopPoint(
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
            case 72: {

              id_ = input.readUInt32();
              break;
            }
            case 88: {

              selfConfidence_ = input.readUInt32();
              break;
            }
            case 112: {
              int rawValue = input.readEnum();

              state_ = rawValue;
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
      return emu.grasscutter.net.proto.CoopPointOuterClass.internal_static_CoopPoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CoopPointOuterClass.internal_static_CoopPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.class, emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.Builder.class);
    }

    /**
     * Protobuf enum {@code CoopPoint.State}
     */
    public enum State
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>STATE_UNSTARTED = 0;</code>
       */
      STATE_UNSTARTED(0),
      /**
       * <code>STATE_STARTED = 1;</code>
       */
      STATE_STARTED(1),
      /**
       * <code>STATE_FINISHED = 2;</code>
       */
      STATE_FINISHED(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>STATE_UNSTARTED = 0;</code>
       */
      public static final int STATE_UNSTARTED_VALUE = 0;
      /**
       * <code>STATE_STARTED = 1;</code>
       */
      public static final int STATE_STARTED_VALUE = 1;
      /**
       * <code>STATE_FINISHED = 2;</code>
       */
      public static final int STATE_FINISHED_VALUE = 2;


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
      public static State valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static State forNumber(int value) {
        switch (value) {
          case 0: return STATE_UNSTARTED;
          case 1: return STATE_STARTED;
          case 2: return STATE_FINISHED;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<State>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          State> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<State>() {
              public State findValueByNumber(int number) {
                return State.forNumber(number);
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
        return emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.getDescriptor().getEnumTypes().get(0);
      }

      private static final State[] VALUES = values();

      public static State valueOf(
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

      private State(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:CoopPoint.State)
    }

    public static final int ID_FIELD_NUMBER = 9;
    private int id_;
    /**
     * <code>uint32 id = 9;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int SELF_CONFIDENCE_FIELD_NUMBER = 11;
    private int selfConfidence_;
    /**
     * <code>uint32 self_confidence = 11;</code>
     * @return The selfConfidence.
     */
    @java.lang.Override
    public int getSelfConfidence() {
      return selfConfidence_;
    }

    public static final int STATE_FIELD_NUMBER = 14;
    private int state_;
    /**
     * <code>.CoopPoint.State state = 14;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.CoopPoint.State state = 14;</code>
     * @return The state.
     */
    @java.lang.Override public emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.State getState() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.State result = emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.State.valueOf(state_);
      return result == null ? emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.State.UNRECOGNIZED : result;
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
      if (id_ != 0) {
        output.writeUInt32(9, id_);
      }
      if (selfConfidence_ != 0) {
        output.writeUInt32(11, selfConfidence_);
      }
      if (state_ != emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.State.STATE_UNSTARTED.getNumber()) {
        output.writeEnum(14, state_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, id_);
      }
      if (selfConfidence_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, selfConfidence_);
      }
      if (state_ != emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.State.STATE_UNSTARTED.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(14, state_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint other = (emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint) obj;

      if (getId()
          != other.getId()) return false;
      if (getSelfConfidence()
          != other.getSelfConfidence()) return false;
      if (state_ != other.state_) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + SELF_CONFIDENCE_FIELD_NUMBER;
      hash = (53 * hash) + getSelfConfidence();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint prototype) {
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
     * Protobuf type {@code CoopPoint}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CoopPoint)
        emu.grasscutter.net.proto.CoopPointOuterClass.CoopPointOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CoopPointOuterClass.internal_static_CoopPoint_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CoopPointOuterClass.internal_static_CoopPoint_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.class, emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.newBuilder()
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
        id_ = 0;

        selfConfidence_ = 0;

        state_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CoopPointOuterClass.internal_static_CoopPoint_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint build() {
        emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint buildPartial() {
        emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint result = new emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint(this);
        result.id_ = id_;
        result.selfConfidence_ = selfConfidence_;
        result.state_ = state_;
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
        if (other instanceof emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint) {
          return mergeFrom((emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint other) {
        if (other == emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getSelfConfidence() != 0) {
          setSelfConfidence(other.getSelfConfidence());
        }
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
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
        emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 9;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 9;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int selfConfidence_ ;
      /**
       * <code>uint32 self_confidence = 11;</code>
       * @return The selfConfidence.
       */
      @java.lang.Override
      public int getSelfConfidence() {
        return selfConfidence_;
      }
      /**
       * <code>uint32 self_confidence = 11;</code>
       * @param value The selfConfidence to set.
       * @return This builder for chaining.
       */
      public Builder setSelfConfidence(int value) {
        
        selfConfidence_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 self_confidence = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSelfConfidence() {
        
        selfConfidence_ = 0;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.CoopPoint.State state = 14;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.CoopPoint.State state = 14;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.CoopPoint.State state = 14;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.State getState() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.State result = emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.State.valueOf(state_);
        return result == null ? emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.State.UNRECOGNIZED : result;
      }
      /**
       * <code>.CoopPoint.State state = 14;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint.State value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.CoopPoint.State state = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CoopPoint)
    }

    // @@protoc_insertion_point(class_scope:CoopPoint)
    private static final emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint();
    }

    public static emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CoopPoint>
        PARSER = new com.google.protobuf.AbstractParser<CoopPoint>() {
      @java.lang.Override
      public CoopPoint parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CoopPoint(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CoopPoint> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoopPoint> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CoopPointOuterClass.CoopPoint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CoopPoint_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CoopPoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017CoopPoint.proto\"\226\001\n\tCoopPoint\022\n\n\002id\030\t " +
      "\001(\r\022\027\n\017self_confidence\030\013 \001(\r\022\037\n\005state\030\016 " +
      "\001(\0162\020.CoopPoint.State\"C\n\005State\022\023\n\017STATE_" +
      "UNSTARTED\020\000\022\021\n\rSTATE_STARTED\020\001\022\022\n\016STATE_" +
      "FINISHED\020\002B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CoopPoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CoopPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CoopPoint_descriptor,
        new java.lang.String[] { "Id", "SelfConfidence", "State", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
