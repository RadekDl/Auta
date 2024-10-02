public class Main {
    public static void main(String[] args) {
        LKV lkv1 = new LKV();
        lkv1.setLength(13.6);
        System.out.println("Délka vozu je " + lkv1.getLength() +"m");

        LKV weight1 = new LKV();
        weight1.setWeight(12.5);
        System.out.println("Váha vozu je "+ weight1.getWeight() +"t");

        LKV registrationNumber1 = new LKV();
        registrationNumber1.setRegistrationNumber("ABC4321");
        System.out.println("SPZ vozu je "+ registrationNumber1.getRegistrationNumber());


        Car car1 = new Car();
        car1.setType(car1.getType());
        car1.setName(car1.getName());
        System.out.println("typ vozu je "+ car1.getType());
        System.out.println("Jméno vozu je "+ car1.getName());




    }
}