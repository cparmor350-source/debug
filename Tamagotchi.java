public class Tamagotchi {

    private int hunger = 4;
    private int energy = 4;
    private int mood = 4;


    public String play() {
        hunger += 1;
        mood += 1;
        energy -= 1;
        return getStatus();
    }

    
    public String eat() {
        hunger -= 2;
        energy -= 1;
        return getStatus();
    }

    
    public String sleep() {
        energy += 2;
        return getStatus(true); 
    }


    private String getStatus() {
        return getStatus(false);
    }

    private String getStatus(boolean sleeping) {
        if (sleeping || energy <= 0) {
            return "(-_-) zZZ";      
        } else if (mood > 8) {
            return ":-)";             
        } else if (mood < 2) {
            return "ఠ_ఠ";           
        } else if (energy < 3) {
            return "(-_-)";           
        } else {
            return ":-|";            
        }
    }


    public static void main(String[] args) {
        Tamagotchi t = new Tamagotchi();
        System.out.println(t.play());
        System.out.println(t.eat());
        System.out.println(t.sleep());
        System.out.println(t.play());
    }
}
