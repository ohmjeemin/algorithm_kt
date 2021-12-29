package ch1

import java.util.*
/*
* 중복 문자 제거
* 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요
* 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
* */
class Main6 {
    fun solution(str:String) : String =
        str.foldIndexed(""){ idx, total, next -> if(str.indexOf(str[idx])==idx) total + next else total}
}

fun main(){
    val main = Main6()
    val sc = Scanner(System.`in`)
    val str = sc.next()

    println(main.solution(str))
}