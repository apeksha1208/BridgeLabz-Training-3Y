public class Cat extends Pet {
    private String furColor;
    private boolean isIndoor;
    
    public Cat(String name, String type, int age) {
        super(name, type, age);
        this.furColor = "Mixed";
        this.isIndoor = true;
    }
    
    public Cat(String name, String type, int age, String furColor, boolean isIndoor) {
        super(name, type, age);
        this.furColor = furColor;
        this.isIndoor = isIndoor;
    }
    
    public String getFurColor() {
        return furColor;
    }
    
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    
    public boolean isIndoor() {
        return isIndoor;
    }
    
    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
}
