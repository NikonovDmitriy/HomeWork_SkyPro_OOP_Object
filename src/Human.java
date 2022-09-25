public class Human {

    String name;
    int dateOfBirth;
    String city;

    Human(String name, String city, int dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
    }

    void people() {
        System.out.println("Привет!. Меня зовут "+name+". Я из города "+city+". Я родился в "+(2022-dateOfBirth)+" году. Будем знакомы!");
    }




}
