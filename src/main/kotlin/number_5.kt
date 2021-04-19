fun main(){
    println("== 회원관리 프로그램 시작 ==")

    print("회원 수 : ")
    val membersCount = readLine()!!.trim().toInt()
    val members = Array<Member?>(membersCount) {null}
    println("${membersCount}명의 회원 정보를 입력합니다.")

    for ( i in 0 until membersCount) {
        val id = i + 1
        print("${i + 1}번 째 회원의 이름 :")
        val name = readLine()!!.trim()
        print("${i + 1}번 째 회원의 나이 :")
        val age = readLine()!!.trim().toInt()
        print("${i + 1}번 째 회원의 성별 (m/w) :")
        val gender = readLine()!!.trim()[0]

        val member = Member(id, name, age, gender)
        members[i] = member
    }
    println(" = 입력하신 회원 리스트 = ")
    println(" 번호 / 이름 / 나이 / 성별 ")

    for (member in members){
        ("${member?.id} / ${member?.name} / ${member?.age} / ${member?.getGenderKor()} ")
    }

    println("== 회원관리 프로그램 끝 ==")

}

data class Member(
    var id:Int,
    var name:String,
    var age:Int,
    var gender:Char
) {
    fun getGenderKor():String{
        if (gender == 'w'){
            return "여자"
        }

        return "남자"
    }
}