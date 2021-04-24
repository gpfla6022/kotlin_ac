import java.text.SimpleDateFormat

fun main() {
    println("== 게시판 관리 프로그램 시작 ==")

    while (true) {
        print("명령어) ")
        val command = readLine()!!.trim()
        println("입력한 명령어: $command ")

        when {
            command == "system exit" -> {
                println("시스템을 종료합니다.")
                break
            }
            command == "article write" -> {
                val id = articleId + 1
                val regDate = Util.getNowDateStr()
                val updateDate = Util.getNowDateStr()

                print("제목: ")
                val title = readLinTrim()
                print("내용: ")
                val body = readLinTrim()

                val article = Article(id, regDate, updateDate, title, body)
                articles.add(article)

                articleId= id

                println("$id 번 게시물이 작성되었습니다.")
            }
            command == "article list" -> {
                println("번호 / 작성일 / 제목")
                for (article in articles)
                    println("${article.id} / ${article.regDate} / ${article.title}")
            }
            command.startsWith("article delete ") -> {
                val id = command.trim().split(" ")[2].toInt()

                val deleteArticle = getArticleToId(id)

                if (deleteArticle == null){
                    println("해당 게시물은 존재하지 않습니다.")
                    continue
                }
                articles.remove(deleteArticle)
                println("$id 번 게시물이 삭제 되었습니다.")


            }
            command.startsWith("article modify ") -> {
                val id = command.trim().split(" ")[2].toInt()

                val modifyArticle = getArticleToId(id)

                if (modifyArticle == null){
                    println("해당 게시물은 존재하지 않습니다.")
                    continue
                }

                print("새 제목: ")
                modifyArticle.title = readLinTrim()
                print("새 내용: ")
                modifyArticle.body = readLinTrim()
                modifyArticle.updateDate = Util.getNowDateStr()

                println("$id 번 게시물이 수정 되었습니다.")
            }

            command.startsWith("article detail ") -> {
                val id = command.trim().split(" ")[2].toInt()

                val detailArticle = getArticleToId(id)

                if (detailArticle == null){
                    println("해당 게시물은 존재하지 않습니다.")
                    continue
                }

                println("$id 번 게시물의 번호: ${detailArticle.id} ")
                println("$id 번 게시물의 제목: ${detailArticle.title}")
                println("$id 번 게시물의 내용: ${detailArticle.body} ")
                println("$id 번 게시물의 작성일: ${detailArticle.regDate} ")
                println("$id 번 게시물의 수정일: ${detailArticle.updateDate}")

            }

            else -> {
                println("$command 는 존재하지 않는 명령어 입니다.")
            }
        }
    }


    println("== 게시판 관리 프로그램 끝 ==")
}



data class Article(
    val id: Int,
    val regDate: String,
    var updateDate: String,
    var title: String,
    var body: String
)

var articleId = 0

fun readLinTrim() = readLine()!!.trim()

val articles = mutableListOf<Article>()


object Util{
    fun getNowDateStr(): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

        return dateFormat.format(System.currentTimeMillis())
    }
}

fun getArticleToId (id: Int) : Article? {

    for (article in articles) {
        if (article.id == id) {
            return article
        }
    }
    return null
}



