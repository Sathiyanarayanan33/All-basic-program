class Method{
 public static void main(String ar [])
 {
  Method obj=new Method();
  obj.Swapp();

}
public void Swapp()
 {
  int n=5;
  int first=0;
  int second=10;
  int sum=0;

  for(int i=1; i<=10; i++){
   sum=first+second;
    first=second;
    second=sum;
}
System.out.println(sum);

}









}
