import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String msg = "Задача заключается в том, чтобы написать генератор словаря аборигенов в функциональном стиле.";
        String[] words = msg
                .toLowerCase()
                .replaceAll("\\pP", "")
                .split(" ");

        List<String> dictionary = doSomething(words, wordsMsg -> Arrays.stream(wordsMsg)
                .distinct()
                .sorted()
                .collect(Collectors.toList()));

        for (String s : dictionary) {
            System.out.println(s);
        }

    }

    private static List<String> doSomething(String[] wordsMsg, Function<String[], List<String>> function) {
        return function.apply(wordsMsg);

    }


}
