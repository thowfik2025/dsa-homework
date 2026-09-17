package Day4;
import java.util.*;

public class BestBuySell {
    public static void main(String[] args) {
        
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] prices=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        int minprice=prices[0];
        int maxprofit=0;
        boolean besttime=false;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            int profit=prices[i]-minprice;
            if(profit>maxprofit){
                maxprofit=profit;
            }
            besttime=true;
        }
        System.out.println(maxprofit);
            
        if(!besttime){
            System.out.println("0");
        }
    }
}
