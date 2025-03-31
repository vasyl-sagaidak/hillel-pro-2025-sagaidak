package lesson_24_gof_patterns_01.livecoding.creational.builder;

public class Pizza {
    private final String sauce;
    private final String topping;
    private final String cheese;
    private final String mushrooms;

   public Pizza(Builder builder) {
        this.sauce = builder.sauce;
        this.topping = builder.topping;
        this.cheese = builder.cheese;
        this.mushrooms = builder.mushrooms;
    }

    public static Builder builder() {
       return new Builder();
    }

    public static class Builder {
        private String sauce;
        private String topping;
        private String cheese;
        private String mushrooms;

    public Builder withSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public Builder withTopping(String topping) {
        this.topping = topping;
        return this;
    }

    public Builder withCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public Builder withMushrooms(String mushrooms) {
        this.mushrooms = mushrooms;
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                ", cheese='" + cheese + '\'' +
                ", mushrooms='" + mushrooms + '\'' +
                '}';
    }
}
