package com.company;

public class MegabyteConverter {

    // Kilobytes is private so that the user can't modify it directly.
    private int kilobytes = 0;

    // Creates and instance of kilobytes.
    public MegabyteConverter(int kilobytes ) {
        this.kilobytes = kilobytes;
    }

    //Establishing the getters and setters
    public int getKilobytes() {
        return kilobytes;
    }

    public void setKilobytes(int kilobytes) {
        this.kilobytes = kilobytes;
    }

    // Method that gives the user the megabytes and remaining kilobytes of the total kilobytes he imputed.
    public static void printMegaBytesAndKiloBytes(int kilobytes) throws Exception{

        if (kilobytes <= 0 ){
            throw new Exception("Error. Kilobytes must be greater than 0!");
        } else{
            int totalMegaBytes = kilobytes / 1024;
            int remainingKiloBytes = kilobytes % 1024;

            if (remainingKiloBytes > 0){
                System.out.println(kilobytes + " KB = " + totalMegaBytes + " MB and " + remainingKiloBytes + " KB");
            } else{
                System.out.println(kilobytes + " KB = " + totalMegaBytes + " MB");
            }
        }
    }
}
