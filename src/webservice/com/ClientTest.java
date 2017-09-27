package webservice.com;

import java.rmi.RemoteException;

public class ClientTest {
	/*
	 * public static void main(String[] args) throws RemoteException { String
	 * endPoint =
	 * "http://localhost:8080/axisProject/webservice/getStuService?wsdl";
	 * 
	 * GetStuServiceProxy proxy = new GetStuServiceProxy(endPoint);
	 * 
	 * // Student student = proxy.getStudentById(1);
	 * 
	 * Student stu = new Student();
	 * 
	 * stu.setStuId(1); stu.setStuAge("24"); stu.setStuName("小杰");
	 * 
	 * Student student = proxy.readOnlyStudent(stu);
	 * System.out.println("student[stuId=" + student.getStuId() + ",stuName=" +
	 * student.getStuName() + ",stuAge=" + student.getStuAge() + "]"); }
	 */

	public static void main(String[] args) throws RemoteException {
		String[] str = new String[3];
		str[0] = "小杰";
		str[1] = "小鹏";
		str[2] = "小永";

		String endPoint = "http://localhost:8080/axisProject/webservice/getStuService?wsdl";

		GetStuServiceProxy proxy = new GetStuServiceProxy(endPoint);

		Object[] list = proxy.getStudentList(str);

		if (null != list && list.length > 0) {
			for (int i = 0; i < list.length; i++) {
				Student stu = (Student) list[i];

				System.out.println("student[stuId=" + stu.getStuId() + ",stuName=" + stu.getStuName() + ",stuAge="
						+ stu.getStuAge() + "]");
			}
		}
	}
}
