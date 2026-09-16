package Day3;
import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        boolean duplicate=false;
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(map.containsKey(x)){
                int prev_index=map.get(x);
                if(i-prev_index<=k){
                    duplicate=true;
                    System.out.println(duplicate);
                    break;
                    
                }
            }else{
                System.out.println(duplicate=false);
                break;

            }
            map.put(x,i);
        }
        
        

    }
    
}
