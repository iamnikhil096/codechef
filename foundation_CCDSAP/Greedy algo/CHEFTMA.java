import java.io.*;
import java.util.*;
class CHEFTMA {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            int c[] = new int[n];
            for(int i = 0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            for(int i = 0; i<n; i++) {
                b[i] = sc.nextInt();
            }
            for(int i = 0; i<n; i++) {
                c[i] = a[i] - b[i];
            }
            Arrays.sort(c);
            int whiteBlack[] = new int[k+m];
            for(int i = 0; i<n; i++) {
                whiteBlack[i] = sc.nextInt();
            }
            Arrays.sort(whiteBlack);
            int i = k+m-1, j = n-1;
            while(i>=0 && j>=0) {
                if(whiteBlack[i] <= c[j]) {
                    //we can press that button.
                    c[j] -= whiteBlack[i];
                    //if(c[j] == 0) {
                      //  j--;
                    //}
                    j--;
                    i--; // we cannot press this button again.
                }else {
                    i--;
                }
            }
            long sum = 0;
            for(i = 0; i<n; i++) {
                sum += c[i];
            }
            System.out.println(sum);
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