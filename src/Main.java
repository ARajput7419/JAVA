import java.util.Scanner;

interface Calculator{
    int add(int x,int y);
    int subtract(int x,int y);
    int multiply(int x,int y);
    float divide(float x,float y);
    float modular(float x , float y);
}


class CalculatorImplementation implements Calculator{

    @Override
    public int add(int x, int y) {
        return x+y;
    }

    @Override
    public int subtract(int x, int y) {
        return x-y;
    }

    @Override
    public int multiply(int x, int y) {
        return x*y;
    }

    @Override
    public float divide(float x, float y) {
        return x/y;
    }

    @Override
    public float modular(float x, float y) {
        return x%y;
    }
}




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorImplementation calculator = new CalculatorImplementation();
        while(true) {
            System.out.println("*******MENU********");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modular");
            System.out.println("6. Exit");
            System.out.println("\nEnter your choice");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    System.out.println(calculator.add(scanner.nextInt(),scanner.nextInt()));
                    break;
                }
                case 2:{
                    System.out.println(calculator.subtract(scanner.nextInt(),scanner.nextInt()));
                    break;
                }
                case 3:{
                    System.out.println(calculator.multiply(scanner.nextInt(),scanner.nextInt()));
                    break;
                }
                case 4:{
                    System.out.println(calculator.divide(scanner.nextFloat(),scanner.nextFloat()));
                    break;
                }
                case 5:{
                    System.out.println(calculator.modular(scanner.nextFloat(),scanner.nextFloat()));
                    break;
                }
                case 6: {
                    System.out.println("Good Bye ...........");
                    System.exit(0);
                }

            }
        }
    }

}
