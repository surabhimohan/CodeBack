//Bank Transaction process using Reference Concept

import java.util.*;
class PinCheck
{
boolean k;
boolean verify(int pinNo)
{
switch(pinNo)
{
case 1234:
k=true;
break;
case 2345:
k=true;
break;
case 3456:
k=true;
break;
default:
k=false;
}
return k;
}
}


}
}
class Reference1
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter pinNo: ");
String pinNo=s.nextLine();
if(pinNo.length()==4)
{
PinCheck pc=new PinCheck();
boolean z=pc.verify(Integer.parseInt(pinNo));
if(z)
{

}//if2
}//if1
}
}