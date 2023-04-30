class Solution {
    var set = mutableSetOf<String>()
    lateinit var copySpell: Array<String>
    lateinit var isVisited: BooleanArray
    lateinit var word: CharArray

    fun makeString(depth: Int) {
        if (depth == copySpell.size) {
            var sb = StringBuilder()
            for (i in 0 until copySpell.size) {
                sb.append(word[i]);
            }
            set.add(sb.toString())
            return
        }

        for (i in 0 until copySpell.size) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                word[depth] = copySpell[i][0]
                makeString(depth + 1)
                isVisited[i] = false;
            }
        }
    }

    fun solution(spell: Array<String>, dic: Array<String>): Int {
        word = CharArray(spell.size)
        isVisited = BooleanArray(spell.size)
        copySpell = spell
        makeString(0)

        set.forEach {
            if(dic.contains(it)) {
                return 1
            }
        }

        return 2
    }
}