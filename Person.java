/*Write a Person class with an instance variable, , and a constructor that takes an integer, , as a parameter. The constructor must assign  to  after confirming the argument passed as  is not negative; if a negative argument is passed as , the constructor should set  to  and print Age is not valid, setting age to 0.. In addition, you must write the following instance methods:

yearPasses() should increase the  instance variable by .
amIOld() should perform the following conditional actions:
If age < 13, print You are young..
If age>=13 and age < 18 and , print You are a teenager..
Otherwise, print You are old.. */
public class Person {
    private int age;	
  
    public int getAge(){
        return this.age;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
          if (initialAge >=0){
              setAge(initialAge);
          }
          else{
              setAge(0);
              System.out.println("Age is not valid, setting age to 0.");
          }
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
          if(getAge() < 13){
            System.out.println("You are young.");
          }
          else if(getAge() >=13 && getAge() < 18){
            System.out.println("You are a teenager.");
          }
          else{
            System.out.println("You are old.");
          }
	}

	public void yearPasses() {
  		// Increment this person's age.
          setAge(getAge() + 1);
	}
}