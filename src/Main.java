public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Максим", "Минск", 35, "бренд-менеджер");
        human1.people();

        Human human2 = new Human("Анна", "Москва", 29, "методист образовательных программ");
        human2.people();

        Human human3 = new Human("Екатерина", "Калининград", 28, "продакт-менеджер");
        human3.people();

        Human human4 = new Human("Артем", "Москва", 27, "директор по развитию бизнеса");
        human4.people();
    }
}