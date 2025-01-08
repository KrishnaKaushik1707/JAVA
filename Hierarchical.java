class Sup{
    int x,y;
    void getxy(){
        x = 10;
        y = 20;
    }
}

class Sub1 extends Sup{
    void sum(){
        System.out.println("Addition of two numbers: " + (x+y));
    }
}

class Sub2 extends Sup{
    int z;
    void z(){
        z = 30;
    }
    void mul(){
        System.out.println("Multiplication of three numbers: " + (x*y*z));
    }
}


public class Hierarchical {
    public static void main(String[] args) {
        
        Sub1 obj1 = new Sub1();
        obj1.getxy();
        obj1.sum();

        Sub2 obj2 = new Sub2();
        obj2.getxy();
        obj2.z();
        obj2.mul();
    }    
}
