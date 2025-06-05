package org.example.lesson38homework;

import org.example.lesson38homework.configuration.AppConfig;
import org.example.lesson38homework.dao.ProductRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductRepository repo = context.getBean(ProductRepository.class);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. New Cart");
            System.out.println("0. Exit");
            System.out.println("Choose: ");
            int action = sc.nextInt();

            if (action == 0) {
                break;
            }
            if (action == 1) {
                Cart cart = context.getBean(Cart.class);
                while(true) {
                    System.out.println("\nProducts:");
                    repo.getAll().forEach(System.out::println);

                    System.out.println("\nCart: " + cart.getProductsBasket());
                    System.out.println("Total: $" + cart.getTotalPrice());

                    System.out.println("\n1. Add to cart");
                    System.out.println("2. Remove from cart");
                    System.out.println("3. Finish cart");
                    System.out.println("Action: ");
                    int choice = sc.nextInt();

                switch (choice) {
                    case 1: System.out.println("Enter product id to add: ");
                            int addId = sc.nextInt();
                            repo.findById(addId)
                                .ifPresentOrElse(cart::addProduct,
                                        () -> System.out.println("Product not found")
                            );
                            break;

                    case 2: System.out.println("Enter product id to remove: ");
                            int removeId = sc.nextInt();
                            cart.removeById(removeId);
                            break;

                    case 3: System.out.println("Final cart: " + cart.getProductsBasket());
                            System.out.println("Total: $" + cart.getTotalPrice());
                            break;
                }
                }
            }
        }
        sc.close();
        context.close();
    }
}
