public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    public Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.value)
            root.left = insertRec(root.left, key);
        else if (key > root.value)
            root.right = insertRec(root.right, key);

        return root;
    }

    public void getAllValues(Node root){
        if(root != null){
            getAllValues(root.left);
            System.out.println(root.value + " ");
            getAllValues(root.right);
        }
    }

    @Override
    public String toString() {
        return "Value" + root.value;
    }
}
