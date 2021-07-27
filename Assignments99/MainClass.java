import java.lang.*;
class EmpDetails
{
String empId, empName, empDesg;
int bSal;
void getEmpDetails()
{
   System.out.println("EmpId=" +empId);
   System.out.println("EmpName=" +empName);
   System.out.println("EmpDesg=" +empDesg);
   System.out.println("EmpBSal=" +empSal); 
}
}

class EmpAddress
{
String hNo,sName,city;
int pincode;
void getEmpAddress()
{
    System.out.println("HouseNo=" +hNo);
    System.out.println("SName=" +sName);
    System.out.println("City=" +city);
    System.out.println("Pincode=" +pincode);
}
}

class MainClass
{
public static void main(String[] args)
{
EmpDetails ed= new EmpDetails();
ed.empId= 1439;
ed.empName="Raj";
ed.empDesg="Software Engineer";
ed.bSal=50000;
ed.getEmpDetails();

EmpAddress ea= new EmpAddress();
ea.hNo="RZF 33A/516, 15";
ea.sNAme="Krishnappa Complex"; 
ea.city= "Delhi";
ea.pincode=450001
ea.getEmpAddress();
}
}