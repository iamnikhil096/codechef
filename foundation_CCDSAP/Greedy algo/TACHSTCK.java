import java.io.*;
import java.util.*;
class TACHSTCK {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int n = sc.nextInt();
        int d = sc.nextInt();
        int l[] = new int[n];
        for(int i = 0; i<n; i++) {
        	l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int count = 0;
        for(int i = 0; i<n-1; ){
        	if(l[i+1] - l[i] <= d){
        		count++;
        		i += 2;
        	}else {
        		i++;
        	}
        }
        System.out.println(count);
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