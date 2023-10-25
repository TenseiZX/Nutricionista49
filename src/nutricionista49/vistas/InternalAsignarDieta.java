package nutricionista49.vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nutricionista49.AccesoDatos.DietaData;
import nutricionista49.AccesoDatos.PacienteData;
import nutricionista49.entidades.Comida;
import nutricionista49.entidades.Dieta;
import nutricionista49.entidades.Paciente;

public class InternalAsignarDieta extends javax.swing.JInternalFrame {

    private PacienteData pd;
    private Paciente pac;
    private DietaData dd;
    private Dieta dietita;

//    DefaultTableModel modelo = new DefaultTableModel() {
//
//        boolean[] canEdit = new boolean[]{
//            false, false, false, false, false, false
//        };
//
//        public boolean isCellEditable(int row, int column) {
//            return canEdit[column];
//        }
//
//    };
    public InternalAsignarDieta() {
        initComponents();
        cargarComboPaciente();
        armarCabecera();
        
        jtID.setVisible(false);
        this.setLocation(95, 50);  //>>>>>> PRIMER VALOR X , SEGUNDO Y
        this.setSize(1150, 600); 
        
        tablaDietas.setShowGrid(true);
        
        jPanel2.setBackground(new Color(255,255,255,150));
        jPanel3.setBackground(new Color(255,255,255,150));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/mealplantest3.jpg"));
        Image miImagen=icono.getImage();
        jPanel1 = new javax.swing.JPanel() {

            public void paintComponent(Graphics g){

                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);

            }

        };
        jcbPacientes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jdateInicio = new com.toedter.calendar.JDateChooser();
        jdateFinal = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtPesoInicial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtPesoFinal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDietas = new javax.swing.JTable();
        jtID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtDNI = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);

        jcbPacientes.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jcbPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPacientesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel2.setText("Paciente:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel3.setText("Inicio:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel4.setText("Fin:");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel5.setText("Peso inicial:");

        jtPesoInicial.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel6.setText("Peso Final:");

        jtPesoFinal.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel7.setText("Nombre Dieta:");

        jtNombre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N

        jbGuardar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/disco-flexible3535.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/editar-codigo3535.png"))); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.setEnabled(false);
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(255, 0, 0));
        jbEliminar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/borrar3535.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/cerrar-sesion3535.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/limpiar3535.png"))); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        tablaDietas.setBackground(new java.awt.Color(255, 255, 255));
        tablaDietas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        tablaDietas.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaDietas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDietasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDietas);

        jtID.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel8.setText("DNI Paciente:");

        jtDNI.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jtDNI.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel9.setText("Seleccione un paciente");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel1.setText("LISTADO DE DIETAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

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
                .addGap(107, 107, 107)
                .addComponent(jbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addContainerGap(594, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbLimpiar))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jbGuardar)
                                .addGap(35, 35, 35)
                                .addComponent(jbModificar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(33, 33, 33))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jdateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jdateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtPesoInicial)
                                        .addComponent(jtPesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbLimpiar)))
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jdateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jdateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jtPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jtPesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jcbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbGuardar)
                            .addComponent(jbModificar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbEliminar)
                            .addComponent(jbSalir))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        DietaData dd = new DietaData();

        try {

            if (!jtNombre.getText().equals("") && jdateInicio.getDate() != null && jdateFinal.getDate() != null && !jtPesoInicial.getText().equals("") && !jtPesoFinal.getText().equals("")) {

                DietaData dietadata = new DietaData();

                String nombre;
                int pesoinicial, pesofinal;

                pac = (Paciente) jcbPacientes.getSelectedItem();
                //Paciente pacid=(Paciente) pac.getIdPaciente();
                //Paciente pacid= jcbPacientes.getSelectedItem().getIdPaciente ??

                nombre = jtNombre.getText();
                pesoinicial = Integer.parseInt(jtPesoInicial.getText());
                pesofinal = Integer.parseInt(jtPesoFinal.getText());
                LocalDate fechainicial;
                LocalDate fechafinal;

                fechainicial = jdateInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                fechafinal = jdateFinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                Dieta dieta1 = new Dieta(pac, nombre, fechainicial, fechafinal, pesoinicial, pesofinal, true);

                dietadata.guardarDieta(dieta1);

            } else {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacios");

            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar numeros en los campos ´PESO´!.");
        }

        metodoLimpiar();
        armarCabecera();


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPacientesActionPerformed


    }//GEN-LAST:event_jcbPacientesActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        DietaData dd = new DietaData();

        try{
        
        int cambiar = Integer.parseInt(jtID.getText());

        if (dd.buscarDietaID(cambiar) != null) {

//            System.out.println("mono2");

            int msj = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar esta Dieta?");

            if (msj == 0) {
//                System.out.println("mono3");
                dd.eliminarDieta(dd.buscarDietaID(cambiar).getIdDieta());
//                System.out.println("mono4");

                armarCabecera();
                metodoLimpiar();

            }

        }
        }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this, "no puede haber campos vacios");
        }

        metodoLimpiar();

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        metodoLimpiar();
        cargarComboPaciente();
        jbGuardar.setEnabled(true);
        jbSalir.setEnabled(true);
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void tablaDietasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDietasMouseClicked
        seleccionarTabla();
        jcbPacientes.removeAllItems();
        jbGuardar.setEnabled(false);
        jbModificar.setEnabled(true);
        jbEliminar.setEnabled(true);
        jbSalir.setEnabled(true);
    }//GEN-LAST:event_tablaDietasMouseClicked

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        
        try{ 

            if (!jtNombre.getText().equals("") && !jtPesoInicial.getText().equals("")&&!jtPesoFinal.getText().equals("")&&jdateFinal.getDate()!=null&& !jtID.getText().equals("")&&jdateInicio.getDate()!=null) {
            
            DietaData dd = new DietaData();
            
            int idiet;
            String nombre;
            LocalDate fechaI,fechaF;
            double pesoI,pesoF;
            boolean estado;
            
            idiet = Integer.parseInt(jtID.getText());
            
            nombre = jtNombre.getText();
            
            fechaI = jdateInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            fechaF = jdateFinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            pesoI=Double.parseDouble(jtPesoInicial.getText());
            pesoF=Double.parseDouble(jtPesoFinal.getText());
            
            estado=true;
            
            
            Dieta dieta = new Dieta(idiet, nombre, fechaI, fechaF, pesoI, pesoF, true);
            dd.ModificarDieta(dieta);
            
        } else {
            JOptionPane.showMessageDialog(null, "Error: No puede haber campos vacios!");

        }
        
           } catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(this, "Error: Solo se pueden ingresar numeros! En pesoINICIAL & pesoFinal");
           }
        
        metodoLimpiar();
        armarCabecera();
        
        
    }//GEN-LAST:event_jbModificarActionPerformed

    private void cargarComboPaciente() {

        PacienteData pd = new PacienteData();
        List<Paciente> pacientes = pd.ListarPaciente();

        for (Paciente paciente : pacientes) {
            jcbPacientes.addItem(paciente);
        }

    }

    private void armarCabecera() {

        DefaultTableModel modelo = new DefaultTableModel() {

            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false,false
            };

            public boolean isCellEditable(int row, int column) {
                return canEdit[column];
            }

        };

        modelo.addColumn("ID");
        modelo.addColumn("Dieta");
        modelo.addColumn("DNI");
        modelo.addColumn("fecha inicio");
        modelo.addColumn("fecha fin");
        modelo.addColumn("peso inicial");
        modelo.addColumn("peso a cumplir");

        tablaDietas.setModel(modelo);

        DietaData dd1 = new DietaData();

        List<Dieta> dietas = dd1.ListarDieta();

        for (Dieta dieta : dietas) {
            modelo.addRow(new Object[]{dieta.getIdDieta(), dieta.getNombre(), dieta.getPaciente().getDni(), dieta.getFechaInicial(), dieta.getFechaFinal(), dieta.getPesoInicial(), dieta.getPesoFinal()});

        }

        tablaDietas.setModel(modelo);

    }

    private void metodoLimpiar() {

        jtNombre.setText("");
        jdateInicio.setCalendar(null);
        jdateFinal.setCalendar(null);
        jtPesoInicial.setText("");
        jtPesoFinal.setText("");
        jtDNI.setText("");
//        jcbPacientes.removeAllItems();

    }

    public void seleccionarTabla() {

////////NO SABEMOS PORQUE NO FUNCIONA
//        try {
//            DefaultTableModel model = (DefaultTableModel) tablaDietas.getModel();
//            int fila = tablaDietas.getSelectedRow();
//            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) modelo.getValueAt(fila, 2));
//            jdateInicio.setDate(date);
//
//        } catch (ParseException ex) {
//            Logger.getLogger(InternalAsignarDieta.class.getName()).log(Level.SEVERE, null, ex);
//        }
/////////////////////NO SABEMOS PORQUE NO FUNCIONA
//        int fila = tablaDietas.getSelectedRow();
//        if (fila >= 0) {
//            jtNombre.setText(tablaDietas.getValueAt(fila, 0).toString()); ///>>>>con esto podemos traer todo menos el combo box y las fechas.
//            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) modelo.getValueAt(fila, 2).toString());
//            jdateInicio.setDate(date);
//        }
//////////////////////////////TRAE LA FECHA PERO SE ESTA DUBLICANDO? 
        int fila = tablaDietas.getSelectedRow();
        if (fila >= 0) {
            try {

                jtID.setText(tablaDietas.getValueAt(fila, 0).toString());
                jtNombre.setText(tablaDietas.getValueAt(fila, 1).toString()); ///>>>>con esto podemos traer todo menos el combo box y las fechas.
                jtDNI.setText(tablaDietas.getValueAt(fila, 2).toString());

                Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse((String) tablaDietas.getValueAt(fila, 3).toString()); //>>>>con modelo anda pero si comento arriba
                jdateInicio.setDate(date1);
                Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse((String) tablaDietas.getValueAt(fila, 4).toString());
                jdateFinal.setDate(date2);

                jtPesoInicial.setText(tablaDietas.getValueAt(fila, 5).toString());
                jtPesoFinal.setText(tablaDietas.getValueAt(fila, 6).toString());

                ///Testeo del combo box
//                String comboSub=tablaDietas.getValueAt(fila, 1).toString();
//                for (int i = 0; i <jcbPacientes.getItemCount();i++){
//                if(jcbPacientes.getItemAt(i).toString().equalsIgnoreCase(comboSub)){
//                jcbPacientes.setSelectedIndex(i);
//                }
//                
//                }
//                Paciente paci = new Paciente();
//                paci.setNombre(tablaDietas.getValueAt(fila, 1).toString());
//                jcbPacientes.setSelectedItem(paci.getNombre());
            } catch (ParseException ex) {
                Logger.getLogger(InternalAsignarDieta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Paciente> jcbPacientes;
    private com.toedter.calendar.JDateChooser jdateFinal;
    private com.toedter.calendar.JDateChooser jdateInicio;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPesoFinal;
    private javax.swing.JTextField jtPesoInicial;
    private javax.swing.JTable tablaDietas;
    // End of variables declaration//GEN-END:variables
}
