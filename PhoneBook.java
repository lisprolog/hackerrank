//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
class PhoneBook{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			map.put(name, phone);
		}
		int result = 0;
		while(in.hasNext())
		{
			String s=in.nextLine();
			try{
			    result = map.get(s);
			    System.out.println(s + "=" + result);
			}catch(NullPointerException e){
			    System.out.println("Not found");
			}
		}
	}
}
