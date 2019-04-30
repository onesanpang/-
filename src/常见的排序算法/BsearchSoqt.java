package 常见的排序算法;

public class BsearchSoqt {

    //非递归算法
    public int bsearch1(int[] a,int n,int value){
        int low = 0;
        int high = a.length-1;

        while(low<=high){
            int min = low+((high-low)>>1);
            if (a[min] == value) {
                return min;
            }else if (a[min]<high){
                low = min+1;
            }else if (a[min]>high){
                high = min-1;
            }
        }
        return -1;
    }

    //递归算法
    public int bsearch2(int[] a,int n,int value){

        return bsearchInternally(a,0,n-1,value);
    }
    private int bsearchInternally(int[] a,int low,int high,int value){
        if (low>high){
            return -1;
        }
        int min = low+((high -low)>>1);
        if (a[min]==value){
            return min;
        }else if (a[min]>value){
            bsearchInternally(a,low,min-1,value);
        }else if (a[min]<value){
            bsearchInternally(a,min-1,high,value);
        }
        return -1;
    }

}
