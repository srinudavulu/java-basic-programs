import java.util.scanner;
public class SumOfArray
{
 public static void main(String args[])
{
 scanner s = new scanner(System.in);
 System.out.println("enter the size");
 int size =s.nextInt();
 int a[] = new int[size];
 for(int i=0;i<size;i++)
{ 
 a[i] = s.nextInt();
} 
 int max = a[0];
for(int i=1;i<size;i++)
{ 
 if(a[i]>max)
 max = a[i];
} 
System.out.println(max);
}
}
