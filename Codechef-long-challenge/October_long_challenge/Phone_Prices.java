import java.io.*;
import java.util.*;
class Phone_Prices
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int t = Integer.parseInt(br.readLine());
		while(t>0)
		{
			int n = Integer.parseInt(br.readLine());
			int a[] = new int [n];
			int c = 0;
			String s[] = br.readLine().trim().split("\\s+");
			for(int i = 0; i < n; i++)
			{
				a[i] = Integer.parseInt(s[i]);
			}
			for(int i = 0; i < n; i++)
			{
				if(i == 0 && (a[i] >= 350 && a[i] <= 750))
					c++;
				else if(i == 1 && (a[i] >= 350 && a[i] <= 750 && a[i] < a[i-1] ))
					c++;
				else if(i==2 && (a[i] >= 350 && a[i] <= 750 && a[i]< a[i-1] && a[i]< a[i-2]))
					c++;
				else if(i==3 && (a[i] >= 350 && a[i] <= 750 && a[i]< a[i-1] && a[i]< a[i-2] && a[i]< a[i-3]))
					c++;
				else if(i==4 && (a[i] >= 350 && a[i] <= 750 && a[i]< a[i-1] && a[i]< a[i-2] && a[i]< a[i-3] && a[i]< a[i-4]))
					c++;
				else if(i>=5 && (a[i] >= 350 && a[i] <= 750 && a[i]< a[i-1] && a[i]< a[i-2] && a[i]< a[i-3] && a[i]< a[i-4] && a[i]< a[i-5]))
					c++;
			}
			System.out.println(c);
			t--;
		}
	}
}