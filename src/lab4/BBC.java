package lab4;

public class BBC extends NewsAgency {
    @Override
    protected News createNews(String type) {
        if (type.equalsIgnoreCase("tech"))
            return new TechNews("Tin Công nghệ", "AI thế hệ mới ra mắt...");
        return null;
    }
}
