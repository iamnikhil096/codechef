import java.io.*;
import java.util.*;
class Operation_on_a_matrix
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int t = Integer.parseInt(br.readLine());
		while(t>0)
		{
			//int n = Integer.parseInt(br.readLine());
			//int a[] = new int [n];
			//int c = 0;
			String s[] = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			int q = Integer.parseInt(s[2]);
			int x[] = new int[n];
			int y[] = new int[m];

			for(int i = 0; i < q; i++)
			{
				s = br.readLine().trim().split("\\s+");
				int a = Integer.parseInt(s[0]);
				int b = Integer.parseInt(s[1]);
				x[a-1] += 1;
				y[b-1] += 1;
			}
			int evenx = 0, oddx = 0;
			int eveny = 0, oddy = 0;
			for(int i = 0; i < n; i++)
			{
				if(x[i] % 2 == 0)
					evenx++;
				else 
					oddx++; 
			}
			for(int i = 0; i < m; i++)
			{
				if(y[i] % 2 == 0)
					eveny++;
				else 
					oddy++; 
			}
			int total = (evenx * oddy) + (eveny * oddx);
			System.out.println(total);
			t--;
		}
	}
}