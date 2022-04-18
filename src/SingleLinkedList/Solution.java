package SingleLinkedList;

import java.util.Scanner;

public class Solution {
    public static void main(String args[] ) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            String namaKereta = s.nextLine();
            Kereta k = new Kereta(namaKereta);
            String gerbong = s.nextLine();
            String [] split = gerbong.split("-");
            for (int i=0; i<split.length; i++){
                k.addLast(new Gerbong(split[i]));
            }
            k.cetak();
        }
    }
}


class Kereta {
    /* Class berisi informasi nama kereta dan gerbongnya */
    String namaKereta;
    Kereta(String namaKereta){
        this.namaKereta = namaKereta;
    }
    Gerbong head;
    int size =0;
    boolean isEmpty(){
        return size==0;
    }

    void addLast(Gerbong input){
        if (isEmpty()){
            head = input;
        }else{
            Gerbong now = head;
            while (now != null){
                if (now.next == null){
                    now.next = input;
                    break;
                }
                now = now.next;
            }
        }
        size++;
    }

    void cetak(){
        Gerbong sementara = head;
        System.out.println(namaKereta);
        while (sementara!=null){
            System.out.print(sementara.namaGerbong);
            if (sementara.next != null){
                System.out.print("-");
            }
            sementara = sementara.next;
        }
    }
}

class Gerbong {
    /* Class berisi informasi kode jenis gerbong dan gerbong selanjutnya */
    String namaGerbong;
    Gerbong next;
    Gerbong (String namaGerbong){
        this.namaGerbong = namaGerbong;
    }
}
