/*
입력데이터1
-----------
3
김동희
30
m
김민희
30
W
홍길동
20
M
 */
fun main() {
    println("== 회원관리 프로그램 시작 ==")

    print("회원 수 : ")
    val membersCount = readLine()!!.trim().toInt()

    val members:Array<Memb> = Array<Memb?>(membersCount) { null } as Array<Memb>

    println("= ${membersCount}명의 회원 정보를 입력합니다. =")

    for (i in members.indices) {
        val id = i + 1
        print("${i + 1}번째 회원의 이름 : ")
        val name = readLine()!!.trim()
        print("${i + 1}번째 회원의 나이 : ")
        val age = readLine()!!.trim().toInt()
        print("${i + 1}번째 회원의 성별(M/W) : ")
        val gender = readLine()!!.trim()[0]

        members[i] = Memb(id, name, age, gender)
    }

    SortMembersByAgeAsc(members)


    println("= 입력하신 회원 리스트 =")
    println("번호 / 나이 / 성별 / 이름")

    for (member in members) {
        println("${member.id}    / ${member.age}   / ${member.getGenderKor()} / ${member.name}")
    }

    println("== 회원관리 프로그램 끝 ==")
}

fun IsMemberBiggerThan(member1: Membs, member2: Membs): Boolean {
    if( member1.age !=  member2.age )return member1.age >  member2.age
    return member1.name >  member2.name

}

fun SortMembersByAgeAsc(members: Array<Memb>) {
    println("정렬 시작")

    val maxDepth = members.size - 1

    for ( depth in maxDepth downTo 1) {

        for ( i in 0 until depth) {
            if ( isMemberBiggerThan(members[i], members[i + 1])) {
                members[i] = members[i + 1].also {members[i + 1] = members[i]}
            }
        }
    }

    println("정렬 끝")
}



data class Membs(
    val id: Int,
    val name: String,
    val age: Int,
    val gender: Char
) {

    fun getGenderKor(): String = when(gender) {
        'w' -> "여자"
        else -> "남자"
    }
}