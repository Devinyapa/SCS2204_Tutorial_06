object Main {
    val ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ .,"
    val KEY = 5

    def shift(dir: Int, idx: Int, key: Int, asize: Int) = {
        var temp = (idx + dir * key) % asize
        if(temp < 0) temp = temp + asize
        temp
    }

    def Encrypt(c: Char, key: Int, a: String) = a(shift(1, a.indexOf(c.toUpper), 5, a.size))

    def Decrypt(c: Char, key: Int, a: String) = a(shift(-1, a.indexOf(c.toUpper), 5, a.size))

    def cipher(algo: (Char, Int, String) => Char, s: String, key: Int, a: String) = s.map(algo(_, key, a))

    def main(args: Array[String]) = {
        val text = "Hello, Functional Programming."

        val ct = cipher(Encrypt, text, KEY, ALPHABET)
        println("\nCiper text : " + ct + "\n")

        val pt = cipher(Decrypt, ct, KEY, ALPHABET)
        println("Original text : " + pt)

    }
}
