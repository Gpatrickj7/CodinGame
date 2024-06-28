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











    //radian conversion
    public double degreesToRadians(double degrees) {
        //double is overpowered for this haha
        double radians = degrees * (3.14159 / 180);

        return radians;
    }

    









    //dealing with string to long conversion
    public double stringToDouble(String strLatitude, String strLongitude) {

        //decided to convert the coords into a double for precision. memory on my machine is a non-issue so this is sufficient for now
        double latitude = Double.parseDouble(latitude.replace(',' , '.'));
        
        double longitude = Double.parseDouble(longitude.replace(',' , '.'));

        System.out.println();

        return latitude + longitude;



    }









    public static void main(String[] args) {

        //variables for data. data comes from console input to my understanding
        Scanner in = getSimulatedInput();

        String LON = in.next();
        String LAT = in.next();
        int N = in.nextInt();
        



        //decided to convert the coords into a double for precision. memory on my machine is a non-issue so this is sufficient for now

        







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
            boolean flag1 = false;
            boolean flag2 = false;
            System.out.println("Outer Outer Loop");

            System.out.println(i + 1);

            System.out.println(DEFIB);
            
            int count = 0;

            for (int j = 0; j < tokens.length; j++) {
                if (tokens[j].startsWith(flagKey1) || tokens[j].startsWith(flagKey2)){
                    System.out.println("1");
                    
                    
                    
                }
            }

            

            
            
                

                

            
            
           
            

        }

        

        
        
        

        

    }
}
       