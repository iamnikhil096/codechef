import java.io.*;
import java.util.*;
public class Refactoring {
	public static int calculate(int n, int m) {
		int count = 0;
        for(int i = m; i*i <= n; i++) {
            if(n%i == 0){
                count += calculate(n/i, i);
                //count += 2;
            }
        }
        return count+1;
	}
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		while(true){
			int n = sc.nextInt();
			System.out.println(calculate(n, 2)-1);
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