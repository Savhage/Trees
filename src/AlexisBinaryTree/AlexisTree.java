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
            //handles when the value already exists and does nothing with it, ending the recursive loop
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
   //Breadth First print for Problem 1
   public void bft(){
        bftPrint(root);
   }
   private void bftPrint(DataContainer current){
        if(current!=null){
            bftPrint(current.left);
            System.out.println(current.getValue());
            bftPrint(current.right);
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
   public void dft() {
       Queue<DataContainer> tree=new LinkedList<>();
       tree.offer(root);
       while(!tree.isEmpty()){
           DataContainer temp=tree.poll();
           System.out.println(temp.getValue());
           if(temp.left!=null){
               tree.offer(temp.left);
           }
           if(temp.right!=null){
               tree.offer(temp.right);
           }
       }

   }
}

