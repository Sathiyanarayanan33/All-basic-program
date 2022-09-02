class Commondiff{  //1,2,3,4,5,6,?
 public static void main(java.lang String ar [])
  {
    Commondiff obj=new Commondiff();
    obj.add();

}
 public void add()
 {
  int n=5;
  int first=1;
  int second=2;
  int sum=0;
for(int i=1; i<=n; i++){
System.out.println(first);
  sum=second-first;
   first=second;
    second=(sum+first)+2;

  }//for
 }//method
}
