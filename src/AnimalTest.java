public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Lion()
        };

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.roam();
            System.out.println();
        }
    }
}