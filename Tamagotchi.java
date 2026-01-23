class Tamagotchi {
    private int hunger;
    private int energy;
    private int mood;
    
    public Tamagotchi() {
        this.hunger = 4;
        this.energy = 4;
        this.mood = 4;
    }
    
    public String play() {
        hunger += 1;
        mood += 1;
        energy -= 1;
        return getState();
    }
    
    public String eat() {
        hunger -= 2;
        energy -= 1;
        return getState();
    }
    
    public String sleep() {
        energy += 2;
        return "(-_-) zZZ";
    }
    
    private String getState() {
        if (energy <= 0) {
            return "(-_-) zZZ";
        } else if (mood > 8) {
            return ":-)";
        } else if (energy < 3) {
            return "(-_-)";
        } else if (mood < 2) {
            return "ఠ_ఠ";
        } else {
            return ":-|";
        }
    }
    
    public void showStats() {
        System.out.println("Hambre: " + hunger + ", Energía: " + energy + ", Humor: " + mood);
    }
}