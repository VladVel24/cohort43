package homework_projectCar;

import java.util.*;
import java.util.stream.Collectors;

public class CarDealer {

    private Map<String,Car> garage = new HashMap<>();

   public void addCar(String vin, Car car){
       garage.put(vin, car);

   }
    public void removeCar(String vin){
       garage.remove(vin);
    }

    public void updateCarPrice(String vin, double newPrice){
       Car car = garage.get(vin);
       if(car != null){
           car.setPrice(newPrice);
       }
    }
    public void updateCarRating(String vin, double newRating){
        Car car = garage.get(vin);
        if(car != null){
            car.setRating(newRating);
        }
    }

    public List<Car> searchByBrand(String brand){
       List<Car> result = new ArrayList<>();
       for (Car car : garage.values()){
           if (car.getBrand().equalsIgnoreCase(brand)){
               result.add(car);
           }
       }
       return result;
    }
    public List<Car> searchByModel(String model){
       return garage.values().stream()
               .filter(car -> car.getModel().equalsIgnoreCase(model) )
               .collect(Collectors.toList());


    }
    public List<Car> searchByYear(Integer year){
       return garage.values().stream()
               .filter(car -> car.getYear() == year )
               .collect(Collectors.toList());
    }
   public List<Car> getAllCars(){
       return new ArrayList<>(garage.values());
   }
   public List<Car> getCarsSortedByPrice(){
       return garage.values().stream()
               .sorted(Comparator.comparingDouble(Car::getPrice))
               .collect(Collectors.toList());
   }
   public List<Car> getCarsSortedByRating(){
       return garage.values().stream()
               .sorted(Comparator.comparingDouble(Car::getRating))
               .collect(Collectors.toList());
   }
   public List<Car> getCarsSortedByYear(){
       return garage.values().stream()
               .sorted(Comparator.comparingInt(Car::getYear))
               .collect(Collectors.toList());
   }
   public List<Car> getCarsSortedByBrand(String brand){
       return garage.values().stream()
               .filter(car -> car.getBrand().equalsIgnoreCase(brand) )
               .collect(Collectors.toList());
   }



}
