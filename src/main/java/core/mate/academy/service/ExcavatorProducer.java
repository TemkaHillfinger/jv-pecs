package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator excavatorFirst = new Excavator("White", "Excavator First");
        Excavator excavatorSecond = new Excavator("White", "Excavator Second");
        return List.of(excavatorFirst, excavatorSecond);
    }
}