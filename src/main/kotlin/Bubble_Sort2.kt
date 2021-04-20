//== 프로그램 시작 ==
//숫자(띄워쓰기로 구분) : 3 0 1 8 7 2 5 4 6 9
//오름차순 정렬 결과 : 0 1 2 3 4 5 6 7 8 9
//내림차순 정렬 결과 : 9 8 7 6 5 4 3 2 1 0
//== 프로그램 끝 ==
fun main(){
    println("== 프로그램 시작 ==")
    print("숫자(띄어쓰기로 구분) : ")
    val numbers = readLine()!!.trim().split(" ").map{it.toInt()}.toMutableList()

    bubble_Sort(numbers)

    print("오름차순 정렬 결과 : ")
    print_Numbers(numbers)


    print("내림차순 정렬 결과 : ")
    printNumbers_Reversed(numbers)


    println("== 프로그램 끝 ==")
}

fun bubble_Sort(numbers: MutableList<Int>) {
    val lastIndex = numbers.size - 1

    var raiseCount = 0


    for (depth in lastIndex downTo 1){
        println("raiseCount : ${++raiseCount}, depth: $depth")

        for (i in 0 until depth ) {
        println("numbers[$i] vs numbers[${i + 1}]")

            if ( numbers[i] > numbers[i + 1]) {
                 numbers[i] = numbers[i + 1].also { numbers[i + 1] = numbers[i] }


                //val temp = numbers[i]
                //numbers[i] = numbers[i + 1]
                //numbers[i + 1] = numbers[i] temp값
            }
        }
    }
}




fun print_Numbers(numbers:List<Int>){
    numbers.forEach {
        print("$it ")
    }
    println()
}

fun printNumbers_Reversed(numbers: List<Int>){
    numbers.withIndex().reversed().forEach {
        print("${it.value} ")
    }
    println()
}