class Happyno{
public static void main(String ar [])
 {
  Happyno obj=new Happyno();
  obj.Happynumber();

}
public void Happynumber()
{
 int a=23;  
 int sum=0;
 int num=0;
while(a>0){
 sum=a%10;
 a=a/10;
 num=(sum*sum)+num;
System.out.println(num);
}



}

}
