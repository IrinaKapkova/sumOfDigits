import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       System.out.println("Введите число: ");

       if (scan.hasNextLong()) {
           long n = scan.nextLong();
           System.out.println("Сумма всех цифр введенного числа равна: "+sumOfDigits (n));
       } else {
           System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
       }

   }
    public static long sumOfDigits (long n) {
        int sum=0;
        while (n !=0){
            sum+=n%10;
            n/=10;
        }
        return Math.abs(sum);
    }
}