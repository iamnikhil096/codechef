import java.io.*;
import java.util.*;
class noChange {
  public static void printSolution(long d[], int n) {
    System.out.print("YES");
    for(int i = 0; i<n; i++) {
      System.out.print(" "+d[i]);
    }
    System.out.println();
  }
  public static void calc(long d[], int n, long p) {
    boolean gotSolution = false;
    int k = -1;
    for(int i = n-1; i>=0; i--) {
      if(d[i] > p) {
        d[i] = 1;
        k = i;
        gotSolution = true;
        break;
      }else if(p%d[i] != 0) {
        d[i] = (p/d[i]) + 1;
        k = i;
        gotSolution = true;
        break;
      }
    }
    //if we have the answer then make all the other elements simply zero.
    if(gotSolution) {
      for(int j = 0; j<n; j++){
        if(j!=k)
          d[j] = 0;
      }
      printSolution(d, n);
      return;
    }
    //else the d[] array contains elements that divide p.
    for(int i = 0; i<n-1; i++) {
      if(d[i+1]%d[i] == 0) {
        d[i] = 0;
      }else {
          long temp = d[i+1];
        d[i+1] = (p/d[i+1]) -1;
        p = temp;
        d[i] = (p/d[i]) + 1;
        for(int j = 0; j<n; j++) {
          if(j!=i && j!=(i+1))
            d[j] = 0;
        }
        gotSolution = true;
        break;
      }
    }
    if(gotSolution) {
      printSolution(d, n);
      return;
    }else{
      d[n-1] = 0;
      System.out.println("NO");
      return;
    }
  }
  public static void main(String[] args) {
    FastReader sc = new FastReader();
    int t = sc.nextInt();
    while(t-- > 0) {
      int n = sc.nextInt();
      long p = sc.nextLong();
      long d[] = new long[n];
      for(int i = 0; i<n; i++) {
        d[i] = sc.nextLong();
      }
      calc(d, n, p);
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