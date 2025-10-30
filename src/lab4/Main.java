package lab4;

public class Main {
    public static void main(String[] args) {
        NewsAgency cnn = new CNN();
        NewsAgency bbc = new BBC();

        Subscriber u1 = new User("Hân");
        Subscriber u2 = new User("Khánh");

        cnn.attach(u1);
        cnn.attach(u2);
        bbc.attach(u1);

        cnn.publishNews("politics", "Bầu cử Mỹ", "Ứng viên dẫn đầu...");
        bbc.publishNews("tech", "AI bùng nổ", "GPT-5 ra mắt...");

        ExternalNewsSource adapter = new JSONNewsFeedAdapter(new JSONNewsFeed());
        for (News n : adapter.fetchExternalNews()) {
            System.out.println(" Tin ngoài: " + n.getTitle());
        }
    }
}
