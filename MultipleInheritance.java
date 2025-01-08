import java.lang.*;

interface A {
    public abstract void one();
}

interface B {
    public abstract void two();
    
}

class C implements A,B{
    public void one(){

        System.out.println("This is A method");
    }

    public void two(){
        System.out.println("This is B method");
    }
}


class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.one();
        obj.two();
    }
}
