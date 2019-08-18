import java.util.Scanner;

fun main(args: Array<String>) {
    // membuat objek scanner
    val input = Scanner(System.`in`)

    // mengambil input
    print("Nama: ")
    val nama = input.nextLine()
    print("Umur: ")
    val umur = input.nextInt()

    // menampilkan isi variabel nama dan umur
    println("Nama kamu adalah $nama dan usianya $umur tahun")
}