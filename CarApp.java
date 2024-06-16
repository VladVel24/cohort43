package homework_projectCar;

public class CarApp {
    public static void main(String[] args) {

        CarDealer garage = new CarDealer();

        garage.addCar("HTOUJYG345D",new Car("Toyota","Yaris",2019,13000.00,5.0));
        garage.addCar("HHJGF678B5D",new Car("Hohda","Civic",2022,18000.00,4.3));
        garage.addCar("HTGHGH78945D",new Car("Toyota","Prius",2019,15500.00,4.0));
        garage.addCar("ASDFJYG345",new Car("Honda","Accord",2024,35000.00,3.4));
        garage.addCar("JKNBV77YG5D",new Car("Toyota","Corolla",2021,25000.00,4.5));
        garage.addCar("HTOUJY77LKJ",new Car("Mazda","CX-60",2015,11300.00,3.0));
        garage.addCar("GHFTYHG66",new Car("Mazda", "CX-90",2012,600.00,2.0));


        for (Car allCar : garage.getAllCars()) {
            System.out.println(allCar);

        }

        garage.updateCarPrice("HTOUJY77LKJ",9999.60);
        garage.removeCar("HHJGF678B5D");

       System.out.println("-===========================================");
       System.out.println( garage.searchByModel("Corolla"));

        System.out.println("-===========================================");



        for(Car allCars: garage.getCarsSortedByRating()){
            System.out.println(allCars);
        }
        System.out.println("-===========================================");

        for(Car allCars : garage.getCarsSortedByYear()){
            System.out.println(allCars);
        }
        System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");

        System.out.println(garage.searchByBrand("Toyota"));



    }
}


