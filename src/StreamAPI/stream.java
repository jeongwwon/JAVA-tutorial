package StreamAPI;
import java.util.stream.Stream;
import java.util.Arrays;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.io.IOException;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;
public class stream {
    public static void main(String[] args) {

        //Array 스트림
        Stream<String> arrayStream = Stream.of("a", "b", "c");
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> arrayFullStream = Arrays.stream(arr);
        Stream<String> arrayPartStream = Arrays.stream(arr, 1, 3);

       //컬렉션 스트림
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> collectionStream = collection.stream();

        //chars()를 통한 문자열 -> IntStream(ASCII) 생성
        String str = "abc";
        IntStream charsStream = str.chars();
        charsStream.forEach(System.out::println);

      //파일 스트림
        Path path = Paths.get("test.txt");
        try{
            Stream<String> streamOfStrings = Files.lines(path);

            Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"));
        }catch (IOException e){
            System.out.println("오류");
        }

      //병렬 스트림
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = Arrays.stream(numbers)
                .parallel() // 병렬 처리 스트림으로 변환
                .sum();
        System.out.println("Sum: " + sum);


        //-----------------중간 연산 메서드-------------


        //filter(),distinct()
        List<Integer> intList = Arrays.asList(1,2,3);
        List<String> strList = Arrays.asList("Hwang", "Hong", "Kang");

        intList.stream().filter(x -> x<=2).forEach(System.out::println);  // filter는 조건에 맞는 요소로 구성된 스트림 반환
        Arrays.asList(1,2,3,2,5).stream().distinct().forEach(System.out::println); // distinct는 중복이 제거된 스트림 반환

        //map()
        intList.stream().map(x -> x*x).forEach(System.out::println); // 각 요소 마다 연산 수행

        //flatMap()
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> flattenedList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattenedList);
        //limit()
        intList.stream().limit(2).forEach(System.out::println); // 시작 요소 부터 전달된 인자까지의 새로운 스트림 반환

        //skip()
        intList.stream().skip(2).forEach(System.out::println); // 시작 요소부터 전달된 인자까지 제외한 새로운 스트림 반환

        //sorted()
        Arrays.asList(1,4,3,2).stream().sorted().forEach(System.out::println); // 기본 오름차순 정렬

        //peek()
        int sum1 = intList.stream().filter(x -> x<=2)
                .peek(System.out::println)
                .mapToInt(Integer::intValue).sum();
        System.out.println("sum: "+sum1);  //연산중 중간 과정 확인

        //최종 연산
        //forEach
        intList.stream().forEach(System.out::println); // 1,2,3
        intList.stream().forEach(x -> System.out.printf("%d : %d\n",x,x*x)); // 1,4,9

        //reduce()
        int sum2 = intList.stream().reduce((a,b) -> a+b).get();
        System.out.println("sum: "+sum2);  // 6

        //findFirst(),findAny()
        strList.stream().filter(s -> s.startsWith("H")).findFirst().ifPresent(System.out::println);  //Hwang
        strList.parallelStream().filter(s -> s.startsWith("H")).findAny().ifPresent(System.out::println);


        //anyMatch(), allMatch(), noneMatch()
        boolean result1 = strList.stream().anyMatch(s -> s.startsWith("H"));  //true
        boolean result2 = strList.stream().allMatch(s -> s.startsWith("H"));  //false
        boolean result3 = strList.stream().noneMatch(s -> s.startsWith("T")); //true
        System.out.printf("%b, %b, %b",result1,result2, result3);

        //count(),min(),max()
        intList.stream().count();	// 3
        intList.stream().filter(n -> n !=2 ).count(); 	// 2
        intList.stream().min(Integer::compare).ifPresent(System.out::println);; 		// 1
        intList.stream().max(Integer::compareUnsigned).ifPresent(System.out::println);; // 3

        strList.stream().count();	// 3
        strList.stream().min(String::compareToIgnoreCase).ifPresent(System.out::println);	// Hong
        strList.stream().max(String::compareTo).ifPresent(System.out::println);	// Kang

        //sum(),average()
        intList.stream().mapToInt(Integer::intValue).sum();	// 6
        intList.stream().reduce((a,b) -> a+b).ifPresent(System.out::println); // 6

        intList.stream().mapToInt(Integer::intValue).average();	// 2
        intList.stream().reduce((a,b) -> a+b).map(n -> n/intList.size()).ifPresent(System.out::println); // 2

        //collect()
        strList.stream().map(String::toUpperCase).collect(Collectors.joining("/"));	 	// Hwang/Hong/Kang
        strList.stream().collect(Collectors.toMap(k -> k, v -> v.length()));	// {Hong=4, Hwang=5, Kang=4}

        intList.stream().collect(Collectors.counting());
        intList.stream().collect(Collectors.maxBy(Integer::compare));
        intList.stream().collect(Collectors.reducing((a,b) -> a+b));	// 6
        intList.stream().collect(Collectors.summarizingInt(x -> x));	//IntSummaryStatistics{count=3, sum=6, min=1, average=2.000000, max=3}

        Map<Boolean, List<String>> group = strList.stream().collect(Collectors.groupingBy(s -> s.startsWith("H")));
        group.get(true).forEach(System.out::println);  // Hwang, Hong

        Map<Boolean, List<String>> partition = strList.stream().collect(Collectors.partitioningBy(s -> s.startsWith("H")));
        partition.get(true).stream().forEach(System.out::println);  // Hwang, Hong



    }
}
