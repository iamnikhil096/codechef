import java.io.*;
import java.util.*;
class Physical_exercise{
	public static void main(String args[]) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int t = Integer.parseInt(br.readLine());
		 while(t-- > 0)
		 {
		 	String s[] = br.readLine().trim().split(" ");
		 	long x = Long.parseLong(s[0]);
		 	long y = Long.parseLong(s[1]);
		 	s = br.readLine().trim().split(" ");
		 	int n = Integer.parseInt(s[0]);
		 	int m = Integer.parseInt(s[1]);
		 	int k = Integer.parseInt(s[2]);
		 	long a[] = new long[2*n];
		 	long b[] = new long[2*m];
		 	long c[] = new long[2*k];
		 	// input for set1
		 	s = br.readLine().trim().split(" ");
		 	for(int i = 0; i<s.length; i++)
		 	{
		 		a[i] = Long.parseLong(s[i]);
		 	}
		 	// input for set2
		 	s = br.readLine().trim().split(" ");
		 	for(int i = 0; i<s.length; i++)
		 	{
		 		b[i] = Long.parseLong(s[i]);
		 	}
		 	// input for set3
		 	s = br.readLine().trim().split(" ");
		 	for(int i = 0; i<s.length; i++)
		 	{
		 		c[i] = Long.parseLong(s[i]);
		 	}

		 	double dist = 0.0d, ans = Double.MAX_VALUE;
		 	for(int i = 0; i<2*n-1; i += 2)
		 	{
		 		double dist_a = Math.sqrt((a[i]-x)*(a[i]-x) + (a[i+1]-y)*(a[i+1]-y));
		 		for(int j = 0; j<2*m-1; j += 2)
		 		{
		 			double dist_b = Math.sqrt((a[i]-b[j])*(a[i]-b[j]) + (a[i+1]-b[j+1])*(a[i+1]-b[j+1]));
		 			for(int l = 0; l<2*k-1; l += 2)
		 			{
		 				double dist_c = Math.sqrt((b[j]-c[l])*(b[j]-c[l]) + (b[j+1]-c[l+1])*(b[j+1]-c[l+1]));
		 				dist = dist_a + dist_b + dist_c;
		 				//System.out.println("	"+dist);
		 				if(dist <= ans)
		 					ans = dist;
		 			}
		 		}
		 	}
		 	dist = 0.0d;
		 	for(int i = 0; i<2*m-1; i += 2)
		 	{
		 		double dist_b = Math.sqrt((b[i]-x)*(b[i]-x) + (b[i+1]-y)*(b[i+1]-y));
		 		for(int j = 0; j<2*n-1; j += 2)
		 		{
		 			double dist_a = Math.sqrt((b[i]-a[j])*(b[i]-a[j]) + (b[i+1]-a[j+1])*(b[i+1]-a[j+1]));
		 			for(int l = 0; l<2*k-1; l += 2)
		 			{
		 				double dist_c = Math.sqrt((a[j]-c[l])*(a[j]-c[l]) + (a[j+1]-c[l+1])*(a[j+1]-c[l+1]));
		 				dist = dist_a + dist_b + dist_c;
		 				//System.out.println("	"+dist);
		 				if(dist <= ans)
		 					ans = dist;
		 			}
		 		}
		 	}
		 	System.out.println((float)ans);
		 }
	}
}