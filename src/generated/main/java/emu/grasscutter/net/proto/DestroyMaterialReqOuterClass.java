// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DestroyMaterialReq.proto

package emu.grasscutter.net.proto;

public final class DestroyMaterialReqOuterClass {
  private DestroyMaterialReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DestroyMaterialReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DestroyMaterialReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .MaterialInfo material_list = 7;</code>
     */
    java.util.List<emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo> 
        getMaterialListList();
    /**
     * <code>repeated .MaterialInfo material_list = 7;</code>
     */
    emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo getMaterialList(int index);
    /**
     * <code>repeated .MaterialInfo material_list = 7;</code>
     */
    int getMaterialListCount();
    /**
     * <code>repeated .MaterialInfo material_list = 7;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfoOrBuilder> 
        getMaterialListOrBuilderList();
    /**
     * <code>repeated .MaterialInfo material_list = 7;</code>
     */
    emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfoOrBuilder getMaterialListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code DestroyMaterialReq}
   */
  public static final class DestroyMaterialReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DestroyMaterialReq)
      DestroyMaterialReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DestroyMaterialReq.newBuilder() to construct.
    private DestroyMaterialReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DestroyMaterialReq() {
      materialList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DestroyMaterialReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DestroyMaterialReq(
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
            case 58: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                materialList_ = new java.util.ArrayList<emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              materialList_.add(
                  input.readMessage(emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          materialList_ = java.util.Collections.unmodifiableList(materialList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq.class, emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq.Builder.class);
    }

    public static final int MATERIAL_LIST_FIELD_NUMBER = 7;
    private java.util.List<emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo> materialList_;
    /**
     * <code>repeated .MaterialInfo material_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo> getMaterialListList() {
      return materialList_;
    }
    /**
     * <code>repeated .MaterialInfo material_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfoOrBuilder> 
        getMaterialListOrBuilderList() {
      return materialList_;
    }
    /**
     * <code>repeated .MaterialInfo material_list = 7;</code>
     */
    @java.lang.Override
    public int getMaterialListCount() {
      return materialList_.size();
    }
    /**
     * <code>repeated .MaterialInfo material_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo getMaterialList(int index) {
      return materialList_.get(index);
    }
    /**
     * <code>repeated .MaterialInfo material_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfoOrBuilder getMaterialListOrBuilder(
        int index) {
      return materialList_.get(index);
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
      for (int i = 0; i < materialList_.size(); i++) {
        output.writeMessage(7, materialList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < materialList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, materialList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq other = (emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq) obj;

      if (!getMaterialListList()
          .equals(other.getMaterialListList())) return false;
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
      if (getMaterialListCount() > 0) {
        hash = (37 * hash) + MATERIAL_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMaterialListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq prototype) {
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
     * Protobuf type {@code DestroyMaterialReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DestroyMaterialReq)
        emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq.class, emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq.newBuilder()
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
          getMaterialListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (materialListBuilder_ == null) {
          materialList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          materialListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq build() {
        emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq buildPartial() {
        emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq result = new emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq(this);
        int from_bitField0_ = bitField0_;
        if (materialListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            materialList_ = java.util.Collections.unmodifiableList(materialList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.materialList_ = materialList_;
        } else {
          result.materialList_ = materialListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq) {
          return mergeFrom((emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq other) {
        if (other == emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq.getDefaultInstance()) return this;
        if (materialListBuilder_ == null) {
          if (!other.materialList_.isEmpty()) {
            if (materialList_.isEmpty()) {
              materialList_ = other.materialList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMaterialListIsMutable();
              materialList_.addAll(other.materialList_);
            }
            onChanged();
          }
        } else {
          if (!other.materialList_.isEmpty()) {
            if (materialListBuilder_.isEmpty()) {
              materialListBuilder_.dispose();
              materialListBuilder_ = null;
              materialList_ = other.materialList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              materialListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMaterialListFieldBuilder() : null;
            } else {
              materialListBuilder_.addAllMessages(other.materialList_);
            }
          }
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
        emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo> materialList_ =
        java.util.Collections.emptyList();
      private void ensureMaterialListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          materialList_ = new java.util.ArrayList<emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo>(materialList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo, emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo.Builder, emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfoOrBuilder> materialListBuilder_;

      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo> getMaterialListList() {
        if (materialListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(materialList_);
        } else {
          return materialListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public int getMaterialListCount() {
        if (materialListBuilder_ == null) {
          return materialList_.size();
        } else {
          return materialListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo getMaterialList(int index) {
        if (materialListBuilder_ == null) {
          return materialList_.get(index);
        } else {
          return materialListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public Builder setMaterialList(
          int index, emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo value) {
        if (materialListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMaterialListIsMutable();
          materialList_.set(index, value);
          onChanged();
        } else {
          materialListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public Builder setMaterialList(
          int index, emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo.Builder builderForValue) {
        if (materialListBuilder_ == null) {
          ensureMaterialListIsMutable();
          materialList_.set(index, builderForValue.build());
          onChanged();
        } else {
          materialListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public Builder addMaterialList(emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo value) {
        if (materialListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMaterialListIsMutable();
          materialList_.add(value);
          onChanged();
        } else {
          materialListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public Builder addMaterialList(
          int index, emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo value) {
        if (materialListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMaterialListIsMutable();
          materialList_.add(index, value);
          onChanged();
        } else {
          materialListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public Builder addMaterialList(
          emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo.Builder builderForValue) {
        if (materialListBuilder_ == null) {
          ensureMaterialListIsMutable();
          materialList_.add(builderForValue.build());
          onChanged();
        } else {
          materialListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public Builder addMaterialList(
          int index, emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo.Builder builderForValue) {
        if (materialListBuilder_ == null) {
          ensureMaterialListIsMutable();
          materialList_.add(index, builderForValue.build());
          onChanged();
        } else {
          materialListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public Builder addAllMaterialList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo> values) {
        if (materialListBuilder_ == null) {
          ensureMaterialListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, materialList_);
          onChanged();
        } else {
          materialListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public Builder clearMaterialList() {
        if (materialListBuilder_ == null) {
          materialList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          materialListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public Builder removeMaterialList(int index) {
        if (materialListBuilder_ == null) {
          ensureMaterialListIsMutable();
          materialList_.remove(index);
          onChanged();
        } else {
          materialListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo.Builder getMaterialListBuilder(
          int index) {
        return getMaterialListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfoOrBuilder getMaterialListOrBuilder(
          int index) {
        if (materialListBuilder_ == null) {
          return materialList_.get(index);  } else {
          return materialListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfoOrBuilder> 
           getMaterialListOrBuilderList() {
        if (materialListBuilder_ != null) {
          return materialListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(materialList_);
        }
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo.Builder addMaterialListBuilder() {
        return getMaterialListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo.Builder addMaterialListBuilder(
          int index) {
        return getMaterialListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MaterialInfo material_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo.Builder> 
           getMaterialListBuilderList() {
        return getMaterialListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo, emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo.Builder, emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfoOrBuilder> 
          getMaterialListFieldBuilder() {
        if (materialListBuilder_ == null) {
          materialListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo, emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfo.Builder, emu.grasscutter.net.proto.MaterialInfoOuterClass.MaterialInfoOrBuilder>(
                  materialList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          materialList_ = null;
        }
        return materialListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DestroyMaterialReq)
    }

    // @@protoc_insertion_point(class_scope:DestroyMaterialReq)
    private static final emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq();
    }

    public static emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DestroyMaterialReq>
        PARSER = new com.google.protobuf.AbstractParser<DestroyMaterialReq>() {
      @java.lang.Override
      public DestroyMaterialReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DestroyMaterialReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DestroyMaterialReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DestroyMaterialReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DestroyMaterialReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DestroyMaterialReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030DestroyMaterialReq.proto\032\022MaterialInfo" +
      ".proto\":\n\022DestroyMaterialReq\022$\n\rmaterial" +
      "_list\030\007 \003(\0132\r.MaterialInfoB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MaterialInfoOuterClass.getDescriptor(),
        });
    internal_static_DestroyMaterialReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DestroyMaterialReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DestroyMaterialReq_descriptor,
        new java.lang.String[] { "MaterialList", });
    emu.grasscutter.net.proto.MaterialInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
