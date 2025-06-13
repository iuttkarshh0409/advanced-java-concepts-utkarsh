import java.util.Arrays;

class ArrayClassDemo {
    public static void main(String[] args) {

        // allocate and initialize array
        int array[] = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = -3 * i;

        // display, sort and display the array
        System.out.print("Original contents: ");
        display(array);

        Arrays.sort(array);
        System.out.print("Sorted: ");
        display(array);

        Arrays.fill(array, 2, 6, -1);
        System.out.print("After fill(): ");
        display(array);

        Arrays.sort(array);
        System.out.print("After sorting again: ");
        display(array);

        // binary search for -9
        System.out.print("The value -9 is at location ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);

        // use copyOf()
        int[] copy = Arrays.copyOf(array, array.length);
        System.out.print("Copied array using copyOf(): ");
        display(copy);

        // use copyOfRange()
        int[] sliced = Arrays.copyOfRange(array, 3, 7);
        System.out.print("Sliced array from index 3 to 6 using copyOfRange(): ");
        display(sliced);

        // compare arrays
        boolean areEqual = Arrays.equals(array, copy);
        System.out.println("array and copy are equal? " + areEqual);

        // convert array to string
        System.out.println("Array as string: " + Arrays.toString(array));

        // mismatch (Java 9+)
        int[] another = Arrays.copyOf(array, array.length);
        another[5] = 100;
        int mismatchIndex = Arrays.mismatch(array, another);
        System.out.println("First mismatch at index: " + mismatchIndex);
    }

    static void display(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
