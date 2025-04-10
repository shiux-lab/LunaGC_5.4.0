// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerPropNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerPropNotifyOuterClass {
  private PlayerPropNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerPropNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerPropNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
     */
    int getPropMapCount();
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
     */
    boolean containsPropMap(
        int key);
    /**
     * Use {@link #getPropMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
    getPropMap();
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
    getPropMapMap();
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
     */

    emu.grasscutter.net.proto.PropValueOuterClass.PropValue getPropMapOrDefault(
        int key,
        emu.grasscutter.net.proto.PropValueOuterClass.PropValue defaultValue);
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
     */

    emu.grasscutter.net.proto.PropValueOuterClass.PropValue getPropMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * CmdId: 5688
   * </pre>
   *
   * Protobuf type {@code PlayerPropNotify}
   */
  public static final class PlayerPropNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerPropNotify)
      PlayerPropNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerPropNotify.newBuilder() to construct.
    private PlayerPropNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerPropNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerPropNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerPropNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 90: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                propMap_ = com.google.protobuf.MapField.newMapField(
                    PropMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
              propMap__ = input.readMessage(
                  PropMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              propMap_.getMutableMap().put(
                  propMap__.getKey(), propMap__.getValue());
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
      return emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.internal_static_PlayerPropNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 11:
          return internalGetPropMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.internal_static_PlayerPropNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify.class, emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify.Builder.class);
    }

    public static final int PROP_MAP_FIELD_NUMBER = 11;
    private static final class PropMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>newDefaultInstance(
                  emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.internal_static_PlayerPropNotify_PropMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.PropValueOuterClass.PropValue.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> propMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
    internalGetPropMap() {
      if (propMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PropMapDefaultEntryHolder.defaultEntry);
      }
      return propMap_;
    }

    public int getPropMapCount() {
      return internalGetPropMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
     */

    @java.lang.Override
    public boolean containsPropMap(
        int key) {
      
      return internalGetPropMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPropMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> getPropMap() {
      return getPropMapMap();
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> getPropMapMap() {
      return internalGetPropMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.PropValueOuterClass.PropValue getPropMapOrDefault(
        int key,
        emu.grasscutter.net.proto.PropValueOuterClass.PropValue defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> map =
          internalGetPropMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.PropValueOuterClass.PropValue getPropMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> map =
          internalGetPropMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetPropMap(),
          PropMapDefaultEntryHolder.defaultEntry,
          11);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> entry
           : internalGetPropMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
        propMap__ = PropMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(11, propMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify other = (emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify) obj;

      if (!internalGetPropMap().equals(
          other.internalGetPropMap())) return false;
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
      if (!internalGetPropMap().getMap().isEmpty()) {
        hash = (37 * hash) + PROP_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetPropMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify prototype) {
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
     * <pre>
     * CmdId: 5688
     * </pre>
     *
     * Protobuf type {@code PlayerPropNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerPropNotify)
        emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.internal_static_PlayerPropNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 11:
            return internalGetPropMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 11:
            return internalGetMutablePropMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.internal_static_PlayerPropNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify.class, emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify.newBuilder()
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
        internalGetMutablePropMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.internal_static_PlayerPropNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify build() {
        emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify result = new emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify(this);
        int from_bitField0_ = bitField0_;
        result.propMap_ = internalGetPropMap();
        result.propMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify.getDefaultInstance()) return this;
        internalGetMutablePropMap().mergeFrom(
            other.internalGetPropMap());
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
        emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> propMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
      internalGetPropMap() {
        if (propMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              PropMapDefaultEntryHolder.defaultEntry);
        }
        return propMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
      internalGetMutablePropMap() {
        onChanged();;
        if (propMap_ == null) {
          propMap_ = com.google.protobuf.MapField.newMapField(
              PropMapDefaultEntryHolder.defaultEntry);
        }
        if (!propMap_.isMutable()) {
          propMap_ = propMap_.copy();
        }
        return propMap_;
      }

      public int getPropMapCount() {
        return internalGetPropMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
       */

      @java.lang.Override
      public boolean containsPropMap(
          int key) {
        
        return internalGetPropMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getPropMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> getPropMap() {
        return getPropMapMap();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> getPropMapMap() {
        return internalGetPropMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.PropValueOuterClass.PropValue getPropMapOrDefault(
          int key,
          emu.grasscutter.net.proto.PropValueOuterClass.PropValue defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> map =
            internalGetPropMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.PropValueOuterClass.PropValue getPropMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> map =
            internalGetPropMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearPropMap() {
        internalGetMutablePropMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
       */

      public Builder removePropMap(
          int key) {
        
        internalGetMutablePropMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
      getMutablePropMap() {
        return internalGetMutablePropMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
       */
      public Builder putPropMap(
          int key,
          emu.grasscutter.net.proto.PropValueOuterClass.PropValue value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutablePropMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 11;</code>
       */

      public Builder putAllPropMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> values) {
        internalGetMutablePropMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:PlayerPropNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerPropNotify)
    private static final emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify();
    }

    public static emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerPropNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerPropNotify>() {
      @java.lang.Override
      public PlayerPropNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerPropNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerPropNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerPropNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerPropNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerPropNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerPropNotify_PropMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerPropNotify_PropMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026PlayerPropNotify.proto\032\017PropValue.prot" +
      "o\"\200\001\n\020PlayerPropNotify\0220\n\010prop_map\030\013 \003(\013" +
      "2\036.PlayerPropNotify.PropMapEntry\032:\n\014Prop" +
      "MapEntry\022\013\n\003key\030\001 \001(\r\022\031\n\005value\030\002 \001(\0132\n.P" +
      "ropValue:\0028\001B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PropValueOuterClass.getDescriptor(),
        });
    internal_static_PlayerPropNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerPropNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerPropNotify_descriptor,
        new java.lang.String[] { "PropMap", });
    internal_static_PlayerPropNotify_PropMapEntry_descriptor =
      internal_static_PlayerPropNotify_descriptor.getNestedTypes().get(0);
    internal_static_PlayerPropNotify_PropMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerPropNotify_PropMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.PropValueOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
