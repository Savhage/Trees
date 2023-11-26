package Problem2;

public class MaxHeap extends Heap {

    public MaxHeap(){
        super();
    }
    public MaxHeap(int value){
        super();
        add(value);
    }
    @Override
    public void heapUp(){
        int index=size-1;
        while (hasParent(index) && parent(index)<items[index]){
            swap(getParentIndex(index),index);
            index=getParentIndex(index);
        }
    }
    @Override
    public void heapDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int tempChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) > leftChild(index)) {
                tempChildIndex = getRightChildIndex(index);
            }
            if (items[index] > items[tempChildIndex]) {
                break;
            } else {
                swap(index, tempChildIndex);
                index = tempChildIndex;
            }
        }
    }
}
