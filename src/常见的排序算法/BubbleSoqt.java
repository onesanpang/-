package 常见的排序算法;

public class BubbleSoqt {
    public static void main(String[] args) {
        int[] a = {9,3,5,4,2,1,6,7,8};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i: a){
            System.out.println(i);
        }
    }

}
