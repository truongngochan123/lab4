package lab4;

public class CNN extends NewsAgency {
    @Override
    protected News createNews(String type) {
        switch (type.toLowerCase()) {
            case "politics":
                return new PoliticsNews("Tin Chính trị", "Ứng viên dẫn đầu bầu cử Mỹ...");
            case "sports":
                return new SportsNews("Tin Thể thao", "Kết quả World Cup mới nhất...");
            default:
                return null;
        }
    }
}
