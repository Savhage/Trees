package Problem2;

public class HeapTester {
    public static void main(String[] args){
        MinHeap min=new MinHeap();
        MaxHeap max=new MaxHeap(25);
        System.out.println(max.peak());
        min.add(15);
        System.out.println(min.peak());
        min.add(25);
        System.out.println(min.peak());
        min.add(5);
        System.out.println(min.peak());
    }
}
