package Day3;
import java.util.*;
public class SumUniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int sum=0;
        for(int x : map.keySet()){
            if(map.get(x)==1){
                sum+=x;
            }
        }
        System.out.println(sum);
    }
}