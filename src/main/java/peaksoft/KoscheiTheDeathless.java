package peaksoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import peaksoft.model.Ocean1;

@Component
public class KoscheiTheDeathless {
    private Ocean1 ocean;

    public String getRulesByDeath() {
        return "На свете есть океан \uD83C\uDF0A , " + ocean.toString();
    }

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }
}
