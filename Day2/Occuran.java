import java.util.Scanner;

public class Occuran{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] parts=input.split(" ");
        
        int[] arr=new int[parts.length];
        

        for(int i=0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i]);
        }
        int n=arr[0];
        int x=arr[1];
        String score=sc.nextLine();
        String[] marks=score.split(" ");
        int[] occur=new int[n];
        for(int i=0;i<n;i++){
            occur[i]=Integer.parseInt(marks[i]);
        }
        int first=-1;
        int last=-1;
        int left=0;
        int right=n-1;

        while(right>-1 && left<n){

            if(occur[left]==x && first==-1){
                first=left;
            }
            if(occur[right]==x && last==-1){
                last=right;
            }
            if(first != -1 && last == -1){
                last = first;
            }
            left++;
            right--;
                
            
        }
        System.out.println(first+" "+last);
        sc.close();
    }
}