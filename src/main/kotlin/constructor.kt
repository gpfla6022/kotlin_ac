fun main() {


    val man1 = Human_3(1, "철수", "남", 23, "철원");
    println(man1.introduceMsg());

    val man2 = Human_3(2,"영희", "여", 22, "남원");
    println(man2.introduceMsg());

    val man3 = Human_3(3,"영수", "남", 25,"진천");
    println(man3.introduceMsg())

}

class Human_3(
    var id: Int,
    var name: String,
    var gender: String,
    var age: Int,
    var hometown: String
  ) {


    fun introduceMsg(): String = "안녕하세요. 저는 ${age}살 $name 입니다. 저는 $hometown 출신입니다.";

    override fun toString(): String = "id: $id, name : $name, gender : $gender, age : $age, hometown : $hometown"


}