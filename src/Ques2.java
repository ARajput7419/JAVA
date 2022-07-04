class Parent{
    int x = 10;
    void displayMessage(){
        System.out.println("Parent Class ");
    }
}
class Child extends  Parent{
    int x = 20;
    void displayMessage(){
        System.out.println("Child Class ");
    }

}


public class Ques2 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        System.out.println(p.x);
        p.displayMessage();
        System.out.println(c.x);
        c.displayMessage();
    }
}
