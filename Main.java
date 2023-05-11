public class Main {
    public static void main(String[] args) {
        //static polymorphism(1)
        Hero he = new Hero();
        he.move();
        he.move("forward");

        Enemy en = new Enemy();
        en.move();
        en.move(10);
        System.out.println();

        //dynamic polymorphism(2)
        Character adam = new Character();
        adam.move();
        System.out.println();

        adam = new Hero();
        adam.move();
        adam = new Enemy();
        adam.move();
        adam = new Fighter();
        adam.move();
        adam = new Witch();
        adam.move();
        System.out.println();

        //dynamic polymorphism(3)
        Character morax = new Witch();
        morax.move();
        morax = new Fighter();
        morax.move();

    }
}
