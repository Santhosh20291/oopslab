public class Simpleinheritance {
    private
    int pri=10;
    public
    int pub=30;
    protected
    int pro=50;

    public
    int getpri(){
        return pri;
    }
}
class subclass extends Simpleinheritance{
    int priVar=getpri();
}
class test{
    public static void main(String[] args) {
        subclass x = new subclass();
       System.out.println("public value " + x.pub);
        System.out.println("public value " + x.pro);
        System.out.println("public value " + x.priVar);


    }
}
