/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaa;

/**
 *
 * @author chris
 */
public class VMedico extends javax.swing.JFrame {

    /**
     * Creates new form pMedico
     */
    public VMedico() { 
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfConfigP = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        btnActPerfil = new javax.swing.JButton();
        configNom = new javax.swing.JTextField();
        configCorreo = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        configNac = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        configPswd = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtAlertNombre = new javax.swing.JLabel();
        txtAlertFecha = new javax.swing.JLabel();
        txtAlertCorreo = new javax.swing.JLabel();
        txtAlertContra = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jmAyuda3 = new javax.swing.JMenu();
        jfCitasMed = new javax.swing.JFrame();
        jLabel19 = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();
        btnLogout1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReporte = new javax.swing.JTable();
        btnActCitas = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        jmAyuda2 = new javax.swing.JMenu();
        txtAlertNombre1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLBienvenidoD = new javax.swing.JLabel();
        btnImagen = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLBienvenidoD1 = new javax.swing.JLabel();
        jLDiasAtencion = new javax.swing.JLabel();
        jLBienvenidoD2 = new javax.swing.JLabel();
        jLHorariosAtencion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnReportes = new javax.swing.JButton();
        btnConfigUser = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        jLabel18 = new javax.swing.JLabel();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        btnLogout = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAyuda = new javax.swing.JMenu();

        jfConfigP.setLocationByPlatform(true);
        jfConfigP.setMinimumSize(new java.awt.Dimension(410, 430));

        jPanel2.setMinimumSize(new java.awt.Dimension(407, 472));
        jPanel2.setPreferredSize(new java.awt.Dimension(407, 472));

        btnActPerfil.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        btnActPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActPerfil.setText("Actualizar");

        btnVolver.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setText("Volver");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 51));
        jLabel10.setText("Nombre");

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 51));
        jLabel14.setText("Fecha nacimiento");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 51));
        jLabel15.setText("Correo");

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 51));
        jLabel16.setText("Contraseña");

        jLabel17.setFont(new java.awt.Font("Russo One", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AcUsuario.png"))); // NOI18N
        jLabel17.setText("CONFIGURAR PERFIL");

        txtAlertNombre.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        txtAlertNombre.setForeground(new java.awt.Color(102, 0, 51));
        txtAlertNombre.setText(".");

        txtAlertFecha.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        txtAlertFecha.setForeground(new java.awt.Color(102, 0, 51));
        txtAlertFecha.setText(".");

        txtAlertCorreo.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        txtAlertCorreo.setForeground(new java.awt.Color(102, 0, 51));
        txtAlertCorreo.setText(".");

        txtAlertContra.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        txtAlertContra.setForeground(new java.awt.Color(102, 0, 51));
        txtAlertContra.setText(".");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(configNac, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(configNom, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(configPswd)
                            .addComponent(configCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(txtAlertFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlertCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlertContra, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlertNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnVolver)
                        .addGap(33, 33, 33)
                        .addComponent(btnActPerfil))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel17)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(configNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlertNombre)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(configNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(txtAlertFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(configCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(txtAlertCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(configPswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlertContra)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActPerfil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmAyuda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        jmAyuda3.setText("Ayuda");
        jMenuBar2.add(jmAyuda3);

        jfConfigP.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jfConfigPLayout = new javax.swing.GroupLayout(jfConfigP.getContentPane());
        jfConfigP.getContentPane().setLayout(jfConfigPLayout);
        jfConfigPLayout.setHorizontalGroup(
            jfConfigPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, Short.MAX_VALUE)
        );
        jfConfigPLayout.setVerticalGroup(
            jfConfigPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfConfigPLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        jfCitasMed.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jfCitasMed.setMinimumSize(new java.awt.Dimension(555, 415));

        jLabel19.setFont(new java.awt.Font("Russo One", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte.png"))); // NOI18N
        jLabel19.setText("CITAS PENDIENTES");

        btnVolver1.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        btnVolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver1.setText("Volver");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        btnLogout1.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        btnLogout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnLogout1.setText("Salir");

        tablaReporte = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {

                if(colIndex==0){
                    return false;
                }
                if(colIndex==1){
                    return false;
                }
                if(colIndex==2){
                    return false;
                }
                if(colIndex==3){
                    return false;
                }
                return true; //Disallow the editing of any cell
            }
        };
        tablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Fecha ", "Hora", "Nombre Paciente", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaReporte.getTableHeader().setResizingAllowed(false);
        tablaReporte.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaReporte);

        btnActCitas.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        btnActCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActCitas.setText("Actualizar");

        jmAyuda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        jmAyuda2.setText("Ayuda");
        jMenuBar3.add(jmAyuda2);

        jfCitasMed.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout jfCitasMedLayout = new javax.swing.GroupLayout(jfCitasMed.getContentPane());
        jfCitasMed.getContentPane().setLayout(jfCitasMedLayout);
        jfCitasMedLayout.setHorizontalGroup(
            jfCitasMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfCitasMedLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(jfCitasMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActCitas))
                .addGap(43, 43, 43))
            .addGroup(jfCitasMedLayout.createSequentialGroup()
                .addGroup(jfCitasMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jfCitasMedLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel19))
                    .addGroup(jfCitasMedLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnVolver1)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogout1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jfCitasMedLayout.setVerticalGroup(
            jfCitasMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfCitasMedLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jfCitasMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txtAlertNombre1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        txtAlertNombre1.setForeground(new java.awt.Color(102, 0, 51));
        txtAlertNombre1.setText(".");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLBienvenidoD.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLBienvenidoD.setForeground(new java.awt.Color(102, 0, 51));
        jLBienvenidoD.setText("Bienvenido, Doctor");

        jLBienvenidoD1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLBienvenidoD1.setForeground(new java.awt.Color(102, 0, 51));
        jLBienvenidoD1.setText("Días de Atención ");

        jLDiasAtencion.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLDiasAtencion.setForeground(new java.awt.Color(102, 0, 102));
        jLDiasAtencion.setText("DAYS");

        jLBienvenidoD2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLBienvenidoD2.setForeground(new java.awt.Color(102, 0, 51));
        jLBienvenidoD2.setText("Horario de Atención");

        jLHorariosAtencion.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLHorariosAtencion.setForeground(new java.awt.Color(102, 0, 102));
        jLHorariosAtencion.setText("HORAS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLBienvenidoD1)
                    .addComponent(jLBienvenidoD2))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLDiasAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addComponent(jLHorariosAtencion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBienvenidoD1)
                    .addComponent(jLDiasAtencion))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBienvenidoD2)
                    .addComponent(jLHorariosAtencion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 51));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuAd.png"))); // NOI18N
        jLabel12.setText("Acciones");

        btnReportes.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte.png"))); // NOI18N
        btnReportes.setText("Citas");

        btnConfigUser.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        btnConfigUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configUser.png"))); // NOI18N
        btnConfigUser.setText("Configurar Perfil");
        btnConfigUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfigUser)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel12)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfigUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 51));
        jLabel11.setText("Fecha Actual");

        rSLabelFecha1.setForeground(new java.awt.Color(102, 0, 102));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 51));
        jLabel18.setText("Hora en sistema");

        rSLabelHora1.setForeground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSLabelFecha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(17, 17, 17)
                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btnLogout.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnLogout.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogout)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLBienvenidoD)
                                        .addGap(43, 43, 43)
                                        .addComponent(btnImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLBienvenidoD)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        jmAyuda.setText("Ayuda");
        jMenuBar1.add(jmAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfigUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigUserActionPerformed
        // TODO add your handling code here: 
        
    }//GEN-LAST:event_btnConfigUserActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolver1ActionPerformed

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
            java.util.logging.Logger.getLogger(VMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActCitas;
    public javax.swing.JButton btnActPerfil;
    public javax.swing.JButton btnConfigUser;
    public javax.swing.JButton btnImagen;
    public javax.swing.JButton btnLogout;
    public javax.swing.JButton btnLogout1;
    public javax.swing.JButton btnReportes;
    public javax.swing.JButton btnVolver;
    public javax.swing.JButton btnVolver1;
    public javax.swing.JTextField configCorreo;
    public com.toedter.calendar.JDateChooser configNac;
    public javax.swing.JTextField configNom;
    public javax.swing.JTextField configPswd;
    public javax.swing.JLabel jLBienvenidoD;
    public javax.swing.JLabel jLBienvenidoD1;
    public javax.swing.JLabel jLBienvenidoD2;
    public javax.swing.JLabel jLDiasAtencion;
    public javax.swing.JLabel jLHorariosAtencion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    public javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JFrame jfCitasMed;
    public javax.swing.JFrame jfConfigP;
    public javax.swing.JMenu jmAyuda;
    public javax.swing.JMenu jmAyuda2;
    public javax.swing.JMenu jmAyuda3;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    public javax.swing.JTable tablaReporte;
    public javax.swing.JLabel txtAlertContra;
    public javax.swing.JLabel txtAlertCorreo;
    public javax.swing.JLabel txtAlertFecha;
    public javax.swing.JLabel txtAlertNombre;
    public javax.swing.JLabel txtAlertNombre1;
    // End of variables declaration//GEN-END:variables
}
