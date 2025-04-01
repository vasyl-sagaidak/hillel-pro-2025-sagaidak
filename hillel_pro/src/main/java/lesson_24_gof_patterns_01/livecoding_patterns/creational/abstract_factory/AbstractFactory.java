package lesson_24_gof_patterns_01.livecoding_patterns.creational.abstract_factory;

public abstract class AbstractFactory {
    public abstract OSCable createOscillator(OscTypes type);
}
