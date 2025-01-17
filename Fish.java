// Fish child class that inherits from the pet parent class
class Fish implements Pet {
    private Attribute hunger;
    private Attribute happiness;
    private Color color;

    public Fish(Attribute hunger, Attribute happiness, Color color) {
        this.hunger = hunger;
        this.happiness = happiness;
        this.color = color;
    }

    @Override
    public void play() {
        System.out.println("The fish is swimming playfully");
        hunger.incrementValue();
        happiness.incrementValue();
        System.out.println("Happiness level increased");
        System.out.println("Hunger level increased");
    }

    @Override
    public void feed() {
        hunger.decrementValue();
        System.out.println("The fish is being fed");
        System.out.println("Hunger level decreased");
    }

    @Override
    public void makeSound() {
        System.out.println("The fish makes no sound");
    }

    @Override
    public Attribute getAttribute1() {
        return hunger;
    }

    @Override
    public Attribute getAttribute2() {
        return happiness;
    }
}