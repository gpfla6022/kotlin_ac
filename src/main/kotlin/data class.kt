fun main() {

    val man1 = Human_4(1, "철수", "남", 23, "철원");
    println(man1);

    val man2 = Human_4(2,"영희", "여", 22, "남원");
    println(man2);

    val man3 = Human_4(3,"영수", "남", 25,"진천");
    println(man3)

}

data class Human_4(
    var id: Int,
    var name: String,
    var gender: String,
    var age: Int,
    var hometown: String
) {


    fun introduceMsg(): String = "안녕하세요. 저는 ${age}살 $name 입니다. 저는 $hometown 출신입니다.";


}