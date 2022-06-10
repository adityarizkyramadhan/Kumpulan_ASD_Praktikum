package Queue;

import java.util.Scanner;

public class HangarPesawatSolution {
    public static void main(String[] args) throws Exception {
        try (Scanner in = new Scanner(System.in)) {
            Queue antrian = new Queue();
            while(in.hasNext()){
                String perintah = in.next();
                if (perintah.equals("INPUT")){
                    String nomor = in.next();
                    antrian.enqueue(nomor);
                }else if (perintah.equals("FIX")){
                    for (int i = 0; i < 2; i++){
                        if (antrian.size==0){
                            continue;
                        }else{
                            System.out.println(antrian.dequeue());
                        }
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Node {
    String Kode;
    Node next;
}
// Queue
class Queue {
    Node head;
    Node tail;
    int size;

    public Queue(){
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(String Kode){
        Node node = new Node();
        node.Kode = Kode;
        node.next = null;
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public String dequeue(){
        if(head == null){
            return null;
        }
        Node temp = head;
        String out = temp.Kode;
        head = head.next;
        size--;
        return out;
    }
}


