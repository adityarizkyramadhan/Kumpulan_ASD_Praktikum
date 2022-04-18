package Queue;

import java.util.Scanner;

public class FowardPaketSolution {
    public static void main(String[] args) throws Exception {
        try (Scanner in = new Scanner(System.in)) {
            Queue antrian = new Queue();
            while (in.hasNext()){
                String buffer = in.nextLine();
                String[] temp = buffer.split(" ");
                if (temp[0].equalsIgnoreCase("DATA")){
                    String data = buffer.replace("DATA","");
                    antrian.enqueue("DATA",data);
                } else if(temp[0].equalsIgnoreCase("CALL")){
                    String data = buffer.replace("CALL","");
                    antrian.enqueue("CALL", data);
                } else if(temp[0].equalsIgnoreCase("OUT")){
                    if (!antrian.isEmpty()){
                        System.out.println(antrian.dequeue().replace(" ",""));
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    

}

class Node{
    String perintah;
    String nomor;
    Node next;
}
// queue
class Queue{
    Node head;
    Node tail;
    int size;
    public Queue(){
        head = null;
        tail = null;
        size = 0;
    }
    public void enqueue(String perintah, String nomor){
        Node node = new Node();
        node.perintah = perintah;
        node.nomor = nomor;
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
        String temp = "";
        Node kepala = head;
        Node kepalaNext = head.next;
        if (kepala.perintah.equals("CALL")){
            temp = kepala.nomor;
            head = kepala.next;
            return temp;
        }
        while(kepala.next != null){
            if(kepalaNext.perintah.equals("CALL")){
                break;
            }
            kepalaNext = kepalaNext.next;
            kepala = kepala.next;
        }
        if (kepalaNext == null){
            temp = head.nomor;
            head = head.next;
        }else{
            temp = kepalaNext.nomor;
            kepala.next = kepalaNext.next;
        }
        return temp;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head == null;
    }
}
