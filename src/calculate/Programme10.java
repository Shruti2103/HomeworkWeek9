package calculate;

import java.util.ArrayList;
import java.util.Scanner;

public class Programme10 {


    public static void main(String[] args) {


        String[] StationName = new String[]{"Aldgate", "Borough", "Bank", "Baker Street ", "Edgware", "Edgware Road", "Aldgate East", "Green Oark", "Eusteon",
                "London Bridge", "Waterloo", "RegentsPark", "Holborn", "LiverpoolStreet", "Bond Street", "Picadelly Circus", "Waren Street", "Moorgate", "Oxford Street",
                "St paul's", "Faringdon", "Bayswater", "Westminister", "leicester Square", "Barbican", "Old Street", "Bond Street", "Waterloo", "Covent Garden",
                "Green Park"};


        String[][] tubeName = new String[12][31];
        tubeName[0][0] = "Metropolitan Line";
        tubeName[0][1] = "Aldgate";
        tubeName[0][2] = "Liverpool Street";
        tubeName[0][3] = "Moorgate ";
        tubeName[1][4] = "Barbican";


        tubeName[1][0] = "Northern Line";
        tubeName[1][1] = "Borough";
        tubeName[1][2] = "London Bridge";
        tubeName[1][3] = "Moorgate";
        tubeName[1][4] = "Old Street";

        tubeName[2][0] = "Waterloo & City";
        tubeName[2][1] = "Bank";


        tubeName[3][0] = "bakerloo";
        tubeName[3][1] = "MBaker street";
        tubeName[3][3] = "Oxford circus";
        tubeName[3][4] = "Picadelly circus";

        tubeName[4][0] = "Central";
        tubeName[4][1] = "Bank";
        tubeName[4][2] = "Holborn";
        tubeName[4][3] = "St Paul";
        tubeName[4][4] = "Bond street";

        tubeName[5][0] = "Circle";
        tubeName[5][1] = "Edgware road";
        tubeName[5][2] = "Baker street";
        tubeName[5][3] = "Faringdon";


        tubeName[6][0] = "Bank";

        tubeName[7][0] = "District";
        tubeName[7][1] = "Edgware road";
        tubeName[7][2] = "Pedington";
        tubeName[7][3] = "Bayswater";

        tubeName[8][0] = "hemmersmith & city";
        tubeName[8][1] = "Aldgate East";
        tubeName[8][2] = "Liverpool street";
        tubeName[8][3] = "Moorgate";
        tubeName[8][4] = "Barbican";

        tubeName[9][0] = "Jublee";
        tubeName[9][1] = "Baker Street";
        tubeName[9][2] = "bond Street";
        tubeName[9][3] = "Westminister";
        tubeName[9][4] = "Waterloo";

        tubeName[10][0] = "Picadilly";
        tubeName[10][1] = "Green Oark";
        tubeName[10][2] = "Picadelly Circus";
        tubeName[10][3] = "Leicester Square";
        tubeName[10][4] = "Covent Garden";

        tubeName[11][0] = "Victoria";
        tubeName[11][1] = "Euston";
        tubeName[11][2] = "Warren street";
        tubeName[11][3] = "Oxford circusr";
        tubeName[11][4] = "Green Park";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Tube station name");
        String userTubeStation = sc.nextLine();
        String catchStationName = " ";

         // check weather user input is match with array 1 list
        for (int i = 0; i < StationName.length; i++) {        // here we are checking length of single dimentinal array
            if (userTubeStation.equalsIgnoreCase(StationName[i])) {                 //here we are matching user input with single dimontional array
                catchStationName = StationName[i];// we are putting stationname first dimentional array in to one variable  catchstationname
            }


        }
        //
        if (userTubeStation.equalsIgnoreCase(catchStationName)) {
            System.out.println("userTubeStation " + "Station is in zone1");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Following lines passing the given tube station " + userTubeStation);
            System.out.println("--------------------------------------------------------------------------");

            for (int x = 0; x < tubeName.length; x++) {// logic for raw so starting point x=0
                for (int y = 1; y < tubeName.length; y++) {
                    String match = tubeName[x][y];

                    if (userTubeStation.equalsIgnoreCase(match)) {
                        System.out.println(tubeName[x][0]);
                    }


                }
            }


        } else {
            System.out.println("Station is not in zone 1");
        }

    }


}



























