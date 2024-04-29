package midterm.lazare_nadaraia_1.task1;

import java.util.ArrayList;
import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    private String lazare;

    public Fantasy(String lazare) {
        this.lazare = lazare;
    }


    @Override
    public String getNest1() {
        return "Nest1: " + lazare;
    }

    @Override
    public String getHdmi2() {
        return "HDMI2: " + lazare;
    }

    @Override
    public String methodCampaign3(String argPalette5) {
        return "Campaign3: " + argPalette5 + " " + lazare;
    }

    @Override
    public List<String> methodJustice4(String argCollection6) {
        List<String> result = new ArrayList<>();
        result.add("Justice4: " + argCollection6 + " " + lazare);
        return result;
    }


    @Override
    public String toString() {
        return "Fantasy{" +
                "lazare='" + lazare + '\'' +
                '}';
    }
}
