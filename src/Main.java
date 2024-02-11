import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of your birth month(1-12): ");
        int birthMonth = in.nextInt();
        if(birthMonth <= 12 && birthMonth >= 1)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}