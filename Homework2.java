/**
 *Java 1. Homework 2.
 *
 *@author Ivan Iov
 *@version dated Nov 27, 2017
 */
class Homework2 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
    }
    //Task 1
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
                System.out.println("arr[" + i + "] = " + arr[i]);
            } else {
                arr[i] = 1;
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }
    }
    //Task 2
    public static void fillArray() {
        int[] arr1 = new int[8];
        for(int i = 0, j = 0; i < arr1.length && j < 22; i++, j = j+3) {
            arr1[i] = j;
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }
    }
    //Task 3
    public static void changeArray() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
    }
}