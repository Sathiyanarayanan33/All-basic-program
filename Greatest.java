class Greatest{ //GCD 3 variable
 public static void main(String ar [])
 {
  Greatest obj=new Greatest();
  obj.Commondevice();
}
public void Commondevice()
 {
  int a=8;
  int b=4;
  int c=12;
  int gcd=0;
  int small=0;

  if(a<b && a<c){
    small=a;}
  else if(b<a && b<c){
    small=b;}
  else{
    small=c;}
   //System.out.println(small); 
  for(int i=1; i<=small; i++){
  if(a%i==0 && b%i==0 && c%i==0){
     gcd=i;
   }//if
  }//for
System.out.println(gcd);
 }//method
}//class
