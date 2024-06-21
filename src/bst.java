
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int v) {
            data = v;

            left=null;

            right=null;

        }
    }
    public  class bst {
        public static void main (String[] args){
            Node root = new Node(1);
            root.left=new Node(2);
            root.right=new Node(4);
            root.right.left=new Node(5);
        }

    }
