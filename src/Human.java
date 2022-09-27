public class Human {

    private final String name;
    private final int dateOfBirth;
    private final String city;
    private final String jobTitle;

    public Human(String name, String city, int dateOfBirth, String jobTitle) {


        this.name = name == null ? "Информация не указана" : name;

        this.city = city == null ? "Информация не указана" : city;

        if (dateOfBirth < 0) {
            this.dateOfBirth = 0;
        } else {
            this.dateOfBirth = dateOfBirth;
        }

        this.jobTitle = jobTitle == null ? "Информация не указана" : jobTitle;
    }


    void people() {
        System.out.println("Привет!. Меня зовут " + name + ". Я из города " + city + ". Я родился в " + (2022 - dateOfBirth) + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }


}
