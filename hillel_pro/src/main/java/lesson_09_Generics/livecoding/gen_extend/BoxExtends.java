package lesson_09_Generics.livecoding.gen_extend;

public class BoxExtends <T extends Number> {
        private T item;

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

    public static void main(String[] args) {
        BoxExtends<Integer> box = new BoxExtends<>();
        box.setItem(123);

        BoxExtends<Double> box2 = new BoxExtends<>();
        box2.setItem(5.6);

        final double result = box.getItem().doubleValue() + box2.getItem().doubleValue();
        System.out.println(result);
    }
}
