class Parents
{
 public void Parents()
{
 System.out.println(" Arrange marriage");
}
}
class Son extends Parents
{
 public void marriage()
{
 System.out.println("love marriage");
}
public void friends()
{
 marriage();
 super.marriage();
}}
public class Society
{
 public static void main(String args[])
{
 Son s1 = new Son();
 s1.friends();
}
} 