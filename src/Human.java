public class Human {

    String name;
    int dateOfBirth;
    String city;
    String jobTitle;

    Human(String name, String city, int dateOfBirth, String jobTitle) {
        this.name = name;
        this.city = city;
        this.dateOfBirth = dateOfBirth;
        this.jobTitle = jobTitle;
    }



    void people() {
        System.out.println("Привет!. Меня зовут "+name+". Я из города "+city+". Я родился в "+(2022-dateOfBirth)+" году. Я работаю на должности "+jobTitle+ ". Будем знакомы!");
    }




}
