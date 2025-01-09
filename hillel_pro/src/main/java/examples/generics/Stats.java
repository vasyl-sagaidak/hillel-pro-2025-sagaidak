package examples.generics;

public class Stats<T extends Number> {
    T[] nums;

    public Stats(T[] o){
        this.nums = o;
    }

    double average(){
        double sum = 0.0;
        for (T element : nums) {
            sum += element.doubleValue();
        }
        return sum/nums.length;
    }

    void isSameAvg(Stats<?> o) {
        if (this.average() == o.average()) {
            System.out.println("Средние значения одинаковы");
        } else {
            System.out.println("Cредние значения отличаются");
        }
    }
}
