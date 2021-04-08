package implimentation;

import myinterface.BSTbyLinkedListADT;

public class BST implements BSTbyLinkedListADT {
    Node root;

    public BST() {
        this.root = null;
    }
    public void insert(int data){
        Node node=new Node(data);
        if (root==null){
            root=node;
        }
        else{
            Node temp=root;
            Node parent=null;
            while(temp!=null){
                parent=temp;
                if(data<temp.getData()){
                    temp=temp.getLeft();
                }
                else if(data>temp.getData()){
                    temp=temp.getRight();
                }
            }
            if(data<parent.getData()){
                parent.setLeft(node);
            }
            else{
                parent.setRight(node);
            }
        }
    }

    @Override
    public int remove(int data) {
        return 0;
    }

    @Override
    public int removeMax() {
        return 0;
    }

    @Override
    public int removeMin() {
        return 0;
    }

    @Override
    public boolean Search(int data) {
        return false;
    }

    @Override
    public void treverse() {

    }
}
