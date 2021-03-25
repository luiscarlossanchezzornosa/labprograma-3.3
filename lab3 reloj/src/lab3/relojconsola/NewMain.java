/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.relojconsola;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author paule
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws InterruptedException{
        Scanner lector=new Scanner(System.in);
System.out.println("reloj");
System.out.println("hora");
int hora2=lector.nextInt();
System.out.println("minuto");
int minuto2=lector.nextInt();
System.out.println("segundo");
int segundo2=lector.nextInt();
System.out.println("alarma");
System.out.println("hora");
int hora1=lector.nextInt();
System.out.println("minuto");
int minuto1=lector.nextInt();
System.out.println("segundo");
int segundo1=lector.nextInt();
int tiempo1;
   tiempo1 = (hora1*3600000)+(minuto1*60000)+(segundo1*1000);
   TimerTask timertaskMain = new TimerTask() {
            int i=1;
            int s=0;
            @Override
            public void run() {
                if()
                        System.out.println("¡turu turu!"+i);       
                i++;
                s=s+11;
                System.out.println("");
            }
        };
 Timer timer = new Timer();
 timer.scheduleAtFixedRate(timertaskMain, tiempo1, 10000);
        while(true){
            if (hora2<10) {
                 System.out.print("0");               
            }
            System.out.print(hora2+":");
            if (minuto2<10) {
                 System.out.print("0");               
            }
            System.out.print(minuto2+":");
            if (segundo2<10) {
                 System.out.print("0");               
            }
            System.out.println(segundo2+":");
            segundo2++;
        if (segundo2==60) {
               segundo2=0;
               minuto2++;     
        if (minuto2==60) {
               minuto2=0;
               hora2++;
        if (hora2==24) {
               hora2=0;
            }
        }
    }
Thread.sleep(1000);
        }
        
    }

    private static void cls() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
