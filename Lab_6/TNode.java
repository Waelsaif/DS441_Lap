package Lab_6;

public class TNode {
        private int data;
        private TNode right;
        private TNode left;
        TNode (int d){
        data = d;
        }
        public String toString(){
           return data + " ";
        }
        public void setLeft(TNode l){
            left=l;
        }
        public void setRight(TNode r){
            right = r;
        }
        public void setData(int d){
            data=d;
        }
        public TNode getLeft(){
            return left;
        }
        public TNode getRight(){
            return right;
        }
        public int getData(){
            return data;
        }

       
}
