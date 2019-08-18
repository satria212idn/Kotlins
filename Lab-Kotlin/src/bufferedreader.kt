import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.Reader

fun main(args: Array<String>) {
    // membuat objek BufferedReader
    val input = BufferedReader(InputStreamReader(System.`in`) as Reader?)

    // mengambil input
    print("input nama: ")
    val namaku = input.readLine()

    // menampilkan output
    println("namaku adalah $namaku")
}