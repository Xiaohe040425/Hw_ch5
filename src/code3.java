import java.util.*;

public class code3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        System.out.println("原始數列：" + numbers);

        Collections.sort(numbers);
        System.out.println("排序後的數列：" + numbers);

        Collections.reverse(numbers);
        System.out.println("反轉後的數列：" + numbers);
    }
}
