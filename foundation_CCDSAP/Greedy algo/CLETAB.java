import java.io.*;
import java.util.*;
class CLETAB {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-->0) {
        	int n = sc.nextInt();
            int m = sc.nextInt();
            int order[] = new int[m];
            for(int i = 0; i<m; i++) {
                order[i] = sc.nextInt();
            }
            Arrays.sort(order);
            int count = 0;
            for(int i = 0; i<m; i++) {
                for(int j = i+1; j<m; j++) {
                    if(order[i]!=order[j]){
                        i = j-1;
                        break;
                    }
                }
                count++;
            }
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