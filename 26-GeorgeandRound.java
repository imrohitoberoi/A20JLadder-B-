import java.io.*;
import java.util.*;

public class Main{
	static BufferedReader reader;
	static StringTokenizer tokenizer;
	static PrintWriter writer;

	static int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	static long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	static double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}

	static String nextToken() throws IOException {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
	static String nexts() throws IOException {
	  	  tokenizer = new StringTokenizer(reader.readLine());
	   	 String s="";
	   	 while (tokenizer.hasMoreTokens()) {
			s+=tokenizer.nextElement()+" ";
		}
		return s;
	}

	//String str=nextToken();
	//String[] s = str.split("\\s+");

	public static int gcd(int x, int y){
		if (y == 0) return x; else return gcd(y, x % y);
	}

	public static boolean isPrime(int n) 
	    { 
	        // Corner cases 
	        if (n <= 1){
		 return false; }
	        if (n <= 3){
		 return true; }
	      
	        // This is checked so that we can skip  
	        // middle five numbers in below loop 
	        if (n % 2 == 0 || n % 3 == 0){
		 return false; }
	      
	        for (int i = 5; i * i <= n; i = i + 6) {    //Checking 6i+1 & 6i-1
	            if (n % i == 0 || n % (i + 2) == 0) {
	            	return false;  }
	            }
			//O(sqrt(n))
	        return true; 
	    } 

	public static void shuffle(int[] A) {
		for (int i = 0; i < A.length; i++) {
			int j = (int)(i * Math.random());
			int tmp = A[i];
			A[i] = A[j];
			A[j] = tmp;
		}
	}

	 public static long power(int x, long n)
	{
	    long mod = 1000000007;
		if (n == 0) {
			return 1;
		}

		long pow = power(x, n / 2);

		if ((n & 1) == 1) {
			return (x * pow * pow)%mod;
		}
		return (pow * pow)%mod;
	}
	 static int ncr(int n, int k)  
   	 { 
      
     		   // Base Cases 
     		   if (k == 0 || k == n) 
     		       return 1; 
          
     		   // Recur 
     		   return ncr(n - 1, k - 1) +  
       		             ncr(n - 1, k); 
    }
	public static int lower_bound(int[] A, int lo, int hi, int x) {
		if (A[lo] >= x) {
			return lo;
		} else if (A[hi] < x) {
			return hi + 1;
		}
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (A[mid] >= x) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return hi + 1;
	}
	 static class R implements Comparable<R>{
	        int x, y;
	        public  R(int x, int y) {
	            this.x = x;
	            this.y = y;
	        }
	        public int compareTo(R o) {
            		return x-o.x;     //Increasing order(Which is usually required)
        		}
	    }   
	// int t=a[i];
	// a[i]=a[j];
	// a[j]=t;
	//double d=Math.sqrt(Math.pow(Math.abs(x2-x1),2)+Math.pow(Math.abs(y2-y1),2));
	public static void main(String[] args) throws IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
		tokenizer = null;
		writer = new PrintWriter(System.out);
		solve();
		reader.close();
		writer.close();
	}
	
	private static void solve() throws IOException {
	//	int t = nextInt();
		//while(t-->0){
			//long n = nextLong();
			//String s= nextToken();
			//long[] a=new long[n];
			ArrayList<Integer> ar=new ArrayList<Integer>();
			//HashSet<Integer> set=new HashSet<Integer>();
			//HashMap<Integer,String> h=new HashMap<Integer,String>();
			//R[] a1=new R[n];
			//char[] c=nextToken().toCharArray();

		int n = nextInt();
		int m = nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int ans=0;
		for(int i=0;i<n;i++){
		    a[i]=nextInt();
		}
		for(int i=0;i<m;i++){
		    b[i]=nextInt();
		}
		int j=0;
		for(int i=0;i<m&&j<n;i++){
		    if(b[i]>=a[j]){
		        j++;
		        ans++;
		    }
		}
		writer.println(n-ans);
		 //}
	}
}