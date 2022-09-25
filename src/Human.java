public class Human {

    String name;
    int dateOfBirth;
    String city;
    String jobTitle;

    Human(String name, String city, int dateOfBirth, String jobTitle) {

        if(name==null){
            System.out.println("Информация не указана");
        }else {
        this.name = name;
        }

        if(city==null){
            System.out.println("Информация не указана");
        }else {
            this.city = city;
        }

        if (dateOfBirth<0){
            dateOfBirth=0;
        }else {
            this.dateOfBirth = dateOfBirth;
        }

        if(jobTitle==null){
            System.out.println("Информация не указана");
        }else {
            this.jobTitle = jobTitle;
        }
    }



    void people() {
        System.out.println("Привет!. Меня зовут "+name+". Я из города "+city+". Я родился в "+(2022-dateOfBirth)+" году. Я работаю на должности "+jobTitle+ ". Будем знакомы!");
    }




}
