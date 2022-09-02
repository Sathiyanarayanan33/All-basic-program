abstract class Bike_1{
public static void main(String ar [])
{

}

public abstract void bikemodel();

public abstract void insurence();

public void showroom()
{
System.out.println("showroom "+ " all over tamilnadu");
}

public void location()
{
System.out.println("location "+ " villupuram");
}
}//class


class Bike extends Bike_1{
public static void main(String ar [])
{
Bike b=new Bike();
b.bikemodel();
b.insurence();
b.location();
b.showroom();
}

public void bikemodel()
{
System.out.println("bikemodel " + " Honda");
}

public void insurence()
{
System.out.println("insurence " + " Per year");
}
}

/*exop
bikemodel  Honda
insurence  Per year
location  villupuram
showroom  all over tamilnadu
*/
