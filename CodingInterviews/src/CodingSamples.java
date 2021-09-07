import java.util.Arrays;
import java.util.HashMap;

public class CodingSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println("hello google");
		String str="hello";
		String res=reverseString(str);
		System.out.println(res);
		rverseznum(182);
		int[] num= {2,3,4,5};
		//reverseArray(num,3);
		rotate(num,0,num.length-1);*/
		
		int[] srr= {0,7,2,3,4,2,7,9,5,6};
		countznum(srr);
		pairsOfElements(srr,9);
		
	}

	public static String reverseString(String str) {
		String rev;
		
		if (str.length()==1) {
			return str;
		}
		
		return str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
	}
	
	public static void rverseznum(int num) {
		int n=num;
		int rev=0;
	while(n>0) {
		int rem=n%10;
		 rev=rev*10+rem;
		n=n/10;	
	}
	System.out.println(rev);
	}
	
	public static void reverseArray(int[] srr,int k) {
		k=k%srr.length;
		rotate(srr,0,srr.length-1);
		rotate(srr,0,k-1);
		rotate(srr,k,srr.length-1);
		
		for(int i=0;i<srr.length;i++) {
			System.out.println(srr[i]);
		}
	}
	
	public static void rotate(int[] arr,int start,int end) {
		
		while(end>start) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

	
	public static void countznum(int[] srr) {
		int count=0;
		HashMap<Integer,Integer> map = new HashMap();
		Arrays.sort(srr);
		for(int i=0;i<srr.length;i++) {
			 for(int j=i+1;j<srr.length;j++) {
				 
				 if(srr[i]+1==srr[j]) {
					 count=count+1;
					 break;
				 }
				 
			 }
		}
		
		System.out.print(count);
	
	}
	
	
	
	
	public static void pairsOfElements(int[] arr,int sum) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==sum) {
					System.out.println("{"+arr[i]+" ,"+arr[j]+"}");
				}
				
			}
		}
		
	}
	
	
}
