package Heap_Avl;

import java.util.Arrays;
import java.util.Scanner;


// AVL Tree
public class SekertarisSibuk {
    public static void main(String[] args) {
        PriorityHeap queueHeap = new PriorityHeap();
        Scanner s = new Scanner(System.in);
        int urutan=0;
        while (s.hasNext()){
            String kata1 = s.next();
            if (kata1.equals("TERIMA")){
                int a = s.nextInt();
                String kata2 = s.nextLine();
                queueHeap.insert(new Node(kata2.substring(1),a,urutan));
                urutan++;
            }else{
                Node temp = queueHeap.pop();
                if (temp==null){
                    System.out.println("KOTAK MASUK KOSONG");
                }else {
                    System.out.println(temp);
                }
            }

        }

    }
}

class Node{
    String data;
    int urutan;
    int key;
    Node(String data, int key, int urutan){
        this.data = data;
        this.key = key;
        this.urutan = urutan;

    }
    public String toString(){
        return data;
    }

}

class PriorityHeap{
    private Node [] nodes;
    private int kapasitas;
    PriorityHeap(){
        kapasitas=0;
        nodes = new Node[5000];
        nodes[0]=(new Node("", Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    private int induk(int sekarang){
        return sekarang/2;
    }
    private int anakKiri(int sekarang){
        return 2*sekarang;
    }
    private int anakKanan(int sekarang){
        return anakKiri(sekarang)+1;
    }

    private void tukar(int indexSatu, int indexDua ){
        Node temp = nodes[indexSatu];
        nodes[indexSatu] = nodes[indexDua];
        nodes[indexDua] = temp;
    }

    private boolean adalahDaun(int posisi){
        return (posisi > (kapasitas / 2)) && (posisi <= kapasitas);

    }

    public String toString(){
        return Arrays.toString(nodes);
    }
    private void urutkanHeap(int posisi){
        if (!adalahDaun(posisi)){
            if (nodes[posisi].key > nodes[anakKiri(posisi)].key
                    || nodes[posisi].key > nodes[anakKanan(posisi)].key){
                if (nodes[anakKiri(posisi)].key < nodes[anakKanan(posisi)].key){
                    tukar(posisi,anakKiri(posisi));
                    urutkanHeap(anakKiri(posisi));
                }else {
                    tukar(posisi, anakKanan(posisi));
                    urutkanHeap(anakKanan(posisi));
                }
            }else if (nodes[posisi].key == nodes[anakKiri(posisi)].key
                    || nodes[posisi].key == nodes[anakKanan(posisi)].key){
                if (nodes[anakKiri(posisi)].urutan < nodes[anakKanan(posisi)].urutan){
                    tukar(posisi,anakKiri(posisi));
                    urutkanHeap(anakKiri(posisi));
                }else {
                    tukar(posisi, anakKanan(posisi));
                    urutkanHeap(anakKanan(posisi));
                }
            }
        }
    }

    public void insert(Node newNode){
        if (kapasitas >= nodes.length) {
            return;
        }
        nodes[++kapasitas] = newNode;
        int current = kapasitas;
        while (nodes[current].key < nodes[induk(current)].key) {
            tukar(current, induk(current));
            current = induk(current);
        }

    }

    public Node pop(){
        if (kapasitas != 0){
            Node root = nodes[1];
            if (kapasitas==1){
                nodes[1]=null;
                return root;
            }
            nodes[1] = nodes[kapasitas--];
            urutkanHeap(1);
            return root;
        }
        return null;
    }
}
