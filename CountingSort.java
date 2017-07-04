//Counting Sort
import java.util.*;


class CountingSort {
    public static void main(String args[] ) {
       
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(N);
        ArrayList<Integer> arr1 = new ArrayList<Integer>(100001);
        for(int i=0;i<N;i++){
        	arr.add(0);
        }
        for(int i=0;i<100001;i++){
        	arr1.add(0);
        }
        for (int i = 0; i < arr.size(); i++) {
            //System.out.println("hello world");
        	int a = s.nextInt();
            arr.set(i,a);
        }
        //System.out.print(arr.size());
        for(int i=0;i<N;i++){
            int m=0;
            m = arr1.get(arr.get(i));
            m++;
            
            arr1.set(arr.get(i),m);
           // System.out.print(arr1.get(arr.get(i)));
            
        }
       // System.out.println();
        for(int i=0;i<100001;i++){
            if(arr1.get(i)!=0){
                System.out.print(i + " " + arr1.get(i));
                System.out.println();
            }
        }
        
        

       // System.out.println("Hello World!");
    }
}
