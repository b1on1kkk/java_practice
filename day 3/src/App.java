public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println(tree);

        tree.getAllValues(tree.root);
    }
}
