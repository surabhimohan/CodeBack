class Addition
{
int a,b;     //non static variables
void add()
{
int c=a+b;
System.out.print(c);
}
public static void main(String[] ar)
{
Addition ad = new Addition();
ad.a=12;
ad.b=23;
ad.add();
}
}


