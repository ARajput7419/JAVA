class A1{

}
class B1 extends  A1{
    int x;
    B1(int x){
        this();
        this.x = x;
        System.out.println("Parameterized constructor ..... class B");
    }
    B1(){
        System.out.println("Default constructor .... class B");
    }
}


class C1{
    C1(){
        System.out.println("Default Constructor ...... class C");
    }
}
class D1 extends  C1{
    int x;
    D1(int x){
        super();
        this.x = x;
        System.out.println("Parameterized constructor ..... class D");
    }
}


public class Ques4 {
    public static void main(String[] args) {
        new B1(10);
        new D1(10);
    }
}
