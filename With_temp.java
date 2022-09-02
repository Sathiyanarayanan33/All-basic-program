class With_temp{
 public static void main(String ar[])
 {
  With_temp obj=new With_temp();
   obj.swap();
    obj.swapping();

}
  void swap()
   {
     int a=10,b=20,t=0;
      t=a+b;
       a=a-b;
        b=a-b;
         System.out.println("A answer is"+a+  "B answer is"+b);
}

    void swapping()
{
    int e=20,f=10,c=30,s=0;
     s=e;
      e=f;
       f=c;
        c=s;
         System.out.println(" "+e+ " "+f+ " "+c);
       
 

}






}
