import java.io.*;
import java.util.*;
public class Trisq {
	public static int squares(int b) {
        if(b<=2)
            return 0;
		return (b/2 - 1) + squares(b-2);
	}
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int b[] = new int[10001];
        for(int i = 1; i<=1000; i++) {
            b[i] = squares(i);
        }
        int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			System.out.println(b[n]);
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