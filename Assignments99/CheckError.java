import java.lang.*;
class StudentData           //subclass
{
String stuName,stuBranch;  //instance variables
int rollNo;
void getStudentData()     //non static method
{
System.out.println("Student's Detail:-");
System.out.println("Name  : "+stuName);
System.out.println("Branch: "+stuBranch);
System.out.println("RollNo: "+rollNo);
}
}

class CheckError                          //main class
{
public static void main(String[] args)   //static method
{
StudentData sd= new StudentData();      //object created
sd.stuName="SURABHI";                  
sd.stuBranch="ECE";
sd.rollNo=2;
sd.getStudentData();
}
}