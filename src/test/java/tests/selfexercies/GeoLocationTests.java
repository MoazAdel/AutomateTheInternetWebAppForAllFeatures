package tests.selfexercies;

import org.testng.annotations.Test;
import tests.base.BaseTests;

import static org.testng.Assert.assertEquals;

public class GeoLocationTests extends BaseTests {

    @Test
    public void testGeoLocation() {
        var geoLocationPage = homePage.navigateToGeoLocationPage();
        geoLocationPage.locateMe();
//        geoLocationPage.acceptLocation();
        var lat = geoLocationPage.getLatVal();
        geoLocationPage.getLongVal();
        var lng = geoLocationPage.navigateToMap();
        var mapCoordination = geoLocationPage.getMapCoordinates();
        assertEquals(lat + lng, mapCoordination);

    }
}
