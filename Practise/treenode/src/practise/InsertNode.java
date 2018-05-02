package practise;

public class InsertNode{
    private TreeNode root = null;
    private TreeNode actual = null;
    private int size;

    private TreeNode insertNode (int value, TreeNode node) {
        if(node == null){
            return new TreeNode(value, null, null);
        } else {
            if (node.getValue() > value) {
                node.setLeft(insertNode(value, node.getLeft()));
                return node;
            } else if (node.getValue() < value) {
                node.setRight(insertNode(value, node.getRight()));
                return node;
            } else {
                return node;
            }
        }
    }
    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value, null, null);
        } else {
            insert(root, value);
        }
    }
}
