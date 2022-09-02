class With_3{    //all in one With return,without return type,parameterized and non parameterized
 public static void main(String ar [])
{
  With_3 obj=new With_3();
  System.out.println ("total answer is " + obj.Withreturn());
   int b=obj.Withreturn();
   obj.Withoutreturn(b);
}
 public int Withreturn()
  {
    int hero=10000;
     int honda=5000;
      int total=hero+honda;
     return total;

}

 public void Withoutreturn(int total)
{ 
  int a=total/2;
   System.out.println("withoutreturn"+a);
}

}




