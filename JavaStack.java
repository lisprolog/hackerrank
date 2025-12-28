import java.util.*;
class JavaStack{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		boolean result = true;
		while (sc.hasNext()) {
			String input=sc.next();
			char c = input.charAt(0);
			if(input.length() % 2 == 1){
			    result = false;
			    //System.out.println("%");
			}else if(c == '}' || c == ']' || c == ')'){
			    result = false;
			    //System.out.println("Closed bracket");
			}
			char pop;
			for(int i = 0; i < input.length(); i++){
			    c = input.charAt(i);
			    if(c == '(' || c == '[' || c == '{'){
				stack.push(c);
				//System.out.println("push"+c);
			    }else if(c == ')' || c == ']' || c == '}'){
				try{
				    pop = stack.pop();
				    //System.out.println("pop"+pop);
				}catch(EmptyStackException e){
				    result = false;
				}
			    }else{
				System.out.println("else");
			    }
			}
			if(!stack.empty()){
			    //System.out.println("stack not empty");
			    result = false;
			}
			System.out.println(result);
			stack.clear();
			result = true;
		}
	}
}
