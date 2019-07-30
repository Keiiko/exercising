package net.yetamine.playground;

public class AbstraktniZoo {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[] {
                new Hafak(),
                new Cici()
        };
        for(Animal zvire : zoo){
            zvire.speak();
        }
    }
}
