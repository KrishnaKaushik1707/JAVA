class Robo{

int x;

void getx()
{
x = 100;
}

}


class Sana extends Robo{

int y;
void gety()
{
y = 200;
}

void add()
{
System.out.println("Addition of two numbers: " + (x+y));
}
}

class SingleInheritance{

public static void main(String [] args){

Sana obj = new Sana();

obj.getx();
obj.gety();
obj.add();

}

}
