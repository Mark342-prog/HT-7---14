package src;

/***
 *
 * Referencia para su Implementación
 * https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
 *
 */
class Node {
    Association data;
    Node left, right;

    Node(Association data) {
        this.data = data;
        left = right = null;
    }
}