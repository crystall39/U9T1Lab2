public class Cat extends Animal // sub class
{
    private boolean played;
    private boolean napping;

    public Cat(String name, int age, boolean vaccinated, String breed)
    {
        super(name, age, vaccinated, breed);
        played = false;
        napping = false;
    }

    public void play()
    {
        System.out.println("I have been played with.");
        played = true;
    }

    public boolean hasPlayedWith()
    {
        return played;
    }

    public boolean isNapping()
    {
        return napping;
    }

    public void knockOverVase()
    {
        System.out.println("I knocked over a vase. I'm sorry");
    }

    public void goNap()
    {
        System.out.println("I am napping");
        napping = true;
    }

    public void wakeUp()
    {
        System.out.println("I am awake");
        napping = false;
    }
}