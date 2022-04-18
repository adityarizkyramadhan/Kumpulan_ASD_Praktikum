#Daftar Putar (Playlist)

Anda diminta untuk membuat sistem daftar putar lagu. Kebutuhan fiturnya:
Menambah lagu pada daftar putar
Menghapus lagu pada daftar putar
Mengubah urutan lagu pada daftar putar
Menampilkan lagu yang sedang diputar
Fitur next/prev lagu
Menampilkan jumlah lagu di daftar putar

Ada N perintah yang akan diujikan. Lagu diputar dari urutan awal. Anda harus menampilkan lagu yang sedang diputar jika ada perintah PLAY, NEXT, atau PREV.

Catatan:

Harus menggunakan konsep double linked list.
Struktur kode bebas

Input Format
Banyak Perintah
perintah 1
.
.
.
perintah N

Constraints

Perintah pasti diawali dengan INSERT atau COUNT
Nama lagu hanya 1 kata.
Nilai urutan lagu pada perintah SWAP dan DELETE dipastikan sesuai dengan kondisi daftar putar seharusnya.
Tidak ada perintah NEXT jika posisi pemutaran lagu sudah diakhir dan tidak ada perintah PREV jika di awal.
Output Format
Lagu yang sedang diputar atau jumlah lagu pada daftar putar

Sample Input 0
13
COUNT
INSERT KekasihTakDianggap
INSERT Alone
INSERT BuihJadiPermadani
NEXT
SWAP 1 3
PREV
INSERT MeraihMimpi
SWAP 4 3
NEXT
NEXT
NEXT
COUNT
Sample Output 0

Total lagu: 0
Sedang diputar: Alone
Sedang diputar: BuihJadiPermadani
Sedang diputar: Alone
Sedang diputar: MeraihMimpi
Sedang diputar: KekasihTakDianggap
Total lagu: 4
Sample Input 1

10
INSERT aAa
INSERT bBb
INSERT bBb
PLAY
NEXT
SWAP 1 2
PLAY
SWAP 1 3
SWAP 2 3
PLAY
Sample Output 1

Sedang diputar: aAa
Sedang diputar: bBb
Sedang diputar: aAa
Sedang diputar: bBb