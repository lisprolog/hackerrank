import java.util.Scanner;

public class JavaSubstringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        String [] allStrings = new String[s.length()-k+1];
        for(int i = 0; i < s.length()-k+1; i++){
          allStrings[i] = s.substring(i,i+k);
        }
        int n = allStrings.length;
        smallest = allStrings[0];
        largest = allStrings[0];
        for(int i = 0; i < n; i++){
            if(allStrings[i].compareTo(smallest) < 0){
		smallest = allStrings[i];
            }else if(allStrings[i].compareTo(largest) > 0){
		largest = allStrings[i];
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
