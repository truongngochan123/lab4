package lab4;

public class Reuters extends NewsAgency {
    @Override
    protected News createNews(String type) {
        if (type.equalsIgnoreCase("politics"))
            return new PoliticsNews("Tin Quốc tế", "Thủ tướng Anh phát biểu tại hội nghị...");
        return null;
    }
}
