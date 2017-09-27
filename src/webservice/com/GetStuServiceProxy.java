package webservice.com;

public class GetStuServiceProxy implements webservice.com.GetStuService {
  private String _endpoint = null;
  private webservice.com.GetStuService getStuService = null;
  
  public GetStuServiceProxy() {
    _initGetStuServiceProxy();
  }
  
  public GetStuServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetStuServiceProxy();
  }
  
  private void _initGetStuServiceProxy() {
    try {
      getStuService = (new webservice.com.GetStuServiceServiceLocator()).getgetStuService();
      if (getStuService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getStuService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getStuService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getStuService != null)
      ((javax.xml.rpc.Stub)getStuService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservice.com.GetStuService getGetStuService() {
    if (getStuService == null)
      _initGetStuServiceProxy();
    return getStuService;
  }
  
  public webservice.com.Student getStudentById(int stuId) throws java.rmi.RemoteException{
    if (getStuService == null)
      _initGetStuServiceProxy();
    return getStuService.getStudentById(stuId);
  }
  
  public webservice.com.Student readOnlyStudent(webservice.com.Student student) throws java.rmi.RemoteException{
    if (getStuService == null)
      _initGetStuServiceProxy();
    return getStuService.readOnlyStudent(student);
  }
  
  public java.lang.Object[] getStudentList(java.lang.String[] obj) throws java.rmi.RemoteException{
    if (getStuService == null)
      _initGetStuServiceProxy();
    return getStuService.getStudentList(obj);
  }
  
  
}