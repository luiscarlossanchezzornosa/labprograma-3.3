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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lab3.reloj.reloj;

/**
 *
 * @author paule
 */
public class NewMain 
{
    
//  int m=1;
//   int s=0;
//public void alarma() throws InterruptedException{
//for(int i=0;i<3;i++){
//   
//     System.out.println("¡turu turu!"+m);       
//     m++;
//     s=s+10;
//    Thread.sleep(10000);
// };
// }
 public static void main(String[] args)throws InterruptedException
 {
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
  TimerTask reloj = new TimerTask() 
  {
   @Override
   public void run() 
   {
       int m=1;
       int s=0;
       System.out.println("turu turu"+m);
       m++;
       s=s+1;
       int tim=0;
        tim=tim+30;
       if (tim==tiempo1) {
           
       }
   }
  };
  Timer timer = new Timer();
  timer.scheduleAtFixedRate(reloj, 0, 10000);
  while(true)
  {
   if (hora2<10)
   {
   System.out.print("0");               
   }
   System.out.print(hora2+":");
   if (minuto2<10)
   {
   System.out.print("0");               
   }
   System.out.print(minuto2+":");
   if (segundo2<10)
   {
   System.out.print("0");               
   }
   System.out.println(segundo2+":");
   segundo2++;
   if (segundo2==60)
   {
   segundo2=0;
   minuto2++;     
   if (minuto2==60)
    {
     minuto2=0;
     hora2++;
     if (hora2==24)
     {
     hora2=0;
     }
    }
   }
   Thread.sleep(1000);
   
  }

 } 
}
