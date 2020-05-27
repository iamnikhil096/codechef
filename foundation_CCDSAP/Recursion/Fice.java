import java.io.*;
import java.util.*;
public class Fice {
    public static int calculate(int n, int m, boolean fire, boolean ice) {
        if(n==0)
            return 1;
        int count = 0;
        for(int i = 1; i<=n; i+=2) {
            if(fire == true){
                count = (count + calculate(n-i, m, false, true))%m;
            }else {
                count = (count + calculate(n-i, m, true, false))%m;
            }
        }
        return count%m;
    }
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int count = calculate(n, m, true, false);
            count = (count + calculate(n, m, false, true))%m;
            System.out.println(count);
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