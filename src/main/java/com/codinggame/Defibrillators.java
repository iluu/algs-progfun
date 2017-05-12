package com.codinggame;

import java.util.Scanner;

class Defibrillators {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double lon = parse(in.next());
        in.nextLine();
        double lat = parse(in.next());
        in.nextLine();

        int nDefib = in.nextInt();
        in.nextLine();

        String minName = "";
        double minDist = Long.MAX_VALUE;
        for (int i = 0; i < nDefib; i++) {
            String[] defib = in.nextLine().split(";");
            double cDist = calculateDist(lon, lat, parse(defib[4]), parse(defib[5]));
            if (minDist > cDist) {
                minDist = cDist;
                minName = defib[1];
            }
        }

        System.out.println(minName);
    }

    private static double parse(String degrees) {
        return Double.parseDouble(degrees.replace(",", "."));
    }

    private static double calculateDist(double cLon, double cLat, double dLon, double dLat) {
        double x = (dLon - cLon) * Math.cos((cLat + dLat) / 2d);
        double y = (dLat - cLat);
        return Math.sqrt(x * x + y * y) * 6371d;
    }
}
