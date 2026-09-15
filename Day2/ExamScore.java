import java.util.*;

public class ExamScore{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String input=sc.nextLine();
        String[] parts=input.split(" ");
    
        int[] scores=new int[n];
        for(int i=0;i<n;i++){
            scores[i]=Integer.parseInt(parts[i]);

        }
        for(int i=0;i<n;i++){
            System.out.print(scores[i]+" ");
            if((i+1)%4==0){
                System.out.println();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=scores[i];
        }
        double avg=(double)sum/n;
        System.out.printf("\nAverage : %.2f\n", avg);
        int lowestscore=scores[0];
        int highestscore=scores[0];
        for(int i=1;i<n;i++){
            if(scores[i]<lowestscore){
                lowestscore=scores[i];
            }
            if(scores[i]>highestscore){
                highestscore=scores[i];
            }
            
        }
        System.out.println("Lowest Scores :" +lowestscore);
        System.out.println("Highest Scores :" +highestscore);
        double[] deviations=new double[n];
        for(int i=0;i<n;i++){
            deviations[i]=scores[i]-avg;
            System.out.printf("%d\t%.2f\n", scores[i], deviations[i]);
        }
        double sumSquareDeviation=0;
        double stand=0;
        for(int i=0;i<n;i++){
            sumSquareDeviation+=deviations[i]*deviations[i];
            stand=Math.sqrt((double)sumSquareDeviation/n);
        }
        System.out.println("Standard deviation:"+stand);
        int count=0;
        double lowerlimit=avg-stand;
        double higherlimit=avg+stand;
        for(int i=0;i<n;i++){
            
            if(scores[i] >= lowerlimit && scores[i] <= higherlimit){
                count++;
            }
        
        }
        System.out.println("Scores with one standard deviations:"+count);
        sc.close();
        

    }
}