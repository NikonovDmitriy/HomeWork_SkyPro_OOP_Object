public class Human {

    private String name;
    private Integer dateOfBirth;
    private String city;
    private String jobTitle;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        if (dateOfBirth < 0 && dateOfBirth == null) {
            this.dateOfBirth = 0;
        } else {
            this.dateOfBirth = dateOfBirth;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

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
