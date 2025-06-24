class Vehicle {

    final int maxSpeed = 120;

    public Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    public final void displayType() {
        System.out.println("This is a generic vehicle.");
    }

    public void run() {
        System.out.println("Vehicle is running...");
    }
}

