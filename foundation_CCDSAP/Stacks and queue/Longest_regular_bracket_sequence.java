import java.io.*;
import java.util.*;
public class Longest_regular_bracket_sequence {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String s = sc.next();
		int l = s.length();
        int maxlen = Integer.MIN_VALUE;
        Stack<Character> st = new Stack<Character>();
        int len = 0;
        for(int i = 0; i<l; i++) {
        	char ch = s.charAt(i);
        	if(st.empty() && ch == ')') {
        		//st.push(ch);
        		//len++;
        		//don't add anything to the stack;
        	}else if(ch == '(') {
        		//add this to the stack.
        		st.push(ch);
        	}else {
        		//ch == ')' && stack is not empty.
        		st.pop(); // remove the top of stack i.e. '(' .
        		len += 2;
        		if(st.empty()) {
        			maxlen = Math.max(len, maxlen);
        			len = 0;
        		}
        	}

        }
	}
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
}