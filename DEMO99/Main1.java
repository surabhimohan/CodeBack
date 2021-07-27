class EmpData
{
String empId,empName,empDesg;
int basicSal;
void getEmpData()
{
System.out.println("DATA DETAILS OF AN EMPLOYEE--");
System.out.println("EmpID:"+empId);
System.out.println("EmpNAME:"+empName);
System.out.println("EmpDESG:"+empDesg);
System.out.println("SALARY:"+basicSal);
}
}

class EmpAddress
{
String houseNo,streetName,city;
int pinCode;
void getEmpAddress()
{
System.out.println("ADDRESS OF EMPLOYEE--");
System.out.println("HouseNo:"+houseNo);
System.out.println("StreetNAME:"+streetName);
System.out.println("CITY:"+city);
System.out.println("PINCODE:"+pinCode);
}
}

class Main1
{
public static void main(String[] args)
{
EmpData ed=new EmpData();
ed.empId="A213BD";
ed.empName="SURABHI";
ed.empDesg="Software Engg";
ed.basicSal=45000;
ed.getEmpData();
EmpAddress ad=new EmpAddress();
ad.houseNo="KM-68";
ad.streetName="SR Nagar";
ad.city="Hyderabad";
ad.pinCode=123456;
ad.getEmpAddress();
}
}