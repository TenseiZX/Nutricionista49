/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package nutricionista49.vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import nutricionista49.AccesoDatos.Conexion;
import nutricionista49.AccesoDatos.PacienteData;
import nutricionista49.entidades.Paciente;


public class InternalPaciente extends javax.swing.JInternalFrame {

    
 
    
    private PacienteData pd;
    private Paciente pac=null;
    
//    private Paciente pac1=null;
    
    
    public InternalPaciente(PacienteData pd) {
        initComponents();
        armarCabecera(); 
        
//        this.pac=pac;
        this.pd=pd;
        PacienteData pac1=new PacienteData();
        
//        pd= new PacienteData();
        
        this.setLocation(95, 50);  //>>>>>> PRIMER VALOR X , SEGUNDO Y
        this.setSize(1150, 610); //>>>> PRIMER VALOR ANCHO, SEGUNDO VALOR ALTO
        tablaPacientes.setShowGrid(true);
        jtID.setVisible(false);
        
        jPanel2.setBackground(new Color(255,255,255,150));
        
        
        
 ////////////////APARTADO VISUAL DE LA TABLA       
//        tablaPacientes.setBackground(new Color(0,0,0,0));
//        
//        ((DefaultTableCellRenderer)tablaPacientes.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0)); 
//        tablaPacientes.setGridColor(Color.black);
//        tablaPacientes.setForeground(Color.green);
//        
//        jScrollPane1.setBackground(new Color(0,0,0,0));
//        jScrollPane1.setOpaque(false);
//        jScrollPane1.getViewport().setOpaque(true);
//        
//        
//        tablaPacientes.setOpaque(false);
//         ((DefaultTableCellRenderer)tablaPacientes.getDefaultRenderer(Object.class)).setOpaque(false);
//           setBackground(new Color(0,0,0,0));
         
         
         
         
 /////////////////////////////////////////////////// 
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/Imagentest1.jpg"));
        Image miImagen=icono.getImage();
        jPanel1 = new javax.swing.JPanel() {

            public void paintComponent(Graphics g){

                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);

            }

        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtDireccion = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jtID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 15)); // NOI18N
        jLabel1.setText("DNI:");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 15)); // NOI18N
        jLabel2.setText("Apellido:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 15)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 15)); // NOI18N
        jLabel4.setText("Dirección:");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 15)); // NOI18N
        jLabel5.setText("Telefono:");

        jtDni.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N

        jtApellido.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N

        jtNombre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N

        jtDireccion.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N

        jtTelefono.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/buscando3535.png"))); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

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

        tablaPacientes.setBackground(new java.awt.Color(255, 255, 255));
        tablaPacientes.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaPacientes);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel7.setText("Apartado Pacientes");

        jbSalir.setBackground(new java.awt.Color(255, 255, 255));
        jbSalir.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/cerrar-sesion3535.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtID.setEditable(false);

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/limpiar3535.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel6.setText("Lista de pacientes:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/salud3535.png"))); // NOI18N
        jLabel8.setText("Clinica Cornyshot");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(408, 408, 408))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addGap(38, 38, 38)
                                                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(2, 2, 2)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jbGuardar)
                                .addGap(34, 34, 34)
                                .addComponent(jbModificar)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jbEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(524, 524, 524)
                        .addComponent(jbSalir)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbBuscar)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbGuardar)
                            .addComponent(jbModificar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbEliminar)
                .addGap(38, 38, 38)
                .addComponent(jbSalir)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(660, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        PacienteData pac1=new PacienteData();
        try{ 

            if (!jtNombre.getText().equals("") && !jtApellido.getText().equals("") && !jtDni.getText().equals("")&&!jtDireccion.getText().equals("")&&!jtTelefono.getText().equals("")) {
            PacienteData pac = new PacienteData();
            String nombre, apellido,domicilio,telefono;
            int dni;
            nombre = jtNombre.getText();
            apellido = jtApellido.getText();
            dni = Integer.parseInt(jtDni.getText());
            domicilio=jtDireccion.getText();
            telefono=jtTelefono.getText();
            
            Paciente paciente = new Paciente(dni, apellido, nombre, domicilio, telefono,true);
            pac.guardarPaciente(paciente);
            
        } else {
            JOptionPane.showMessageDialog(null, "Error: No puede haber campos vacios.");

        }
        
           } catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(this, "Error: Debe ingresar numeros en el campo DNI!");
           }
        metodoLimpiar();
        armarCabecera();
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
        try {
            int cambiarAInactivo = Integer.parseInt(jtDni.getText());
            if (pd.buscarPacientePorDni(cambiarAInactivo) != null) {
                int msj = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar este Paciente?");

                if (msj == 0) {
                    pd.eliminarPaciente(pd.buscarPacientePorDni(cambiarAInactivo).getIdPaciente());
                    armarCabecera();
                    jtDni.setText("");
                    jtApellido.setText("");
                    jtNombre.setText("");
                    jtDireccion.setText("");
                    jtTelefono.setText("");
                    
                    
                }

            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: No puede haber campos vacios");
        }
        
        metodoLimpiar();
        
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        jbGuardar.setEnabled(false);
        jbModificar.setEnabled(true);
        jbEliminar.setEnabled(true);
        jbSalir.setEnabled(true);
        
        try {
            Integer dni = Integer.parseInt(jtDni.getText());
            Paciente pac = pd.buscarPacientePorDni(dni);

            if (pac != null) {

                jtApellido.setText(pac.getApellido());
                jtNombre.setText(pac.getNombre());
                jtDireccion.setText(pac.getDomicilio());
                jtTelefono.setText(pac.getTelefono());
                jtID.setText(String.valueOf(pac.getIdPaciente()));
                
                

            }else{
            metodoLimpiar();
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar un numero valido.");
            metodoLimpiar();
        }
        
        
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        
        try{ 

            if (!jtNombre.getText().equals("") && !jtApellido.getText().equals("") && !jtDni.getText().equals("") && !jtDireccion.getText().equals("")&&!jtTelefono.getText().equals("")) {
            PacienteData paciente1 = new PacienteData();
            String nombre, apellido,domicilio,telefono;
            int dni,idpac;
            
            dni = Integer.parseInt(jtDni.getText());
            idpac = Integer.parseInt(jtID.getText());
            nombre = jtNombre.getText();
            apellido = jtApellido.getText();
            domicilio = jtDireccion.getText();
            telefono = jtTelefono.getText();
            
            
            
            
            Paciente paciente = new Paciente(idpac, dni, apellido, nombre, domicilio, telefono,true);
            paciente1.ModificarPaciente(paciente);
        } else {
            JOptionPane.showMessageDialog(null, "Error: No puede haber campos vacios");

        }
        
           } catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(this, "Error: se excedio el limite de caracteres permitidos");
           }
        
        metodoLimpiar();
        armarCabecera();

//Paciente pac=null;

//PacienteData pac1=new PacienteData();
//
//try{
//
//        Integer dni= Integer.parseInt(jtDni.getText());
//        String apellido=jtApellido.getText();
//        String nombre=jtNombre.getText();
//        String direccion=jtDireccion.getText();
//        String telefono=jtTelefono.getText();
//        
//        if(nombre.isEmpty()||apellido.isEmpty()||direccion.isEmpty()||telefono.isEmpty()){
//        
//        JOptionPane.showMessageDialog(null, "No puede haber campos vacios ");
//        return;
//        }
//        
//        
//        
//        if(pac == null){
//        
//        pac=new Paciente(dni, apellido, nombre, direccion, telefono,true);
//        pd.guardarPaciente(pac);
//        
//        }else{
//        pac.setDni(dni);
//        pac.setApellido(apellido);
//        pac.setNombre(nombre);
//        pac.setDomicilio(direccion);
//        pac.setTelefono(telefono);
//        pd.ModificarPaciente(pac);
//        }
//        }catch (NumberFormatException ex){
//        JOptionPane.showMessageDialog(null, "Debe ingresar un dni valido ");
//       
//        }
//        
//        armarCabecera();
//        metodoLimpiar();
        
        


        
        
        
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jbGuardar.setEnabled(true);
        jbSalir.setEnabled(true);
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        
        metodoLimpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void metodoLimpiar(){
    jtDni.setText("");
    jtApellido.setText("");
    jtNombre.setText("");
    jtDireccion.setText("");
    jtTelefono.setText("");
    }

    
    private void armarCabecera(){  //>>>>>>>>>>>>>>> lo usamos para pruebas
    
        DefaultTableModel modelo=new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false; // 
            }
        
        };
        
       
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Telefono");
        
        
        
        tablaPacientes.setModel(modelo);
        
        PacienteData pd1=new PacienteData();
        
        List<Paciente> pacientes= pd1.ListarPaciente();
        
        for (Paciente paciente : pacientes) {
                modelo.addRow(new Object[]{paciente.getDni(),paciente.getApellido(), paciente.getNombre(),paciente.getDomicilio(),paciente.getTelefono()});
                
            }
        
        tablaPacientes.setModel(modelo);
        
        
    
    
    }
    
