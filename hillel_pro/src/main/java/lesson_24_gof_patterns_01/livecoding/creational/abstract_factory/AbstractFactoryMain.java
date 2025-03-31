package lesson_24_gof_patterns_01.livecoding.creational.abstract_factory;

import lesson_24_gof_patterns_01.livecoding.creational.abstract_factory.models.AccessVirusClassicFactory;
import lesson_24_gof_patterns_01.livecoding.creational.abstract_factory.models.AccessVirusTIFactory;
import lesson_24_gof_patterns_01.livecoding.creational.abstract_factory.models.ClaviaNordLead2XFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AccessVirusClassicFactory virusClassic = new AccessVirusClassicFactory();
        AccessVirusTIFactory virusTi = new AccessVirusTIFactory();
        ClaviaNordLead2XFactory nordLead2x = new ClaviaNordLead2XFactory();

        // Virus Classic: Choose Wave
        virusClassic.createOscillator(OscTypes.CLASSIC_OSC).setWave("Square Wave");
        virusClassic.createOscillator(OscTypes.CLASSIC_OSC).setWave("50 Saw Wave / 50 Square Wave");
        virusClassic.createOscillator(OscTypes.CLASSIC_OSC).setWave("Sin Wave");

        // Virus TI: Choose Wave
        virusTi.createOscillator(OscTypes.GRAIN_COMPLEX_OSC).setWave("Iron Man Wave");
        virusTi.createOscillator(OscTypes.FORMANT_COMPLEX_OSC).setWave("Bat Cave Wave");
        virusTi.createOscillator(OscTypes.WAVE_TABLE_OSC).setWave("Wave 36");

        //Nord Lead 2X: Choose Wave
        nordLead2x.createOscillator(OscTypes.CLASSIC_OSC).setWave("Triangle");
        nordLead2x.createOscillator(OscTypes.WAVE_TABLE_OSC).setWave("Wave 3");
    }
}
