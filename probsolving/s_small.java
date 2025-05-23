package probsolving;

public class s_small {
    static int sec_smallest(int[] arr) {
        
        int min1 = 0, min2 = 0;

        System.out.println("Before sorting the array : ");
        for (int s : arr) {
            System.out.print(s + " ");
        }

        // second smallest

        if (arr[0] < arr[1]) {
            min1 = arr[0];
            min2 = arr[1];
        } else if (arr[0] > arr[1]) {
            min1 = arr[1];
            min2 = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }

        }
        return min2;


    }

    static int sec_largest(int[] arr) {
        int max1 = 0, max2 = 0;
        System.out.println();

        // second largest
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else if (arr[0] < arr[1]) {
            max1 = arr[1];
            max2 = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;


    }

    public static void main(String[] args) {
        int arr[] = {88, 12, 24, 44, 101};

        int second_smallest = sec_smallest(arr);

        System.out.println("\nThe second smallest array is : " + second_smallest);

        int second_largest = sec_largest(arr);
        System.out.println("The second largest array is : " + second_largest);


    }
}
