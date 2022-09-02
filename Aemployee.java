class Aemployee implements Employeerules //interface method
{
public static void main(String ar [])
{
Aemployee workers=new Aemployee();
workers.maintainence();
workers.timing();
workers.dresscode();
workers.report();

System.out.println(Employeerules.salery);
System.out.println(Employeerules.leave);

}

public void maintainence()
{
System.out.println("per day 3 shifts");
}
public void timing()
{
System.out.println("per shift 8 hours");
}

public void dresscode()
{
System.out.println("company given dress");
}

public void report()
{
System.out.println("report to production leader");

 }
}
//exop:
/*per day 3 shifts
per shift 8 hours
company given dress
report to production leader
25000
10*/

