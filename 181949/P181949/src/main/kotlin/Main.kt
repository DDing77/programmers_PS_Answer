fun main(args: Array<String>) {
    val s1 = readLine()!!
    val sb = StringBuilder()

    s1.map {
        if (it in 'a'..'z') {
            sb.append(it.uppercaseChar())
        } else {
            sb.append(it.lowercaseChar())
        }
    }

    println(sb)
}