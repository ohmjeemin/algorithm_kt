package ch1

import java.util.*
/*
* 가장 짧은 문자거리
* 한 개의 문자열 s와 문자 t가 주어지면 문자열 s가 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요
* */
class Main10 {
    fun solution(input1:String, input2:Char) : List<Int> {
        val answer = mutableListOf<Int>()
        var p = 1000
        input1.mapIndexed { idx, s ->
            if(input1[idx] == input2) {
                p = 0
                answer.add(idx, p) // 맨첨엔 add .. 근데 answer[idx] = p 이건 왜 안되는지 아직도 모르겠다;;
            }else {
                p += 1
                answer.add(idx, p)
            }
        }

        p = 1000
        for(x in answer.size-1 downTo 0) {
            if(input1[x] == input2) p = 0
            else {
                p += 1
                answer[x] = Math.min(answer[x], p) // 이미 들어와있어서 되는건지
            }
        }
        print(answer.size)

        return answer
    }
}

fun main(){
    val main = Main10()
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val c = sc.next()[0]
    

    val result = main.solution(s, c)
    result.forEach{ r -> print("$r ")}
}