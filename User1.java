class A 
{
 public A()
{
this(100);
 System.out.println(" A-class constructor");
}
public A(int i)
{
 System.out.println("AB-class constructor");
}
}
class B extends A
{
 public B()
{
 
}
}
class C extends A,B
{
 public C()
{
 super();
 super();
}
}
public class User1
{
 public static void main(String args[])
{
  C b1 = new C();
}
}