import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter the number of rows: : ");
        int count = scan.nextInt(); 

        for (int i = 0; i < count; i++) { 
            for (int j = 0; j <= i; j++) { 
                System.out.print(i); 
            }
            System.out.println(); 
        }
        System.out.println(); 
    }
}
