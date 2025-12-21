import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        
        BigInteger bi1 = new BigInteger(n);
        boolean b1 = bi1.isProbablePrime(1);
        
        if(b1){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
