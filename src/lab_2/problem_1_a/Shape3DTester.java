package lab_2.problem_1_a;

import java.util.Scanner;

public class Shape3DTester {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity of fiqures:");
            int numberFiqures = scanner.nextInt();
            scanner.nextLine();

            for(int i=0;i<numberFiqures;i++){
                System.out.println("Enter fiqure (Cube,Sphere,Cylinder):");
                String fiqure = scanner.nextLine();
                if(fiqure.equals("Cube")){
                    System.out.println("Enter height:");
                    int height = scanner.nextInt();
                    scanner.nextLine();
                    Cube cube = new Cube(height);
                    System.out.println("Cube volume is :" + cube.volume());
                    System.out.println("Cube surface area is :" + cube.surfaceArea());

                    System.out.println();

                }
                else if(fiqure.equals("Sphere")){
                    System.out.println("Enter radius:");
                    int radius = scanner.nextInt();
                    scanner.nextLine();
                    Sphere sphere = new Sphere(radius);
                    System.out.println("Sphere volume is :" + sphere.volume());
                    System.out.println("Sphere surface area is:" + sphere.surfaceArea());

                }
                else if(fiqure.equals("Cylinder")){
                    System.out.println("Enter height:");
                    int height = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter radius:");
                    int radius = scanner.nextInt();
                    scanner.nextLine();
                    Cylinder cylinder = new Cylinder(radius, height);
                    System.out.println("Cylinder volume is :" + cylinder.volume());
                    System.out.println("Cilinder surface area is :" + cylinder.surfaceArea());
                }
                else{
                    System.out.println("Invalid input");
                }
            }
        }
    }

