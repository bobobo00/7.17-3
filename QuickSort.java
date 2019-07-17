package bt.three;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr= {12,43,10,32,28,43,65,7,21};
		int len=arr.length-1;
		System.out.print("Œ¥≈≈–Ú«∞£∫");
		for(int n:arr) {
			System.out.print(n+" ");
		}
		System.out.println();
		Sort(arr,0,len);
		System.out.print("≈≈–Ú∫Û £∫");
		for(int m:arr) {
			System.out.print(m+" ");
		}
		
	}
	public static void Sort(int[] arr,int low,int high) {
		if(low<high) {
		int num=partion(arr,low,high);
		Sort(arr,low,num-1);
		Sort(arr,num+1,high);
		}
	}
	public static int partion(int[] arr,int low,int high) {
		int key=arr[low];
		int temp;
		while(low<high) {
		   while(arr[high]>=key&&low<high) {
			high--;
		   }
		   temp=arr[low];
		   arr[low]=arr[high];
		   arr[high]=temp;
		   while(arr[low]<=key&&low<high) {
			low++;
		   }
		   temp=arr[low];
		   arr[low]=arr[high];
		   arr[high]=temp;
		}
		return low;
	}
}
