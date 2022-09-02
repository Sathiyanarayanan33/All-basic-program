class Sum_digit{
 public static void main(String ar[])
  {
   Sum_digit obj=new Sum_digit();
     obj.addition();
  }
 public void addition()
  {
  int  n=40;
    if(n<=9&&n>=0){
     System.out.println(n);
      
}   



   else if (n<=99&&n>=10){
    int a=40%10;
     int b=40/10;
      int c=a+b;
       System.out.println(c);

}

}

}

