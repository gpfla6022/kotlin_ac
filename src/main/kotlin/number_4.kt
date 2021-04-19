fun main(){
    println("== 프로그램 시작 ==")

    println("숫자의 개수: ")
    val c = readLine()!!.trim().toInt()
    val moo = IntArray(c) {0}

    println("${c}개의 숫자를 입력받습니다.")

    for (i in 0 until c) {
        println("${i+1}번째 숫자 : ")
        moo[i] = readLine()!!.trim().toInt()
    }
    println("입력이 완료되었습니다.")


    println("입력하신 숫자의 합은 ${moo.sum()}입니다.")
    println("입력하신 숫자의 평균은 ${moo.average().toInt()} 입니다.")


    println("== 프로그램 끝 ==")
}