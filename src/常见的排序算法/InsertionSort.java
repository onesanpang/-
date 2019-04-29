package 常见的排序算法;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {9,3,5,4,2,1,6,7,8};

        for (int i=1;i<a.length;i++){
            int value = a[i];
            int j=i-1;

            for (;j>=0;--j){
                if (a[j]>value){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = value;
        }

        for (int i: a){
            System.out.println(i);
        }
    }
}
