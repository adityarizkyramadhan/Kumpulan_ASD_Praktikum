# Sekertaris Sibuk

Wah, sekretaris kantor sedang kebingungan membaca surat masuk yang banyak sekali. Sepertinya dia butuh sistem untuk mengurutkan surat masuk berdasarkan prioritas.

Agar lebih mudah, prioritas diurutkan dari nilai yang terkecil sebagai prioritas utama dengan batas terendah 0.

Sistem bekerja sebagai berikut:

Terima Surat Masuk
Surat masuk yang diterima berisi prioritas dan isi surat. Format perintahnya adalah TERIMA [prioritas] [isi-surat].-->

Contoh TERIMA 99 Selamat datang di xxxx. Selamat Berbelanja!

Baca Surat
Tampilkan surat yang harus dibaca sekretaris. Ingat! harus dimulai dari prioritas tertinggi ya. Jika tidak ada surat, print KOTAK MASUK KOSONG. Perintah: BACA

Catatan: Gunakan heap tree untuk membuat penyelesaian ini.

Input Format

TERIMA  [prioritas] [isi-surat]  atau BACA

Constraints

prioritas >= 0
Output Format

Isi surat yang harus dibaca saat diperintahkan BACA. Jika tidak ada surat untuk dibaca, keluarkan: KOTAK MASUK KOSONG

Sample Input 0

TERIMA 69 Hai kawan
TERIMA 10 Surat Penting. Besok Rapat
BACA
BACA
Sample Output 0

Surat Penting. Besok Rapat
Hai kawan
Sample Input 1

TERIMA 1 Surat 1
TERIMA 1 Surat 2
TERIMA 0 Surat 3
TERIMA 1 Surat 4
TERIMA 1 Surat 5
TERIMA 0 Surat 6

BACA
BACA
BACA
BACA
Sample Output 1

Surat 3
Surat 6
Surat 1
Surat 2
