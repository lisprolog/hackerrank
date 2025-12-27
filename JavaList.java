import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	ArrayList<Integer> figures = new ArrayList<Integer>();
	for(int i = 0; i < n; i++){
	    figures.add(sc.nextInt());
	}
	int q = sc.nextInt();
	int i = 0;
	String query = "";
	int index = 0;
	int number = 0;
	while(i < q){
	    query = sc.next();
	    if(query.equals("Insert")){
		index = sc.nextInt();
		number = sc.nextInt();
		figures.add(index, number);
	    }else if(query.equals("Delete")){
		index = sc.nextInt();
		figures.remove(index);
	    }else{
		System.out.println("Error");
	    }
	    i++;
	}
	for (int j = 0; j< figures.size(); j++) {
	    System.out.print(figures.get(j) + " ");
	}
	System.out.println(""); 
    }
}
