import java.util.Scanner;
import java.util.ArrayList;
public class Last_index_of_Heap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] str = in.nextLine().split(" ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(array[0]);
        int index = 0;
        if (n <= 3) {
            for (int i = 1; i < n; i++) {
                if (array[0] >= array[i]) {
                    arr.add(array[i]);
                    index = i;
                } else {
                    break;
                }
            }
        }
        else {
            for (int i = 1; i < 3; i++) {
                if (array[i] <= array[0]) {
                    arr.add(array[i]);
                    index = i;
                } else break;
            }
        }
        if (arr.size() < 3) {
        }
        else {
            for (int i = 3; i < n; i++) {
                if ((i % 2 == 0) && (array[(i / 2) - 1] >= array[i])) {
                    index = i;
                    arr.add(array[i]);
                } else if ((i % 2 == 1) && (array[(i - 1) / 2] >= array[i])) {
                    index = i;
                    arr.add(array[i]);
                } else
                    break;
            }

        }
        System.out.println(index);
    }
}

