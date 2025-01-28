package lesson_10_Java_IO.extra_task;

public class FileMaxSizeReachedException extends RuntimeException {
  public FileMaxSizeReachedException(String message) {
    super(message);
  }
}
