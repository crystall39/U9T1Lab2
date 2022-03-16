public class Computer // super class
{
    private int screenSize;
    private int memory;

    public Computer(int screenSize, int memory)
    {
        this.screenSize = screenSize;
        this.memory = memory;
    }

    public void installOperatingSystem()
    {
        System.out.println("installing OS...");
    }
}
