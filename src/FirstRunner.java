public class FirstRunner
{
    public static void main(String[] args)
    {
        Animal myAnimal = new Animal("Alex", 5, true, "Labrador Retriever");
        System.out.println(myAnimal.getName());
        System.out.println(myAnimal.getAge());
        System.out.println(myAnimal.isVaccinated());
        System.out.println(myAnimal.getBreed());
        myAnimal.adopt();
        myAnimal.feed();
        myAnimal.drink();

        System.out.println("-----------------------");

        Dog myDog = new Dog("Golden", 3, true, "Golden Retriever");
        System.out.println(myDog.getName());
        System.out.println(myDog.getAge());
        System.out.println(myDog.isVaccinated());
        System.out.println(myDog.getBreed());
        myDog.adopt();
        myDog.feed();
        myDog.drink();
        // own methods
        System.out.println(myDog.hasBeenWalked());
        myDog.walk();
        System.out.println(myDog.hasBeenWalked());
        System.out.println(myDog.isCageClean());
        myDog.cleanCage();
        System.out.println(myDog.isCageClean());

        System.out.println("-----------------------");

        Cat myCat = new Cat("Justin", 2, false, "Calico");
        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());
        System.out.println(myCat.isVaccinated());
        System.out.println(myCat.getBreed());
        myCat.adopt();
        myCat.feed();
        myCat.drink();
        // own methods
        System.out.println(myCat.hasPlayedWith());
        myCat.play();
        System.out.println(myCat.hasPlayedWith());
        myCat.knockOverVase();
        myCat.goNap();
        System.out.println(myCat.isNapping());
        myCat.wakeUp();
        System.out.println(myCat.isNapping());
    }
}