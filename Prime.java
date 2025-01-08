import java.util.Scanner;


public class Prime {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        int count = 0;

        for(int i =1;i<=num;i++){
            if(num%i == 0){
                count++;
            }
        }

        if(count == 2){
        System.out.println("It is prime");
        }

        else{
        System.out.println("It is not a prime");
        }
}
}
