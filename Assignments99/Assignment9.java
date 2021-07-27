import java.util.*;
class BranchCheck
{
boolean k;
boolean verify(String stuBranch)
{
switch(stuBranch)
{
case "CSE":
k=true;
break;
case "ECE":
k=true;
break;
case "EEE":
k=true;
break;
}
return k;
}
}
class Result
{
float per;
String result;
void cal(int p,int totMarks)
{
per=(float)totMarks/6;
if(p==1)
{
System.out.println("FAIL");
}
else if(p>=70 && p<=100)
{
System.out.println("Passed with Distinction");
}
else if(p>=60 && p<=70)
{
System.out.println("Passed with First Class");
}
else if(p>=50 && p<=60)
{
System.out.println("Passed with Second Class");
}
else if(p>=35 && p<=50)
{
System.out.println("Passed with Third Class");
}
}
void getstuResult()
{
System.out.println("Percentage: "+per);
System.out.println("Result: "+result);
} 
}
class Assignment9
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the Student Name: ");
String stuName=s.nextLine();
System.out.print("Enter the Branch Name: ");
String stuBranch=s.nextLine();
if(stuBranch.length()==3) 
{
BranchCheck b=new BranchCheck();
boolean p=b.verify(stuBranch.toUpperCase());
if(p) 
{
System.out.print("Enter the rollNo: ");
String stuRollNo=s.nextLine();
if(stuRollNo.length()==10) 
{
int i=1,p=0,totMarks=0;
System.out.print("==Six subjects marks==");
while(i<=6)
{
System.out.print("Enter marks of sub: "+i);
int sub=Integer.parse.Int(s.nextLine());
i++;
if(sub<0 || sub>100) 
{
System.out.print("Invaid SubMarks..!!");
i--;
continue;
}
if(sub>=0 && sub<=34)
{
p=1;
}
totMarks=totMarks+sub;
}
System.out.println("StuName: "+stuName);
System.out.println("StuBranch: "+stuBranch);
System.out.println("StuRollNo: "+stuRollNo);
Result r=new Result();
r.cal(p,totMarks);
r.getResult();
}
else
{
System.out.println("Invalid RollNo..!!");
}
else
{
System.out.println("Branch does not exist..!!");
}
else
{
System.out.println("Invalid Branch..!!");
}
}
}