package Arrays.MoreExercise;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, j, k, l;            //Declaring Variables
        int array[]=new int[30];     //using 1d array
        int temp[]=new int[30];       //using 1d array

        int num = Integer.parseInt(scanner.nextLine());

        temp[0] = 1;     //Initializing first variable of the array as 1
        array[0] = 1;   //Initializing first variable of the array as 1

        System.out.println("1");     //For first element
        for (i = 1; i < num; i++)      //To iterate through all the rows
        {
            for (j = 0; j < i; j++)    //To print the space
                System.out.print("");
            for (k = 1; k < num; k++)
            {
                array[k] = temp[k - 1] + temp[k];      //Initialize the array to store the pascal triangle elements
            }
            array[i] = 1;
            for (l = 0; l <= i; l++)
            {
                System.out.print(array[l]+" ");  //Print the array elements
                temp[l] = array[l];    //Copy the array elements to another array
            }
            System.out.println("");    //For next line
        }

    }
}