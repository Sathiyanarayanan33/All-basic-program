class Mobile{
 public void calling()
  {
   int incoming=10;
   int outgoing=11;
  System.out.println(incoming+" "+outgoing);
}
}
class Mobile_2 extends Mobile{
 public void calling()
  {
   int message=15;
   int game=20;
    System.out.println(message+" "+game);
}
}
public class String{
public static void main(String ar [])
{
 Mobile_2 obj=new Mobile_2();
 obj.calling();
}
}
//15,20
