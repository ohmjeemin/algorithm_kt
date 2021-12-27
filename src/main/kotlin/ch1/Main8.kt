package ch1

import java.util.*
/*
* 유효한 팰린드롬
* 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 한다.
* 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES" 아니면 "NO"를 출력하는 프로그램을 작성하세요.
* 단 회문을 검사할 때 알파벳 알파벳만 가지고 회문을 검사하고, 대소문자를 구분하지 않습니다.
* found7, time: study; Yduts; emit, 7Dnuof
* */
class Main8 {
    fun solution(input:String) : String {
        var answer = "NO";
        val str = input.uppercase().replace("[^A-Z]".toRegex(), "")
        println(str) //FOUNDTIMESTUDYYDUTSEMITDNUOF
        val tmp = str.reversed()
        println(tmp) //FOUNDTIMESTUDYYDUTSEMITDNUOF
        if(str==tmp) answer = "YES"
        return answer
    }
}

fun main(){
    val main = Main8()
    val sc = Scanner(System.`in`)
    println(main.solution(sc.nextLine()))
}