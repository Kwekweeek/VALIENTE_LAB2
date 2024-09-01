import java.util.Scanner;

// Base class representing a cylinder
class Cylinder {
    // Protected attributes for radius, height, and area
    protected double radius;
    protected double height;
    protected double area;

    // Method to get input from the user and compute the surface area of the cylinder
    public void Area() {
        // Create a scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Get input for the radius of the cylinder from the user
        System.out.print("Enter the radius of the cylinder: ");
        radius = scanner.nextDouble();
        
        // Get input for the height of the cylinder from the user
        System.out.print("Enter the height of the cylinder: ");
        height = scanner.nextDouble();
        
        // Calculate the surface area of the cylinder using the formula: Area = 2πr^2 + 2πrh
        area = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
        
        // Display the calculated area
        System.out.println("Area of the cylinder: " + area);
    }
}

// Derived class that extends the Cylinder class to compute the volume of the cylinder
class CylinderVol extends Cylinder {
    // Private attribute to store the volume of the cylinder
    private double volume;

    // Method to compute the volume of the cylinder
    public void Volume() {
        // Calculate the volume of the cylinder using the formula: Volume = πr^2h
        volume = Math.PI * radius * radius * height;
        
        // Display the calculated volume
        System.out.println("Volume of the cylinder: " + volume);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an object of the CylinderVol class (which inherits from Cylinder)
        CylinderVol cylinderVol = new CylinderVol();
        
        // Call the Area method to calculate and display the area of the cylinder
        cylinderVol.Area();
        
        // Call the Volume method to calculate and display the volume of the cylinder
        cylinderVol.Volume();
    }
}