/**
 * Student.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.com;

public class Student  implements java.io.Serializable {
    private java.lang.String stuAge;

    private int stuId;

    private java.lang.String stuName;

    public Student() {
    }

    public Student(
           java.lang.String stuAge,
           int stuId,
           java.lang.String stuName) {
           this.stuAge = stuAge;
           this.stuId = stuId;
           this.stuName = stuName;
    }


    /**
     * Gets the stuAge value for this Student.
     * 
     * @return stuAge
     */
    public java.lang.String getStuAge() {
        return stuAge;
    }


    /**
     * Sets the stuAge value for this Student.
     * 
     * @param stuAge
     */
    public void setStuAge(java.lang.String stuAge) {
        this.stuAge = stuAge;
    }


    /**
     * Gets the stuId value for this Student.
     * 
     * @return stuId
     */
    public int getStuId() {
        return stuId;
    }


    /**
     * Sets the stuId value for this Student.
     * 
     * @param stuId
     */
    public void setStuId(int stuId) {
        this.stuId = stuId;
    }


    /**
     * Gets the stuName value for this Student.
     * 
     * @return stuName
     */
    public java.lang.String getStuName() {
        return stuName;
    }


    /**
     * Sets the stuName value for this Student.
     * 
     * @param stuName
     */
    public void setStuName(java.lang.String stuName) {
        this.stuName = stuName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stuAge==null && other.getStuAge()==null) || 
             (this.stuAge!=null &&
              this.stuAge.equals(other.getStuAge()))) &&
            this.stuId == other.getStuId() &&
            ((this.stuName==null && other.getStuName()==null) || 
             (this.stuName!=null &&
              this.stuName.equals(other.getStuName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStuAge() != null) {
            _hashCode += getStuAge().hashCode();
        }
        _hashCode += getStuId();
        if (getStuName() != null) {
            _hashCode += getStuName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Student.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("com.webservice", "Student"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stuAge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stuAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stuId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stuId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stuName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stuName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
