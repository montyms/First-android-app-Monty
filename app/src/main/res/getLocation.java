/**
 * Created by Michael Monty on 1/26/2017.
 */

import android.location.Location;
import android.location.LocationManager;

public class getLocation {

    public void getLocation() {
        try {
            LocationManager locMgr = (LocationManager)
                    this.getSystemService(LOCATION_SERVICE);
            Location recentLoc = locMgr.
                    getLastKnownLocation(LocationManager.GPS_PROVIDER);
            Log.i(DEBUG_TAG, “loc: “ + recentLoc.toString());
        }
        catch (Exception e) {
            Log.e(DEBUG_TAG, “Location failed”, e);
        }
    }
}
