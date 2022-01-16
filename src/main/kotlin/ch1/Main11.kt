package ch1

import java.util.*

/*
* 문자열 압축
* 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를
* 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오
* 단 반복횟수가 1인 경우 생략합니다.
* */
class Main11 {
    fun solution(input:String) : String {
        val str = "$input "
        var answer = ""
        var cnt = 1
        for(i in input.indices) {
            if(str[i]==str[i+1]) cnt ++
            else {
                answer += str[i]
                if(cnt>1) answer += "$cnt"
                cnt = 1
            }
        }
        return answer
    }
}

fun main(){
    val main = Main11()
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(main.solution(s))
}