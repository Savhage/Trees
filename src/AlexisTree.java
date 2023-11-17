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
        if(root==null){
            return false;
        }
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
        if(current==null){

        }
        else{
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
        else{
            if(current.getValue()==n){
                if(current.left==null) {
                    current = current.right;
                }
                else if(current.right==null) {
                    current = current.left;
                }
                else{
                    DataContainer temp=new DataContainer();
                    temp.right=current.right;
                    temp.left=current.left;

                }
            return current;
            }
            else{
                if(n<current.getValue()){
                    return internalRemove(current.left, n);
                }
                else{
                    return internalRemove(current.right,n);
                }
            }
        }
   }
}

