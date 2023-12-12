package Problem2;
import java.util.Arrays;
//Followed steps from HackerRank Youtube video called Data Structures: Heaps and changed it a bit to fit
//within the parameters of our assignment
public abstract class Heap {
    int size;
    int capacity=10;
    int[] items;
    public Heap(){
        items=new int[capacity];
        size=0;
    }
    public void add(int value){
        checkCapacity();
        items[size]=value;
        size++;
        heapify();
    }

    public void heapify() {
        for (int i = (size / 2 - 1); i >= 0; i--) {
            heapSort(i);
        }
        for (int i = size - 1; i >= 0; i--) {
            swap(i, 0);
            heapSort(0);
        }
    }
    public void heapSort(int index){}
    public int getLeftChildIndex(int index){
        return 2*index+1;
    }
    public int getRightChildIndex(int index){
        return 2*index+2;
    }
    public int leftChild(int index){
        return items[getLeftChildIndex(index)];
    }
    public int rightChild(int index){
        return items[getRightChildIndex(index)];
    }
    public void swap(int firstIndex, int secondIndex){
        int temp=items[firstIndex];
        items[firstIndex]=items[secondIndex];
        items[secondIndex]=temp;
    }
    public void checkCapacity(){
        if(size==capacity){
            capacity*=2;
            items=Arrays.copyOf(items,capacity);
        }
    }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.println(items[i]);
        }
    }
}
