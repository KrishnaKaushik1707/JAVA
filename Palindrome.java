import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        int number;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        int Reverse_number = 0, temp = number;
        while(temp>0){
            int remainder = temp%10;
            Reverse_number = Reverse_number*10 + remainder;
            temp = temp/10;
        }

        System.out.println("Reverse_number is: " + Reverse_number);

        
        if(number == Reverse_number){
            System.out.println("It is a palindrome!");
        }
        else{
            System.out.println("It is a not palindrome!");
        }

    }
}
