public class BinTree {
    public static void main(String[] args) {

        /*
        Rekommenderad ordning att implementera metoderna i:
        1.) Implementera metoden existHelper(data)
        2.) Implementera metoden putHelper(data)
            Om du vill, pröva att implementera metoderna put2(data) och putHelper2(data)
        3.) Implementera printHelper (skriv ut trädet i en SORTERAD ORDNING)
         */

        BinTree binTree = new BinTree();

        // när du har implementerat putHelper, använd dessa rader istället för att stoppa in data i binärträdet:
        /*
        binTree.put(5);
        binTree.put(2);
        binTree.put(8);
        binTree.put(3);
        binTree.put(1);
        binTree.put(6);
         */
        /*binTree.root = new Node(5);
        binTree.root.left = new Node(2);
        binTree.root.right = new Node(8);
        binTree.root.left.right = new Node(3);
        binTree.root.left.left = new Node(1);
        binTree.root.right.left = new Node(6);*/

        System.out.println("Utskrift av trädet...");
        binTree.print();
        System.out.println("\n");


        System.out.println("Finns 6: " + binTree.exist(6)); //true
        System.out.println("Finns 8: " + binTree.exist(8)); //true
        System.out.println("Finns 4: " + binTree.exist(4)); //false

    }
}

class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

class BinTree {
    public Node root;

    public BinTree() {
        this.root = null;
    }

    public void put(int data) {this.root = this.putHelper(this.root, data);
    }

    private Node putHelper(Node node, int data) {
        // Din kod här
        if(this.root)
        return null;
    }

    public void put2(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            this.putHelper2(this.root, data);
        }
    }

    private void putHelper2(Node node, int data) {
        // Din kod här
    }

    public boolean exist(int data) {
        boolean result = existHelper(this.root, data);
        return result;
    }

    private boolean existHelper(Node node, int data) {
        // Din kod här
        if(node.data==0)
            return  true;
        else
            return false;
    }

    public void print() {
        printHelper(this.root);
    }

    private void printHelper(Node node) {
        //din kod här
    }
}
