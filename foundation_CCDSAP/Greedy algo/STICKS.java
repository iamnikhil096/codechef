import java.io.*;
import java.util.*;
class STICKS {
    public static int shorterSide(int a[], int i) {
        for( ; i>0; i--){
            if(a[i] == a[i-1])
                return i;
        }
        return -1;
    }
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long area = -1;
            for(int i = n-1; i>0; i--) {
                if(a[i] == a[i-1]) {
                    //two longer sie of a rectangle is found, now we need to get two shorter sides.
                    int x = shorterSide(a, i-2);
                    if(x == -1)
                        break;
                    area = a[i] * a[x];
                    break;
                }
            }
            System.out.println(area);
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