import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// https://www.hackerrank.com/challenges/java-arraylist/problem
public class ArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <List<Integer>> graph = new ArrayList<List<Integer>>();
	int rows = sc.nextInt();
	if(rows > 0){
	    for(int i = 0; i < rows;i++){
		graph.add(new ArrayList<Integer>());
		int elements = sc.nextInt();
		int element = 0;
		for(int j = 0; j < elements; j++){
		    element = sc.nextInt();
		    graph.get(i).add(element);
		}
	    }
	}else{
	    graph.add(new ArrayList<Integer>());
	}
	int queries = sc.nextInt();
	int row = 0;
	int column = 0;
	for(int i = 0; i < queries; i++){
	    row = sc.nextInt();
	    column = sc.nextInt();
	    try{
		System.out.println(graph.get(row-1).get(column-1));
	    }catch(Exception e){
		System.out.println("ERROR!");
	    }
	}
    }
}
