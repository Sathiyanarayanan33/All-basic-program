class Swappi{
 public static void main(String ar[])
 {
   Swappi obj=new Swappi();
    obj.Withouttemp();
}

  void Withouttemp()
   {
     int a=10,b=12,c=15;
      a=(a+b+c);
       b=a-(b+c);
        c=a-(b+c);
         a=a-(b+c);
   System.out.println("answer a"+a+  " answer  b"+b+   " answer  c"+c);


}





}
