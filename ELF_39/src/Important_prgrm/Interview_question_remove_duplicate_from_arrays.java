package Important_prgrm;

public class Interview_question_remove_duplicate_from_arrays {
public static void main(String[] args) {
	int arr[]= {1,2,1,2,5,4,9,6,8,7,7,8,9};int k=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
	}
	System.out.println("array after sorting");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]!=arr[i+1]) {
			arr[k]=arr[i];k++;
		}
	}
	arr[k]=arr[arr.length-1];
	System.out.println("after removing the duplicate");
	for(int i=0;i<=k;i++) {
		System.out.println(arr[i]);
	}
}
}
