package Day3;
import java.util.*;

public class UniqueOccur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        HashSet<Integer>set=new HashSet<>();
        boolean unique=true;
        for(int count : map.values()){
            if(set.contains(count)){
                unique = false;
                break;
            }else{
                set.add(count);
            }
        }
        System.out.println("Occurance counts are unique");

        
    }
    
}
