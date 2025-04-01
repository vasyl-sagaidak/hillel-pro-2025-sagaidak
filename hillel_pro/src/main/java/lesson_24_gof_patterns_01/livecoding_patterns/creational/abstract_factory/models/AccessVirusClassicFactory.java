package lesson_24_gof_patterns_01.livecoding_patterns.creational.abstract_factory.models;

import lesson_24_gof_patterns_01.livecoding_patterns.creational.abstract_factory.AbstractFactory;
import lesson_24_gof_patterns_01.livecoding_patterns.creational.abstract_factory.OSCable;
import lesson_24_gof_patterns_01.livecoding_patterns.creational.abstract_factory.OscTypes;
import lesson_24_gof_patterns_01.livecoding_patterns.creational.abstract_factory.oscillators.ClassicOSC;
import lesson_24_gof_patterns_01.livecoding_patterns.creational.abstract_factory.oscillators.HyperSawOSC;

public class AccessVirusClassicFactory extends AbstractFactory {

    @Override
    public OSCable createOscillator(OscTypes type) {
        switch (type) {
            case CLASSIC_OSC:
                return new ClassicOSC();
            case HYPER_SAW_OSC:
                return new HyperSawOSC();
        }
        throw new RuntimeException("Access Virus Classic doesn't have this type of OSC.");
    }
}
