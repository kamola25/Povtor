import com.company.*;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(10, Color.BLACK,"Lucky");
        Snake snake = new Snake(5,Color.YELLOW,"Kobra",35);
        Lizard lizard = new Lizard(1,Color.GREEN,"Colomon",5);
        Cat cat = new Cat(9,Color.WHITE,"Chico");
        Lizard lizard1 = new Lizard(2,Color.STRIPED,"Zhun li",7);
        Cat cat1 = new Cat(2,Color.GREY,"Jerry");

        System.out.println(snake.toString());
        System.out.println();

        System.out.println(lizard.toString("Snake"));
        System.out.println();
        System.out.println(dog.toString());
        System.out.println();
        System.out.println(cat1.toString(3));

        //ООП - это правила, система котрая включает в себя принципы: полимарфизм, инапсуляция, наследование, абстракция.
    }

}