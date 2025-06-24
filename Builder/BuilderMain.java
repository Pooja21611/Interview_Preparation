public class BuilderMain{
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder()
                .setOs("Android")
                .setRam(8)
                .setProcessor("Snapdragon 8 Gen 1")
                .setScreenSize(6.7)
                .setBattery(5000)
                .build();

        System.out.println(phone);
    }
}
