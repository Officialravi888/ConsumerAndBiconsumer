package Java_8_Consumer_Example;

import java.util.function.Consumer;
public class java8ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumerString=s->System.out.println(s);
        consumerString.accept("ravi");
    }
}