import java.io.*;
import java.util.*;
public class DivisorInc {
	public static int calculate(int n, int m) {
		if(n>m)
			return -1;
		if(n==m)
			return 0;
		int dp[] = new int[m+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[n] = 0;
		for(int i = n; i<=m; i++) {
			if(dp[i] == Integer.MAX_VALUE)
				continue;
			for(int j = 2; j*j <= i; j++) {
				if(i%j == 0){
					if(i+j <= m){
						dp[i+j] = Math.min(dp[i+j], dp[i] + 1);
					}
					int quotient = i/j;
					if(i+quotient <= m){
						dp[i+quotient] = Math.min(dp[i+quotient], dp[i] + 1);
					}
				}
			}
		}
		if(dp[m] == Integer.MAX_VALUE)
			return -1;
		//else.
		return dp[m];
	}
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		//while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(calculate(n, m));
		//}
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