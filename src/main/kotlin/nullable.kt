fun main(){
    var person1: person?
    person1 = null
    if ( person1 != null) {
        person1.introduceMsg()
    }
    else{
        println("사람이 없습니다.")
    }
}

data class person (
    var id: Int,
    var name: String,
    var gender: String,
    var age: Int,
    var hometown: String
) {
    fun introduceMsg(): String = "안녕하세요. 저는 ${age}살, $name 입니다. 저는 $hometown 출신입니다.";
}