class SubClass
{
static
{
System.out.println("Subclass Static block..");
}
}
class StaticBlock
{
public static void main(String[] args)
{
SubClass sc=new SubClass();
System.out.println("Msg from main() method..");
}
static 
{
System.out.println("Mainclass Static Block..");
}
}