import java.util.Scanner;

public class BasicSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar=null;
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		ar=new int[n];
		for (int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		
		int min=getMin(ar);
		int max=getMax(ar);
		int sum=getSum(ar);
		
		System.out.println("min="+min+",max="+max+",sum="+sum);
		
	}

	private static int getSum(int[] ar) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int getMax(int[] ar) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int getMin(int[] ar) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE; //2^31-1
		for (int i=0;i<ar.length;i++) {
			if (min>ar[i]) {
				min=ar[i];
			}
		}
		return min;
	}

}
