class Mobile{   //method overloading
 public void Android(int a, int b)
 {
   int c=a+b;
   System.out.println(c);
}
 public void Android(int a, int b, int c)
{
   int z=a+b+c;
  System.out.println(z);

}
public static void main(String ar [])
{
 Mobile obj=new Mobile();
 obj.Android(10, 20);
 obj.Android(30, 40, 50);

}
}
//30
//120
//   int phonecall=10;
//   int message=20;
//  System.out.println(phonecall+" "+message);
