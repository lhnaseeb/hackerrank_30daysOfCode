class Car {
     
    //properties or fields 
    //instance variables
    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079; //lbs

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy" ;

    double maxFuel = 16; //gallons
    double currentFuel = 8; //double because we need decimals
    double mpg = 26.4; //miles per gallon

    int numberOfPeopleInCar = 1;

    //constructor to give custom min and max speeds
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }


    public void printVariable(){
        System.out.println("This is the max speed: "+maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);

        
    }

    public void wreckCar(){
        condition = 'C';
    }

    public void upgradeMaxSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn(){
        numberOfPeopleInCar++ ;
    }
    public void getOut(){
        numberOfPeopleInCar-- ;
    }
    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }
    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }

    public static void main(String[] args) {
       
        
       Car birthdayCar = new Car(500, 5000.545, true );
       System.out.println("Birthday Car V1: ");
       birthdayCar.printVariable();

        birthdayCar.getIn();
        birthdayCar.getIn();
        birthdayCar.getIn();
        System.out.println("Miles Left: " + birthdayCar.howManyMilesTillOutOfGas());
        System.out.println("Max Miles: " + birthdayCar.maxMilesPerFillUp());
        System.out.println("Birthday Car V2: ");
       birthdayCar.printVariable();
       birthdayCar.getOut();
       System.out.println("Birthday Car V3: ");
       birthdayCar.printVariable();

       //System.out.println("Christmas Car: ");
       //Car christmasCar = new Car(550, 2000, false);
       //christmasCar.printVariable();

        /* Car familyCar = new Car();
        System.out.println("Familys's Car: ");
        familyCar.printVariable();
       
        //System.out.println("Alice's Car: ");

        //Car aliceCar = familyCar;
        familyCar.wreckCar();
        familyCar.upgradeMaxSpeed();
        //aliceCar.printVariable();
        familyCar.printVariable();*/

    }
}