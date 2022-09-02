class Sumof_enno{ //add the sum of first en number
 public static void main(String ar[])
 {
  Sumof_enno obj=new Sumof_enno();
  obj.add();
  obj.multiple();
  obj.sub();
}
 public void add()
  {
   int n=10;
   int sum=0;

   for(int i=1; i<=10; i++){
    sum=sum+i;
}
System.out.println("Sum of add no is"+" "+sum);
}

//exop:sum=55

public void multiple()
 {
   int n=10;
   int sum=1;

   for(int i=1; i<=10; i++){
     sum=sum*i;   
}
System.out.println("Sum of multiple no is"+" "+sum);
}
//exop:sum=3628800

public void sub()
 {
  int n=10;
  int sum=0;
   for(int i=1; i<=10; i++){
    sum=sum-i;
}
System.out.println("Sum of sub no is"+" "+sum);
}
//exop:-55
}

/*total outout
Sum of add no is 55
Sum of multiple no is 3628800
Sum of sub no is -55*/

