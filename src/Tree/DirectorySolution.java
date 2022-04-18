package Tree;

import java.util.Objects;
import java.util.Scanner;
public class DirectorySolution {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            Tree coba = new Tree();
            coba.addRoot("");
            int p = s.nextInt();s.nextLine();
            for (int i =0; i<p; i++){
                String in = s.nextLine();
                String [] input = in.split(" ");
                if (input[0].equals("touch")){
                    String [] folder = input[1].replaceAll(" ","").split("/");
                    for (int j=0; j<folder.length; j++){
                        if (j==0){
                            continue;
                        }
                        if (coba.root==null){
                            coba.addRoot(folder[j]);
                        }else{
                            coba.addData(folder[j-1],folder[j]);
                        }
                    }
                }else if (input[0].equals("find")){
                    System.out.println(coba.printNFind(input[2]));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Node{
    Node parent;
    Node next;
    SLL childs;
    String data;
    Node(String data){
        this.data = data;
        childs = new SLL();
        parent = null;
    }
}
class SLL {
    Node head, tail;
    int size = 0;
    Node pointer = head;

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

    public Node isData(String data) {
        Node pointer = head;
        while (pointer != null) {
            if (Objects.equals(pointer.data, data)) return pointer;
            pointer = pointer.next;
        }
        return null;
    }
    public boolean isExist(String data) {
        Node pointer = head;
        while (pointer != null) {
            if (Objects.equals(pointer.data, data)) return true;
            pointer = pointer.next;
        }
        return false;
    }

}

class Tree{
    Node root,tail;
    Node searchData(String data){
        Node curr = root;
        if (curr.childs.isExist(data)) {
            return curr.childs.isData(data);
        }
        Node kepala =  root.childs.head;
        Node sementara = kepala;

        while (sementara!=null){
            if (sementara.childs.isExist(data)){
                return sementara.childs.isData(data);
            }
            sementara = sementara.next;
        }
        assert kepala!=null;
        kepala = kepala.childs.head;
        sementara = kepala;
        while (sementara!=null){
            if (sementara.childs.isExist(data)){
                return sementara.childs.isData(data);
            }
            sementara = sementara.next;
        }

        assert kepala != null;
        kepala = kepala.childs.head;
        assert kepala != null;
        sementara = kepala;
        while (sementara!=null){
            if (sementara.childs.isExist(data)){
                return sementara.childs.isData(data);
            }
            sementara = sementara.next;
        }

        kepala = kepala.childs.head;
        assert kepala != null;
        sementara = kepala;

        while (sementara!=null){
            if (sementara.childs.isExist(data)){
                return sementara.childs.isData(data);
            }
            sementara = sementara.next;
        }
        kepala = kepala.childs.head;
        sementara = kepala;
        while (sementara!=null){
            if (sementara.childs.isExist(data)){
                return sementara.childs.isData(data);
            }
            sementara = sementara.next;
        }
        assert kepala != null;
        kepala = kepala.childs.head;
        sementara = kepala;
        while (sementara!=null){
            if (sementara.childs.isExist(data)){
                return sementara.childs.isData(data);
            }
            sementara = sementara.next;
        }
        assert kepala != null;
        kepala = kepala.childs.head;
        sementara = kepala;
        while (sementara!=null){
            if (sementara.childs.isExist(data)){
                return sementara.childs.isData(data);
            }
            sementara = sementara.next;
        }
        assert kepala != null;
        kepala = kepala.childs.head;
        sementara = kepala;
        while (sementara!=null){
            if (sementara.childs.isExist(data)){
                return sementara.childs.isData(data);
            }
            sementara = sementara.next;
        }
        assert kepala != null;
        kepala = kepala.childs.head;
        sementara = kepala;
        while (sementara!=null){
            if (sementara.childs.isExist(data)){
                return sementara.childs.isData(data);
            }
            sementara = sementara.next;
        }
        assert kepala != null;
        kepala = kepala.childs.head;
        sementara = kepala;
        while (sementara!=null){
            if (sementara.childs.isExist(data)){
                return sementara.childs.isData(data);
            }
            sementara = sementara.next;
        }
        return null;
    }
    String printNFind(String data){
        Node find;
        try{
            find = searchData(data);
        }catch (Exception e){
            return "TIDAK ADA";
        }
        String temp = "";
        String cetak="";
        if (find==null){
            return "TIDAK ADA";
        }
        while(find!=null){
            temp = find.data + " " + temp;
            //System.out.println(find.data);
            find = find.parent;

        }
        String [] arr = temp.split(" ");
        for (int i = arr.length-1; i>=1; i--){
            arr[i] = "/" + arr[i];
            cetak = arr[i] + cetak;
        }
        return cetak;
    }
    void addRoot(String data){
        root = new Node(data);
    }
    void addData(String dataLama, String data){
        Node baru = new Node(data);

        if (dataLama.equals(root.data)){
            root.childs.addLast(baru);
            baru.parent = root;
            return;
        }
        Node temp;
        temp = searchData(dataLama);
        temp.childs.addLast(baru);
        baru.parent=temp;
        //System.out.println(baru.data + baru.parent.data + baru.parent.parent.data);

    }
}
