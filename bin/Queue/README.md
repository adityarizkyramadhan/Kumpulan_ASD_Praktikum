#Hangar Pesawat

Hanggar pesawat adalah tempat perbaikan dan maintenance pesawat. Karena pesawat yang dapat diperbaiki dalam satu waktu hanya 2 pesawat, maka harus dibuat sistem antrian.

Akan ada input INPUT <kode-registrasi-pesawat> untuk menambahkan antrian dan input FIX untuk menunjuk pesawat yang akan diperbaiki. Tugas Anda selain membuat sistem antrian, anda juga harus mengefisiensikan pengerjaan perbaikan pesawat.

Input Format
INPUT <kode-registrasi-pesawat> atau FIX

Constraints
Kode registrasi pesawat adalah satu kata

Output Format
Kode registrasi pesawat yang harus diperbaiki

Sample Input 0
INPUT PK-LBS
INPUT PK-LDP
INPUT PK-LQR
FIX
FIX
INPUT PK-ABS
FIX

Sample Output 0
PK-LBS
PK-LDP
PK-LQR
PK-ABS

Explanation 0
FIX pertama menunjuk pesawat PK-LBS dan PK-LDP. FIX kedua menunjuk pesawat PK-LQR. FIX ketiga menunjuk PK-ABS

Sample Input 1
INPUT PK-NPK
INPUT PK-NDK
INPUT PK-RBQ
FIX
INPUT PK-VQK

Sample Output 1
PK-NPK
PK-NDK

#Forward Packet

Kalian tau router? Perangkat yang meneruskan paket data pada jaringan lokal kalian ke tujuan selanjutnya atau internet.

Router perlu menjaga Quality of Service (QoS). Ketika Anda sedang menelepon, tentu tidak ingin diganggu oleh teman kalian yang sedang menonton YouTube bukan?

Ada 2 tipe data, CALL dan DATA. Anda harus membuat sistem antrian paket data, kemudian anda harus menentukan paket mana yang akan keluar. Paket CALL harus lebih diprioritaskan daripada paket DATA.

Tentukan paket data yang harus diteruskan saat diperintahkan OUT pada console.

Input Format

CALL <raw-data> atau DATA <raw-data> atau OUT

Constraints

<raw-data> bisa jadi mengandung whitespace
Output Format

Data terkait yang harus diteruskan ke tujuan selanjutnya.

Sample Input 0
DATA 123
CALL 0893
DATA 222
OUT
OUT
OUT

Sample Output 0
0893
123
222

Sample Input 1
DATA 1
DATA 2
DATA 3
CALL 5
CALL 4
CALL 6
OUT
OUT
OUT
OUT

Sample Output 1
5
4
6
1