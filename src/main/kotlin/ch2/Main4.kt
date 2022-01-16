package ch2

import java.util.*
/*
피보나치 수열
- 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
- 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다
* */
class Main4 {
    fun solution(n: Int) : Array<Int> {
        val arr = Array(n){0}
        arr[0] = 1
        arr[1] = 1
        for(i in 2 until n) arr[i] = arr[i-1] + arr[i-2]
        return arr
    }
}

fun main(){
    val main = Main4()
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    main.solution(n).forEach { print("$it ") }
}