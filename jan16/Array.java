package jan16;

import java.util.Scanner;

public class Array {
    public static void main(String[] args)
    {
//        int x [] = new int[3];
//        String names[] = new String[3];
//        double salary[] = new double[3];
//        boolean ans[] = new boolean[3];
//        char data[] = new char[3];
//        long[] values = new long[3];
//        byte [] val = new byte[3];

//        x[0] = 90;
//        x[1]=11;
//        x[2]=12;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:" );
        int size = sc.nextInt();
        int[] x = new int[size];

        System.out.println("Enter the values of array:");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }



        System.out.println("Array Elements are");
        for(int i=0;i< x.length;i++)
        {
            System.out.println(x[i]);
        }

     }
}
