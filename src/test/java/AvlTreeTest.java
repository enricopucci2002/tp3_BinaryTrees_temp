class AVLTreeTester {
    public static void main(String[] args) {

        AvlTree<Integer> avl = new AvlTree<Integer>();
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();

        Integer[] toInsert = {5,4,3,2,1,9,8,7,6};
        for(int i = 0; i < toInsert.length; i++) {
            avl.add(toInsert[i]);
            bst.add(toInsert[i]);
        }

        System.out.println("Parcours préordre de BST: "); bst.printPreOrder(); System.out.println("");
        System.out.println("Parcours en ordre de BST: "); bst.printInOrder(); System.out.println("");
        System.out.println("Parcours par niveau de BST: "); bst.printPostOrder(); System.out.println("");

        System.out.println("Parcours préordre de AVL: "); avl.printPreOrder(); System.out.println("");
        System.out.println("Parcours en ordre de AVL: "); avl.printInOrder(); System.out.println("");
        System.out.println("Parcours par niveau de AVL: "); avl.printPostOrder(); System.out.println("");
    }
}
