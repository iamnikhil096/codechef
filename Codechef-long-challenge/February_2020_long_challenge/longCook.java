import java.io.*;
import java.util.*;
class longCook {
	public static boolean leapYear(long year) {
		if(year%400 == 0)
			return true;
		if(year%100 == 0)
			return false;
		if(year%4 == 0)
			return true;
		return false;
	}
	public static long calc(long i, long n) {
		long count = 0;
		for( ; i<n; i++) {
			long startDay = 0;
			startDay = (((i-1)*365) + ((i-1)/4) - ((i-1)/100) + ((i-1)/400))%7;
			if(startDay == 2) {
				//year is starting with wednesday(leap year + non leap year).
				count++;
			}else if(startDay == 3 && leapYear(i) == false) {
				//non leap year starting with thursday.
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while(t-- > 0){
			int startMonth = sc.nextInt();
			long startYear = sc.nextLong();
			int endMonth = sc.nextInt();
			long endYear = sc.nextLong();
			if(startMonth > 2)
				startYear++;
			if(endMonth >= 2)
				endYear++;
			long count = 0;
			if(endYear - startYear >= 400) {
				count += ((endYear - startYear)/400)*101;
				long i = startYear + ((endYear - startYear)/400)*400;
				count += calc(i, endYear);
			}else {
				count += calc(startYear, endYear);
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