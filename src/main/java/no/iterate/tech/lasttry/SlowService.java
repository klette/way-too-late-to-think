package no.iterate.tech.lasttry;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class SlowService {


    public static final Random RANDOM = new Random(System.nanoTime());

    public static CompletableFuture<String> getCustomerId() {
        return CompletableFuture.supplyAsync(() -> {
            sleep();
            return "a-customer-id";
        }, App.ASYNC);
    }

    public static CompletableFuture<List<String>> getProducts(String customerId) {
        return CompletableFuture.supplyAsync(() -> {
            sleep();
            return Collections.unmodifiableList(Arrays.asList("product1", "product2"));
        }, App.ASYNC);
    }

    public static CompletableFuture<List<String>> getOffers(String customerId) {
        return CompletableFuture.supplyAsync(() -> {
            sleep();
            return Collections.unmodifiableList(Arrays.asList("offer1", "offer22"));
        }, App.ASYNC);
    }

    private static void sleep() {

            int millis = RANDOM.nextInt(9999) + 1;
        System.out.println(millis);
            long sum = 2;
            for (int l = 1; l < millis; l++) {
                sum += sum + (sum * l);
            }
            System.out.println(sum);

    }
}
