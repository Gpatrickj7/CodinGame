import java.util.*;
import java.io.*;
import java.math.*;




public class App {

    public static Scanner getSimulatedInput() {

        String simulatedInput = "3,879483\n" +
                                "43,608177\n" +
                                "3\n" +
                                "1;Maison de la Prevention Sante;6 rue Maguelone 340000 Montpellier;;3,87952263361082;43,6071285339217\n" +
                                "2;Hotel de Ville;1 place Georges Freche 34267 Montpellier;;3,89652239197876;43,5987299452849\n" +
                                "3;Zoo de Lunaret;50 avenue Agropolis 34090 Mtp;;3,87388031141133;43,6395872778854";

                                System.out.println("Simulated Input:\n" + simulatedInput);  // Print the entire input
        
        return new Scanner(simulatedInput);

        
    }



    //Harvesine formula 

    public static double calculateDistance(double LAT1, double LON1, double LAT2, double LON2) {
        double distance = 0.00;
        double a = 0.00;
        double c = 0.00;



        return distance;
    }











    //radian conversion
    public static double degreesToRadians(double degrees) {
        //double is overpowered for this haha
        double radians = degrees * (3.141589 / 180);

        return radians;
    }

    









    //dealing with string to long conversion
    public static double stringToDouble(String str) {

        //decided to convert the coords into a double for precision. memory on my machine is a non-issue so this is sufficient for now
        double dbl = Double.parseDouble(str.replace(',' , '.'));
        
        

        System.out.println();

        return dbl;



    }









    public static void main(String[] args) {

        //variables for data. data comes from console input to my understanding
        Scanner in = getSimulatedInput();

        double LAT = stringToDouble(in.next());
        double LON = stringToDouble(in.next());
        System.out.println(LAT + ", " + LON);
        int N = in.nextInt();
        
        



        double phi1 = degreesToRadians(LAT);
        double lambda1 = degreesToRadians(LON);

        System.out.println(phi1 + ", " + lambda1);

        







        //sorting through input logically and breaking it down to work with it how i need


        if (in.hasNextLine()) {
            in.nextLine();
        }
        System.out.println("|".repeat(110));
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            String[] tokens = DEFIB.split(";");
            String flagKey1 = "3,";
            String flagKey2 = "43,";
            
            System.out.println("Outer Outer Loop");

            System.out.println(i + 1);

            System.out.println(DEFIB);
            
            

            for (int j = 0; j < tokens.length; j++) {
                if (tokens[j].startsWith(flagKey1) || tokens[j].startsWith(flagKey2)){

                    if(tokens[j].startsWith(flagKey1)) {
                        double LAT2 = stringToDouble(tokens[j]);

                        System.out.print("Latitude: ");
                    
                        System.out.println(LAT2);


                    }
                    if (tokens[j].startsWith(flagKey2)){
                        double LON2 = stringToDouble(tokens[j]);

                        System.out.print("Longitude: ");
                        
                        System.out.println(LON2);
                    }

                    
                    
                    
                }
            }

            

            
            
                

                

            
            
           
            

        }

        

        
        
        

        

    }
}
       