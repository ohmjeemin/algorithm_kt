package ch1

import java.util.*
/*
* N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요
* */
class Main4 {
    fun solution(strArr:Array<String>) : ArrayList<String> {
        val answer = arrayListOf<String>()
        for(x in strArr) {
            val arr = x.toCharArray()
            var result = ""
            for(i in arr.size-1 downTo 0) { // downTo 역순일 때
                result += arr[i]
            }
            answer.add(result)
        }

        return answer;
    }
}

fun main(){
    val main = Main4()
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val strArr = Array(n, {""}) // size정한 빈배열 만들기

    for(i in 0 until n) { // until쓰면 0부터 n-1까지
        strArr[i] = sc.next()
    }

    for(x in main.solution(strArr)) {
        System.out.println(x)
    }
}