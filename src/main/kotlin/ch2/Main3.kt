package ch2

import java.util.*
/*
가위바위보 - 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
1:가위, 2:바위, 3:보
* */
class Main3 {
    fun solution(list1: MutableList<Int>, list2: MutableList<Int>) : String {
        var answer = ""
        for(i in 0 until list1.size) {
            answer += when {
                list1[i]==list2[i] -> "D"
                list1[i]==1 && list2[i]==3 ||
                list1[i]==2 && list2[i]==1 ||
                list1[i]==3 && list2[i]==2 -> "A"
                else -> "B"
            }
        }
        return answer
    }
}

fun main(){
    val main = Main3()
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()
    for(i in 0 until n) {  //until은 n포함 안함 i in 0..n은 n포함한다.
        list1.add(sc.nextInt())
    }
    for(i in 0 until n) {  //until은 n포함 안함 i in 0..n은 n포함한다.
        list2.add(sc.nextInt())
    }
    main.solution(list1, list2).forEach {
        println(it)
    }
}