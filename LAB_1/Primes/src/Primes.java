import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Primes {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i < 100; i++) {
            boolean isSimple = isPrime(i);
            if (isSimple) {
                numbers.add(i);
            }
        }
        if (!numbers.isEmpty()) {
            System.out.println("Простые числа: " + numbers.stream().map(Object::toString).collect(Collectors.joining(", "))); //Красивый вывод
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}