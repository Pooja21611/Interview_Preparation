class Car extends Vehicle {

    private String brand;
    private int modelYear;

    public Car(String brand, int modelYear) {
        super();
        this.brand = brand;
        this.modelYear = modelYear;
        System.out.println("Car constructor called");
    }

    @Override
    public void run() {
        super.run();
        System.out.println(brand + " car is running at 100 km/h.");
    }

    public void showDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model Year: " + this.modelYear);
        System.out.println("Max Speed: " + this.maxSpeed); 
    }
}