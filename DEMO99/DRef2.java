class Employee
{
String eId,eName;
void getEmployee()
{
System.out.println("EId:"+eId);
System.out.println("EName:"+eName);
}
}

class EAddress
{
String hNo,sName,city;
int pinCode;
void getEAddress()
{
System.out.println("HNo:"+hNo);
System.out.println("SName:"+sName);
System.out.println("City:"+city);
System.out.println("PinCode:"+pinCode);
}
}

class Read
{
void read()
{
System.out.println("enter eid");
e.eId=s.nextLine();
System.out.println("enter ename");
e.eName=s.nextLine();
System.out.println("enter houseNo");
String hNo=s.nextLine();
System.out.println("enter streetName");
String sName=s.nextLine();
System.out.println("enter city");
String city=s.nextLine();
System.out.println("enter pinCode");
int pinCode=s.nextInt();
}
}

class Display
{
void dis()
{

}
}

class DRef2
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
Employee e=new Employee();
Read r=new Read();
r.read();

}