import java.util.*;
import java.lang.*;
import java.io.*;
class JNEXT
{
	public static void main (String[] args)	{
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while(t-- > 0) {
		int n = sc.nextInt();
		int num[] = new int[n];
		for(int i = 0; i<n; i++)
			num[i] = sc.nextInt();
		int index = -1;
		int j = n-1;
		for(; j>0; j--) {
			if(num[j] > num[j-1]) {
				index = j-1;
				//swapx = num[index];
				break;
			}
		}
		if(j == 0) {
		    System.out.println("-1");
		    continue;
		}
		int swapIndex = -1;
		for(int i = index+1; i<n; i++) {
			if(num[i] > num[index]) {
				swapIndex = i;
			}else {
				break;
			}
		}
		//swap elements.
		int temp = num[index];
		num[index] = num[swapIndex];
		num[swapIndex] = temp;
		//Arrays.sort(num, index+1, n);
		int k = n-1;
		for(int i = index+1; i<=(index+(n-index)/2); i++) {
		    int tempnum = num[i];
		    num[i] = num[k];
		    num[k] = tempnum;
		    k--;
		}
		StringBuilder sb = new StringBuilder(n);
		for(int i = 0; i<n; i++) {
			sb.append(num[i]);
			//System.out.print(num[i]);
		}
		System.out.println(sb);
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