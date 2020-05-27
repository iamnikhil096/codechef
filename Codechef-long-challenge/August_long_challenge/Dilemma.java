import java.io.*;
import java.util.*;
class Dilemma
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int t = Integer.parseInt(br.readLine());
		while(t>0)
		{
			String s = br.readLine();
			char a[] = s.toCharArray();
			int b[] = new int[s.length()];
			//int empty = 0, prevempty = 0;
			int one = 0;
			for(int i = 0; i<s.length(); i++)
			{
				b[i] = a[i] - 48;
			}
			int n = b.length;
			for(int i = 0; i<n; i++)
			{
				if(b[i] == 1)
					one++;
			}
			if(one % 2 == 1)
				System.out.println("WIN");
			else
				System.out.println("LOSE");
			
			/*
			while(true)
			{
				empty = 0;
			for(int i = 0; i<n; i++)
			{
				if(b[i] == 1)
				{
					b[i] = -1;
					empty++;
					if(i == 0 && i < n-1)
						b[i+1] = (b[i+1] == 0)? 1 : (b[i+1] == 1)? 0 : -1;
					else if(i == n-1)
						b[i-1] = (b[i-1] == 0)? 1 : (b[i-1] == 1)? 0 : -1;
					else
					{
						b[i+1] = (b[i+1] == 0)? 1 : (b[i+1] == 1)? 0 : -1;
						b[i-1] = (b[i-1] == 0)? 1 : (b[i-1] == 1)? 0 : -1;
					}
				}
				else if(b[i] == -1)
					empty++;
			}
			if(empty == prevempty)
				break;
			prevempty = empty;
			}
			if(empty == n)
				System.out.println("WIN");
			else
				System.out.println("LOSE");*/



			t--;
		}
	}
}