public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm / 1.6; // Using 1 mile = 1.6 km
        double volumeMi3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + String.format("%.2f", volumeKm3) + " and cubic miles is " + String.format("%.2f", volumeMi3));
    }
}


