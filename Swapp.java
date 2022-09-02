class Swapp{
 public static void main(String ar[])
  {
   Swapp obj=new Swapp();
    obj.Withouttemp();
}
 void Withouttemp()
 {
  int a=10,b=12;
   a=(a+b);
    b=(a-b);
     a=(a-b);
    System.out.println("a Answer"+a+ "b answer"+b);
}






}
