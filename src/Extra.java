import java.util.Scanner;

public class Extra {
    String pluralnoun1;
    String color1;
    String color2;
    String food;
    String pluralnoun2;

    Extra (){
        pluralnoun1 = "";
        color1 = "";
        color2 = "";
        food = "";
        pluralnoun2 = "";

    }
    

    void sysOut () {
        Scanner answer = new Scanner(System.in);

        System.out.println("Please input pluralnoun1" );
        pluralnoun1 = answer.nextLine(); 
        System.out.println("Please input color1 " );  
        color1 = answer.nextLine();
        System.out.println("Please input color2 " );
        color2 = answer.nextLine();
        System.out.println("Please input food");
        food = answer.nextLine();
        System.out.println("Please input pluralnoun2" );
        pluralnoun2 = answer.nextLine();
    
    }

    public void roses() {
        System.out.println("Roses are " + color1);
        System.out.println(pluralnoun1 + " are" + color2);
        System.out.println("I like " + food);
        System.out.println("Do  " + pluralnoun2 + " Like them too?");

    }
}

