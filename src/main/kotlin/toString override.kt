// 첫번째 사람은 철수/남자/23살/철원
// 두번째 사람은 영희/여자/22살/남원
// 세번째 사람은 영수/남자/25살/진천

fun main() {
    val man1 = Person();
    man1.id = 1;
    man1.name = "철수";
    man1.gender = "남자";
    man1.age = 23;
    man1.hometown = "철원";
    println(man1);

    val man2 = Person();
    man2.id = 2;
    man2.name = "영희";
    man2.gender = "여자";
    man2.age = 22;
    man2.hometown = "남원";
    println(man2);

    val man3 = Person();
    man3.id = 3;
    man3.name = "영수";
    man3.gender = "남자";
    man3.age = 25;
    man3.hometown = "진천";
    println(man3);
}

class Person {
    var id :Int = 0;
    var name :String = "";
    var gender :String = "";
    var age :Int = 0;
    var hometown :String = "";

    override fun toString(): String {
        return "id: $id, name: $name, gender: $gender, age: $age, hometown: $hometown";
    };
}