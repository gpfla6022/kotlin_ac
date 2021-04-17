fun main(){
    println("== 프로그램 시작 ==")

// val numbers = intArrayOf(0, 0, 0)
    val numbers = IntArray(3) { 0 }
// 3칸 짜리 배열이 완성되고 초기값은 0 이다.

    println("* 숫자 입력 ")

//    for ( i in 0 .. numbers.size - 1) {}
    for ( i in numbers.indices) {
        println("${ i + 1}번째 숫자입력")
        numbers[i] = readLine()!!.trim().toInt()
                }
    println("* 숫자 출력 ")
 //   for ( i in numbers.indices) {
 //       println("${ i + 1}번째 숫자 : ${numbers[i]}")}
   var i = 0
    for ( number in numbers) {
        i++
        println("${i}번째 숫자 : $number")}


    println("== 프로그램 끝 ==")
}