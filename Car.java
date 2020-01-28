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
    int maxPeopleInCar = 6;

    //default constructor
    public Car() {}

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
        if (numberOfPeopleInCar < maxPeopleInCar) 
        {
            numberOfPeopleInCar++ ;
            System.out.println("Someone got in.");

        }
        else {
            System.out.println("Car is full " + numberOfPeopleInCar + " = " + maxPeopleInCar);
        }
    }
    public void getOut(){
        if (numberOfPeopleInCar != 0 ){
            numberOfPeopleInCar-- ;
        } else{
            System.out.println("No one is in the car " + numberOfPeopleInCar);
        }
        

    }
    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }
    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }

    public void turnTheCarOn(){
        if (!isTheCarOn) {
        isTheCarOn = true; 
        }
        else { 
            System.out.println("The car is already on. " + isTheCarOn );
        }
    }

    public static void main(String[] args) {
       
        
       Car tommyCar = new Car();
       tommyCar.getOut();
       tommyCar.getOut();

       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();

       tommyCar.turnTheCarOn();
       tommyCar.turnTheCarOn();

       

    }
}