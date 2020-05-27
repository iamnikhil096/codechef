import java.io.*;
import java.util.*;
class GCJ101B_spoj {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int c = sc.nextInt();
        int case_count = 1;
        while(case_count <= c){
            int n = sc.nextInt(); //no of chicks.
            int k = sc.nextInt(); //least no. of chick that should reach 'B'.
            int B = sc.nextInt(); //the final destination.
            int T = sc.nextInt(); //travel time.
            long position[] = new long[n];
            long speed[] = new long[n];
            for(int i = 0; i<n; i++) {
                position[i] = sc.nextLong();
            }
            for(int i = 0; i<n; i++) {
                speed[i] = sc.nextLong();
            }
            int count = 0; //to count the total no of chicks that will reach the final dest. after 'T' time using swaps.
            for(int i = 0; i<n; i++) {
                position[i] += T*speed[i];
                if(position[i] >= B) {
                    count++;
                }
            }
            if(count >= k) {
                int reached = 0; // to count no. of chicks tht have reached 'B'.
                int last_chick_pos = n-1;
                int swaps = 0;
                for(int i = n-1; i>=0; i--) {
                    if(position[i] >= B) {
                        swaps = swaps + (last_chick_pos - i);
                        last_chick_pos--;
                        reached++;
                    }
                    if(reached == k)
                        break;
                }
                System.out.println("Case #" + case_count + ": " +swaps);
            }else {
                System.out.println("Case #" + case_count + ": " +"IMPOSSIBLE");
            }
            case_count++;
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