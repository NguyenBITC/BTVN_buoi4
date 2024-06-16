import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    public int calculateSum(){
      
        int sum = 0;
        System.out.println("Moi nhap so: ");

        while (true) {
            String input = scanner.next();
            if(input.equals("n")) {
                break;
            }
            // Check if the input is an integer
            if(input.matches("-?\\d+")) { // The regex "-?\\d+" matches any integer
            sum += Integer.parseInt(input);
            System.out.println("Enter any key to continue or 'n' to end");
        } else {
            System.out.println("Please enter a valid integer:");
        }

        }
        scanner.close();
        return sum;
    }
    // public int calculateSumofProduct(int n) {
    //     int sum = 0;
    //     int product = 1;
    //     for (int i = 1; i <= n; i++) {
    //         product *= i; // Calculate the product 1*2*...*i
    //         sum += product; // Add the product to the sum
    //     }
    //     return sum;
    // }
    public int calculateSumofProduct(int n) {
        int sum = 0;
        int product = 1;
        StringBuilder expression = new StringBuilder("1");

        for (int i = 2; i <= n; i++) {
            product *= i;
            sum += product;
            expression.append(" + 1");
            for (int j = 2; j <= i; j++) {
                expression.append("*").append(j);
            }
        }

        System.out.println("Bieu thuc co dang: " + expression.toString());
        return sum;
    }

    // }
    public void printPrimeFactors(int n){
        System.out.print("Cac thua so nguyen to cua " + n + " la: ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n/i;
            }
        }
        System.out.println();
    } 
}
