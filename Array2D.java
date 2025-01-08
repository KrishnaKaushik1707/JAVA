import java.util.Scanner;

class Array2D {
    public static void main(String [] args){
        int arr [][] = new int [3][3];
        Scanner in =new Scanner(System.in);

        //input
        for(int i = 0; i<3; i++){
            for(int j = 0; j < arr[i].length ; j++){
                arr [i][j] = in.nextInt();
            }
        }

        for(int i = 0; i<3; i++){
            for(int j = 0; j < arr[i].length ; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
    
}
