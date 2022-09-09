/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21game1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class jptv21game1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int cash = 30;
        int myNumber = random.nextInt(6);
        do{
            if (cash == 0){
                System.out.println("deneg net, no vi derjites`");
                break;
            }
            int counter = 0;
            System.out.println("Zadumano chislo ot 0 do 5, ugadai, est` 3 popitki: ");
            System.out.println("vashi den`gi "+cash);
            Scanner scanner = new Scanner(System.in); 
            do{
                if (counter == 3){
                System.out.println("Ti proigral");
                cash -= 15;
                System.out.println("cash "+cash);
                break;
                }
                int yourNumber = scanner.nextInt();
                if(myNumber == yourNumber){
                    System.out.println("VPERED!!1 VPERED!!! VPERED!1!");
                    cash +=15;
                    System.out.println("cash "+cash);
                    break;
                }else{
                    System.out.println("nea,probuy eshe");
                    counter += 1; 
                }

            }while(true);
            System.out.println("Najmi 0 4tobi viiti, najmi grugie knopki 4tobi prodoljit`: ");
            int game = scanner.nextInt();
            if (0 == game){
                System.out.println("do svjazi");
                break;
            }
        }while(true);
// TODO code application logic here
    }
    
}
