/**
 * GetStuService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.com;

public interface GetStuService extends java.rmi.Remote {
    public webservice.com.Student getStudentById(int stuId) throws java.rmi.RemoteException;
    public webservice.com.Student readOnlyStudent(webservice.com.Student student) throws java.rmi.RemoteException;
    public java.lang.Object[] getStudentList(java.lang.String[] obj) throws java.rmi.RemoteException;
}
