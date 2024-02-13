package Interviewpratice;
import java.util.Scanner;

public class Q1AppendFunction {


    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements  in first array::");
        int m = sc.nextInt();
        System.out.print("\nEnter the number of elements in second array:: ");
        int n = sc.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];

        System.out.println("Enter the elements for the first array:-\n");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("\nEnter the elements for the second array:-\n");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int arr3[] = append(arr1, arr2);
        for (int e : arr3) {
            System.out.print(e + " ");
        }

    }

    static int[] append(int arr1[], int arr2[])
    {
        int k = arr1.length + arr2.length;
        int i = 0;
        int arr3[] = new int[k];
        int a = 0;
        int b = 0;

        while (i < k)
        {
            if(a<arr1.length)
            {
                arr3[i]=arr1[a];
                a++;
            }
            else if(b<arr2.length)
            {
                arr3[i]=arr2[b];
                b++;
            }
            i++;
        }
        return arr3;
    }
}

