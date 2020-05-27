import java.io.*;
import java.util.*;
class LAZER {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            long a[] = new long[n+1]; // we start from index 1 for ease.
            for(int i = 1; i<=n; i++) {
                a[i] = sc.nextLong();
            }
            StringBuilder sb = new StringBuilder(q);
            for(int i = 0; i<q; i++) {
                int x1 = sc.nextInt();
                int x2 = sc.nextInt();
                long y = sc.nextLong();
                int count_collision = 0;
                while(x1 < x2) {
                    long y1 = a[x1];
                    long y2 = a[x1+1];
                    if(y1 <= y && y2 >= y) {
                        count_collision++;
                    }else if(y1 >= y && y2 <= y) {
                        count_collision++;
                    }
                    x1++;
                }
                sb.append(Integer.toString(count_collision)+"\n");
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