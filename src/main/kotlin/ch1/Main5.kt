package ch1

import java.util.*
/*
* 특정 문자 뒤집기
* 영어 알파벳과 특수문자로 구성된 문자들이 주어지면 영어 알파벳만 뒤집고,
* 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요
* */
class Main5 {
    fun solution(str:String) : String {
        var answer = ""
        var sArr = str.toCharArray()
        var lt = 0
        var rt = sArr.size-1

        while(lt < rt) {
            if(!(sArr[lt].isLowerCase() || sArr[lt].isUpperCase())) lt++
            else if(!(sArr[rt].isLowerCase() || sArr[rt].isUpperCase())) rt--
            else {
                var temp = sArr[lt]
                sArr[lt] = sArr[rt]
                sArr[rt] = temp
                lt ++
                rt --
            }
        }
        answer = sArr.joinToString("")
        return answer
    }
}

fun main(){
    val main = Main5()
    val sc = Scanner(System.`in`)
    val str = sc.next()

    println(main.solution(str))
}