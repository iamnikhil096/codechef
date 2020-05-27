import java.io.*;
import java.util.*;
class C_minimal_string_codeforces {
	public static boolean lessThan(char ch, int alpha[]) {
		int k = ch-97;
		for(int i = 0; i<k; i++){
			if(alpha[i] != 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String s = sc.next();
		int l = s.length();
		Stack<Character> st = new Stack<Character>();
		int alpha[] = new int[26];
		for(int i = 0; i<l; i++) {
			char ch = s.charAt(i);
			alpha[ch - 97] += 1;
		}
		StringBuilder ans = new StringBuilder(l);
		for(int i = 0; i<l; i++) {
			char ch = s.charAt(i);
			alpha[ch - 97] -= 1;
			if(lessThan(ch, alpha)) {
				ans.append(ch);
				while(!st.empty()) {
					char temp = st.peek();
					//alpha[ch-97] -= 1;
					if(lessThan(temp, alpha)) {
						ans.append(temp);
						st.pop();
					}else {
						//alpha[ch - 97] += 1;
						break;
					}
				}
			}else {
				st.push(ch);
			}
		}
		while(!st.empty()) {
			ans.append(st.pop());
		}
		System.out.println(ans);
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