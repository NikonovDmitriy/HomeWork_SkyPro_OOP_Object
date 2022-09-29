public class Flower {

    private String name;
    private String flowerColor;
    private String country;
    private double cost;

    Integer lifeSpan;

    public Flower(String name, String country, double cost, Integer lifeSpan) {
        this.name = name;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }

    public Flower(String name, double cost, Integer lifeSpan) {
        this.name = name;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }

    public Flower(String name, String country, double cost) {
        this.name = name;
        this.country = country;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {

        this.flowerColor = flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank() ? "белый" : flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null || country.isEmpty() || country.isBlank() ? "Россия" : country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost == 0 || cost < 0 ? 1 : cost;
    }

    public Integer getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(Integer lifeSpan) {
        this.lifeSpan = lifeSpan == null || lifeSpan < 0 ? 3 : lifeSpan;
    }

    void infoFlower() {
        System.out.println(name + ", страна происхождения - " + country + ", стоимость штуки - " + cost + " рублей, срок стояния - " + lifeSpan + " день.");
    }


    public static void main(String[] args) {
        Flower flower1 = new Flower("Роза обыкновенная", "Голландия", 35.59);
        flower1.infoFlower();
        Flower flower2 = new Flower("Хризантема", 15.0, 5);
        flower2.infoFlower();
        Flower flower3 = new Flower("Пион ", "Англия", 69.9, 1);
        flower3.infoFlower();
        Flower flower4 = new Flower("Гипсофила", "Турция", 19.5, 10);
        flower4.infoFlower();

    }
}


