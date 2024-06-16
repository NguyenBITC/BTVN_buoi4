public class App {
    public static void main(String[] args) throws Exception {
        //tinh tổng các số
        Calculator calculator = new Calculator();
        int result = calculator.calculateSum();
        System.out.println("Tong la: " + result);

        int sumofproduct = calculator.calculateSumofProduct(5);
        System.out.printf("Tong cua tich la: %d \n",sumofproduct);
        //tính thua so nguyen to
        calculator.printPrimeFactors(12);
        calculator.printPrimeFactors(35);
        calculator.printPrimeFactors(86);


}

}

