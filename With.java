class With{
 int c;
 public static void main(String ar []) 
{
  With obj=new With();
  obj.add(20,30);
   obj.sub();
  System.out.println(obj.add (20,30));  
}

 public int add(int a,int b)
  {
      c=a+b;
    
return c;
}

public void sub()
 {
   int a=20;
   System.out.println(a+ add(20,30));  

}

}
