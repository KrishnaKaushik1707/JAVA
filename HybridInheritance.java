class A
{
int a;
}

class B extends A
{
int b;
}

class C extends A
{
int c;
void c()
{
a = 10;
c = 20;
}

void sum()
{
System.out.println("Addition of two numbers: " + (a+c));
}
}


class D extends B
{
int d;

void d()
{
a = 10;
b = 30;
d = 40;
}

void multiply()
{
System.out.println("Multiplication: "+ (a*b*d));
}
 
}


class HybridInheritance
{
public static void main(String args[])
{
C obj1 = new C();
obj1.c();
obj1.sum();

D obj2 = new D();
obj2.d();
obj2.multiply();
}


}


