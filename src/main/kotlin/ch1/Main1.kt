package ch1

import java.util.*

class Main1 {
    fun solution(str: String, t: Char):Int {
        var answer = 0
        val paramStr = str.uppercase()
        val paramChar = t.uppercase()

        for(x in paramStr) {
            if("$x"==paramChar) answer ++;
        }
        return answer;
    }
}

fun main(){
    val main = Main1()
    val sc = Scanner(System.`in`)
    val str = sc.next()
    val c:Char = sc.next()[0]
    System.out.println(main.solution(str, c))
}