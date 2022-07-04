import java.util.Scanner;

public class SymbolPrint {
    private static void print(int n){

        for (int i =0;i<n+4;i++){
            if (i==2||i==n+1) {
                System.out.print(" ");
                for (int j = 1; j < n+4; j++)
                    System.out.print("*");

            }
            else if (i>2&&i<n+1)
            {
                System.out.print("*");
                for (int j =0;j<n+4;j++) {
                    if (j == (n + 3) - i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

            }
            else{
                for (int j =0;j<n+4;j++) {
                    if (j == (n + 3) - i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();



        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of lines ");
        int n = scanner.nextInt();
        print(n);
    }
}
