public abstract class Pet {
    private String name;
    private String type;
    private int age;
    private int hunger;
    private int mood;
    private int energy;
    
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = 50;
        this.mood = 50;
        this.energy = 50;
    }
    
    public Pet(String name, String type, int age, int hunger, int mood, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.mood = mood;
        this.energy = energy;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getHunger() {
        return hunger;
    }
    
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    
    public int getMood() {
        return mood;
    }
    
    public void setMood(int mood) {
        this.mood = mood;
    }
    
    public int getEnergy() {
        return energy;
    }
    
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    
    public abstract void makeSound();
}
