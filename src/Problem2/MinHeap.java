package Problem2;
public class MinHeap extends Heap{

    public MinHeap(){
        super();
    }
    public MinHeap(int value){
        super();
        add(value);

    }
    public void heapSort(int index){
        int check=index;
        if(getRightChildIndex(index)<size &&  leftChild(index)>rightChild(index)){
            swap(getLeftChildIndex(index),getRightChildIndex(index));
        }
        if(getLeftChildIndex(index)<size && leftChild(index)<items[check]){
            check=getLeftChildIndex(index);
        }
        if(getRightChildIndex(index)<size && rightChild(index)<items[check]){
            check=getRightChildIndex(index);
        }
        if(check!=index){
            swap(index,check);
            heapSort(check);
        }

    }

}
