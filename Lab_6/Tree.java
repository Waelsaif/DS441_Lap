package Lab_6;
public class Tree {
           
       TNode root;
   
       //----------------------------------------------------------------//
   
       void insert (int data){
           TNode n= new TNode(data);
           if (root==null){
            root = new TNode(data);}
            else {
            TNode current = root;
            TNode parent = null;
            while (current != null){
                parent = current;
                if (data > current.getData())
                    current=current.getRight();
                else {
                    current=current.getLeft();
                }
            }
            if (data > parent.getData()){
                parent.setRight(n);
            }
            else{
             parent.setLeft(n);}
           }
       }
   
       //----------------------------------------------------------------//
   
       boolean find (int data){
        TNode current = root;               
        while(current != null)        
           {
          if(current.getData() == data)            
              return true;                
           if(data < current.getData())        
              current = current.getLeft();
           else                            
              current = current.getRight();
           }
        return false;  
       }

       //----------------------------------------------------------------//
       
       boolean recFind (int data, TNode n){
        TNode current = n;               
        if (current == null)       
           return false;
        if(current.getData() == data)            
            return true;  
        if(data < current.getData())
            return(recFind(data,current.getLeft()));
        if(data > current.getData())                            
            return(recFind(data,current.getRight()));
           
        return false;  
       }
   
       //----------------------------------------------------------------//
       
       int max(){
        TNode curr=root;
        while (curr.getRight()!=null){
            curr=curr.getRight();
        }
        return curr.getData();
        
       }

       //----------------------------------------------------------------//

       int min() {
        TNode curr=root;
        while (curr.getLeft()!=null){
            curr=curr.getLeft();
        }
        return curr.getData(); 
       }

       //----------------------------------------------------------------//

       void inOrder(TNode n){
        if (n != null){
            inOrder(n.getLeft());
            System.out.print(n.getData()+" ");
            inOrder(n.getRight());
        }
    }
        void inOrder(){
            inOrder(root);
        }

        //----------------------------------------------------------------//
        void preOrder(TNode n){
           if (n!=null){
            System.out.print(n.getData()+" ");
            preOrder(n.getLeft());
            preOrder(n.getRight());
           }
        }
        void preOrder(){
            preOrder(root);
        }

        //----------------------------------------------------------------//

        void postOrder(TNode n){
            if (n!=null){
                postOrder(n.getLeft());
                postOrder(n.getRight());
                System.out.print(n.getData()+" ");
            }
        }
        void postOrder(){
            postOrder(root);
        }
        //----------------------------------------------------------------//

        boolean isFull(TNode n){
            if (n.getLeft()==null && n.getRight()==null)
                return true;
            if (n.getLeft()!=null && n.getRight()!=null)
                return(isFull(n.getLeft()) && isFull(n.getRight()));
            
            return false;
        }
        void isFull(){
            boolean s=isFull(root);
            System.out.println(s);
        }
   
   }
   

