// Crée une classe Hangar qui possédera une méthode main()
public class Hangar {

    public static void main(String[] args) {

// Ajoute des références vers des instances des classes Car et Boat dans la méthode main() de Hangar
        Car Clio = new Car("Clio", 50);
        Boat Titanic = new Boat("Titanic", 500);
       

// Pour chacune des références, affiche dans le terminal le résultat de l'appel de la méthode doStuff()
        System.out.println(Clio.doStuff());
        System.out.println(Titanic.doStuff());
    }
}








// Compile et teste Hangar : quand tout fonctionne, crée un dépôt git et envoie le tout sur GitHub
// Partage le lien du dépôt GitHub en solution