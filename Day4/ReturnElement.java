package Day4;
import java.util.*;

public class ReturnElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean[] seen=new boolean[26];
        boolean repeated=false;
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            if(seen[index]){
                System.out.println(String.valueOf(s.charAt(i)));
                repeated=true;
                break;
            }
            seen[index]=true;
        }
        if(!repeated){
            System.out.println("-1");
        }
    }
    
}
