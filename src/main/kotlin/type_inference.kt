fun main() {

    val man1 = Human_5(1, "철수", "남", 23, "철원");
    println(man1);

    val man2 = Human_5(2,"영희", "여", 22, "남원");
    println(man2);

    val man3 = Human_5(3,"영수", "남", 25,"진천");
    println(man3)


    // 이게 정상적인 변수 선언
    var a : Int;
    a = 40;
    //추론이 가능한 경우에는 안붙여도 됨
}

data class Human_5(
    var id: Int,
    var name: String,
    var gender: String,
    var age: Int,
    var hometown: String
) {


    fun introduceMsg(): String = "안녕하세요. 저는 ${age}살 $name 입니다. 저는 $hometown 출신입니다.";


}