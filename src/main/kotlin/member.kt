fun main(){
    println("== 회원관리 프로그램 시작 ==")

    println("회원 수 : ")
    val MembersCount = readLine()!!.trim().toInt()
    val members = Array<Friend?>(MembersCount) {null}

    println("= ${MembersCount}명의 회원 정보를 입력합니다. =")

    for (i in 0 until MembersCount){
        val id = i + 1
        print("${i + 1}번째 회원의 이름: ")
        val name = readLine()!!.trim()
        print("${i + 1}번째 회원의 나이: ")
        val age = readLine()!!.trim().toInt()
        print("${i + 1}번째 회원의 성별(M/W): ")
        val gender = readLine()!!.trim()[0]
        println("${i + 1}번쨰 회원 정보가 등록되었습니다.")

        val member = Friend(id, name, age, gender)
        members[i] = member
    }

    println("= 입력하신 회원 리스트 =")
    println("번호 / 이름 / 나이 / 성별")

    for (member in members){
        println("${member?.id} / ${member?.name} / ${member?.age} / ${member?.getKor()} / ")
    }


    println("== 회원관리 프로그램 시작 ==")
}

data class Friend(
    var id: Int,
    var name: String,
    var age: Int,
    var gender: Char
) {fun getKor (): String {
    if (gender == 'W'){
        return "여자"
    }
    return "남자"
}


}