
class Animals {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dogs extends Animals {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void wagTail() {          // Extra method (shudu Dog-a ace)
        System.out.println("Dog wags tail");
    }
}

public class DMDwithExtraMethods {
    public static void main(String[] args) {
        Animals myAnimal = new Dogs();

        myAnimal.sound();   // output: Dog barks

        // myAnimal.wagTail(); // compiler error: Animal-a wagTail() nei

        // Extra method call korte chaile down custin korte hobe

        Dogs myDog = (Dogs) myAnimal;
        myDog.wagTail();   //  Dog wags tail

    }
}