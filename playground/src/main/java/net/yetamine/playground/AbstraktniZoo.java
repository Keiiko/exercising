package net.yetamine.playground;

public class AbstraktniZoo {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[] {
                new Hafak(),
                new Cici()
        };
        for(final Animal zvire : zoo){
            if(zvire instanceof Pojmenovano) {
                System.out.println(((Pojmenovano) zvire).jmeno());
            }
            zvire.speak();
        }
    }
}
