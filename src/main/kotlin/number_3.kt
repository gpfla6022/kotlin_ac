fun main(){
    println("== 프로그램 시작 ==")

    val abc = IntArray(10) {0}

    var b = 0

    while (true) {
        println("숫자 개수 : ")
        b = readLine()!!.trim().toInt()

    if (b > abc.size) {
        println("${abc.size}이하의 숫자를 입력해 주세요.")
        }
        else {
            break
        }
    }
    println("${b}개의 숫자를 입력 받았습니다.")

        for (i in 0 until b){
            print("${i + 1}번째 숫자 : ")
            abc[i] = readLine()!!.trim().toInt()
        }

    var sum = 0;

    for (i in 0 until b) {
        sum += abc[i]
    }

    val avg = sum / b

    println("입력하신 숫자의 합은 $sum 입니다.")
    println("입력하신 숫자의 합은 $avg 입니다.")

    println("== 프로그램  끝==")
}