package lab4;

public class User implements Subscriber {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(News news) {
        System.out.println(name + " nhận tin mới: [" + news.getTitle() + "] - " + news.getContent());
    }
}
