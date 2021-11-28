package ConstructorsOnlineMikeDane;

public class App {
    public static void main(String[] args) {

        Book book1 = new Book("Harry potter", "Jk", 12, "English");
        Book book2 = new Book("Mercy", "Zk", 112, "English");
        System.out.println(book1.pages);
        System.out.println("--------------------------");

        Shirt s = new Shirt("White", 'M');
        System.out.println(s.color + " " + s.size);
        System.out.println("--------------------------");

        s.putOn();
        s.takeOff();

        System.out.println("--------------------------");

        Pokemon p1 = new Pokemon("Pikaciu,", 25);
        System.out.println(p1.name + "Level = " + p1.level);
        p1.attack();

//        p1.name = "Pikaciu";
//        p1.level = 10;
//
//        Pokemon p2 = new Pokemon();
//        p2.name = "Evee";
//        p2.level = 20;
//        p2.attack();
//        System.out.println(p1.name+" "+p1.level);

    }
}

