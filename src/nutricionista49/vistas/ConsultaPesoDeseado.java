
package nutricionista49.vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import nutricionista49.AccesoDatos.DietaData;
import nutricionista49.entidades.Dieta;

public class ConsultaPesoDeseado extends javax.swing.JInternalFrame {

   
//    DefaultTableModel modelo=new DefaultTableModel(){
//            @Override
//            public boolean isCellEditable(int i, int i1) {
//                return false; // 
//            }
//        
//        };
    
    public ConsultaPesoDeseado() {
        initComponents();
        armarCabecera();
        
        
        
        this.setLocation(95, 50);
        this.setSize(910, 500); 
        
        tablapesados.setShowGrid(true);
        
        jPanel3.setBackground(new Color(255,255,255,150));
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/pesono2.jpg"));
        Image miImagen=icono.getImage();
        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){

                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);

            }

        } ;
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapesados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel1.setText("LISTADO DE PACIENTES QUE NO ALCANZARON EL OBJETIVO");

        tablapesados.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        tablapesados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablapesados);

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/cerrar-sesion3535.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/salud3535.png"))); // NOI18N
        jLabel10.setText("Clinica Cornyshot");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(172, 172, 172))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jButton1)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    public void armarCabecera(){
        
        
        DefaultTableModel modelo = new DefaultTableModel() {

            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false,false
            };

            public boolean isCellEditable(int row, int column) {
                return canEdit[column];
            }

        };

//        modelo.addColumn("ID");
//        modelo.addColumn("Dieta");
//        modelo.addColumn("DNI");
//        modelo.addColumn("fecha inicio");
//        modelo.addColumn("fecha fin");
//        modelo.addColumn("peso inicial");
//        modelo.addColumn("peso a cumplir");

          modelo.addColumn("Nombre");
          modelo.addColumn("Peso Inicial");
          modelo.addColumn("Peso Actual");

        tablapesados.setModel(modelo);

        DietaData dd1 = new DietaData();

        List<Dieta> dietas = dd1.ListarDietaGOR();

        for (Dieta dieta : dietas) {
//            modelo.addRow(new Object[]{dieta.getIdDieta(), dieta.getNombre(), dieta.getPaciente().getDni(), dieta.getFechaInicial(), dieta.getFechaFinal(), dieta.getPesoInicial(), dieta.getPesoFinal()});
              modelo.addRow(new Object[]{dieta.getPaciente().getNombre(),dieta.getPesoInicial(), dieta.getPesoFinal()});
        }

        tablapesados.setModel(modelo);
    
    }
    
    
//    public void listagordis(){
//    
//        tablapesados.setModel(modelo);
//
//        DietaData dd1 = new DietaData();
//
//        List<Dieta> dietas = dd1.ListarDieta();
//
//        for (Dieta dieta : dietas) {
//            modelo.addRow(new Object[]{dieta.getPaciente().getNombre(), dieta.getFechaInicial(), dieta.getFechaFinal(), dieta.getPesoInicial(), dieta.getPesoFinal()});
//
//        }
//    
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablapesados;
    // End of variables declaration//GEN-END:variables
}
