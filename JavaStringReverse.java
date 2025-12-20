import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String Areverse = "";
        int n = A.length();
        for(int i = n-1; i > -1; i--){
          Areverse += A.charAt(i);
        }
        if(A.compareTo(Areverse) == 0){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
    }
}
