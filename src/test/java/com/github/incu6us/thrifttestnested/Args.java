/**
 * Autogenerated by Thrift Compiler (0.14.0)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.github.incu6us.thrifttestnested;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-02-10")
public class Args implements org.apache.thrift.TBase<Args, Args._Fields>, java.io.Serializable, Cloneable, Comparable<Args> {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Args");

    private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short) 1);
    private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short) 2);
    private static final org.apache.thrift.protocol.TField TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("text", org.apache.thrift.protocol.TType.STRING, (short) 3);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ArgsStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ArgsTupleSchemeFactory();

    public @org.apache.thrift.annotation.Nullable
    String id; // optional
    public @org.apache.thrift.annotation.Nullable
    String name; // required
    public @org.apache.thrift.annotation.Nullable
    String text; // required

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        ID((short) 1, "id"),
        NAME((short) 2, "name"),
        TEXT((short) 3, "text");

        private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

        static {
            for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        @org.apache.thrift.annotation.Nullable
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
                case 1: // ID
                    return ID;
                case 2: // NAME
                    return NAME;
                case 3: // TEXT
                    return TEXT;
                default:
                    return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        @org.apache.thrift.annotation.Nullable
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    // isset id assignments
    private static final _Fields optionals[] = {_Fields.ID};
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.TEXT, new org.apache.thrift.meta_data.FieldMetaData("text", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Args.class, metaDataMap);
    }

    public Args() {
    }

    public Args(
            String name,
            String text) {
        this();
        this.name = name;
        this.text = text;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public Args(Args other) {
        if (other.isSetId()) {
            this.id = other.id;
        }
        if (other.isSetName()) {
            this.name = other.name;
        }
        if (other.isSetText()) {
            this.text = other.text;
        }
    }

    public Args deepCopy() {
        return new Args(this);
    }

    @Override
    public void clear() {
        this.id = null;
        this.name = null;
        this.text = null;
    }

    @org.apache.thrift.annotation.Nullable
    public String getId() {
        return this.id;
    }

    public Args setId(@org.apache.thrift.annotation.Nullable String id) {
        this.id = id;
        return this;
    }

    public void unsetId() {
        this.id = null;
    }

    /**
     * Returns true if field id is set (has been assigned a value) and false otherwise
     */
    public boolean isSetId() {
        return this.id != null;
    }

    public void setIdIsSet(boolean value) {
        if (!value) {
            this.id = null;
        }
    }

    @org.apache.thrift.annotation.Nullable
    public String getName() {
        return this.name;
    }

    public Args setName(@org.apache.thrift.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    public void unsetName() {
        this.name = null;
    }

    /**
     * Returns true if field name is set (has been assigned a value) and false otherwise
     */
    public boolean isSetName() {
        return this.name != null;
    }

    public void setNameIsSet(boolean value) {
        if (!value) {
            this.name = null;
        }
    }

    @org.apache.thrift.annotation.Nullable
    public String getText() {
        return this.text;
    }

    public Args setText(@org.apache.thrift.annotation.Nullable String text) {
        this.text = text;
        return this;
    }

    public void unsetText() {
        this.text = null;
    }

    /**
     * Returns true if field text is set (has been assigned a value) and false otherwise
     */
    public boolean isSetText() {
        return this.text != null;
    }

    public void setTextIsSet(boolean value) {
        if (!value) {
            this.text = null;
        }
    }

    public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
        switch (field) {
            case ID:
                if (value == null) {
                    unsetId();
                } else {
                    setId((String) value);
                }
                break;

            case NAME:
                if (value == null) {
                    unsetName();
                } else {
                    setName((String) value);
                }
                break;

            case TEXT:
                if (value == null) {
                    unsetText();
                } else {
                    setText((String) value);
                }
                break;

        }
    }

    @org.apache.thrift.annotation.Nullable
    public Object getFieldValue(_Fields field) {
        switch (field) {
            case ID:
                return getId();

            case NAME:
                return getName();

            case TEXT:
                return getText();

        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case ID:
                return isSetId();
            case NAME:
                return isSetName();
            case TEXT:
                return isSetText();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that instanceof Args)
            return this.equals((Args) that);
        return false;
    }

    public boolean equals(Args that) {
        if (that == null)
            return false;
        if (this == that)
            return true;

        boolean this_present_id = true && this.isSetId();
        boolean that_present_id = true && that.isSetId();
        if (this_present_id || that_present_id) {
            if (!(this_present_id && that_present_id))
                return false;
            if (!this.id.equals(that.id))
                return false;
        }

        boolean this_present_name = true && this.isSetName();
        boolean that_present_name = true && that.isSetName();
        if (this_present_name || that_present_name) {
            if (!(this_present_name && that_present_name))
                return false;
            if (!this.name.equals(that.name))
                return false;
        }

        boolean this_present_text = true && this.isSetText();
        boolean that_present_text = true && that.isSetText();
        if (this_present_text || that_present_text) {
            if (!(this_present_text && that_present_text))
                return false;
            if (!this.text.equals(that.text))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
        if (isSetId())
            hashCode = hashCode * 8191 + id.hashCode();

        hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
        if (isSetName())
            hashCode = hashCode * 8191 + name.hashCode();

        hashCode = hashCode * 8191 + ((isSetText()) ? 131071 : 524287);
        if (isSetText())
            hashCode = hashCode * 8191 + text.hashCode();

        return hashCode;
    }

    @Override
    public int compareTo(Args other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.compare(isSetId(), other.isSetId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.compare(isSetName(), other.isSetName());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetName()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.compare(isSetText(), other.isSetText());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetText()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.text, other.text);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    @org.apache.thrift.annotation.Nullable
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        scheme(oprot).write(oprot, this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Args(");
        boolean first = true;

        if (isSetId()) {
            sb.append("id:");
            if (this.id == null) {
                sb.append("null");
            } else {
                sb.append(this.id);
            }
            first = false;
        }
        if (!first) sb.append(", ");
        sb.append("name:");
        if (this.name == null) {
            sb.append("null");
        } else {
            sb.append(this.name);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("text:");
        if (this.text == null) {
            sb.append("null");
        } else {
            sb.append(this.text);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        if (name == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
        }
        // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        try {
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class ArgsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ArgsStandardScheme getScheme() {
            return new ArgsStandardScheme();
        }
    }

    private static class ArgsStandardScheme extends org.apache.thrift.scheme.StandardScheme<Args> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, Args struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.id = iprot.readString();
                            struct.setIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // NAME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.name = iprot.readString();
                            struct.setNameIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // TEXT
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.text = iprot.readString();
                            struct.setTextIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, Args struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.id != null) {
                if (struct.isSetId()) {
                    oprot.writeFieldBegin(ID_FIELD_DESC);
                    oprot.writeString(struct.id);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.name != null) {
                oprot.writeFieldBegin(NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            if (struct.text != null) {
                oprot.writeFieldBegin(TEXT_FIELD_DESC);
                oprot.writeString(struct.text);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class ArgsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ArgsTupleScheme getScheme() {
            return new ArgsTupleScheme();
        }
    }

    private static class ArgsTupleScheme extends org.apache.thrift.scheme.TupleScheme<Args> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, Args struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            oprot.writeString(struct.name);
            java.util.BitSet optionals = new java.util.BitSet();
            if (struct.isSetId()) {
                optionals.set(0);
            }
            if (struct.isSetText()) {
                optionals.set(1);
            }
            oprot.writeBitSet(optionals, 2);
            if (struct.isSetId()) {
                oprot.writeString(struct.id);
            }
            if (struct.isSetText()) {
                oprot.writeString(struct.text);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, Args struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            struct.name = iprot.readString();
            struct.setNameIsSet(true);
            java.util.BitSet incoming = iprot.readBitSet(2);
            if (incoming.get(0)) {
                struct.id = iprot.readString();
                struct.setIdIsSet(true);
            }
            if (incoming.get(1)) {
                struct.text = iprot.readString();
                struct.setTextIsSet(true);
            }
        }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
        return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
}
