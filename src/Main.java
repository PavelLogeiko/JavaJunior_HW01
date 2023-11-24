import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("\nЗадан следующий список целых чисел\n" + numbers);
        System.out.println("\nС помощью Stream API вывести на экран среднее\nзначение " +
                "всех четных чисел в списке.");

        System.out.println("Все четные числа в списке:");
        Stream<Integer> evenNumbersStream = numbers.stream().filter(n -> n % 2 == 0);
        List<Integer> evenNumbersList = evenNumbersStream.collect(Collectors.toList());
        System.out.println(evenNumbersList);

   double average = numbers.stream()
           .filter(n -> n % 2 == 0)
           .mapToDouble((val -> val))
           .average().orElse(Double.NaN);

        System.out.println("\nСреднее значение всех четных чисел\nзаданного списка: " + average);
    }
}