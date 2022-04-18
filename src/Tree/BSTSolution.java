package Tree;

import java.util.Scanner;

public class BSTSolution {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int bData, bQuery;
            TreeModelDua Bst = new TreeModelDua();
            bData = in.nextInt();
            bQuery = in.nextInt();
            for (int i=0; i<bData; i++){
                Bst.addData(in.nextInt(),in.next());
            }
            for (int i=0; i<bQuery; i++){
                Bst.printByData(in.nextInt());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Node2{
    Node2 left;
    Node2 right;
    Node2 parent;
    int data;
    String value;
    Node2(int data, String value){
        this.data = data;
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
class TreeModelDua {
    Node2 root;
    Node2 find(int key){
        Node2 current = root;
        while(current!=null){
            if (current.data > key){
                if (current.left==null){
                    return current;
                }
                current = current.left;
            }else if (current.data < key){
                if (current.right== null){
                    return current;
                }
                current = current.right;
            }else{
                return current;
            }
        }
        return null;
    }
    void addData(int data,String value){
        Node2 newNode = new Node2(data,value);
        if (root==null){
            root = newNode;
            return;
        }
        Node2 parent = find(data);
        if (parent.data>data){
            parent.left = newNode;
            parent.left.parent=parent;
        }else if (parent.data<data){
            parent.right = newNode;
            parent.right.parent = parent;
        }
    }

    void printByData(int data){
        Node2 print = find(data);
        if (print.data == data){
            System.out.println(print.value);
        }else{
            System.out.println("TIDAK ADA");
        }
    }
    void preOrder(Node2 node){
        System.out.print(node + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    void inOrder(Node2 node){
        inOrder(node.left);
        System.out.print(node + " ");
        inOrder(node.right);
    }
    void postOrder(Node2 node){
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node + " ");
    }
}
