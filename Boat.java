// Crée une classe Boat qui étend la classe Vehicle
public class Boat extends Vehicle {

// Constructeur
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

// Ajoute dans Boat une implémentation du corps de la méthode doStuff()
    @Override
    public String doStuff() {
// pour Boat, tu devras retourner : "Je suis {brand} et je fais glou glou !"
        return "Je suis " + this.getBrand() + " et je fais glou glou !";
    }
}