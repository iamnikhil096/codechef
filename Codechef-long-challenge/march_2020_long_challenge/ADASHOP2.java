import java.io.*;
import java.util.*;
class chess {
    int row;
    int col;
    public chess(int r, int c) {
        row = r;
        col = c;
    }
}
class ADASHOP2 {
    public static void create(ArrayList<chess> cells, int check) {
        
        chess ob2 = new chess(2, 2);
        cells.add(ob2);
        chess ob3 = new chess(1, 3);
        cells.add(ob3);
        chess ob4 = new chess(2, 4);
        cells.add(ob4);
        chess ob5 = new chess(1, 5);
        cells.add(ob5);
        chess ob6 = new chess(2, 6);
        cells.add(ob6);
        chess ob7 = new chess(1, 7);
        cells.add(ob7);
        chess ob8 = new chess(2, 8);
        cells.add(ob8);
        chess ob9 = new chess(3, 7);
        cells.add(ob9);
        chess ob10 = new chess(4, 8);
        cells.add(ob10);
        chess ob11 = new chess(5, 7);
        cells.add(ob11);
        chess ob12 = new chess(6, 8);
        cells.add(ob12);
        chess ob13 = new chess(7, 7);
        cells.add(ob13);
        chess ob14 = new chess(8, 8);
        cells.add(ob14);
        chess ob15 = new chess(7, 7);
        cells.add(ob15);
        chess ob16 = new chess(8, 6);
        cells.add(ob16);
        chess ob17 = new chess(7, 5);
        cells.add(ob17);
        chess ob18 = new chess(8, 4);
        cells.add(ob18);
        chess ob19 = new chess(7, 3);
        cells.add(ob19);
        chess ob20 = new chess(8, 2);
        cells.add(ob20);
        chess ob21 = new chess(7, 1);
        cells.add(ob21);
        chess ob22 = new chess(6, 2);
        cells.add(ob22);
        chess ob23 = new chess(5, 1);
        cells.add(ob23);
        chess ob24 = new chess(4, 2);
        cells.add(ob24);
        chess ob25 = new chess(3, 1);
        cells.add(ob25);
        chess ob26 = new chess(2, 2);
        cells.add(ob26);

        if(check != 1) {
            chess ob1 = new chess(1, 1);
            cells.add(ob1);
        }

        chess ob27 = new chess(3, 3);
        cells.add(ob27);
        chess ob28 = new chess(4, 4);
        cells.add(ob28);
        chess ob29 = new chess(3, 5);
        cells.add(ob29);
        chess ob30 = new chess(4, 6);
        cells.add(ob30);
        chess ob31 = new chess(5, 5);
        cells.add(ob31);
        chess ob32 = new chess(6, 6);
        cells.add(ob32);
        chess ob33 = new chess(5, 5);
        cells.add(ob33);
        chess ob34 = new chess(6, 4);
        cells.add(ob34);
        chess ob35 = new chess(5, 3);
        cells.add(ob35);
    }
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-->0) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if(r == 1 && c == 1) {
                ArrayList<chess> cells = new ArrayList<chess>(35);
                create(cells, 0);
                System.out.println(cells.size());
                for(int i = 0; i<cells.size(); i++) {
                    int row = cells.get(i).row;
                    int col = cells.get(i).col;
                    System.out.println(row + " " + col);
                }
            }else {
                ArrayList<chess> cells = new ArrayList<chess>();
                if(r == c) {
                    //that means this BISHOP is in one of the Black Diagonal cells.
                    //so just make a move to (1, 1) and then rset moves are same as for (1, 1).
                    chess ob = new chess(1, 1);
                    cells.add(ob);
                    create(cells, 1);
                    System.out.println(cells.size());
                    for(int i = 0; i<cells.size(); i++) {
                        int row = cells.get(i).row;
                        int col = cells.get(i).col;
                        System.out.println(row + " " + col);
                    }
                }else {
                    //make 1st move to the Black Diagonal, then to (1, 1).
                    int sum = r+c;
                    sum = sum/2;
                    chess obd = new chess(sum, sum); //move to Diagonal.
                    cells.add(obd);
                    chess obf = new chess(1, 1); //move to the 1st cell.
                    cells.add(obf);
                    create(cells, 1);
                    System.out.println(cells.size());
                    for(int i = 0; i<cells.size(); i++) {
                        int row = cells.get(i).row;
                        int col = cells.get(i).col;
                        System.out.println(row + " " + col);
                    }
                }
            }
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