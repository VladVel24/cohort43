package homework_projectCar;

public class Car {
    private String brand;
    private String  model;
    private Integer year;
    private Double price;
    private Double rating;

    public Car(String brand, String model, Integer year, Double price, Double rating) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.rating = rating;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public Double getPrice() {
        return price;
    }

    public Double getRating() {
        return rating;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
