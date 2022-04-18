#BS Tree
Disediakan beberapa pasangan angka A dan value V. Buatlah BST tree dengan basis angka-angka tersebut.

Tampilkan value dari angka yang diminta.

Ada N pasangan angka dan value dan M perintah pencarian value.

Input Format
N M
A1 V1
A2 V2
...
AN VN
P1
P2
...
PM

Constraints
1 <= N, M <= 3000
A = Angka unik

Output Format
Value dari angka yang diminta. Output TIDAK ADA jika tidak ditemukan.

Sample Input 0
3 1
1 Ada
2 Bebek
3 Cherry
3

Sample Output 0
Cherry

Sample Input 1
1 3
2 X
1
1
2

Sample Output 1
TIDAK ADA
TIDAK ADA
X

#Sistem Direktori

Sistem direktori adalah sistem pengelolaan penempatan berkas. Dalam OS lain, direktori disebut dengan folder. Di dalam direktori bisa berisi direktori atau berkas.

Buat sistem direktori tersebut menjadi bentuk tree. Sistem tersebut dapat menambahkan berkas dan mencari berkas.

Ada N perintah yang harus dikerjakan.

Input Format
N

Buat berkas:
touch /nama-direktori/.../nama-berkas

Cari berkas/direktori:
find -name nama-berkas

Constraints
Nama direktori dan nama berkas adalah nama unik.

Output Format
TIDAK ADA atau path berkas

Sample Input 0
5
touch /home/file1
touch /home/file2
touch /home/file3/file4
find -name file1
find -name file2

Sample Output 0
/home/file1
/home/file2

Sample Input 1
3
touch /file
find -name file2
find -name file

Sample Output 1
TIDAK ADA
/file