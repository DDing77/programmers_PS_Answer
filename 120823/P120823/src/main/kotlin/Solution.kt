fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)
    var sb = StringBuilder()

    for (i in 1..n) {
        for (j in 1..i) {
            sb.append('*')
        }
        sb.append('\n')
    }

    println(sb)
}