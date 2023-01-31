package assigment1;

import java.util.ArrayList;

public class Combine {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3};
        int[] list2 = {4, 5, 6};

        ArrayList<Integer> res = combineLists(list1, list2);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    // method to combine two lists
    public static ArrayList<Integer> combineLists(int[] list1, int[] list2) {
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        while (i < list1.length && j < list2.length) {
            result.add(list1[i]);
            result.add(list2[j]);

            i++;
            j++;
        }

        // dealing with remaining part of list1
        while (i < list1.length) {
            result.add(list1[i]);
            i++;
        }

        // dealing with remaining part of list2
        while (j < list2.length) {
            result.add(list2.length);
        }

        return result;
    }
}
