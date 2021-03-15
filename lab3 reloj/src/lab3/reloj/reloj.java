
package lab3.reloj;

import java.util.*;
public class reloj extends javax.swing.JFrame implements Runnable{
String hora,minuto,segundo,ampm;
Calendar calendario;
Thread h1;
    public reloj() {
        initComponents();
        h1=new Thread(this);
        h1.start();
        setLocationRelativeTo(null);
        setTitle("reloj");
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        relojj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        relojj.setBackground(new java.awt.Color(133, 184, 188));
        relojj.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        relojj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(relojj, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(relojj, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel relojj;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
    Thread ct=Thread.currentThread();
        while (ct==h1) {
            calcula();
            relojj.setText(hora+":"+minuto+":"+segundo+":"+ampm);
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException e) {}
        }
      }

    private void calcula() {
   Calendar calendario=new GregorianCalendar();
   Date fechaHoraActual=new Date();
   calendario.setTime(fechaHoraActual);
   ampm=calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
   if(ampm.equals("PM")){
       int h=calendario.get(Calendar.HOUR_OF_DAY)-12;
        hora=h>9?""+h:"0"+h;
    }else{
       hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
    }
    minuto=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
   segundo=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
   
    }
}
