import java.io.*;
import java.util.*;
class MAXDIFF {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-->0) {
        	int n = sc.nextInt();
        	int k = sc.nextInt();
        	int w[] = new int[n];
        	for(int i = 0; i<n; i++) {
        		w[i] = sc.nextInt();
        	}
        	Arrays.sort(w);
        	if(k > n/2)
        		k = n-k;
        	int sum1 = 0, sum2 = 0;
        	for(int i = 0; i<k; i++)
        		sum1 += w[i];
        	for(int i = k; i<n; i++) {
        		sum2 += w[i];
        	}
        	System.out.println(Math.abs(sum2-sum1));
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