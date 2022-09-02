class Mani{
 public static void main(String ar [])
{
  int n=1234;
   int sum=0;
for(int i=1; n>0||sum>9; i++)
 {
if (n==0){
  n=sum;
  sum=0;
}
  sum=sum+n%10;
   n=n/10;
}
System.out.println(sum);

}


}
