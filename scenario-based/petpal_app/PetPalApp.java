public class PetPalApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Dog", 3, "Golden Retriever", true);
        Cat cat = new Cat("Whiskers", "Cat", 2, "Orange", true);
        Bird bird = new Bird("Tweety", "Bird", 1, "Canary", true);
        
        PetInteraction dogInteraction = new PetInteraction(dog);
        PetInteraction catInteraction = new PetInteraction(cat);
        PetInteraction birdInteraction = new PetInteraction(bird);
        
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
        
        dogInteraction.feed();
        dogInteraction.play();
        dogInteraction.sleep();
        
        catInteraction.play();
        catInteraction.sleep();
        
        birdInteraction.feed();
        
        System.out.println("Dog energy increased by: " + (dog.getEnergy() - 50));
        System.out.println("Cat mood increased by: " + (cat.getMood() - 50));
        System.out.println("Bird hunger decreased by: " + (50 - bird.getHunger()));
    }
}
