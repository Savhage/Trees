package Problem2;
import java.util.Arrays;

public abstract class Heap {
    int size;
    int capacity=10;
    int[] items;
    public Heap(){
        items=new int[capacity];
        size=0;
    }
    public int peak(){
        return items[0];
    }
    public int poll(){
        int temp=items[0];
        items[0]=items[size-1];
        size--;
        heapDown();
        return temp;
    }
    public void add(int value){
        checkCapacity();
        items[size]=value;
        size++;
        heapUp();
    }
    public void heapUp(){
    }
    public void heapDown(){
    }
    public int getLeftChildIndex(int index){
        return 2*index+1;
    }
    public int getRightChildIndex(int index){
        return 2*index+2;
    }
    public int getParentIndex(int index){
        return (index-1)/2;
    }
    public boolean hasLeftChild(int index){
        return getLeftChildIndex(index)<size;
    }
    public boolean hasRightChild(int index){
        return getRightChildIndex(index)<size;
    }
    public boolean hasParent(int index){
        return getParentIndex(index)>=0;
    }
    public int leftChild(int index){
        return items[getLeftChildIndex(index)];
    }
    public int rightChild(int index){
        return items[getRightChildIndex(index)];
    }
    public int parent(int index){
        return items[ getParentIndex(index)];
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
}
