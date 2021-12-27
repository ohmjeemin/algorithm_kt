package ch1

import java.util.*
/*
* 회문 문자열
* 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
* 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES" 회문 문자열이 아니면 "NO"를 출력하는 프로그램을 작성하세요.
* 단 회문을 검사할 때 대소문자를 구분하지 않습니다...
* */
class Main7 {
    fun solution(input:String) : String {
        var answer = "YES";
        val str = input.uppercase()
        val length = str.length
        for(i in 0 .. length/2) {
            if(str[i] != str[length-1-i]) {
                answer = "NO"
                break
            }
        }
        return answer
    }
}

fun main(){
    val main = Main7()
    val sc = Scanner(System.`in`)
    println(main.solution(sc.next()))
}