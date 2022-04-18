#XML Markup
XML adalah salah satu bahasa markup yang ditulis dengan membuat tag yang selalu berpasangan. Misalnya untuk menuliskan tag style maka akan dituliskan .... Tugas kamu hanya memastikan setiap tag telah berpasangan dan berada di urutan yang tepat.

Gunakan ASD Stack untuk menyelesaikan permasalahan ini.

Input Format
TAG1
TAG2

.
.
.
TAGN

Constraints
Hanya ada satu tag pembuka atau penutup per barisnya.
Tidak ada konten selain tag
Output Format

TRUE or FALSE

Sample Input 0
<html>
</html>
<body>
</body>

Sample Output 0
TRUE

Explanation 0
Masing-masing tag html dan body telah berpasangan dan urutan penutup tag tepat.

Sample Input 1
<html>
<body>
</body>
</html>

Sample Output 1
TRUE

Sample Input 2
<php>
<html>
</html>

Sample Output 2
FALSE

Explanation 2
Tag PHP tidak memiliki penutup

Sample Input 3
<html>
<body>
</html>
</body>

Sample Output 3
FALSE

Explanation 3
Masing-masing html dan body memiliki pasangan, namun urutan penutup tag tidak sesuai.