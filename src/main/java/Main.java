public class Main {
    public static void main(String[] args) {

        Crawler crawler = new Crawler();
        String cafeUrl = "http://cafe.naver.com/temadica/710902";

        crawler.imageCrawler(cafeUrl);
    }
}
