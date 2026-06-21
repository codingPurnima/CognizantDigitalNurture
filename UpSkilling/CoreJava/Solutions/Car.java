public class Car {
    private String make, model;
    int year;
    void printDetails(){
        System.out.println("Make: "+ make);
        System.out.println("Model: "+ model);
        System.out.println("Year: "+ year);
    }
    public static void main(String[] args) {
        Car car= new Car();
        car.make= "Audi";
        car.model= "V7-321";
        car.year= 2021;
        car.printDetails();
    }
}
