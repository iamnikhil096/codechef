import java.io.*;
import java.util.*;
public class PrimePolynom {
    public static boolean checkPrime(int n) {
        if(n<2)
            return false;
        for(int i = 2; i*i <= n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
	public static int calculate(int a, int b, int c) {
		int k = 0;
        while(checkPrime(a*k*k + b*k + c))
            k++;
        return k;
	}
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		//while(true){
			int A = sc.nextInt();
			int B = sc.nextInt();
            int C = sc.nextInt();
			System.out.println(calculate(A, B, C));
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