import java.io.*;
import java.util.*;
class BADMATH {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        long power[] = new long[101];
        power[0] = 1;
        long mod = 1000000007;
        for(int i = 1; i<n; i++) {
            power[i] = (2*power[i-1])%mod;
        }
        int t= sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt()
            int m = sc.nextInt();
            String s = sc.next();
            for(int i = 0; i<n; i++) {
                if(s.charAt(i) == '_')
                    count++;
            }
            int p = (1<<count);
            long dp[][] = new long[n][p];
            
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