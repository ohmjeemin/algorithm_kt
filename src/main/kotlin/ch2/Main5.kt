package ch2

import java.util.*
/*
피보나치 수열
- 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
- 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다
* */
class Main5 {
    fun solution(input:Int) : Int {
        var cnt = 0
        val arr = Array(input+1){0}
        for(i in 2 until input) {
            if(arr[i]==0) {
                cnt ++
                var j = i
                //println(j)
                while (j>input) {
                    arr[j]=1
                    j += i
                }
//                for(j in i .. input step (j)) {
//                    arr[j]=1
//                }
            }
        }
        return cnt
    }
}

fun main(){
    val main = Main5()
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(main.solution(n))
}