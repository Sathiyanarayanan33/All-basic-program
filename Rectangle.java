class Rectangle{  //i use the return type,non return type,parameterized
 public static void main(String ar[])
  {
   Rectangle obj=new Rectangle();
    //System.out.println (obj.equal());
       obj.equal(10,11);
}
 public void equal(int a,int b)
  {
   //int a=10;
   //int b=11;
  if(a==b){
  System.out.println("square");
   //return "square";
}
  else{
     System.out.println("rectangle");
     // return "rectangle";
  }
 }
}
