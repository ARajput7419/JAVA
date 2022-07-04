class A{

}
class B extends  A{
    int x;
    B(int x){
        this.x = x;
        System.out.println("Parameterized constructor ..... class B");
    }
}


class C{
    C(){
        System.out.println("Default Constructor ...... class C");
    }
}
class D extends  C{
    int x;
    D(int x){
        this.x = x;
        System.out.println("Parameterized constructor ..... class D");
    }
}


public class Ques3 {
    public static void main(String[] args) {
        new B(10);
        new D(10);
    }
}
