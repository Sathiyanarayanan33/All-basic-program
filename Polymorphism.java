class Polymorphism{//method overloading
static public void main(String ar [])
{
Polymorphism poly=new Polymorphism();
poly.add(10,10);
poly.add(10,20,30);
poly.add(10,10);
}
static void add(long a, long b)
{
System.out.println(a+b);
}

static void add(int a, int b, int c)
{
System.out.println(a+b+c);
}

static void add (int c, int d)
{
System.out.println(c*d);
}

}
