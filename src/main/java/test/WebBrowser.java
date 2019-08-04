package test;

import java.util.*;

public class WebBrowser {

    private PriorityQueue<WebPage> history;
    private Map<String,WebPage> webPageMap;

    class WebPage {
        private String url;
        private int visitCount;

        public WebPage(String url){
            this.url = url;
            this.visitCount = 1;
        }

        public void visited() {
            this.visitCount++;
        }
    }

    public WebBrowser() {
        this.history = new PriorityQueue<>(new Comparator<WebPage>() {
            @Override
            public int compare(WebPage o1, WebPage o2) {
                return o2.visitCount-o1.visitCount;
            }
        });
        this.webPageMap = new HashMap<>();
    }


    public void navigate(String url) {

        if(!this.webPageMap.containsKey(url)){
            WebPage page = new WebPage(url);
            this.webPageMap.put(url,page);
            this.history.offer(page);
        }else {
            WebPage page = this.webPageMap.get(url);
            this.history.remove(page);
            page.visited();
            this.history.offer(page);
        }

    }

    public List<String> mostVisisted() {

        List<String> list = new ArrayList<>();
        /*Iterator<WebPage> itr = this.history.iterator();

        int count  = 10;
        while(itr.hasNext() && count>0) {
            list.add(itr.next());
            count--;
        }
        return list;
*/
        int count = 3;
        while (count>0 && !this.history.isEmpty()) {

            list.add(this.history.poll().url);
            count--;
        }
        return list;
    }


    public static void main(String[] args) {

        WebBrowser webBrowser = new WebBrowser();
//        webBrowser.navigate("https://www.google.com");
//        webBrowser.navigate("https://www.twitter.com");
//        webBrowser.navigate("https://www.yahoo.com");
//        webBrowser.navigate("https://www.bloomberg.com");
//        webBrowser.navigate("https://www.gmail.com");
//        webBrowser.navigate("https://www.google.com");
//        webBrowser.navigate("https://www.yahoo.com");
//        webBrowser.navigate("https://www.yahoo.com");

        webBrowser.navigate("Bartell");
        webBrowser.navigate("Pizza");
        webBrowser.navigate("Bartell");
        webBrowser.navigate("Safeway");
        webBrowser.navigate("Pizza");
        webBrowser.navigate("Acme");
        webBrowser.navigate("Bartell");
        webBrowser.navigate("Albertsons");
        webBrowser.navigate("Albertsons");
        webBrowser.navigate("Bartell");

        List<String> list = webBrowser.mostVisisted();
        for(String page : list ) {
            System.out.println(page);
        }
        System.out.println("");


    }
}