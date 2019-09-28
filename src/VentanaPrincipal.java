
import java.io.BufferedReader;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }
    public static String rutaOrigen,rutaDestino;
    
    public static void fileMove(String sourceFile, String destinationFile) {
    try {
        File inFile = new File(sourceFile);
        File outFile = new File(destinationFile);

        FileInputStream in = new FileInputStream(inFile);
        FileOutputStream out = new FileOutputStream(outFile);

            int c;
                while ((c = in.read()) != -1)
                    out.write(c);

                    in.close();
                    out.close();

            File file = new File(sourceFile);
                if (file.exists()) {
                    file.delete();
            }

        } catch (IOException e) {System.err.println("Hubo un error de entrada/salida!!!");}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Ruta Vieja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ruta Nueva");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese Contraseña");

        jButton3.setText("Verificar Contraseña");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Mover");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton4))
                        .addGap(200, 200, 200))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(45, 45, 45)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addComponent(jButton4)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/////RUTA ORIGINAL 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        String choosertitle = "";
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle(choosertitle);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if(chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            rutaOrigen = (chooser.getSelectedFile().toString());
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //moviendo archivo
        
        fileMove(rutaOrigen,rutaDestino);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          JFileChooser chooser = new JFileChooser();
        String choosertitle = "";
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle(choosertitle);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if(chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            rutaDestino = (chooser.getSelectedFile().toString());
        } 

    }//GEN-LAST:event_jButton2ActionPerformed

    //verificar contraseña
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            String password = String.valueOf(jPasswordField1.getPassword());
            
            List listaPuntuaciones = new ArrayList();
            List listaRangos = new ArrayList();
            File puntuacion = new File("src/Files/puntuacion.txt");
            File rangos = new File("src/Files/resultado.txt");
            BufferedReader bufferPuntuacion = new BufferedReader(new FileReader(puntuacion));
            BufferedReader bufferRangos = new BufferedReader(new FileReader(rangos));

            int i = 0;
            String readLine = "";
            while ((readLine = bufferPuntuacion.readLine()) != null) {
                listaPuntuaciones.add(readLine);
            }
            while ((readLine = bufferRangos.readLine()) != null) {
                listaRangos.add(readLine);
            }
            //asi se obtiene un valor de la lista en string
           //jLabel1.setText((String) listaRangos.get(0));
           int comparacion1 = Integer.parseInt((String) listaPuntuaciones.get(0));
           int comparacion2 = Integer.parseInt((String) listaPuntuaciones.get(1));
           int comparacion3 = Integer.parseInt((String) listaPuntuaciones.get(2));
           int comparacion4 = Integer.parseInt((String) listaPuntuaciones.get(3));
           int comparacion5 = Integer.parseInt((String) listaPuntuaciones.get(4));
           int comparacion6 = Integer.parseInt((String) listaPuntuaciones.get(5));
           int comparacion7 = Integer.parseInt((String) listaPuntuaciones.get(6));
           int comparacion8 = Integer.parseInt((String) listaPuntuaciones.get(7));

           int puntuacionFinal = 0; 
           if(password.length() < comparacion1){
               JOptionPane.showMessageDialog(null, "La contraseña no es válida, por favor ingrese una nueva");
           }
           else if(password.length() >= comparacion1){
               JOptionPane.showMessageDialog(null, "La contraseña ingresada es válida.");
               //comparacion 2
               puntuacionFinal += (comparacion2*password.length());
               //comparacion 3: validacion de mayusculas
               int numeroMayusculas = 0,numeroletras=0,numerodigitos=0,numeroespeciales=0;
               for(int k =0;k<password.length();k++){
                  char caracter = password.charAt(k);
                  if(Character.isUpperCase(caracter)){ 
                      numeroMayusculas++;
                  }
                  //comparacion para saber si contiene digitos
                 if (Character.isDigit(caracter)) {
                     numerodigitos++;
                 } 
                 if (Character.isLetter(caracter)) {
                     //comparacion para saber si contiene letras
                     numeroletras++;
                 }
                 //comparacion caracteres especiales
                 if (!Character.isLetter(caracter) && !Character.isDigit(caracter)) {
                     numeroespeciales++;
                 }
               }
               puntuacionFinal += (comparacion3*numeroMayusculas);
               puntuacionFinal += (comparacion4*numeroletras);
               puntuacionFinal += (comparacion5*numerodigitos);
               puntuacionFinal += ((password.length()+ comparacion6)*numeroespeciales);
               
               if(java.util.Objects.equals(password.length(), numerodigitos)){
                   puntuacionFinal -= comparacion7;
               }
               else if (java.util.Objects.equals(password.length(), numeroletras)){
                   puntuacionFinal -= comparacion8;
               }
               
               JOptionPane.showMessageDialog(null, puntuacionFinal);
           }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables

    
}
