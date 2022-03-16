public class Animal // super class
{
    private String name;
    private int age;
    private boolean vaccinated;
    private String breed;

    public Animal(String name, int age, boolean vaccinated, String breed)
    {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.breed = breed;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public boolean isVaccinated()
    {
        return vaccinated;
    }

    public String getBreed()
    {
        return breed;
    }

    public void adopt()
    {
        System.out.println("I have been adopted");
    }

    public void feed()
    {
        System.out.println("I have been fed, thank you!");
    }

    public void drink()
    {
        System.out.println("I drank some water");
    }
}