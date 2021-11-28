package ConstructorsOnlineMikeDane;

public class Pokemon {

    String name;
    int level;

    Pokemon (){
        level = 1;
    }

    Pokemon (String Name, int Level){
        this.name = Name;
        this.level = Level;
    }

    void attack(){
        System.out.print(name+ " Attack!");
    }

}
