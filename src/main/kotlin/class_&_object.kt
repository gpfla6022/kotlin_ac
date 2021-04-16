fun main() {
    val article1 = Article();
    article1.id =1;
    article1.regDate = "2020-12-12 12:12:12";
    article1.title = "제목1";
    println("id : ${article1.id}, regdate : ${article1.regDate}, title : ${article1.title}")

    val article2 = Article();
    article2.id =2;
    article2.regDate = "2020-12-13 12:12:12";
    article2.title = "제목2";
    println("id : ${article2.id}, regdate : ${article2.regDate}, title : ${article2.title}")

    Article();
}
    class Article {
        var id: Int = 0;
        var regDate: String = "";
        var title: String =" ";

    }

