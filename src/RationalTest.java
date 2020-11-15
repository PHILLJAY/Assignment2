import java.util.Scanner;

public class RationalTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();//gets the integers and for the numerator and denominator
        int dom1 = scan.nextInt();//of the first number
        RationalNumber a = new RationalNumber(num1, dom1);
        int num2 = scan.nextInt();
        int dom2 = scan.nextInt();
        RationalNumber b = new RationalNumber(num2, dom2);

        int x = a.compareTo(b);

        if (x == 0){//determines if the difference between the numbers is greater than 0
            System.out.print("the numbers are within 0.0001");

        }
        else{
            System.out.print("the numbers are not within 0.0001");
        }
    }
}
