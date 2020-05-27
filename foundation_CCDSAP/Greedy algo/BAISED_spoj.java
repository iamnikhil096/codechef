import java.io.*;
import java.util.*;
class BAISED_spoj {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s[] = new String[n];
            int preferred_rank[] = new int[n];
            for(int i = 0; i<n; i++) {
                s[i] = sc.next();
                preferred_rank[i] = sc.nextInt();
            }
            Arrays.sort(preferred_rank);
            long ans = 0;
            for(int i = 0; i<n; i++) {
                ans  = ans + Math.abs((i+1) - preferred_rank[i]);
            }
            System.out.println(ans);
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