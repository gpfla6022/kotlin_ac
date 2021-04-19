fun main(){
    println("== 프로그램 시작 ==")

    val numbers = IntArray(100) {0}

    println("숫자 개수 : ")
    val a = readLine()!!.trim().toInt()
    println("${a} 개의 숫자를 입력 받았습니다.")

    for (i in 0 until a) {
        print("${i + 1}번째 숫자: ")
        numbers[i] = readLine()!!.trim().toInt()
    }

    var sum = 0

    for (i in 0 until a) {
        sum += numbers[i]
    }

    val avg = sum / a;

    println("입력하신 숫자의 합은 $sum 입니다.")
    println("입력하신 숫자의 평균은 $avg 입니다.")

    println("== 프로그램 끝 ==")
}