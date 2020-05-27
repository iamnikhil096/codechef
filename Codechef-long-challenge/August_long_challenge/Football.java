import java.io.*;
import java.util.*;
class Football
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int t = Integer.parseInt(br.readLine());
		while(t>0)
		{
			int n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
			int b[] = new int[n];
			String s[] = br.readLine().trim().split(" ");
			for(int i = 0; i<s.length; i++)
			{
				a[i] = Integer.parseInt(s[i]);
			}
			s = br.readLine().trim().split(" ");
			for(int i = 0; i<s.length; i++)
			{
				b[i] = Integer.parseInt(s[i]);
			}
			int max = 0;
			for(int i = 0; i<n; i++)
			{
				int temp = (a[i] * 20) - (b[i] * 10);
				if(temp<0)
					temp = 0;
				if(temp>max)
					max = temp;
			}
			System.out.println(max);
			t--;
		}
	}
}