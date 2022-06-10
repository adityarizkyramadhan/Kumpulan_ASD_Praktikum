package Sorting;

import java.util.Scanner;

public class PenilaianJuri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();s.nextLine();
        Sorting sortingLomba = new Sorting(n);
        Data [] datas = new Data[n];
        for (int i=0; i< datas.length;i++ ){
            datas[i]=new Data(s.next(),s.nextDouble(),s.nextDouble());
        }
        sortingLomba.setData(datas);
        sortingLomba.bubbleSort();
        int posisi = sortingLomba.search(s.next());
        if (posisi<m){
            System.out.println("LOLOS");
        }else{
            System.out.println("GAGAL");
        }
    }
}

class Data {
    String nama;
    double nilai1;
    double nilai2;
    double jumlahNilai;

    Data (String nama, double nilai1, double nilai2) {
        this.nama = nama;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.jumlahNilai = nilai1 + nilai2;
    }
}

class Sorting{
    Data[] data;
    int jumlahData;
    Sorting(int jumlahData) {
        this.jumlahData = jumlahData;

    }
    public void setData(Data[] data){
        this.data = data;
    }
    public void bubbleSort(){
        for (int i = 0; i < jumlahData - 1; i++) {
            for (int j = 0; j < jumlahData - i - 1; j++) {
                if (data[j].jumlahNilai < data[j + 1].jumlahNilai) {
                    Data temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
    //searching
    public int search(String nama){
        for (int i = 0; i < jumlahData; i++) {
            if (data[i].nama.equals(nama)) {
                return i;
            }
        }
        return -1;
    }

}
