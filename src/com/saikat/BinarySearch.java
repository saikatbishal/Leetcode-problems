package com.doesjava;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {13,24,56,78,99,123,832,9987};
        int target = 123;

        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        if (arr[start] < arr[end]){
            // ordered ascending
            while (start <= end){
                int mid = start + (end-start)/2;

                if (arr[mid] == target){
                    return mid;
                }
                if (arr[mid] > target){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        else {
            // ordered descending
            while (start <= end){
                int mid = start + (end-start)/2;

                if (arr[mid] == target){
                    return mid;
                }
                if (arr[mid] < target){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
