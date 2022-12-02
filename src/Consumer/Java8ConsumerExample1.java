import java.util.function.Consumer;
public class Java8ConsumerExample1{
    public static void main(String[] args) {
        Consumer<String> firstC = x -> System.out.println(x.toLowerCase());
        Consumer<String> second = y -> System.out.println(y.toUpperCase());
        Consumer<String> result = firstC.andThen(second);
        result.accept("ravi");

    }
}