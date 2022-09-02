class Leep_2{   //4 rows 4 colum
 public static void main(String ar [])
   {
    Leep_2 obj=new Leep_2();
     obj.loops();
}
public void loops()
  {
    int row=1;
    while(row<=4){

    int col=1;
    while(col<=4){

    if (col==row){
    System.out.print(1+" ");}

    else{
     System.out.print(0+" ");}
     col++;
   }//row
    System.out.println();
     row++;
  } //col
 } //method
} //class
//EX OP
//1000
//0100
//0010
//0001
