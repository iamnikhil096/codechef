import java.io.*;
import java.util.*;
class MMPROD {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int t = sc.nextInt();
        long mod = 1000000007;
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long a[] = new long[n];
            for(int i = 0; i<n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            int pos = n-1, neg = 0;
            long ans = 1;
            if(k%2!=0 && a[n-1] < 0) {
                //all elements are negative and the resultant product is negative too.
                for(int i = pos; i>=n-k; i--) {
                    ans = ((ans*a[i])%mod+mod)%mod;
                }
                System.out.println(ans);
                continue;
            }
            //else.
            while(k!=0) {
                if(k>=2 && (a[neg]*a[neg+1] > a[pos]*a[pos-1])){
                    ans = ((((ans*a[neg])%mod+mod)%mod * a[neg+1])%mod + mod)%mod;
                    neg += 2;
                    k -= 2;
                }else {
                    ans = ((ans*a[pos])%mod + mod)%mod;
                    pos--;
                    k--;
                }
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