class Value{
 public static void main(String ar [])
 {
  Value no=new Value();
  System.out.println (no.withreturn());
System.out.println(no.multiple());
 //int z=no.multiple();   
no.sub(no.multiple());


}
  public int withreturn()
  {
    int a=100;
    int b=200;
    int c=a+b;
    return c;
}
  public int multiple()
   {
   int d=300;
   int e=200;
   int f=d+e;
   return f;
}
  public void sub(int f)
{
   int a=300;
   int b=a-f;
 System.out.println(b);
}



}
