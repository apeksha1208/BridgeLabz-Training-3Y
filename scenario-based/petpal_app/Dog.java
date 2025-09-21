public class Dog extends Pet {
    private String breed;
    private boolean isTrained;
    
    public Dog(String name, String type, int age) {
        super(name, type, age);
        this.breed = "Mixed";
        this.isTrained = false;
    }
    
    public Dog(String name, String type, int age, String breed, boolean isTrained) {
        super(name, type, age);
        this.breed = breed;
        this.isTrained = isTrained;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public boolean isTrained() {
        return isTrained;
    }
    
    public void setTrained(boolean trained) {
        isTrained = trained;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
}
