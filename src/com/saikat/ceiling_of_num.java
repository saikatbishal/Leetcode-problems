package com.yashpd;

public class ceiling_of_num {
    public static void main(String[] args) {
        // ceiling of a number from an array (order-agnostic)
        int[] arr = {12, 34, 55, 67, 89};
        int target = 20;

        int[] arr2 = {99,87,78,69,57,34,12,3,1};
        int target2 = 45;

//        System.out.println(ceilingElement(arr, target));
        System.out.println(ceilingElement(arr2, target2));
    }

    static int ceilingElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        if (arr[start] < arr[end]) {
            //ascending sorted
            while (start <= end){
                int mid = start + (end-start)/2;

                if (arr[mid] == target){
                    return arr[mid];
                }
                if (arr[mid] > target){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }

            }
            return arr[start];
        }
        else {
            // descending sorted
            while (start <= end){
                int mid = start + (end-start)/2;

                if (arr[mid] == target){
                    return arr[mid];
                }
                if (arr[mid] < target){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }

            }
            return arr[end];
        }
    }
}
