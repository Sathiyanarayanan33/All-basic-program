class Leastcommon_1{ //LCM 3 statements
 public static void main(String ar [])
  {
   Leastcommon_1 obj=new Leastcommon_1();
   obj.Multiple();
}
public void Multiple()
 {
  int a=14;
  int b=12;
  int c=10;
  int lcm=0;
  int large=1;

  if(a>b && a>c){
    large=a;}
  else if(b>a && b>c){
     large=b;}
  else{
     large=c;}
 System.out.println(large);
 for(int i=1;true; i++){
  if(i%a==0 && i%b==0 && i%c==0){
   lcm=i;
System.out.println(lcm);
 break;
   }
  }

 }
}
//small no:14
//lcm:420
