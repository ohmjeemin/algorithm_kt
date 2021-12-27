package ch1

import java.util.*
/*
*  숫자만 추출
* 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수 만듬
* */
class Main9 {
    fun solution(input:String) : String {
        val answer = StringBuilder();
        val regExp = "^[0-9]+$".toRegex()
        input.forEach { c ->  if("$c".matches(regExp)) answer.append(c) }
        while (answer[0]=='0') {
            answer.delete(0,1)
        }
        return answer.toString()
    }
}

fun main(){
    val main = Main9()
    val sc = Scanner(System.`in`)
    println(main.solution(sc.nextLine()))
}