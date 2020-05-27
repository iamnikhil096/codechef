import java.io.*;
import java.util.*;
class Chef_and_minimum_coloring {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			int a[][] = new int[2][n];
			s = br.readLine().trim().split(" ");
			for(int i = 0; i<n; i++)
			{
				a[0][i] = Integer.parseInt(s[i]);
				a[1][i] = i%m;
			}
			Arrays.sort(a);
			System.out.println(Arrays.deepToString(a));
		}
	}
}