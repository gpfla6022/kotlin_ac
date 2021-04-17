fun main(){
    println("== 프로그램시작 ==")

    println("* 숫자입력")

    print("숫자 : ")
    val numb0 = readLine()?. trim()?.toInt()
    print("숫자 : ")
    val numb1 = readLine()!!.trim().toInt()
    print("숫자 : ")
    val numb2 = (readLine() ?: "").trim().toInt()
    print("숫자 : ")
    val numb3 = readLine() ?.trim()?.toInt() ?: 0

    println("* 숫자출력")

    println("numb0 : $numb0")
    println("numb1 : $numb1")
    println("numb2 : $numb2")
    println("numb3 : $numb3")

    println("== 프로그램시작 ==")
}

// !!는 null이 아니라고 확신하는 것
// ?:는 엘비스 연산자로 readLine의 값이 있으면 나오고 널이면 ""의 값이 나옴
// ?: 0끝까지 다했는데 값이 없으면 0
// trim은 띄어쓰기된 공백을 삭제해줌
