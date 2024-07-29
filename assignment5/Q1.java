package assignment5;

import java.util.Arrays;

/**
 * 1. Write a Java Program to search an element in an array using Binary Search.
 * 
 * 
 * 2. Write a Java Program to swap between the highest and lowest element in an
 * array.
 
 * 3. Write a java program that finds the second smallest element in an array and eliminate it.
 * (For example, I/P: [9,3,1,6,4] O/P: [9,1,6,4]).
 * 
 
 */
class OperationArray {
    private int highest(int[] arr) {
        int maxInd = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[maxInd] < arr[i]) {
                maxInd = i;
            }
        }
        return maxInd;
    }

    private int lowest(int[] arr) {
        int minInd = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[minInd] > arr[i]) {
                minInd = i;
            }
        }
        return minInd;
    }

    public void swapElement(int[] arr) {
        int h = highest(arr);
        int l = lowest(arr);

        System.out.println(arr[secondlowest(arr)]);
        int temp = arr[h];
        arr[h] = arr[l];
        arr[l] = temp;

    }
    private int secondlowest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = num;
            } else if (num < secondSmallest && num != firstSmallest) 
            // second condition is need for duplicate element checking, if multiple lowest
            // element is there then it carefully dintinct second lowest
            {
                secondSmallest = num;
            }
        }

        return secondSmallest;        
           
    }
    public int[] removeElement(int[] array) {
        int element=secondlowest(array);
        int[] newArray = new int[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != element ) {
                newArray[j++] = array[i];
            }
        }

        return newArray;
    }
    public void show(int[] arr){
        for (int x : arr) {
            System.out.print(x + " , ");
        }
    }
}

public class Q1 {
    public static boolean binarySearch(int[] arr, int number) {
        int start = 0;
        int len = arr.length;
        while (start <= len) {
            int mid = start + ((len - start) / 2);
            // System.out.println("mid="+mid);
            if (arr[mid] == number) {
                return true;
            }
            if (arr[mid] > number) {
                len = mid - 1;
            } else
                start = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {
                2, 3, 4, 5, 1, 9, 12
        };
        Arrays.sort(arr);
        // System.out.println(binarySearch(arr,12));

        OperationArray swl = new OperationArray();
        swl.swapElement(arr);
        swl.show(arr);
       
        System.out.println();

        int[] newArray=swl.removeElement(arr);
        swl.show(newArray);
    }
}
