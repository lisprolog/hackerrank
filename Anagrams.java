import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }	
        String aToLower = a.toLowerCase();
        String bToLower = b.toLowerCase();
        int n = a.length();
        char [] aArray = new char[n];
        char [] bArray = new char[n];
        
        for(int i = 0; i < n; i++){
          aArray[i] = aToLower.charAt(i);
        }
        
        for(int i = 0; i < n; i++){
          bArray[i] = bToLower.charAt(i);
        }
        char temp;
        for(int i=0;i<n-1;i++){
	        for(int j=0;j<n-1;j++){
		        if(aArray[j] > aArray[j+1]){
		          temp = aArray[j+1];
		          aArray[j+1] = aArray[j];
			  aArray[j]=temp;
			}
		}
        }
        char temp2;
        for(int i=0;i<n-1;i++){
	        for(int j=0;j<n-1;j++){
		        if(bArray[j] > bArray[j+1]){
		          temp2 = bArray[j+1];
		          bArray[j+1] = bArray[j];
			  bArray[j]=temp2;
			}
		}
        }
	
        boolean equals = true;
        for(int i = 0; i < n; i++){
          if(aArray[i] != bArray[i]){
            equals = false;
          }
        }
        return equals;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
