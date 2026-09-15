import java.util.Scanner;
public class EmployeeId {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] empId=new int[n];
        boolean unique=true;
        for(int i=0;i<n;i++){
            empId[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(empId[i]==empId[j]){
                    unique=false;
                    break;
                }
                if(!unique){
                    break;
                }
            }
        }
        if(unique){
            System.out.println("Yes");

        }else{
            System.out.println("No");
        }
        sc.close();


    }
    
}
