import java.io.*;
import java.util.*;
class Theatre {
	public static int calc(int m[][], int a, int b, int c, int d) {
		int a1[] = new int[]{m[0][a], m[1][b], m[2][c], m[3][d]};
		int p1 = 0;
		for(int i = 0; i<4; i++) {
			int max = Integer.MIN_VALUE, index = -1;
			for(int j = 0; j<4; j++) {
				if(a1[j] >= max) {
					index = j;
					max = a1[j];
				}
			}
			a1[index] = Integer.MIN_VALUE;
			if(i == 0) {
				if(max>0)
					p1 += max*100;
				else
					p1 -= 100;
			}
			if(i == 1) {
				if(max>0)
					p1 += max*75;
				else
					p1 -= 100;
			}
			if(i == 2) {
				if(max>0)
					p1 += max*50;
				else
					p1 -= 100;
			}
			if(i == 3) {
				if(max>0)
					p1 += max*25;
				else
					p1 -= 100;
			}
		}
		return p1;
	}
	public static int calcMaxProfit(int m[][]) {
		//ABCD
		int m1 = calc(m, 0, 1, 2, 3);
		int m2 = calc(m, 0, 1, 3, 2);
		int m3 = calc(m, 0, 2, 1, 3);
		int m4 = calc(m, 0, 2, 3, 1);
		int m5 = calc(m, 0, 3, 1, 2);
		int m6 = calc(m, 0, 3, 2, 1);
		int m7 = calc(m, 1,0,2,3);
		int m8 = calc(m, 1,0,3,2);
		int m9 = calc(m, 1,2,0,3);
		int m10 = calc(m, 1,2,3,0);
		int m11 = calc(m, 1,3,0,2);
		int m12 = calc(m, 1,3,2,0);
		int m13 = calc(m, 2,0,1,3);
		int m14 = calc(m, 2,0,3,1);
		int m15 = calc(m, 2,1,0,3);
		int m16 = calc(m, 2,1,3,0);
		int m17 = calc(m, 2,3,0,1);
		int m18 = calc(m, 2,3,1,0);
		int m19 = calc(m, 3,0,1,2);
		int m20 = calc(m, 3,0,2,1);
		int m21 = calc(m, 3,1,0,2);
		int m22 = calc(m, 3,1,2,0);
		int m23 = calc(m, 3,2,0,1);
		int m24 = calc(m, 3,2,1,0);
		int maximum = Math.max(m1,Math.max(m2,Math.max(m3,Math.max(m4,Math.max(m5,Math.max(m6,Math.max(m7,Math.max(m8,Math.max(m9,Math.max(m10,Math.max(m11,Math.max(m12,
			Math.max(m13,Math.max(m14,Math.max(m15,Math.max(m16,Math.max(m17,Math.max(m18,Math.max(m19,Math.max(m20,Math.max(m21,Math.max(m22,Math.max(m23,
				m24)))))))))))))))))))))));
		return maximum;
	}
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		long totalProfit = 0;
		while(t-- > 0) {
			int n = sc.nextInt();
			int m[][] = new int[4][4];
			while(n-- > 0) {
				String s[] = sc.nextLine().trim().split("\\s+");
				char ch = s[0].charAt(0);
				int i = ch - 'A';
				int j = Integer.parseInt(s[1]);
				j = (j/3)%4;
				m[i][j]++;
			}
			int r = calcMaxProfit(m);
			totalProfit += r;
			System.out.println(r);
		}
		System.out.println(totalProfit);
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