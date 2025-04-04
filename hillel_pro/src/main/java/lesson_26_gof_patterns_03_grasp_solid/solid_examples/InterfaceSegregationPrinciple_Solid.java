package lesson_26_gof_patterns_03_grasp_solid.solid_examples;

/*
В этом примере интерфейс MultimediaPlayer был разделен на два отдельных интерфейса – VideoPlayer
и AudioPlayer, чтобы класс SimpleMultimediaPlayer мог имплементировать только те методы, которые
отвечают за воспроизведение аудио. Таким образом, другие классы, которые используют AudioPlayer,
не зависят от ненужных методов воспроизведения видео.
 */

// Интерфейс для воспроизведения мультимедийного контента
interface MultimediaPlayer {
    void play(); // Відтворення контенту
    void pause(); // Пауза
    void stop(); // Зупинка
}

// Интерфейс для просмотра видео
interface VideoPlayer {
    void playVideo(); // Воспроизведение видео
}

// Интерфейс для проигрывания аудио
interface AudioPlayer {
    void playAudio(); // Воспроизведение аудио
}

// Класс мультимедийного проигрывателя, реализующего только нужные методы
class SimpleMultimediaPlayer implements MultimediaPlayer, AudioPlayer {
    @Override
    public void play() {
        System.out.println("Мультимедийный контент воспроизводится");
    }

    @Override
    public void pause() {
        System.out.println("Мультимедийный контент на паузе");
    }

    @Override
    public void stop() {
        System.out.println("Мультимедийный контент остановлен");
    }

    @Override
    public void playAudio() {
        System.out.println("Аудио воспроизводится");
    }
}

public class InterfaceSegregationPrinciple_Solid {
    public static void main(String[] args) {
        SimpleMultimediaPlayer player = new SimpleMultimediaPlayer();
        player.play(); // Ожидается воспроизведение мультимедийного контента
        player.playAudio(); // Ожидается воспроизведение аудио
    }
}
