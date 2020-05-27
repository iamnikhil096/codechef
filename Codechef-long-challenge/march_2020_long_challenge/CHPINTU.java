import java.io.*;
import java.util.*;
class CHPINTU {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int f[] = new int[n]; //this stores the type of fruit in the basket.
            int p[] = new int[n]; //this stores the cost of fruit in that basket.
            for(int i = 0; i<n; i++) {
                f[i] = sc.nextInt();
            }
            for(int i = 0; i<n; i++) {
                p[i] = sc.nextInt();
            }
            int fruit[] = new int[m+1];
            Arrays.fill(fruit, -1);
            for(int i = 0; i<n; i++) {
                if(fruit[f[i]] < 0) {
                    fruit[f[i]] = 0;
                }
                fruit[f[i]] += p[i];
            }
            int min = Integer.MAX_VALUE;
            for(int i = 1; i<=m; i++) {
                if(fruit[i] != -1 && fruit[i] < min) {
                    min = fruit[i];
                }
            }
            //System.out.println(Arrays.toString(fruit));
            System.out.println(min);
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