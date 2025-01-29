package lesson_10_Java_IO.livecoding;

public class CloseableResource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Close my resource");
    }

    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
