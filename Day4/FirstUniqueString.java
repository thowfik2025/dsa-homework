package Day4;
import java.util.Scanner;

public class FirstUniqueString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        int[] count=new int[26];
        boolean unique=false;
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)-'a']==1){
                unique=true;
                System.out.println(i);
                break;
            }
        }
        if(!unique){
            System.out.println(-1);
        }
        
    }
    
}
