import java.util.Scanner;

public class Placementcutoff {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] parts=input.split(" ");
        
        int[] arr=new int[parts.length];
        

        for(int i=0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i]);
        }
        int n=arr[0];
        int c=arr[1];
        String score=sc.nextLine();
        String[] marks=score.split(" ");
        int[] cutoff=new int[n];
        for(int i=0;i<n;i++){
            cutoff[i]=Integer.parseInt(marks[i]);
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(cutoff[i]>=c){
                count++;
            }
        }
        System.out.println("Count"+count);
        sc.close();

    }
    
}
