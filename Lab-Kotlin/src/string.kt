fun main(args: Array<String>){

    val nama = "Reza"
    val usia = 13
    val alamat = "Bandung"

    val template = """
    nama: $nama
    usia: $usia tahun
    alamat: $alamat

    Reza 5 tahun lagi akan berusia ${usia + 5} tahun
    """.trimIndent()

    println(template)

}