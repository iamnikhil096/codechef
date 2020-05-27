import java.io.*;
import java.util.*;
class CIELRCPT {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int menu[] = new int[12];
        menu[0] = 1;
        for(int i = 1; i<12; i++) {
            menu[i] = menu[i-1] * 2;
        }
        int t = sc.nextInt();
        while(t-- > 0) {
            int p = sc.nextInt();
            int totalItems = 0;
            int j = 11;
            while(p!=0) {
                if(p >= menu[j]) {
                    int quotient = p/menu[j];
                    totalItems += quotient;
                    p = p%menu[j];
                }
                else{
                    j--;
                }
            }
            System.out.println(totalItems);
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