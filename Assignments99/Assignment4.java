class StudentData
{
String stuName,stuBr;
int rollNo;
void getStudentData()
{
System.out.println("StuName  : "+stuName);
System.out.println("Branch   : "+stuBr);
System.out.println("RollNo   : "+rollNo);
}
}

class StudentAddress
{
String hNo,stName,city;
int pinCode;
void getStudentAddress()
{
System.out.println("HouseNo  : "+hNo);
System.out.println("Street   : "+stName);
System.out.println("City     : "+city);
System.out.println("PinCode  : "+pinCode);
}
}

class Assignment4
{
public static void main(String[] args)
{
StudentData sd=new StudentData();
sd.stuName="Surabhi";
sd.stuBr="ECE";
sd.rollNo=2;
sd.getStudentData();

StudentAddress sa=new StudentAddress();
sa.hNo="KN-68";
sa.stName="Kashipur";
sa.city="Smastipur";
sa.pinCode=848101;
sa.getStudentAddress();
}
}