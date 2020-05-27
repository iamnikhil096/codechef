import java.io.*;
import java.util.*;
class MANYCHEF {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int l = s.length();
            char ans[] = new char[l];
            for(int i = 0; i<l; i++) {
                char ch = s.charAt(i);
                ans[i] = ch;
            }
            for(int i = l-1; i>=0; i--) {
                if((i-3 >= 0) &&(ans[i] == 'F' || ans[i] == '?')) {
                    if((ans[i-1] == 'E' || ans[i-1] == '?') && (ans[i-2] == 'H' || ans[i-2] == '?') && (ans[i-3] == 'C' || ans[i-3] == '?')) {
                        ans[i] = 'F';
                        ans[i-1] = 'E';
                        ans[i-2] = 'H';
                        ans[i-3] = 'C';
                        i = i-3;
                    }else if(ans[i] == '?'){
                        ans[i] = 'A';
                    }
                }else {
                    if(ans[i] == '?'){
                        ans[i] = 'A';
                    }
                }
            }
            StringBuilder sb = new StringBuilder(l);
            for(int i = 0; i<l; i++) {
                sb.append(ans[i]);
            }
            System.out.println(sb);
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