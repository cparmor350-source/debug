public class Main {
    public static void main(String[] args) {
        Tamagotchi miTamagotchi = new Tamagotchi();
        
        System.out.println("Bienvenidoo al tamagotchi");
        System.out.println();
        System.out.println("Estado inicial:");
        miTamagotchi.showStats();
        System.out.println();
        
        System.out.println("Jugando");
        System.out.println("Estado: " + miTamagotchi.play());
        miTamagotchi.showStats();
        System.out.println();
        
        System.out.println("Jugando de nuevo");
        System.out.println("Estado: " + miTamagotchi.play());
        miTamagotchi.showStats();
        System.out.println();
        
        System.out.println("Comiendo.");
        System.out.println("Estado: " + miTamagotchi.eat());
        miTamagotchi.showStats();
        System.out.println();
        
        System.out.println("Jugando ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Estado: " + miTamagotchi.play());
        }
        miTamagotchi.showStats();
        System.out.println();
        
        System.out.println("Durmiendo");
        System.out.println("Estado: " + miTamagotchi.sleep());
        miTamagotchi.showStats();
        System.out.println();
        
        System.out.println("Comiendo bastante ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Estado: " + miTamagotchi.eat());
        }
        miTamagotchi.showStats();
    }
}