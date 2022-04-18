package DoubleLinkedList;

import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        QueueLagu list = new QueueLagu();
        try (Scanner s = new Scanner(System.in)) {
            int jumlah = s.nextInt();
            s.nextLine();
            String [] kumpulanPerintah = new String[jumlah];
            for (int i=0; i< kumpulanPerintah.length; i++){
                kumpulanPerintah[i] = s.nextLine();
            }
            for (int i=0; i< kumpulanPerintah.length; i++){
                String [] pemisah = kumpulanPerintah[i].split(" ");
                if (pemisah[0].equals("INSERT")){
                    list.tambahLagu(new NamaLagu(pemisah[1]));
                }else if(pemisah[0].equals("DELETE")){
                    list.hapusLagu(Integer.parseInt(pemisah[1]));
                }else if (pemisah[0].equals("SWAP")) {
                    list.tukarLagu(Integer.parseInt(pemisah[1]), Integer.parseInt(pemisah[2]));
                }else if (pemisah[0].equals("NEXT")){
                    list.nextPlay();
                }else if (pemisah[0].equals("PREV")){
                    list.prevPlay();
                }else if (pemisah[0].equals("PLAY")){
                    list.playNow();
                }else if (pemisah[0].equals("COUNT")){
                    list.banyakLagu();
                }else if (pemisah[0].equals("PRINT")){
                    list.printLagu();
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class NamaLagu{
    private String nama;
    NamaLagu(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    NamaLagu prev;
    NamaLagu next;
}

class QueueLagu{
    private NamaLagu head;
    private NamaLagu tail;
    public void tambahLagu(NamaLagu nama){
        if(head == null){
            head = nama;
            tail = nama;
        }else{
            tail.next = nama;
            nama.prev = tail;
            tail = nama;
        }
    }
    private NamaLagu play;
    public void playNow(){
        if (play == null){
            this.play = head;
        }
        System.out.println("Sedang diputar: "+play.getNama());
    }

    public void prevPlay(){
        NamaLagu jalan;
        if (play == null){
            this.play = head;
        }
        jalan = play.prev;
        play = jalan;
        System.out.println("Sedang diputar: "+play.getNama());
    }

    public void nextPlay(){
        NamaLagu jalan;
        if (play == null){
            play = head;
        }
        jalan = play.next;
        play = jalan;
        System.out.println("Sedang diputar: "+play.getNama());
    }

    public void printLagu(){
        System.out.println("==== PRINT LAGU ====");
        NamaLagu temp = head;
        while(temp != null){
            System.out.println(temp.getNama());
            temp = temp.next;
        }
    }
    public void hapusLagu(int urutan){
        NamaLagu temp = head;
        for(int i = 1; i < urutan; i++){
            if (temp == null){
                System.out.println("KOK BISA SIH DELETE YG GAK ADA!");
                return;
            }
            temp = temp.next;
        }
        // hapus lagu
        if(temp == head){
            head = temp.next;
        }else{
            temp.prev.next = temp.next;
        }
        if(temp == tail) {
            tail = temp.prev;
        }
    }
    public void banyakLagu(){
        int count = 0;
        NamaLagu temp = head;
        while(temp != null && temp.next!=null){
            temp = temp.next;
            count++;
        }
        if (count!=0){
            count++;
        }
        System.out.println("Total lagu: "+count);
    }

    public void tukarLagu(int pertama, int kedua){
        // AKU MENYERAH DISINI MAS HUHUHUHUHU :(
        NamaLagu first = head;
        NamaLagu second = head;
        for (int i = 1; i < pertama; i++){
            if (first == null){
                System.out.println("GAK ADA KOK YANG PERTAMA!");
                return;
            }
            first=first.next;
        }
        for (int i = 1; i < kedua; i++){
            if (first == null){
                System.out.println("GAK ADA KOK YANG KEDUA!");
                return;
            }
            second=second.next;
        }
        String penyimpan = first.getNama();
        first.setNama(second.getNama());
        second.setNama(penyimpan);

    }

}

