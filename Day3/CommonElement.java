package Day3;
import java.util.*;

public class CommonElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int m=sc.nextInt();
        int[] nums1=new int[n];
        int[] nums2=new int[m];
        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            nums2[i]=sc.nextInt();
        }

        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int x : nums1){
            set1.add(x);
        }
        for(int x : nums2){
            set2.add(x);
        }
        int answer1=0;
        int answer2=0;
        for(int x : nums1){
            if(set2.contains(x)){
                answer1++;
            }
        }
        for(int x : nums2){
            if(set1.contains(x)){
                answer2++;
            }
        }
        int[] result={answer1,answer2};
        System.out.println(Arrays.toString(result));

    }
    
    
}
