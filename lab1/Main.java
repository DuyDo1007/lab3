//JAVA 
import java.util.Scanner; 

@SuppressWarnings({"unchecked", "deprecation"})
public class Main { 
    public static void main(String[] args) { 
        Scanner keyboard = new Scanner(System.in);
        int k = keyboard.nextInt();
        int n = keyboard.nextInt();
        C(k,n);

    }
    public static int C(int k,int n){
        if (k == n || k == 0) return 1;
        return C(k-1,n-1) + C(k-1,n);
    }
}