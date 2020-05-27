import java.io.*;
import java.util.*;
class Distribute_apples
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		long t = Long.parseLong(br.readLine());
		while(t>0)
		{
			String s[] = br.readLine().trim().split(" ");
			long n = Long.parseLong(s[0]);
			long k = Long.parseLong(s[1]);
			long a[][] = new long[2][2];
			long b[][] = new long[2][2];
			
			a[0][0] = k;
			a[1][0] = n/k;
			a[0][1] = 0;
			a[1][1] = 0;

			long m = n;
			long x = (m/k)/k;
			long y = 0;
			//this logic to find remainder is used bcz for "k > 10^9", (k*k) results a number which is beyond
				//the limit of "int" or "long" that gives an "exception at Runtime".
			if(x > 0)
				y = m % (k * k);
			else
				y = m;
			if(x > 0)
			{
				b[0][0] = k;
				b[1][0] = x * k;
				if(y > 0)
				{
					b[0][0] = y/k;
					long c = b[1][0];
					b[1][0] += k;
					b[0][1] = k - b[0][0];
					b[1][1] = c;
				}
			}
			else
			{
				b[0][0] = y/k;
				b[1][0] = k;
				b[0][1] = k - b[0][0];
				b[1][1] = 0;
			}
			
			if((a[0][0] == b[0][0] && a[1][0] == b[1][0]) && (a[0][1] == b[0][1] && a[1][1] == b[1][1]))
				System.out.println("NO");
			else
				System.out.println("YES");
			t--;
		}
	}
}