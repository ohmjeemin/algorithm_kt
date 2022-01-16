package ch2

import java.util.*
/*
큰 수 출력하기
* */
class Main1 {
    fun solution(list: MutableList<Int>) : Int = list.maxOf{ num -> num }
}

fun main(){
    val main = Main1()
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val list = mutableListOf<Int>()
    for(i in 0 until n) {  //until은 n포함 안함 i in 0..n은 n포함한다.
        list.add(sc.nextInt())
    }
    print(main.solution(list))
}