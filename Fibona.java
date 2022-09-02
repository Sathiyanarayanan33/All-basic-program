public class Fibona{  //factorial series


 public static void main(String [] args)
 {
  Fibona obj=new Fibona();
  obj.Multiple();
  //obj.Multi();
}
 public void Multiple()
 {
  int n=10;
  int sum=1;
  for(int i=1; i<=10; i++){
   sum=sum*i;
}
  System.out.println(sum);
}

/*public void Multi()
 {
  int n=1;
  int sum=1;
  for(int i=1; i>=10; i++){
   sum=sum*i;
   }
  System.out.println(sum);*/
 //}
}
