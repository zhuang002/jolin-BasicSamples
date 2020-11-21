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
		
		int a=9;
		int b=5;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+",b="+b);
		
	}

	private static int getSum(int[] ar) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i=0;i<ar.length;i++) {
			sum+=ar[i];
		}
		return sum;
	}

	private static int getMax(int[] ar) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		for (int i=0;i<ar.length;i++) {
			if (max<ar[i]) {
				max=ar[i];
			}
		}
		return max;
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
