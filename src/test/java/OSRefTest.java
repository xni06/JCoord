package uk.me.jstott.jcoord.junit;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

import uk.me.jstott.jcoord.OSRef;

public class OSRefTest extends TestCase {

    private final List<Data> data = new ArrayList() {{
        add(new Data(55.00793350, -1.63509470, "NZ23336822"));
        add(new Data(55.00793350, -1.63509470, "NZ23336822"));
        add(new Data(55.27392830, -2.07162170, "NY95459776"));
        add(new Data(55.34695322, -2.46549256, "NT70480598"));
        add(new Data(55.07704000, -1.54471670, "NZ29067594"));
        add(new Data(55.54650170, -1.69597330, "NU19182813"));
        add(new Data(55.56885670, -1.64451170, "NU22413063"));
        add(new Data(55.05398170, -1.64884000, "NZ22437334"));
        add(new Data(55.14710372, -1.97922751, "NZ01328364"));
        add(new Data(55.33516630, -2.11948693, "NT92420457"));
        add(new Data(55.31509120, -1.55736380, "NU28080242"));
        add(new Data(55.31332170, -1.55670170, "NU28130223"));
    }};
    
    public void testOsRefWithPrecisionOfEightDigits() {
        for (Data d : data) {
            getOsRefWithPrecisionOfEightDigits(d.lat, d.lng, d.osRef);
        }
    }

    private void getOsRefWithPrecisionOfEightDigits(double lat, double lng, String expected) {
        OSRef osRef = new uk.me.jstott.jcoord.LatLng(lat, lng).toOSRef();
        String actual = osRef.getOsRefWithPrecisionOf(OSRef.Precision.EIGHT_DIGITS);
        assertEquals(expected, actual);
    }

    private class Data {
        double lat;
        double lng;
        String osRef;

        public Data(double lat, double lng, String osRef) {
            this.lat = lat;
            this.lng = lng;
            this.osRef = osRef;
        }
    }
}
