fun main() {


    val man1 = Human();
    man1.id = 1;
    man1.name = "철수";
    man1.gender = "남";
    man1.age = 23;
    man1.hometown = "철원"
    println("id : ${man1.id}, name : ${man1.name}, gender : ${man1.gender}, age : ${man1.age}, hometown : ${man1.hometown}")

    val man2 = Human();
    man2.id = 2;
    man2.name = "영희";
    man2.gender = "여";
    man2.age = 22;
    man2.hometown = "남원";
    println("id : ${man2.id}, name : ${man2.name}, gender : ${man2.gender}, age : ${man2.age}, hometown : ${man2.hometown}")
    val man3 = Human();
    man3.id = 3;
    man3.name = "영수";
    man3.gender = "남";
    man3.age = 25;
    man3.hometown = "진천";
    println("id : ${man3.id}, name : ${man3.name}, gender : ${man3.gender}, age : ${man3.age}, hometown : ${man3.hometown}")

}

    class Human {
        var id: Int = 0;
        var name: String = "";
        var gender: String = " ";
        var age: Int = 0;
        var hometown: String = " ";

    }
