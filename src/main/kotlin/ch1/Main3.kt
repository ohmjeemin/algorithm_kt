package ch1

import java.util.*
/*
* 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요
* */
class Main3 {
    fun solution(str: String):String {
        val arr = str.split(" ")
        var max = Int.MIN_VALUE
        var answer = ""

        for(x in arr) {
            val len = x.length
            if(len > max) {
                max = len
                answer = x
            }
        }
        return answer;
    }
}

fun main(){
    val main = Main3()
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()
    println(main.solution(str))
}