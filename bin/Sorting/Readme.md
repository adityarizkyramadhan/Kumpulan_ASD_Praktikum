# Penjurian

Untuk masuk instansi, ada 2 tahap seleksi yang harus diikuti setiap pendaftar, yakni tahap A dan tahap B. Aturannya adalah nilai seleksi diambil dari terbaik tahap B. Tahap A hanya digunakan apabila ada nilai yang sama pada tahap B.

Instansi hanya membutuhkan M orang yang akan lolos seleksi. Demi kerahasiaan data pendaftar, instansi tidak akan mengumumkan hasil seleksinya melainkan peserta yang harus bertanya apakah dia diterima pada instansi tersebut.

Panitia seleksi tentu akan kewalahan jika harus menjawab pertanyaan N pendaftar satu per satu. Buatlah program yang dapat membantu panitia untuk menjawab pertanyaan pendaftar!

Input Format

N M

nama1 A1 B1

nama2 A2 B2

...

namaN AN BN

namapenanya

Constraints

nama = 1 kata
0.0 &lt;= Ai, Bi &lt;= 100.0
1 &lt;= N &lt;= 1000
1 &lt;= M &lt;= N
Tidak ada 2 peserta yang memiliki nilai sama pada tahap A dan B
Output Format

LOLOS atau GAGAL

Sample Input 0

5 3
Adit 9.0 15.0
Bagas 10.0 20.0
Dani 10.0 15.0
Budi 10.2 10.5
Eko 9.3 1.1
Adit
Sample Output 0

LOLOS
Explanation 0

Leaderboard berdasarkan aturan adalah:

Nama	Tahap A	Tahap B
Bagas	10.0	20.0
Dani	10.0	15.0
Adit	9.0	15.0
Budi	10.2	10.5
Eko	9.3	1.1
Dari 5 peserta, diambil 3 peserta. Adit berada pada urutan ke-3 sehingga dia dinyatakan LOLOS
