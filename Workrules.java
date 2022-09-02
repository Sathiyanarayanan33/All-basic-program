interface Employeerules_1{

int salery=25000;//by default these variable are final and static
int leave=10;

public void maintainence();//by default they are abstract

public void timing();

public void dresscode();

public void report();

}


class Aemployee implements Employeerules_1{

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

public class Workrules
{
public static void main(String ar [])
{
Aemployee workers=new Aemployee();
workers.maintainence();
workers.timing();
workers.dresscode();
workers.report();

System.out.println(Employeerules_1.salery);
System.out.println(Employeerules_1.leave);

}
}

/*exop:
per day 3 shifts
per shift 8 hours
company given dress
report to production leader
25000
10*/

