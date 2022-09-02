interface Dominous_1{

public void Agentname();

public void Location();

public void Dresscode();

public void Parkingareya();

private void offers();

}

class Dominous implements Dominous_1{
public static void main(String ar [])
{
Dominous Food=new Dominous();
Food.Agentname();
Food.Location();
Food.Dresscode();
Food.Parkingareya();
Food.offers();
Food.Salary();
}

public void Agentname()
{
System.out.println("Agentname =" + "Sathiya");
}

public void Location()
{
System.out.println("Location =" + "Villupuram");
}

public void Dresscode()
{
System.out.println("Dresscode =" + "Red shirt and black pant");
}

public void Parkingareya()
{
System.out.println("Parkingareya =" + "1200sq");
}
private void offers()
{
System.out.println("offers =" + "Every monday 50% offer");
}
private void Salary()
{
System.out.println("Salary =" + "25000");
}

}

/*exop
Agentname =Sathiya
Location =Villupuram
Dresscode =Red shirt and black pant
Parkingareya =1200sq
offers =Every monday 50% offer
Salary =25000
*/
