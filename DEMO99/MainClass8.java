class Display
{
int k=10;
void dis()
{
k++;
System.out.println("value of k: "+k);
}
}
class MainClass8
{
public static void main(String[] args)
{
Display d1=new Display();
Display d2=new Display();
Display d3=new Display();
d1.dis();
d2.dis();
d3.dis();
}
}