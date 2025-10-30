package lab4;

public abstract class News {
    protected String title;
    protected String content;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() { return title; }
    public String getContent() { return content; }
}
