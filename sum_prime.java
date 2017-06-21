// Program to find any number as sum of prime number
import java.util.Scanner;

public class prime_numbers {

	public int Binary_search(int[] arr,int l,int r,int x){
		if(r>=l){
			int mid = l + (r-l)/2;
			if(arr[mid] == x){
				return 1;
			}
			else if(arr[mid]<x){
				return Binary_search(arr, mid+1, r, x);
				
			}
			else{
				return Binary_search(arr, l, mid-1, x);
			}
			
		}
		return 0;
		
		
	}
	public boolean[] sieve(int a) {
	    boolean[] arr = new boolean[a+1];
	    int[] arr1 = new int[a];
	    for(int i=0;i<=a;i++){
	        arr[i] = true;
	    }
	  //  int j=0;
	    arr[0]= arr[1] = false;
	    for(int i=2;i<=a;i++){
	        for(int k = 1*i*i;k<=a;k=k+i){
	            arr[k] = false;
	        }
	       
	        
	    }
	    int j=0;
		for(int i=0;i<=a;i++){
			if(arr[i]==true){
				arr1[j]= i;
				j++;
			}
		}
//		for(int i=0;i<arr1.length;i++){
//			int num = a-arr1[i];
//			if(binarySearch(arr1,0,arr1.length,num)){
//				System.out.println(arr1[i]+" "+num);
//				
//				
//			}
//		}

	    //arr[1]= true;
	    
	    return arr;
	}
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		prime_numbers prime  = new prime_numbers();
		boolean[] a = new boolean[n];
		int[] arr = new int[n];
		a = prime.sieve(n);
		int j=0;
		for(int i=0;i<=n;i++){
			if(a[i]==true){
				arr[j]= i;
				j++;
			//System.out.print(i+ " ");
			}
		}
		//System.out.println();
		for(int i=0;i<j;i++){
			int num = n-arr[i];
			//System.out.println(num+" "+ prime.Binary_search(arr,0,arr.length-1,num)+" ");
			if(prime.Binary_search(arr,0,j-1,num)==1){
				System.out.println(arr[i]+" "+num);
				break;
				
				
			}
		}
		//sieve(n);
		in.close();
		
		
	}
}
