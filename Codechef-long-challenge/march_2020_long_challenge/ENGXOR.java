import java.io.*;
import java.util.*;
class ENGXOR {
    public static short oneCount(int v) {
        short count = 0;
        while(v != 0) {
            if((v&1) == 1){
                count++;
            }
            v = v>>1;
        }
        return count;
    }
    public static int calculate(int a[], int p, int n, short bits[]) {
        int even1 = 0;
        for(int i = 0; i<n; i++) {
            int v = a[i]^p;
            int b = bits[v];
            if(b%2 == 0) {
                even1++;
            }
        }
        return even1;
    }
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        short bits[] = new short[200000000];
        bits[0] = 0;
        for(int i = 1; i<200000000; i++) {
            short x = oneCount(i);
            bits[i] = x;
        }
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int Q = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            for(int i = 0; i<Q; i++) {
                int p = sc.nextInt();
                int even1 = calculate(a, p, n, bits);
                int odd1 = n-even1;
                System.out.println(even1 + " " + odd1);
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