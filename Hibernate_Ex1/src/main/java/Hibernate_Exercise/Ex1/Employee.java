/*
 Create a table Employee with atleast
  4 columns and add data to it with the help of Hibernate.
 */

package Hibernate_Exercise.Ex1;
import jakarta.persistence.*;

@Entity
public class Employee {
	
@Id
@Column(name = "empId")
private int EmpId;
@Column(name = "empName")
private String Empname;
@Column(name = "empSal")
private int EmpSal;
@Column(name = "empDept")
private String EmpDept;
public int getEmpId() {
	return EmpId;
}
public void setEmpId(int empId) {
	EmpId = empId;
}
public String getEmpname() {
	return Empname;
}
public void setEmpname(String empname) {
	Empname = empname;
}
public int getEmpSal() {
	return EmpSal;
}
public void setEmpSal(int empSal) {
	EmpSal = empSal;
}
public String getEmpDept() {
	return EmpDept;
}
public void setEmpDept(String empDept) {
	EmpDept = empDept;
} 



}
