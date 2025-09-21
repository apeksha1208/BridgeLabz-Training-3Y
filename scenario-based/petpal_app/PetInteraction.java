public class PetInteraction implements IInteractable {
    private Pet pet;
    
    public PetInteraction(Pet pet) {
        this.pet = pet;
    }
    
    public Pet getPet() {
        return pet;
    }
    
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
    @Override
    public void feed() {
        pet.setHunger(pet.getHunger() + 20);
        pet.setMood(pet.getMood() + 10);
        System.out.println(pet.getName() + " has been fed. Hunger: " + pet.getHunger());
    }
    
    @Override
    public void play() {
        pet.setEnergy(pet.getEnergy() - 15);
        pet.setMood(pet.getMood() + 15);
        System.out.println(pet.getName() + " played. Energy: " + pet.getEnergy() + ", Mood: " + pet.getMood());
    }
    
    @Override
    public void sleep() {
        pet.setEnergy(pet.getEnergy() + 30);
        pet.setHunger(pet.getHunger() - 10);
        System.out.println(pet.getName() + " slept. Energy: " + pet.getEnergy() + ", Hunger: " + pet.getHunger());
    }
}
