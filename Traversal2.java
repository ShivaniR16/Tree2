
class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int value){
      this.value=value;
      left=right=null;
    }
}
public class Traversal2{
    public void preorders(TreeNode root){
        if(root==null)
        return;
        System.out.print(root.value+" ");
        preorders(root.left);
        preorders(root.right);
    }
    public void postorders(TreeNode root){
        if(root==null)
        return;
        postorders(root.left);
        postorders(root.right);
        System.out.print(root.value+" ");
    }
    public void inorders(TreeNode root){
        if(root==null)
        return;
        inorders(root.left);
        System.out.print(root.value+" ");
        inorders(root.right);
    }

public static void main(String[] args){
    TreeNode root=new TreeNode(4);
    root.left=new TreeNode(2);
    root.left.left=new TreeNode(3);
    root.left.left.right=new TreeNode(9);
    root.left.left.right.left=new TreeNode(1);
    
    root.right=new TreeNode(5);
    root.right.left=new TreeNode(7);
    root.right.right=new TreeNode(6);
    root.right.right.left=new TreeNode(8);
    
    Traversal2 treepre=new Traversal2 ();
    System.out.println("preorder");
    treepre.preorders(root);
    System.out.println();

    Traversal2 treepost=new Traversal2();
    System.out.println("postorder");
    treepost.postorders(root);
    System.out.println();

    Traversal2 treein=new Traversal2();
    System.out.println("inorder");
    treein.inorders(root);
}
}