package sorting;

public class InsertionSort {
	static int a[] = new int[6];
	
	InsertionSort(){
		a[0]=16;
		a[1]=10;
		a[2]=8;
		a[3]=7;
		a[4]=5;
		a[5]=1;

	}
	public static void main(String[] args){
		InsertionSort yellow=new InsertionSort();
		yellow.sort();
		for (int y:a)
		System.out.println(y);
		System.out.println("Length"+a.length);
	}
	public static void sort(){
		for (int j=1;j< a.length;j++)
			for (int k=0;k<=j;k++){
				if (a[j]<a[k]){
					int temp = a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
	}

	public static void sort2(){
		for (int j=0;j< a.length;j++){	
			int min = j;
			for (int k=j;k<a.length;k++){
				if (a[k]<a[min]){
					min=k;
				}
			}
			if (j!=min){
				int temp=a[j];
				a[j]=a[min];
				a[min]=temp;
			}
		}
	}
}
