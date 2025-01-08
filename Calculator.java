import java.util.Scanner;


public class Calculator
{
    public static void main(String [] args){

    int operator,n1,n2;
    int result = 0;

    System.out.print("1-Add/n 2-Sub/n 3-Mul/n 4-Div ");

    System.out.print("Enter any operator: ");
    Scanner sc = new Scanner(System.in);
    operator = sc.nextInt();

    System.out.print("Enter 1st num: ");
    n1 = sc.nextInt();

    System.out.print("Enter 2nd num: ");
    n2 = sc.nextInt();


    switch(operator)
    {
        case 1: result = n1+n2;
        break;

        case 2: result = n1-n2;
        break;
        
        case 3: result = n1*n2;
        break;

        case 4: 
            result = n1/n2;
        
        break;

        default:
        System.out.println("invalid operator!!!");
        break;
    }

    System.out.println("result ="+ result);
}
}