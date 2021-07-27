import java.util;
class Abc
{
public static void main(String[] args)
{
int i=0,j,t,size;
Scanner s=new Scanner(System.in);
System.out.println("enter the size:");
Abc e[]=new Abc[size];
int size=Integer.parseInt(s.nextLine());
while(i < size)
{
j=i+1;
 while(j < size)
 {
  if(e[i] < e[j])
  {
   t=e[i];
   e[i]=e[j];
   e[j]=t;
  }
  j=j+1;
 }
 i=i+1;
}
while(i < size)
{
System.out.println(e[i]);
i=i+1;
}
}
}