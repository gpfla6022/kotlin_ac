fun main(){
    for ( dan in 1 .. 9) {
        print("== ${dan}단 ==")

        for ( i in 1 .. 9 ) {
            println("$dan * $i = ${dan + i}")
        }
    }
}