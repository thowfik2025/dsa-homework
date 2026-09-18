package UserDefindMethods;
import java.util.*;

public class ArrDuplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] result=new int[n];
        int count=0;
        
        for(int i=0;i<n;i++){
            int value=arr[i];
            if(value<0){
                value=-value;
            }
            int index=value-1;
            if(arr[index]<0){
                result[count]=value;
                count++;
            }else{
                arr[index]=-arr[index];
            }
        }
        
        
        for(int i=0;i<count;i++){
            System.out.print(result[i]+ " ");
        }
        
    }
}
