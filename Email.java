import java.util.scanner;
class Email
{
 private String uname,pwd;

 // setter & getter
public void set_uname_pwd(String uname,String pwd)
{
 this.uname = uname;
 this.pwd = pwd;
}
 public String getuname()
{
 // verification
 if (uname == " srinudavuluri2gmail.com")
 {
   return " valid Email";
 }
  else 
{
  return " invalid Email";
}
public String getpwd()
{
 //verification
 if(pwd == " srinu@307")
{
  return " welcome to emaol app ";
}
 else 
{ 
   return " invalid password please re-enter correct password ";
}
}
public class userEmail
{
 public static void main(String args[])
{ 
 scanner s1 = new scanner(system.in);
 Email m1 = new Email();
 String uname =s1.nextline();
 String pwd = s1.nextline();
}
}
}