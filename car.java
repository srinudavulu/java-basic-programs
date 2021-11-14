interface car
{
   void engine();
   void breaks();
  void acceleration();
  void gears();
class Suv implements car
{
  public void engine()
{ 
  System.out.println("engine specifications : 120km/h");
}
public void breaks()
{
 System.out.println("4-disk breaks");
}
public void acceleration()
{
 System.out.println(" 4- mins");
}
public void gears()
{
  System.out.println(" automatic and 5- gears");
}}
 class Toyota implements car 
{
  public void engine()
{
  System.out.println(" engine specifications : 135km/h");
}
public void breaks()
{
 System.out.println(" disk breaks with abs");
}
public void acceleration()
{
 System.out.println("2.5 - mins");
}
public void gears()
{
 System.out.println("6-gears type");
}}
public class user_car
{
 public void main(String[] args)
{
 car c= new Suv();
 c.engine();
 c.breaks();
 c.gears();
 c.acceleration();
car c1 = new Toyota();
c1.engine();
c1.breaks();
c1.gears();
c1.acceleration();
}
}
}




