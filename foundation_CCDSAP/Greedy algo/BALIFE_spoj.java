import java.io.*;
import java.util.*;
class BALIFE_spoj {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int n = sc.nextInt();
        while(n != -1){
            long a[] = new long[n];
            for(int i = 0; i<n; i++) {
                a[i] = sc.nextLong();
            }
            long sum = 0;
            for(int i = 0; i<n; i++) {
                sum += a[i];
            }
            if(sum%n == 0){
                long avg = sum/n;
                for(int i = 0; i<n; i++) {
                    a[i] = a[i] - avg;
                }
                long max = Math.abs(a[0]);
                for(int i = 1; i<n; i++) {
                    a[i] += a[i-1];
                    max = Math.max(max, Math.abs(a[i]));
                }
                System.out.println(max);
            }else {
                System.out.println("-1");
            }
            n = sc.nextInt();
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