//    private void cargarComboPaciente() {   >>>>>>>>>>>>lo usamos para pruebas
//        
//        try{
//        Paciente pacombo=new Paciente();
//        pacombo.setNombre("Seleccione al paciente");
//        PacienteData pacdata= new PacienteData();
//        List<Paciente> pacientes=pacdata.ListarPaciente();
//        jcbPaciente.addItem(pacombo);
//        for (Paciente paciente : pacientes) {
//            
//            jcbPaciente.addItem(paciente);
//        }
//        
//        } catch (NullPointerException ex) {
//        JOptionPane.showMessageDialog(null,"error" +ex);
//        }
//        
//    }
    
//    public void mostrarPacientesInternal(JTable tablapac){  //>>>>>>>>>>>>>>> metodo mostrar desde una internal frame
//    
//        Conexion objetoConexion=new Conexion();
//        
//    DefaultTableModel modelo=new DefaultTableModel(){
//            @Override
//            public boolean isCellEditable(int i, int i1) {
//                return false; // 
//            }
//        
//        };
//        
//        
//    String sql="";
//    
//    modelo.addColumn("ID");
//    modelo.addColumn("DNI");
//    modelo.addColumn("APELLIDO");
//    modelo.addColumn("NOMBRE");
//    modelo.addColumn("DOMICILIO");
//    modelo.addColumn("TELEFONO");
//    
//    tablapac.setModel(modelo);
//    
//    sql="select * from paciente where estado=1;";
//    
//    String [] datos = new String[6]; 
//    
//    Statement st;
//    
//    try {
//            st= objetoConexion.getConexion().createStatement();
//            ResultSet rs=st.executeQuery(sql);
//            
//            while(rs.next()){
//            datos [0]=rs.getString(1);
//            datos [1]=rs.getString(2);
//            datos [2]=rs.getString(3);
//            datos [3]=rs.getString(4);
//            datos [4]=rs.getString(5);
//            datos [5]=rs.getString(6);
//            
//            modelo.addRow(datos);
//            }
//            
//            tablapac.setModel(modelo);
//            
//            
//            
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Error: al acceder a los datos de la base de datos");
//        }
//    
//    
//    }
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JTable tablaPacientes;
    // End of variables declaration//GEN-END:variables
}
