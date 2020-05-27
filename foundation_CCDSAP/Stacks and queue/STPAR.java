import java.io.*;
import java.util.*;
class STPAR {
	public static void calculate(int a[], int n) {
		int count = 1;
		Stack<Integer> sideRoad = new Stack<Integer>();
		for(int i = 0; i<n; i++) {
			if(a[i] == count) {
				count++;
				//System.out.println("	"+i+"  "+count);
			}else if(!sideRoad.empty() && sideRoad.peek() == count) {
				sideRoad.pop();
				count++;
				//System.out.println("	"+i+"  "+count);
				i--;
			}else {
				sideRoad.push(a[i]);
				//System.out.println("	"+i+"  "+count);
			}
		}
		if(count!=n) {
			while(!sideRoad.empty()) {
				if(sideRoad.pop() == count) {
					count++;
				}else {
					System.out.println("no");
					return;
				}
			}
		}
		System.out.println("yes");
		return;
	}
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		while(n!=0) {
			int a[] = new int[n];
			for(int i = 0; i<n; i++) {
				a[i] = sc.nextInt();
			}
			calculate(a, n);
			n = sc.nextInt();
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