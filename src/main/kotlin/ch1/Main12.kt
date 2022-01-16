package ch1
//
//import java.util.*
//
///*
//소수(에라토스테네스 체)
//- 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요
//- 만약 20이 입력되면 1부터 20까지의 소수는 2,3,5,7,11,13,17,19로 총 8개 입니다.
//* */
//class Main12 {
//    fun solution(input:Int) : Int {
//        var cnt = 0
//        val arr = Array(input+1){i -> i}
//        for(i in 2 until input) {
//            if(arr[i]==0) {
//                cnt ++
//                for(i in i .. input step(i)) {
//
//                }
//            }
//        }
//        return 3
//    }
//}
//
//fun main(){
//    val main = Main11()
//    val sc = Scanner(System.`in`)
//    val s = sc.nextInt()
//    println(main.solution(s))
//}