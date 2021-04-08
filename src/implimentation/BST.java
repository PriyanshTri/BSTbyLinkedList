package implimentation;

public class BST {
    Node root;

    public BST() {
        this.root = null;
    }
    public void insert(int data){
        Node node=new Node(data);
        Node temp=root;
        while(temp!=null){
            if(data<temp.getData()){
                temp=temp.getLeft();
            }
            else{
                temp=temp.getRight();
            }
        }
    }
}
