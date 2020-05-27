import java.io.*;
import java.util.*;
class Zombie_and_the_caves
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int t = Integer.parseInt(br.readLine());
		while(t>0)
		{
			int n = Integer.parseInt(br.readLine());
			int rpower[] = new int[n];
			int rlevel[] = new int[n];
			int zhealth[] = new int[n];
			String s[] = br.readLine().trim().split(" ");
			for(int i = 0; i<n; i++)
			{
				rpower[i] = Integer.parseInt(s[i]);
			}
			s = br.readLine().trim().split(" ");
			for(int i = 0; i<n ;i++)
			{
				zhealth[i] = Integer.parseInt(s[i]);
			}
			for(int i = 0; i<n; i++)
			{
				int x = ((i-rpower[i]) > 0) ? (i-rpower[i]) : 0;
				int y = ((i+rpower[i]) < n-1) ? (i+rpower[i]) : n-1;
				for(int j = x; j<=y; j++)
				{
					rlevel[j] += 1;
				}
			}
			Arrays.sort(rlevel);
			Arrays.sort(zhealth);
			int c = 0;
			for(int i = 0; i<n ; i++)
			{
				if(rlevel[i] != zhealth[i])
				{
					c = 1;
					break;
				}
			}
			if(c == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
			t--;
		}
	}
}