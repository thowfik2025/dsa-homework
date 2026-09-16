package Day3;
import java.util.*;

public class ArrayDuplicate {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int x : arr) {

            if (set.contains(x)) {
                result.add(x);
            } else {
                set.add(x);
            }
        }

        if (result.isEmpty()) {
            System.out.println("No duplicates found");
        } else {
            System.out.println("Duplicate elements: " + result);
        }
    }
}