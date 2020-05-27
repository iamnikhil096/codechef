import java.io.*;
import java.util.*;
public class Alternating_current {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String s = sc.next();
		int l = s.length();
        if(l%2 != 0) {
            System.out.println("No");
        }else {
            Stack<Character> st = new Stack<Character>();
            for(int i = 0; i<l; i++) {
                char ch = s.charAt(i);
                if(st.empty()) {
                    st.push(ch);
                }else {
                    if(st.peek() == ch)
                        st.pop();
                    else
                        st.push(ch);
                }
            }
            if(st.empty())
                System.out.println("Yes");
            else
                System.out.println("No");
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