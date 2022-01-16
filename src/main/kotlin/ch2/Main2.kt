package ch2

import java.util.*
/*
보이는 학생
* */
class Main2 {
    fun solution(list: MutableList<Int>) : Int {
        var cnt = 1
        var max = list[0]
        for(i in 0 until list.size) {
            if(list[i] > max) {
                max = list[i]
                cnt ++
            }
        }
        return cnt
    }
}

fun main(){
    val main = Main2()
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val list = mutableListOf<Int>()
    for(i in 0 until n) {  //until은 n포함 안함 i in 0..n은 n포함한다.
        list.add(sc.nextInt())
    }
    print(main.solution(list))
}