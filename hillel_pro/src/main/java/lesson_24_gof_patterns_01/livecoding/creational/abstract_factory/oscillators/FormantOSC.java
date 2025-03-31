package lesson_24_gof_patterns_01.livecoding.creational.abstract_factory.oscillators;

import lesson_24_gof_patterns_01.livecoding.creational.abstract_factory.OSCable;

public class FormantOSC implements OSCable {
    @Override
    public void setWave(String waveType) {
        // -- logic of the type setting Formant OSC Wave--
        System.out.println("OSC wave type is:" + waveType);
    }
}
