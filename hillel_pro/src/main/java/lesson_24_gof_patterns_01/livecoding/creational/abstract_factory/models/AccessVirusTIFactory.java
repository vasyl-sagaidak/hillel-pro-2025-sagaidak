package lesson_24_gof_patterns_01.livecoding.creational.abstract_factory.models;

import lesson_24_gof_patterns_01.livecoding.creational.abstract_factory.AbstractFactory;
import lesson_24_gof_patterns_01.livecoding.creational.abstract_factory.OSCable;
import lesson_24_gof_patterns_01.livecoding.creational.abstract_factory.OscTypes;
import lesson_24_gof_patterns_01.livecoding.creational.abstract_factory.oscillators.ClassicOSC;
import lesson_24_gof_patterns_01.livecoding.creational.abstract_factory.oscillators.FormantOSC;
import lesson_24_gof_patterns_01.livecoding.creational.abstract_factory.oscillators.GrainOSC;
import lesson_24_gof_patterns_01.livecoding.creational.abstract_factory.oscillators.HyperSawOSC;
import lesson_24_gof_patterns_01.livecoding.creational.abstract_factory.oscillators.WaveTableOSC;

public class AccessVirusTIFactory extends AbstractFactory {
    @Override
    public OSCable createOscillator(OscTypes type) {
        switch (type) {
            case CLASSIC_OSC:
                return new ClassicOSC();
            case HYPER_SAW_OSC:
                return new HyperSawOSC();
            case GRAIN_COMPLEX_OSC:
                return new GrainOSC();
            case WAVE_TABLE_OSC:
                return new WaveTableOSC();
            case FORMANT_COMPLEX_OSC:
                return new FormantOSC();
        }
        throw new RuntimeException("Access Virus TI2 doesn't have this type of OSC.");
    }
}
