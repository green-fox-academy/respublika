public class UrlFixerV2 {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url=url.substring(0,5)+":"+url.substring(5, 38)+"odds";
        System.out.println(url);
    }
}
