import java.text.SimpleDateFormat

fun readLineTrim() = readLine()!!.trim()


fun main() {
    println("== 게시판 관리 프로그램 시작 ==")

    var articlesLastId = 0

    val articles = mutableListOf<Article>()

    loop@ while (true) {
        print("명령어")
        val command = readLineTrim()
        println("입력한 명령어 : $command")

        when {
            command == "system exit" -> {
                println("프로그램을 종료합니다.")
                break@loop
            }

            command.startsWith("article delete ") -> {
                val id = command.trim().split(" ")[2].toInt()

                var articleToDelete: Article? = null

                for ( article in articles ) {
                    if ( article.id == id ) {
                        articleToDelete = article
                    }
                }

                if( articleToDelete == null){
                    print("${id}번 게시물은 존재하지 않습니다.")
                    continue
                }

                articles.remove(articleToDelete)

                print("${id}번 게시물을 삭제합니다.")
            }

            command == "article write" -> {
                val id = articlesLastId + 1
                val regDate = Util.getNowDateStr()
                val updateDate = Util.getNowDateStr()


                print("제목 : ")
                val title = readLineTrim()
                print("내용 : ")
                val body = readLineTrim()
                val article = Article(id, regDate, updateDate, title, body)

                println("$id 번 게시물이 작성되었습니다.")

                articles.add(article)

                articlesLastId = id
            }
            command == "article List" -> {
                println("번호 / 작성날짜 / 제목 ")

                for( article in articles ) {
                    println("${article.id} / ${article.regDate} / ${article.title}")
                }
            }
            else -> {
                println("'$command' 은(는) 존재하지 않는 명령어 입니다.")
            }
        }
    }

    println("== 게시판 관리 프로그램 끝 ==")

}
data class Article(
    val id: Int,
    val regDate: String, //등록일(바뀌지 않음)
    val updateDate: String, //수정일(바뀜)
    val title: String,
    val body: String
)

object Util {
    fun getNowDateStr() = SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(System.currentTimeMillis())


}