package lab4;

import java.util.ArrayList;
import java.util.List;

public class JSONNewsFeedAdapter implements ExternalNewsSource {
    private JSONNewsFeed feed;

    public JSONNewsFeedAdapter(JSONNewsFeed feed) {
        this.feed = feed;
    }

    @Override
    public List<News> fetchExternalNews() {
        System.out.println(" Chuyển đổi JSON feed sang News object...");
        List<News> list = new ArrayList<>();
        list.add(new TechNews("Tin JSON 1", "Nội dung A"));
        list.add(new TechNews("Tin JSON 2", "Nội dung B"));
        return list;
    }
}
