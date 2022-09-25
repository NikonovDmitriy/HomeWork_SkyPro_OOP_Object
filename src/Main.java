public class Main {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.name = "Максим";
        human1.dateOfBirth = 35;
        human1.city = "Минск";
        human1.jobTitle = "бренд-менеджер";
        human1.people();

        Human human2 = new Human();
        human2.name = "Анна";
        human2.dateOfBirth = 29;
        human2.city = "Москва";
        human2.jobTitle = "методист образовательных программ";
        human2.people();

        Human human3 = new Human();
        human3.name = "Екатерина";
        human3.dateOfBirth = 28;
        human3.city = "Калининград";
        human3.jobTitle = "продакт-менеджер";
        human3.people();

        Human human4 = new Human();
        human4.name = "Артем";
        human4.dateOfBirth = 27;
        human4.city = "Москва";
        human4.jobTitle = "директор по развитию бизнеса";
        human4.people();
    }
}