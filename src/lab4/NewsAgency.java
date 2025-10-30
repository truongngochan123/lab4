package lab4;

import java.util.ArrayList;
import java.util.List;

public abstract class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void attach(Subscriber s) {
        subscribers.add(s);
    }

    public void detach(Subscriber s) {
        subscribers.remove(s);
    }

    protected void notifySubscribers(News news) {
        for (Subscriber s : subscribers) {
            s.update(news);
        }
    }

    public void publishNews(String type, String title, String content) {
        News news = createNews(type);
        if (news != null) {
            System.out.println("📰 " + getClass().getSimpleName() + " đăng tin: " + title);
            notifySubscribers(news);
        } else {
            System.out.println("❌ Loại tin không hợp lệ: " + type);
        }
    }

    protected abstract News createNews(String type);
}
