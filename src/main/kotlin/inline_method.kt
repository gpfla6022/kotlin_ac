fun main() {


    val man1 = Human_2();
    man1.id = 1;
    man1.name = "철수";
    man1.gender = "남";
    man1.age = 23;
    man1.hometown = "철원"
    println(man1);
    println(man1.introduceMsg());

    val man2 = Human_2();
    man2.id = 2;
    man2.name = "영희";
    man2.gender = "여";
    man2.age = 22;
    man2.hometown = "남원";
    println(man2);
    println(man2.introduceMsg());

    val man3 = Human_2();
    man3.id = 3
    man3.name = "영수"
    man3.gender = "남"
    man3.age = 25
    man3.hometown = "진천"
    println(man3)
    println(man3.introduceMsg())

}

class Human_2 {
    var id: Int = 0
    var name: String = ""
    var gender: String = " "
    var age: Int = 0
    var hometown: String = " "

    fun introduceMsg(): String = "안녕하세요. 저는 ${age}살 $name 입니다. 저는 $hometown 출신입니다.";

    override fun toString(): String = "id: $id, name : $name, gender : $gender, age : $age, hometown : $hometown"


    }
