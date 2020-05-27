import java.io.*;
import java.util.*;
class Weapon_value{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			String a[] = new String[n];
			for(int i = 0; i<n; i++){
				a[i] = br.readLine();
			}
			if(n > 1)
			{
				for(int i = 1; i<n; i++)
				{
					String temp = "";
					for(int j = 0; j<10; j++)
					{
						if(a[i].charAt(j) == a[i-1].charAt(j))
							temp += "0";
						else
							temp += "1";
					}
					a[i] = temp;
				}
			}
			//System.out.println(Arrays.toString(a));		
			String weapon = a[n-1];
			int count = 0;
			for(int i = 0; i<10; i++)
			{
				if(weapon.charAt(i) == '1')
					count++;
			}
			System.out.println(count);
		}
	}
}		