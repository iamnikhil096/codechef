import java.io.*;
import java.util.*;
class tip {
    int a;
    int b;
    public tip() {
        this.a = 0;
        this.b = 0;
    }
}
class TADELIVE {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        ArrayList<tip> al = new ArrayList<tip>(n);
        //tip ob[] = new tip[n];
        for(int i = 0; i<n; i++) {
            tip ob = new tip();
            int temp = sc.nextInt();
            ob.a = temp;
            al.add(ob);
        }
        for(int i = 0; i<n; i++) {
            int temp = sc.nextInt();
            al.get(i).b = temp;
        }
        Collections.sort(al, new Comparator<tip> () {
            public int compare(tip t1, tip t2) {
                int d1 = Math.abs(t1.a - t1.b);
                int d2 = Math.abs(t2.a - t2.b);
                if(d1 < d2){
                    return 1;//swap
                }
                return -1;//no swap.
            }
        });
        int totalTip = 0;

        for(int i = 0; i<n; i++) {
            tip ob = al.get(i);
            if(ob.a > ob.b) {
                if(x > 0){
                    x--;
                    totalTip += ob.a;
                }else {
                    y--;
                    totalTip += ob.b;
                }
            }else {
                if(y > 0) {
                    y--;
                    totalTip += ob.b;
                }else {
                    x--;
                    totalTip += ob.a;
                }
            }
        }
        System.out.println(totalTip);
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