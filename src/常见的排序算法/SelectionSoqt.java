package 常见的排序算法;

public class SelectionSoqt {
    public static void main(String[] args) {
        int temp = 0;
        int minIndex = 0;
        int[] a = {9,3,5,4,2,1,6,7,8,10};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if (a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        for (int i:a){
            System.out.println(i);
        }
    }
}
