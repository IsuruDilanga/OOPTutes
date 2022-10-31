package Question6;

public class TreeNode implements Node{
    int data;

    TreeNode(int data){
        this.data = data;
    }

    @Override
    public void print(){
        System.out.println("data: " + data);
    }
}
