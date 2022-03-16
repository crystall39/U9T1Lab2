public class Dog extends Animal // sub class
{
    private boolean hasBeenWalked;
    private boolean cleanCage;

    public Dog(String name, int age, boolean vaccinated, String breed)
    {
        super(name, age, vaccinated, breed);
        hasBeenWalked = false;
        cleanCage = false;
    }

    public void walk()
    {
        System.out.println("Come on, " + this.getName() + "! Let's get the leash!");
        hasBeenWalked = true;
    }

    public void cleanCage()
    {
        System.out.println("Thank you for cleaning my cage!");
        cleanCage = true;
    }

    public boolean hasBeenWalked()
    {
        return hasBeenWalked;
    }

    public boolean isCageClean()
    {
        return cleanCage;
    }
}