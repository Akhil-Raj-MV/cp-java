package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastReader sc=new FastReader();
		PrintWriter out=new PrintWriter(System.out);
		int t=sc.nextInt();
		while(t-->0) {
		
		}
		out.close();
	}

	
	static class FastReader {
	    BufferedReader br;
	    StringTokenizer st;
	    public FastReader()
	    {
	        br = new BufferedReader(
	            new InputStreamReader(System.in));
	    }
	    String next()
	    {
	        while (st == null || !st.hasMoreElements()) {
	            try {
	                st = new StringTokenizer(br.readLine());
	            }
	            catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        return st.nextToken();
	    }
	    int nextInt() { return Integer.parseInt(next()); }
	    long nextLong() { return Long.parseLong(next()); }
	    double nextDouble()
	    {
	        return Double.parseDouble(next());
	    }
	    String nextLine()
	    {
	        String str = "";
	        try {
	            if(st.hasMoreTokens()){
	                str = st.nextToken("\n");
	            }
	            else{
	                str = br.readLine();
	            }
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	        return str;
	    }
	    
	    int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
	    }
	}
	
	static long gcd(long a, long b) {
		if (b==0) return a;
		return gcd(b, a%b);
	}
	
	static final Random random=new Random();
	static final int mod=998244353;
	
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	
	static long add(long a, long b) {
		return (a+b)%mod;
	}
	static long sub(long a, long b) {
		return ((a-b)%mod+mod)%mod;
	}
	static long mul(long a, long b) {
		return (a*b)%mod;
	}
	static long exp(long base, long exp) {
		if (exp==0) return 1;
		long half=exp(base, exp/2);
		if (exp%2==0) return mul(half, half);
		return mul(half, mul(half, base));
	}
	
	 static boolean isPrime(long n){
	        if(n < 2) return false;
	        if(n == 2 || n == 3) return true;
	        if(n%2 == 0 || n%3 == 0) return false;
	        long sqrtN = (long)Math.sqrt(n)+1;
	        for(long i = 6L; i <= sqrtN; i += 6) {
	            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
	        }
	        return true;
    }
	
	 static ArrayList<Integer> findDiv(int N)
	    {
	        ArrayList<Integer> ls1 = new ArrayList<Integer>();
	        ArrayList<Integer> ls2 = new ArrayList<Integer>();
	        for(int i=1; i <= (int)(Math.sqrt(N)+0.00000001); i++)
	            if(N%i == 0)
	            {
	                ls1.add(i);
	                ls2.add(N/i);
	            }
	        Collections.reverse(ls2);
	        for(int b: ls2)
	            if(b != ls1.get(ls1.size()-1))
	                ls1.add(b);
	        return ls1;
	    }
	
	 static long power(long x, long y, long p)
	    {
	        long res = 1L;
	        x = x%p;
	        while(y > 0)
	        {
	            if((y&1)==1)
	                res = (res*x)%p;
	            y >>= 1;
	            x = (x*x)%p;
	        }
	        return res;
	    }
}

