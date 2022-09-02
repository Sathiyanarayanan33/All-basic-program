class Maths{
 public static void main(String ar[])
  {
    Maths obj=new Maths();
    obj.Factorial();

}
 public void Factorial()
  {
    int n=5;
    int sum=n;
   while(n>0){
    
    sum=sum*n;
     n++;
System.out.println(sum);
}
 
}
}
