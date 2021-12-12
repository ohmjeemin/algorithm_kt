package ch1

import java.util.*
/*
* 소문자는 대문자로 대문자는 소문자로 변환
* */
class Main2 {
    fun solution(str: String):String {
        var answer = ""

        for(x in str) {
            answer += if(x.isLowerCase()) x.uppercase() else x.lowercase()
        }
        return answer;
    }
}

fun main(){
    val main = Main2()
    val sc = Scanner(System.`in`)
    val str = sc.next()
    println(main.solution(str))
}