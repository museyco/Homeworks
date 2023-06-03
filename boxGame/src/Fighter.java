public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name,int damage,int health,int weight,int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;

    }

    public int hit(Fighter foe) {
        if (foe.dodge()) {
            System.out.println("---------------------");
            System.out.println(foe.name + " *BLOKLADI!*");
            System.out.println("---------------------");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        System.out.println(this.name + " ----> " + foe.name + " Sporcusuna *" + this.damage + "* Hasar Vurdu!");
        System.out.println("=============================");
        return foe.health - this.damage;
    }

    public boolean dodge(){
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
        }
    }


