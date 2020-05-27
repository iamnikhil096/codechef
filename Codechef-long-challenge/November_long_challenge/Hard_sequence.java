import java.io.*;
import java.util.*;
class Hard_sequence{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
			a[0] = 0;
			for(int i = 1; i<n; i++)
			{
				int index = -1;
				for(int j = i-2; j>=0; j--)
				{
					if(a[j] == a[i-1])
					{
						index = j;
						break;
					}
				}
				if(index == -1)
					a[i] = 0;
				else
					a[i] = (i-1) - index;
			}
			int count = 0;
			for(int i = 0; i<n; i++)
			{
				if(a[i] == a[n-1])
					count++;
			}
			System.out.println(count);
		}
	}
}