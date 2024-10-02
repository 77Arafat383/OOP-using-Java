class vehicle{
    int passanger;
    int fuel_cap;  //fual capacity.
    int mpg; // fula consumption in miles per gallon; 
    void range()
    {
        int range=fuel_cap*mpg;
        System.out.println(passanger+" People can travel with this vehicle in range "+ range + " KM");
    }
    double mile(int fuel)
    {
        return (double)fuel/mpg;

    }
}
class vehicledemo {
    public static void main(String[] args) {
        vehicle car= new vehicle();
        vehicle micro_bus;
        micro_bus=new vehicle();
        car.passanger=5;
        car.fuel_cap=3;
        car.mpg=7;
        System.out.println("This car can carry "+car.passanger+" people in range "+(car.fuel_cap*car.mpg)+" KM");

        micro_bus.passanger=20;
        micro_bus.fuel_cap=10;
        micro_bus.mpg=14;
        System.out.println("This micro_bus can carry "+micro_bus.passanger+" people in range "+(micro_bus.fuel_cap*micro_bus.mpg)+" KM");
        micro_bus.range();     
       double n_mile= car.mile(50);  
       System.out.println(n_mile + " can travel with this 50 L fuel"); 
    }

}