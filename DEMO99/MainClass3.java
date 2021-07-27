import java.lang.*;
import java.util.*;
class UserData
{
String userName,mailId;  //instance variables
long phoneNo;
void getUserData()
{
System.out.println("User Name: "+userName);
System.out.println("Mail Id: "+mailId);
System.out.println("Phone No: "+phoneNo);
}
}

class MainClass3
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
UserData ud = new UserData();
System.out.print("Enter the User Name: ");
ud.userName=scn.nextLine();
System.out.print("Enter the Mail Id: ");
ud.mailId=scn.nextLine();
System.out.print("Enter the Phone No: ");
ud.phoneNo=Long.parseLong(scn.nextLine());
ud.getUserData();
}
} 