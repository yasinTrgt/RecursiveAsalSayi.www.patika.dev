import java.util.Scanner;

public class Main {
    static boolean asalmi(int number, int x){

        if (number < 2) {

            return false;

        }
        if(number == 2){
            return true;
        }
        if (number%x != 0 && x>=number-1) {

            return true;
        }else {
            if (number%x == 00) {

                return false;

            }else{
                return asalmi(number, x+1);
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = sc.nextInt();
        final int bolen = 2;

        if (asalmi(number, bolen)) {

            System.out.println(number +" Sayısı asaldır.");

        }else {
            System.out.println(number +" Sayısı asal değildir.");
        }
    }
}
