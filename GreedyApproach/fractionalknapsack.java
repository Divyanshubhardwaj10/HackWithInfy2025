import java.util.*;

class Item {
    double value, weight;

    Item(double value, double weight) {
        this.value = value;
        this.weight = weight;
    }

    double valuePerWeight() {
        return value / weight;
    }
}

public class fractionalknapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = sc.nextInt();  
        int n = sc.nextInt();         

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            double value = sc.nextDouble();
            double weight = sc.nextDouble();
            items[i] = new Item(value, weight);
        }

        Arrays.sort(items, (a, b) -> Double.compare(b.valuePerWeight(), a.valuePerWeight()));

        double maxValue = 0.0;

        for (Item item : items) {
            if (capacity == 0)
                break;

            if (item.weight <= capacity) {
                capacity -= item.weight;
                maxValue += item.value;
            } else {
                maxValue += item.valuePerWeight() * capacity;
                capacity = 0;
            }
        }
        System.out.printf("%.2f\n", maxValue);
    }
}
