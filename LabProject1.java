public class LabProject1 {
    public static void main(String[] args) {

        double radius = 2.0;

        double height = 5.0;

        // Surface Area equation = A = PI*R(R+sqrt(h^2+R^2))
        double surfaceArea = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));

        // Volume equation = PI * R^2 (h/3)
        double volume = Math.PI * Math.pow(radius, 2) * (height / 3);

        // Printing Statement
        System.out.println("Surface Area of the Cone = " + Math.round(surfaceArea));

        System.out.println("Volume of the Cone = " + Math.round(volume));
    }
}
