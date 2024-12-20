package Core;

public class bubblesort {

    public static void main(String[] args) {
        int []a = {1, 5, 2, 7, 2, 8, 4};

        // Bubble sort algorithm
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // The second largest value will be the second last element in the sorted array
        System.out.println("Second Largest Value: " + a[a.length - 2]);
    }
}
