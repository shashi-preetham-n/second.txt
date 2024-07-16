import java.util.Scanner;

public class driving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your id");
        int id;
        id = scan.nextInt();
        System.out.println("entered id is :- "+id);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("enter your name");
        String name;
        name =scan1.nextLine();
        System.out.println("entered name is :- "+name);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("enter your age :-");
        int age=18;
        age = scan2.nextInt();
        if(age>=18){
            System.out.println("you are eligible to the driving license");
        }
        else{
            System.out.println(" you are not eligible to the driving license");
        }
        Scanner scan3 = new Scanner(System.in);
        System.out.println("enter your address :- ");
        String address;
        address = scan3.nextLine();
        System.out.println("enterd address is :- "+address);

    }
    
}
