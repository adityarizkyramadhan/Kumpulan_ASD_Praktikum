package Graph;

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class SLL {
    Node head, tail;
    int size = 0;


    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(Node input) {
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            tail.next = input;
            tail = input;
        }
        size++;
    }

    public Node isData(int data) {
        Node pointer = head;
        while (pointer != null) {
            if (pointer.data==data) return pointer;
            pointer = pointer.next;
        }
        return null;
    }
    public boolean isExist(int data) {
        Node pointer = head;
        while (pointer != null) {
            if (pointer.data==data) return true;
            pointer = pointer.next;
        }
        return false;
    }

}

class GraphASD {
    SLL[] arrNode;
    GraphASD(int maxNode){
        arrNode = new SLL[maxNode];
        for (int i=0; i<arrNode.length;i++){
            arrNode[i] = new SLL();
        }

    }
    void addData(int DataAwal, int DataAkhir){
        Node first=new Node(DataAwal);
        Node last = new Node(DataAkhir);
        arrNode[first.data].addLast(last);
        arrNode[last.data].addLast(first);
    }

    void printGraph(){
        for (int i=0; i<arrNode.length;i++){
            System.out.print(i+" : ");
            Node pointer = arrNode[i].head;
            while (pointer!=null){
                System.out.print(pointer.data+" ");
                pointer = pointer.next;
            }
            System.out.println();
        }
    }

    // Dijkstra algorithm
    void dijkstra(int start, int end){
        int[] distance = new int[arrNode.length];
        boolean[] visited = new boolean[arrNode.length];
        for (int i=0; i<arrNode.length;i++){
            distance[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        distance[start] = 0;
        for (int i=0; i<arrNode.length;i++){
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int j=0; j<arrNode.length;j++){
                if (!visited[j] && distance[j]<min){
                    min = distance[j];
                    minIndex = j;
                }
            }
            visited[minIndex] = true;
            Node pointer = arrNode[minIndex].head;
            while (pointer!=null){
                int nextNode = pointer.data;
                int nextDistance = distance[minIndex] + 1;
                if (nextDistance<distance[nextNode]){
                    distance[nextNode] = nextDistance;
                }
                pointer = pointer.next;
            }
        }
        if (distance[end]==Integer.MAX_VALUE){
            distance[end]=-1;
        }
        System.out.println(distance[end]);
    }



}
public class Graph {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GraphASD graphASD = new GraphASD(s.nextInt());
        int p = s.nextInt();s.nextLine();
        for (int i=0; i<p;i++){
            String[] in = s.nextLine().split(" ");
            int tmp1 = Integer.parseInt(in[0]);
            int tmp2 = Integer.parseInt(in[2]);
            graphASD.addData(tmp1,tmp2);
        }
        graphASD.dijkstra(s.nextInt(), s.nextInt());

    }

}
