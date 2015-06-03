import java.util.Arrays;
import static java.util.stream.Collectors.toList;

public class ParsingBug {

    public static final class MyClass {
        private final int id;

        public MyClass(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.asList(new MyClass(42)).stream().map(MyClass.class::cast).collect(toList()));
    }
}
