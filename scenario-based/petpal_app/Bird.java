public class Bird extends Pet {
    private String species;
    private boolean canFly;
    
    public Bird(String name, String type, int age) {
        super(name, type, age);
        this.species = "Unknown";
        this.canFly = true;
    }
    
    public Bird(String name, String type, int age, String species, boolean canFly) {
        super(name, type, age);
        this.species = species;
        this.canFly = canFly;
    }
    
    public String getSpecies() {
        return species;
    }
    
    public void setSpecies(String species) {
        this.species = species;
    }
    
    public boolean isCanFly() {
        return canFly;
    }
    
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet! Tweet!");
    }
}
