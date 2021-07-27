import java.lang.*;
import java.util.*;
class BusService
{
String serName,from,to,depTime,arrTime,serNo;
void getBusService()
{
System.out.println("Serice Name: "+serName);
System.out.println("Serice No: "+serNo);
System.out.println("Bus From: "+from);
System.out.println("Bus To: "+to);
System.out.println("DepTime: "+depTime);
System.out.println("ArrTime: "+arrTime);
}
}

class Assignment3
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
BusService bs=new BusService();
System.out.print("Enter the service name: ");
bs.serName=s.nextLine();
System.out.print("Enter the service no: ");
bs.serNo=s.nextLine();
System.out.print("Enter the pickup pt.: ");
bs.from=s.nextLine();
System.out.print("Enter the destination pt.: ");
bs.to=s.nextLine();
System.out.print("Enter the departure time: ");
bs.depTime=s.nextLine();
System.out.print("Enter the arrival time: ");
bs.arrTime=s.nextLine();
bs.getBusService();
}
}