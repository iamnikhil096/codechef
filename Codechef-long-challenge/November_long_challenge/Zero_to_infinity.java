import java.io.*;
import java.util.*;
class Zero_to_infinity{
	public static boolean vowel(char ch)
	{
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		return false;
	}

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			int n = Integer.parseInt(br.readLine());
			int alice[] = new int[26];
			int bob[] = new int[26];
			int no_of_strings_alice_contain_ch[] = new int[26];
			int no_of_strings_bob_contain_ch[] = new int[26];
			int alice_count = 0, bob_count = 0;
			while(n > 0){
				String s = br.readLine();
				int l = 0, r = 1;
				int len = s.length();
				boolean check = false;
				int a[] = new int[26];
				while(l<r && r<len)	{
					char chl = s.charAt(l);
					if(check == false) {
						char chr = s.charAt(r);
						if(!((l == 0 && ((vowel(chl) == true && vowel(chr)==true)||(vowel(chl) == true && vowel(chr)== false)||(vowel(chl) == false && vowel(chr)==true))) || 
							(l>0 && ((vowel(chl) == true && vowel(chr)==true)||(vowel(chl) == true && vowel(chr)== false && vowel(s.charAt(l-1)) == true)||(vowel(chl) == false && vowel(chr)==true)))) == true)
						{
							//bob
							check = true;
							bob_count++;
						}
					}
					a[chl - 97] += 1;
					++l;
					++r;
				}
				char chl = s.charAt(l);
				a[chl - 97] += 1;
				if(check == false){
					//alice group;
					alice_count++;
					for(int i = 0; i<26; i++){
						if(a[i] > 0){
							no_of_strings_alice_contain_ch[i] += 1;
							alice[i] += a[i];
						}
					}
				}
				else{
					//bob group;
					for(int i = 0; i<26; i++){
						if(a[i] > 0){
							no_of_strings_bob_contain_ch[i] += 1;
							bob[i] += a[i];
						}
					}
				}
				--n;
			}
			double da = 0.0d;
			for(int i = 0; i<26; i++)
			{
				if(alice[i] > 0)
				{
					da = da + (Math.log10(no_of_strings_alice_contain_ch[i]) - (alice_count * Math.log10(alice[i])));
					//double temp = no_of_strings_alice_contain_ch[i] / Math.pow(alice[i], alice_count);
					//da = da * temp;
				}
				
			}
			double db = 0.0d;
			for(int i = 0; i<26; i++)
			{
				if(bob[i] > 0)
				{
					db = db + (Math.log10(no_of_strings_bob_contain_ch[i]) - (bob_count * Math.log10(bob[i])));
					//double temp = no_of_strings_bob_contain_ch[i] / Math.pow(bob[i], bob_count);
					//db = db * temp;
				}
			} 
			//double ans = da / db;
			double ans = da - db;  //Math.log10(da) - Math.log10(db);
			if(ans >= 7.0d)
				System.out.println("Infinity");
			else
				System.out.println(Math.pow(10, ans));
			/*if(ans >= Math.pow(10.0d, 7))
				System.out.println("Infinity");
			else
				System.out.println(ans);*/
		}
	}
}