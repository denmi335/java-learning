import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaExample {
    public static <T>List<T> filterByPredicate(List<T> list, Predicate<T> predicate){
        return list.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
    public static <T, R> List<R> transformList(List<T> list, Function<T, R> function){
        return list.stream()
                .map(function)
                .collect(Collectors.toList());
    }
    public static <T> void processList(List<T> list, Consumer<T> consumer){
        list.stream()
                .forEach(consumer);
    }
    public static <T>List<T> createList(Supplier<List<T>> supplier){
        return supplier.get();
    }

}
