// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LuaShellType.proto

package emu.grasscutter.net.proto;

public final class LuaShellTypeOuterClass {
  private LuaShellTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code LuaShellType}
   */
  public enum LuaShellType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *forced
     * </pre>
     *
     * <code>LUASHELL_NONE = 0;</code>
     */
    LUASHELL_NONE(0),
    /**
     * <code>LUA_SHELL_TYPE_LUASHELL_NORMAL = 1;</code>
     */
    LUA_SHELL_TYPE_LUASHELL_NORMAL(1),
    /**
     * <code>LUA_SHELL_TYPE_LUASHELL_SECURITY = 2;</code>
     */
    LUA_SHELL_TYPE_LUASHELL_SECURITY(2),
    /**
     * <code>LUA_SHELL_TYPE_LUASHELL_SHELL_CODE = 3;</code>
     */
    LUA_SHELL_TYPE_LUASHELL_SHELL_CODE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     *forced
     * </pre>
     *
     * <code>LUASHELL_NONE = 0;</code>
     */
    public static final int LUASHELL_NONE_VALUE = 0;
    /**
     * <code>LUA_SHELL_TYPE_LUASHELL_NORMAL = 1;</code>
     */
    public static final int LUA_SHELL_TYPE_LUASHELL_NORMAL_VALUE = 1;
    /**
     * <code>LUA_SHELL_TYPE_LUASHELL_SECURITY = 2;</code>
     */
    public static final int LUA_SHELL_TYPE_LUASHELL_SECURITY_VALUE = 2;
    /**
     * <code>LUA_SHELL_TYPE_LUASHELL_SHELL_CODE = 3;</code>
     */
    public static final int LUA_SHELL_TYPE_LUASHELL_SHELL_CODE_VALUE = 3;


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
    public static LuaShellType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LuaShellType forNumber(int value) {
      switch (value) {
        case 0: return LUASHELL_NONE;
        case 1: return LUA_SHELL_TYPE_LUASHELL_NORMAL;
        case 2: return LUA_SHELL_TYPE_LUASHELL_SECURITY;
        case 3: return LUA_SHELL_TYPE_LUASHELL_SHELL_CODE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LuaShellType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LuaShellType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LuaShellType>() {
            public LuaShellType findValueByNumber(int number) {
              return LuaShellType.forNumber(number);
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
      return emu.grasscutter.net.proto.LuaShellTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final LuaShellType[] VALUES = values();

    public static LuaShellType valueOf(
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

    private LuaShellType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:LuaShellType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022LuaShellType.proto*\223\001\n\014LuaShellType\022\021\n" +
      "\rLUASHELL_NONE\020\000\022\"\n\036LUA_SHELL_TYPE_LUASH" +
      "ELL_NORMAL\020\001\022$\n LUA_SHELL_TYPE_LUASHELL_" +
      "SECURITY\020\002\022&\n\"LUA_SHELL_TYPE_LUASHELL_SH" +
      "ELL_CODE\020\003B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
