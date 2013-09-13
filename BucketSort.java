package sorting;
import java.util.Arrays;

public class BucketSort{

    public static void sort(int[] a, int maxVal){
        int [] bucket=new int[maxVal+1];

        for (int i=0; i<bucket.length; i++){
            bucket[i]=0;
        }

        for (int i=0; i<a.length; i++){
            bucket[a[i]]++;
        }

//        Arrays.print(bucket);
        System.out.println("In Sorting");
        for(int buck:bucket)
        System.out.println(buck);
        int outPos=0;
        for (int i=0; i<bucket.length; i++){
            for (int j=0; j<bucket[i]; j++){
                a[outPos++]=i;
            }
        }
    }

    
    public static void main(String[] args){
        int maxVal=3;
        int [] data= {1,0,1,2,3,1,0,3,1,0,1,3}; //ArrayUtil.randomIntArray(10,maxVal+1);

        for(int buck:data)
            System.out.println(buck);
        
        System.out.println("After Sorting");
        sort(data,maxVal);

        for(int buck:data)
            System.out.println(buck);
    }

}