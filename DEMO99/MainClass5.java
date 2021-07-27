import java.lang.*;
import java.util.*;
class Designation
{
boolean k;
boolean verify(String desg)
{
switch(desg)
{
case "SE":
k=true;
break;
case "TE":
k=true;
break;
case "ME":
k=true;
break;
}
return k;
}
}
class EmpIdCheck
{
boolean z;
boolean verify(String eId)
{
switch(eId)
{
case "S111":
z=true;
break;
case "T222":
z=true;
break;
case "M333":
z=true;
break;
}
return z;
}
}
class Salary
{
float totSal;
void cal(int bSal)
{
totSal=bSal+(0.97F*bSal)+(0.63F*bSal);
}
void getTotSal()
{
System.out.println("Total Salary: "+totSal);
}
}
class MainClass5
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the eNAME: ");
String eName=s.nextLine();
System.out.print("Enter the empDESG: ");
String empDesg=s.nextLine();
if(empDesg.length()==2)
{
Designation d=new Designation();
boolean p=d.verify(empDesg.toUpperCase());
if(p)
{
System.out.print("Enter the empId: ");
String empId=s.nextLine();
if(empId.length()==4)
{
EmpIdCheck eic=new EmpIdCheck();
boolean q=eic.verify(empId.toUpperCase());
if(q)
{
System.out.print("Enter the basic salary: ");
int bSal=Integer.parseInt(s.nextLine());
if(bSal>=5000)
{
Salary s1=new Salary();
s1.cal(bSal);
System.out.println("eName: "+eName);
System.out.println("empDesg: "+empDesg);
System.out.println("EmpId: "+empId);
System.out.println("bSal: "+bSal);
s1.getTotSal();
}
else
{
System.out.println("Invalid Salary..!!");
}
}
else
{
System.out.println("EmpId does not exist..!!");
}
}
else
{
System.out.println("Invalid EmpId..!!");
}
}
else
{
System.out.println("EmpDesg does not exist..!!");
}
}
else
{
System.out.println("Invalid EmpDesg..!!");
}

}//psvm
}//mainclass5