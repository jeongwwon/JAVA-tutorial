package FunctionUtil;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.Comparator;


public class FunctionInterface {
    public static void main(String[] args) {
        System.out.println("-------------1.Function------------");
        Function<String, Integer> f = str -> Integer.parseInt(str);
        Integer result = f.apply("10");
        System.out.println(result);

        //Consumer :foreach 메서드는  void forEach(Consumer<? super T> action) 로 정의되어 있으며
        // Consumer 함수형 인터페이스를 인자로 가지고 있다.
        System.out.println("-------------2.Consumer----------------");
        String[] strArr = {"Hello", "World", "Java"};
        Arrays.stream(strArr).sorted().forEach(str -> System.out.println(str));

        System.out.println("-------------3.Supplier------------");
        Supplier<String> s = () -> "msg from supplier";
        String result1 = s.get();
        System.out.println(result1);

        System.out.println("-------------4.Operator---------------");
        UnaryOperator<String> u = str -> str + " operator";
        String result2 = u.apply("msg from unary operator");
        System.out.println(result2);

        BinaryOperator<String> b = (str1, str2) -> str1 + "123" + str2;
        String result3 = b.apply("msg from", "binary operator");
        System.out.println(result3);

        System.out.println("-------------5.Predicate----------------");
        Predicate<String> p = str -> str.contains("msg");
        boolean result4 = p.test("hello"); // false
        System.out.println(result4);

        System.out.println("-------------6.Comparator---------------");
        Comparator<String> c = (str1, str2) -> str1.compareTo(str2);
        int result5 = c.compare("xxx", "yyy");  //-1
        System.out.println(result5);

    }
}
