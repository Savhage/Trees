package AlexisBinaryTree;
import java.util.Queue;
import java.util.LinkedList;
public class AlexisTree{

    DataContainer root;

    public AlexisTree(){
        root=null;
    }
    public void addValue(int n){
       root=addDataContainer(root, n);

    }
    private DataContainer addDataContainer(DataContainer current, int n){
        if(current==null){
            current=new DataContainer(n);
            return current;
        }
        if(n<current.getValue()){
            current.left=addDataContainer(current.left, n);
        }
        else if(n>current.getValue()){
            current.right=addDataContainer(current.right,n);
        }
        else{
        }
        return current;
    }
    public boolean findValue(int n){
        return internalFind(root, n);
    }
   private boolean internalFind(DataContainer current, int n){
       if(current==null){
           return false;
       }
       if(n==current.getValue()){
           return true;
       }
       else if(n<current.getValue()){
           return internalFind(current.left, n);
       }
       else{
           return internalFind(current.right, n);
       }
   }
   public void printTree(){
        internalPrint(root);
   }
   private void internalPrint(DataContainer current){
        if(current!=null){
            internalPrint(current.left);
            System.out.println(current.getValue());
            internalPrint(current.right);
        }
   }
   public void remove(int n){
        root=internalRemove(root,n);
   }
   private DataContainer internalRemove(DataContainer current, int n){
        if(current==null){
            return current;
        }
        if(current.getValue()==n){
            if(current.left==null) {
                current = current.right;
            }
            else if(current.right==null) {
                current = current.left;
            }
            else{
                current.value=findLargest(current.left);
                current.left=internalRemove(current.left, findLargest(current.left));
            }
        }
        else{
            if(n<current.getValue()){
                current.left=internalRemove(current.left, n);
            }
            else{
                current.right=internalRemove(current.right,n);
            }
        }
       return current;
   }
   private int findLargest(DataContainer current){
        if(current.right==null){
            return current.getValue();
        }
        else{
            return findLargest(current.right);
        }
   }
   public void printDepthFirst(){
        Queue<DataContainer> queue=new LinkedList<>();
        queue=bft(root,queue);
        int size=queue.size();
        for(int i=0;i<size;i++){
            System.out.println(queue.poll().getValue());
        }
   }
    private Queue<DataContainer> bft(DataContainer current, Queue<DataContainer> queue){
        if(current==null){
            return queue;
        }
        else{
            queue.offer(current.left);
            queue.offer(current.right);
        }

        }
        return queue
}

