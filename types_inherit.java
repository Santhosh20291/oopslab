class ClassA{
    void Aclass(){
        System.out.println("I am from class A");
    }
}
class ClassB extends ClassA{
    void Bclass(){
        System.out.println("I am from class B inherit from class A");
    }
}
class ClassC extends ClassB{
    void Cclass(){
        System.out.println("I am from class C inherit from class B");
    }
}
class ClassD extends ClassA{
    void Dclass(){
        System.out.println("I am from class B inherit from class A");
    }
}
public class InheriTypes {
    public static void main(String[] args) {
        ClassB x = new ClassB();
        System.out.println("Simple inheritance");
        x.Aclass();
        x.Bclass();
        System.out.println("Multi-Level inheritance");
        ClassC y = new ClassC();
        y.Aclass();
        y.Bclass();
        y.Cclass();
        System.out.println("Hierarchial inheritance");
        ClassD z1 = new ClassD();
        ClassD z2 = new ClassD();
        z1.Aclass();
        z1.Dclass();
        z2.Aclass();
        z2.Dclass();
    }
}

