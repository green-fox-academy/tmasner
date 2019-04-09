public class UrlFixer {
    public static void main(String... args){
        String Url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        String newUrl = Url.replaceAll("bots", "odds");

        String NewUrl = newUrl.replaceFirst("https//","https://");

        System.out.println(NewUrl);
    }
}
