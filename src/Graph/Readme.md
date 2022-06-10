Dalam jaringan, sebuah perangkat dapat terkoneksi dengan perangkat lainnya. Koneksi bisa dilakukan secara langsung atau dengan perantara suatu perangkat.

Network Cost adalah nilai yang diperlukan untuk menciptakan koneksi. Pada soal ini, kalian hanya diminta untuk menentukan Network Cost dengan parameter banyak hop saja. Hop adalah jumlah perangkat yang harus dilewati untuk mencapai tujuan. Network Cost dari koneksi langsung adalah 1.

Anda akan disediakan N perangkat dengan id 0 hingga (N-1). Lalu akan ada M koneksi antar perangkat Xm ke Ym. Hitunglah Network Cost paling rendah antara perangkat dengan id C0 ke C1.

Network Cost bernilai -1 jika kedua perangkat tidak dapat terhubung.

Input Format

N
M
X1 - Y1
X2 - Y2
...
Xm - Ym
C0
C1
Constraints

0 &lt; N &lt;= 100
0 &lt;= M &lt;= N(N-1) / 2
0 &lt;= C0, C1, Xm, Ym &lt; N
Output Format

Nilai network cost.

Sample Input 0

6
3
1 - 2
2 - 3
5 - 1
1
3
Sample Output 0

2
Explanation 0

image

Perangkat 1 harus melewati 2 perangkat untuk tiba di perangkat 3, yaitu perangkat 2 dan perangkat 3

Sample Input 1

6
4
1 - 2
2 - 3
5 - 1
3 - 1
1
3
Sample Output 1

1
Explanation 1

image

Ada 2 opsi untuk menghubungkan perangkat 1 ke 3. Namun opsi dengan Cost terkecil adalah koneksi langsung perangkat 1 dan 3. Sehingga Network Cost bernilai 1.
