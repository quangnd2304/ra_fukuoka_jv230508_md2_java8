package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //1. Tạo stream cho các kiểu dữ liệu primitive
        IntStream intStream = IntStream.range(1,5);
        System.out.println("Giá trị của intStream:");
        intStream.forEach(element-> System.out.println(element));
        IntStream intStream2 = IntStream.of(1,3,5);
        System.out.println("Giá trị của intStream2");
        intStream2.forEach(System.out::println);
        DoubleStream doubleStream = DoubleStream.of(3,7);
        System.out.println("Giá trị doubleStream:");
        doubleStream.forEach(System.out::println);
        //2. Tạo Stream từ các kiểu dữ liệu khác
        List<String> languages = new ArrayList<>();
        languages.add("HTML");
        languages.add("CSS");
        languages.add("Javascript");
        languages.add("Java");
        System.out.println("Các ngôn ngữ:");
        languages.stream().forEach(System.out::println);
    }
}
