/**
 * Copyright wuwenhui
 * 堆排序
 * @author wuwh6
 */
public class HeapSort {


    public static void main(String[] args) {
        int arras[] = new int[]{3,3,3,7,9,122344,4656,34,34,4656,5,6,7,8,9,343,57765,23,12321};
        sort(arras);
        for(int i = 0;i<arras.length;i++){
            System.out.print(arras[i]+"\t");
        }
    }

    public static void sort(int[] arrays){
        int len = arrays.length;
        buildHeap(arrays,len);
        for(int i=arrays.length-1;i>0;i--){
            //获取大堆的头，放到最后，从小到大排列
            swap(arrays,0,i);
            len--;
            heapify(arrays,0,len);
        }
    }

    private static void buildHeap(int[] arrays,int heapSize){
        for(int i=(int)Math.floor(arrays.length/2);i>=0;i--){
            System.out.println(i+"====="+heapSize);
            heapify(arrays,i,heapSize);
        }
    }

    /**
     * 进行堆的重新排列
     * @param arrays
     * @param parenIndex
     * @param heapSize
     */
    public static void heapify(int[] arrays,int parenIndex,int heapSize){
        int leftIndex = parenIndex*2+1;
        int rightIndex = parenIndex*2+2;
        int largestIndex = parenIndex;
        System.out.println("leftindex="+leftIndex+" rightindex="+rightIndex+" largestIndex="+largestIndex);

        if(leftIndex<heapSize&&arrays[leftIndex]>arrays[largestIndex]){
            largestIndex = leftIndex;
        }
        if(rightIndex<heapSize&&arrays[rightIndex]>arrays[largestIndex]){
            largestIndex = rightIndex;
        }
        //最大的不是父，不符合大堆定义时，将大的数据和父进行交换，后将堆进行重新排列
        if(largestIndex!=parenIndex){
            swap(arrays,parenIndex,largestIndex);
            System.out.println("index==="+largestIndex);
            //交换后要进行子的重新建堆
            heapify(arrays,largestIndex,heapSize);
        }

    }

    private static void swap(int[] arrays,int i1,int i2){
        int temp = arrays[i1];
        arrays[i1]=arrays[i2];
        arrays[i2] = temp;
    }
}
