fun main(args: Array<String>) {
    app()
}

fun app() {
    do {
        println("Aplikasi Kalkulator Sederhana")
        println("=============================")
        println("Pilih operasi yang akan digunakan")
        println("1. Tambah")
        println("2. Kurang")
        println("3. Bagi")
        println("4. Kali")
        println("0. Selesai")
        print("Pilih salah satu: ")
        var pilih = readln().toInt()

        if (pilih == 0) {
            break
        } else if (pilih > 4){
            break
        }

        print("Masukkan nilai ke 1: ")
        var a = readln().toInt()
        print("Masukkan nilai ke 2: ")
        var b = readln().toInt()

        when (pilih) {
            1 -> println("Hasil penambahan antara $a + $b adalah ${plus(a, b)}")
            2 -> println("Hasil pengurangan antara $a - $b adalah ${minus(a, b)}")
            3 -> println("Hasil pembagian antara $a / $b adalah ${divided(a, b)}")
            4 -> println("Hasil perkalian antara $a - $b adalah ${multiply(a, b)}")
        }
    } while (pilih < 5)
}

fun plus(a: Int, b: Int) = a + b

fun minus(a: Int, b: Int) = a - b

fun divided(a: Int, b: Int) =
    if (b == 0) {
        throw IllegalArgumentException("Cannot divide by zero")
    } else {
        a / b
    }

fun multiply(a: Int, b: Int) = a * b