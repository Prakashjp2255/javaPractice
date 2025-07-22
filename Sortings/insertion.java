package Sortings;

public class insertion {
    public static void main(String[] args) {
        int arr[] = { 9, 7, 3, 2, 8, 8, 1 };

        for (int i = 1; i < arr.length; i++) {
            int k = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = k;
        }
        System.out.println("Sorted arr is : ");
        for (int s : arr) {
            System.out.print(s + " ");
        }
    }

}
