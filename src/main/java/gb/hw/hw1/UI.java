package gb.hw.hw1;

import java.io.File;
import java.util.Scanner;


public class UI {



    public static void menu(){
        Scanner sc = new Scanner(System.in);
        boolean ifEnd = false;
        System.out.println("Введите '1', чтобы добвить заметку, '2' - посмотреть все заметки, любой другой символ - выйти");
        while(!ifEnd){
            String command = sc.nextLine();
            switch (Integer.parseInt(command)) {
                case 1:
                    System.out.println("Введите заметку: ");
                    Files.write(sc.nextLine());
                    break;
                case 2:
                    Files.show();
                    break;
                default:
                    ifEnd = true;
                    break;
            }

        }
    }
}
