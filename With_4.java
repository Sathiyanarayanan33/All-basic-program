class With_4{  //parameterized
 public static void main(String ar [])
 {
  With_4 obj=new With_4();
  System.out.println (obj.add(20,30));
  int d=obj.add(20,30);
   obj.multiple(d);
System.out.println(obj.multiple(d));
}
 public int add(int a,int b)
 {
  int c=a+b;
   return c;

}

public float multiple(int c)
{
 float a=c*2;

return a;
}

}

