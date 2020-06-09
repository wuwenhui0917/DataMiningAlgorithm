/**
 * Copyright wuwenhui
 *  快速排序
 * @author wuwh6
 */
public class ObjectQuickSort<T extends Comparable> {

    public static void sort(int[] arrys,int start,int end){
        //确定轴点元素
        int povit =arrys[start];
        int i = start;
        int j=end;
        while(i<j){

            while(i<j){

                if(arrys[j]>povit){
                    j--;
                }
                else {
                    arrys[i]=arrys[j];
                    i++;
                    break;
                }
            }
            while(i<j){
                if(arrys[i]<povit){
                    i++;
                }
                else {
                    arrys[j]=arrys[i];
                    j--;
                    break;
                }
            }

        }
        arrys[i]=povit;
        System.out.println("轴点元素："+i+":"+arrys[i]);
        print(arrys);

        //确定轴点元素
        if (i-1>start) sort(arrys,start,i-1);
        if (j+1<end) sort(arrys,i+1,end);

    }


    public static  void print(int[] arras){
        for(int i = 0;i<arras.length;i++){
            System.out.print(arras[i]+"\t");
        }
    }


    public static void main(String[] args) {
        int[] arras = {3,4,5,6,1000,10,14,100,10};
        sort(arras,0,arras.length-1);
        for(int i = 0;i<arras.length;i++){
            System.out.print(arras[i]+"\t");
        }

    }




}
