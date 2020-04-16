package factory.simple;

/**
 * @author: Guowei
 * 2020-04-15
 */
public class Client {
    public static void main(String[] args) {
        Human human = SimpleFactory.makeHumanByClass(Man.class);
        Human human1 = SimpleFactory.makeHumanBySex("woman");
        human.say();
        human1.say();
    }
}
