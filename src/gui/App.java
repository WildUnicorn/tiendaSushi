package gui;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import model.Cliente;
import model.Data;
import model.Producto;
import model.TMAdmin;
import model.Tipo;

/**
 *
 * @author Piaa FernanDaa
 */
public class App extends javax.swing.JFrame {

   private Data d;
   private String passAdm = "12345";
   private String usuAdm = "admi";
   
    public App() {
        initComponents();
        
       try {
           d = new Data();
           
           cargarCombo();
       } catch (SQLException ex) {
           Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
       }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPedido = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        tab2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        lblSushi2 = new javax.swing.JLabel();
        lblSushi3 = new javax.swing.JLabel();
        lblSushi1 = new javax.swing.JLabel();
        lblSushi7 = new javax.swing.JLabel();
        lblSushi5 = new javax.swing.JLabel();
        lblSushi4 = new javax.swing.JLabel();
        lblSushi8 = new javax.swing.JLabel();
        lblSushi9 = new javax.swing.JLabel();
        lblSushi10 = new javax.swing.JLabel();
        lblSushi13 = new javax.swing.JLabel();
        lblSushi14 = new javax.swing.JLabel();
        lblSushi15 = new javax.swing.JLabel();
        lblSushi16 = new javax.swing.JLabel();
        lblSushi17 = new javax.swing.JLabel();
        lblSushi18 = new javax.swing.JLabel();
        lblSushi6 = new javax.swing.JLabel();
        lblSushi12 = new javax.swing.JLabel();
        lblSushi11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblPrecioSushi = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        spnUniSushi = new javax.swing.JSpinner();
        lblNombreSushi = new javax.swing.JLabel();
        btnAgregar1 = new javax.swing.JButton();
        btnFinalizar1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        lblIdSushi = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtIngredientesSushi = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        lblAgre1 = new javax.swing.JLabel();
        lblAgre2 = new javax.swing.JLabel();
        lblAgre3 = new javax.swing.JLabel();
        lblAgre4 = new javax.swing.JLabel();
        lblAgre5 = new javax.swing.JLabel();
        lblAgre6 = new javax.swing.JLabel();
        lblAgre7 = new javax.swing.JLabel();
        lblAgre8 = new javax.swing.JLabel();
        lblAgre9 = new javax.swing.JLabel();
        lblAgre10 = new javax.swing.JLabel();
        lblAgre11 = new javax.swing.JLabel();
        lblAgre12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblPrecioAgregado = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        spnUniAgre = new javax.swing.JSpinner();
        lblNombreAgregado = new javax.swing.JLabel();
        btnAgregar2 = new javax.swing.JButton();
        btnFinalizar2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cboBebidas = new javax.swing.JComboBox();
        cboJugos = new javax.swing.JComboBox();
        cboCervezas = new javax.swing.JComboBox();
        cboOtros = new javax.swing.JComboBox();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtPrecioBebida = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        spnBebida = new javax.swing.JSpinner();
        lblNombreBebida = new javax.swing.JLabel();
        btnAgregar3 = new javax.swing.JButton();
        btnFinalizar3 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMSalir = new javax.swing.JMenuItem();
        jAdmin = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEliminarAdmi = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabProductoAdmi = new javax.swing.JTable();
        btnEliminarAdmin = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        txtidEliminar = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreAgregarAdmi = new javax.swing.JTextField();
        txtPrecioAgregarAdmi = new javax.swing.JTextField();
        btnAgregarAdmi = new javax.swing.JButton();
        cboTipoAdmi = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtEditarAdmi = new javax.swing.JTextField();
        lblPreActAdmi = new javax.swing.JLabel();
        txtPreNueAdmi = new javax.swing.JTextField();
        btnActPreAdmi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuAdmi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPassAdmi = new javax.swing.JTextField();
        btnIngresarAdmi = new javax.swing.JButton();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jBoleta = new javax.swing.JFrame();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabBoleta = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblRandom = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidoCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        txtRutCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bgMedioPago = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnPedido = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Arma tu pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 2, 12))); // NOI18N
        jPanel2.setName("Pedido"); // NOI18N

        lblSushi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/camaronTempura.jpg"))); // NOI18N
        lblSushi2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi2MouseReleased(evt);
            }
        });

        lblSushi3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/camaronCibulette.jpg"))); // NOI18N
        lblSushi3.setText("img3");
        lblSushi3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi3MouseReleased(evt);
            }
        });

        lblSushi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/camaronPalta.jpg"))); // NOI18N
        lblSushi1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi1MouseReleased(evt);
            }
        });

        lblSushi7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salmonPalta.jpg"))); // NOI18N
        lblSushi7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi7MouseReleased(evt);
            }
        });

        lblSushi5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/kanikamaTempura.jpg"))); // NOI18N
        lblSushi5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi5MouseReleased(evt);
            }
        });

        lblSushi4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/kanikamaPalta.png"))); // NOI18N
        lblSushi4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi4MouseReleased(evt);
            }
        });

        lblSushi8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salmonTempura.jpg"))); // NOI18N
        lblSushi8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi8MouseReleased(evt);
            }
        });

        lblSushi9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salomCibulette.jpg"))); // NOI18N
        lblSushi9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi9MouseReleased(evt);
            }
        });

        lblSushi10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/polloPalta.jpg"))); // NOI18N
        lblSushi10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi10MouseReleased(evt);
            }
        });

        lblSushi13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pandaRoll.jpg"))); // NOI18N
        lblSushi13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi13MouseReleased(evt);
            }
        });

        lblSushi14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/sushi17_1.jpg"))); // NOI18N
        lblSushi14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi14MouseReleased(evt);
            }
        });

        lblSushi15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/sushi18_1.jpg"))); // NOI18N
        lblSushi15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi15MouseReleased(evt);
            }
        });

        lblSushi16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/sushi10_1.jpg"))); // NOI18N
        lblSushi16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi16MouseReleased(evt);
            }
        });

        lblSushi17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/sushi16_2.jpg"))); // NOI18N
        lblSushi17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi17MouseReleased(evt);
            }
        });

        lblSushi18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/hamburgesa.jpg"))); // NOI18N
        lblSushi18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi18MouseReleased(evt);
            }
        });

        lblSushi6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/kanikamaCibulette.jpg"))); // NOI18N
        lblSushi6.setText("img6");
        lblSushi6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi6MouseReleased(evt);
            }
        });

        lblSushi12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/polloCibulette.jpg"))); // NOI18N
        lblSushi12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi12MouseReleased(evt);
            }
        });

        lblSushi11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/polloTempura.jpg"))); // NOI18N
        lblSushi11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSushi11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSushi11MouseReleased(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 2, 11))); // NOI18N

        jLabel9.setText("Nombre:");

        jLabel10.setText("Precio:");

        lblPrecioSushi.setText("X");

        jLabel11.setText("Unidades:");

        spnUniSushi.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spnUniSushi.setToolTipText("");

        lblNombreSushi.setText("X");

        btnAgregar1.setText("Agregar a la compra");
        btnAgregar1.setEnabled(false);

        btnFinalizar1.setText("Finalizar compra");
        btnFinalizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizar1ActionPerformed(evt);
            }
        });

        jLabel29.setText("ID:");

        lblIdSushi.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblIdSushi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lblNombreSushi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblPrecioSushi, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFinalizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(spnUniSushi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(lblIdSushi)
                    .addComponent(btnAgregar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombreSushi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinalizar1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecioSushi)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(spnUniSushi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        txtIngredientesSushi.setEditable(false);
        txtIngredientesSushi.setColumns(20);
        txtIngredientesSushi.setFont(new java.awt.Font("Century Gothic", 2, 13)); // NOI18N
        txtIngredientesSushi.setRows(5);
        txtIngredientesSushi.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingredientes..."));
        jScrollPane3.setViewportView(txtIngredientesSushi);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblSushi13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSushi14, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSushi15, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSushi16))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSushi8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(lblSushi1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSushi2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lblSushi3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSushi4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lblSushi9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSushi10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblSushi7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSushi11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSushi17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSushi5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSushi18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSushi12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSushi6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSushi1)
                        .addComponent(lblSushi2)
                        .addComponent(lblSushi3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSushi4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSushi6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSushi5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSushi11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSushi10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSushi12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSushi8)
                    .addComponent(lblSushi9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSushi7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblSushi17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSushi18, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSushi13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblSushi14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSushi16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSushi15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        tab2.addTab("SUSHI", jPanel4);

        lblAgre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/papasPequeñas.jpg"))); // NOI18N
        lblAgre1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAgre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAgre1MouseReleased(evt);
            }
        });

        lblAgre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/papasMedianas.jpg"))); // NOI18N
        lblAgre2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAgre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAgre2MouseReleased(evt);
            }
        });

        lblAgre3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/papasFamiliares.jpg"))); // NOI18N
        lblAgre3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAgre3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAgre3MouseReleased(evt);
            }
        });

        lblAgre4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/papasMega.jpg"))); // NOI18N
        lblAgre4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAgre4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAgre4MouseReleased(evt);
            }
        });

        lblAgre5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/4empanadas.jpg"))); // NOI18N
        lblAgre5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAgre5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAgre5MouseReleased(evt);
            }
        });

        lblAgre6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/8empanadas.jpg"))); // NOI18N
        lblAgre6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAgre6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAgre6MouseReleased(evt);
            }
        });

        lblAgre7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/12empanadas.jpg"))); // NOI18N
        lblAgre7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAgre7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAgre7MouseReleased(evt);
            }
        });

        lblAgre8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/arrollado.jpg"))); // NOI18N
        lblAgre8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAgre8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAgre8MouseReleased(evt);
            }
        });

        lblAgre9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/6gyosasPollo.jpg"))); // NOI18N
        lblAgre9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAgre9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAgre9MouseReleased(evt);
            }
        });

        lblAgre10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/12gyosasPollo.jpg"))); // NOI18N
        lblAgre10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAgre10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAgre10MouseReleased(evt);
            }
        });

        lblAgre11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/6gyosasCerdo.jpg"))); // NOI18N
        lblAgre11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAgre11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAgre11MouseReleased(evt);
            }
        });

        lblAgre12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/12gyosasCerdo.jpg"))); // NOI18N
        lblAgre12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAgre12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAgre12MouseReleased(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 2, 11))); // NOI18N

        jLabel12.setText("Nombre:");

        jLabel13.setText("Precio:");

        lblPrecioAgregado.setText("X");

        jLabel14.setText("Unidades:");

        spnUniAgre.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spnUniAgre.setToolTipText("");

        lblNombreAgregado.setText("X");

        btnAgregar2.setText("Agregar a la compra");
        btnAgregar2.setEnabled(false);

        btnFinalizar2.setText("Finalizar compra");
        btnFinalizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombreAgregado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(lblPrecioAgregado, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFinalizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(spnUniAgre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(lblNombreAgregado))
                    .addComponent(btnAgregar2))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPrecioAgregado)
                        .addComponent(btnFinalizar2)))
                .addGap(9, 9, 9)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(spnUniAgre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblAgre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAgre2))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblAgre9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblAgre10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblAgre5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblAgre6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAgre3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAgre7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAgre11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAgre4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAgre8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAgre12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 177, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgre1)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblAgre3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAgre2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAgre4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAgre7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAgre8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAgre11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAgre12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAgre6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lblAgre5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAgre9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAgre10))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        tab2.addTab("AGREGADOS", jPanel5);

        jLabel15.setText("Bebidas:");

        jLabel16.setText("Jugos:");

        jLabel17.setText("Otros:");

        jLabel18.setText("Cervezas:");

        cboBebidas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar..." }));

        cboJugos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar..." }));

        cboCervezas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar..." }));

        cboOtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        cboOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboOtrosActionPerformed(evt);
            }
        });

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 2, 11))); // NOI18N

        jLabel19.setText("Nombre:");

        jLabel20.setText("Precio:");

        txtPrecioBebida.setText("X");

        jLabel21.setText("Unidades:");

        spnBebida.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spnBebida.setToolTipText("");

        lblNombreBebida.setText("X");

        btnAgregar3.setText("Agregar a la compra");

        btnFinalizar3.setText("Finalizar compra");
        btnFinalizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombreBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addComponent(btnAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(txtPrecioBebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFinalizar3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(spnBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(lblNombreBebida))
                    .addComponent(btnAgregar3))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecioBebida)
                        .addComponent(btnFinalizar3)))
                .addGap(9, 9, 9)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(spnBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboBebidas, 0, 209, Short.MAX_VALUE)
                    .addComponent(cboJugos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboCervezas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboOtros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(405, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(171, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cboBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cboJugos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cboCervezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(490, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(163, 163, 163)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(313, Short.MAX_VALUE)))
        );

        tab2.addTab("BEBIDAS", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tab2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu2.setText("Archivo");
        jMenu2.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N

        jMSalir.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMenu2.add(jMSalir);

        jMenuBar2.add(jMenu2);

        jPedido.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jPedidoLayout = new javax.swing.GroupLayout(jPedido.getContentPane());
        jPedido.getContentPane().setLayout(jPedidoLayout);
        jPedidoLayout.setHorizontalGroup(
            jPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPedidoLayout.setVerticalGroup(
            jPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar producto"));

        jLabel1.setText("Nombre:");

        txtEliminarAdmi.setEnabled(false);
        txtEliminarAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarAdmiActionPerformed(evt);
            }
        });
        txtEliminarAdmi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEliminarAdmiKeyReleased(evt);
            }
        });

        tabProductoAdmi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabProductoAdmi.setEnabled(false);
        tabProductoAdmi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabProductoAdmiMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tabProductoAdmi);

        btnEliminarAdmin.setText("Eliminar");
        btnEliminarAdmin.setEnabled(false);
        btnEliminarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAdminActionPerformed(evt);
            }
        });

        jLabel31.setText("ID:");

        txtidEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEliminarAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar)
                            .addComponent(txtidEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEliminarAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtidEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addGap(5, 5, 5)
                .addComponent(btnEliminarAdmin))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar producto"));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio:");

        jLabel4.setText("Tipo: ");

        txtNombreAgregarAdmi.setEnabled(false);

        txtPrecioAgregarAdmi.setEnabled(false);

        btnAgregarAdmi.setText("Agregar");
        btnAgregarAdmi.setEnabled(false);
        btnAgregarAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAdmiActionPerformed(evt);
            }
        });

        cboTipoAdmi.setEditable(true);
        cboTipoAdmi.setEnabled(false);
        cboTipoAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoAdmiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecioAgregarAdmi, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(cboTipoAdmi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(btnAgregarAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(100, 100, 100)
                        .addComponent(txtNombreAgregarAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreAgregarAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecioAgregarAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarAdmi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboTipoAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar precio"));
        jPanel9.setEnabled(false);

        jLabel5.setText("ID:");
        jLabel5.setEnabled(false);

        txtEditarAdmi.setEnabled(false);
        txtEditarAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditarAdmiActionPerformed(evt);
            }
        });

        lblPreActAdmi.setText("Precio actual : $00000");
        lblPreActAdmi.setEnabled(false);

        txtPreNueAdmi.setEnabled(false);

        btnActPreAdmi.setText("Actualizar precio");
        btnActPreAdmi.setEnabled(false);
        btnActPreAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActPreAdmiActionPerformed(evt);
            }
        });

        jLabel7.setText("Precio nuevo:");
        jLabel7.setEnabled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEditarAdmi, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(txtPreNueAdmi))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnActPreAdmi)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPreActAdmi)
                        .addContainerGap())))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEditarAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPreActAdmi))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreNueAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActPreAdmi)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Usuario:");

        jLabel8.setText("Contraseña: ");

        txtPassAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassAdmiActionPerformed(evt);
            }
        });
        txtPassAdmi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassAdmiKeyReleased(evt);
            }
        });

        btnIngresarAdmi.setText("Ingresar");
        btnIngresarAdmi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnIngresarAdmiMouseReleased(evt);
            }
        });
        btnIngresarAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAdmiActionPerformed(evt);
            }
        });

        jMenu4.setText("Archivo");

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar4.add(jMenu4);

        jAdmin.setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout jAdminLayout = new javax.swing.GroupLayout(jAdmin.getContentPane());
        jAdmin.getContentPane().setLayout(jAdminLayout);
        jAdminLayout.setHorizontalGroup(
            jAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAdminLayout.createSequentialGroup()
                .addGroup(jAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jAdminLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPassAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnIngresarAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jAdminLayout.setVerticalGroup(
            jAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUsuAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtPassAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarAdmi))
                .addGap(12, 12, 12)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Su compra"));

        tabBoleta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabBoleta);

        jLabel22.setText("Total: ");

        lblTotal.setText("0000");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal)
                        .addGap(107, 107, 107))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(lblTotal)))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos cliente"));

        jLabel23.setText("Nombre:");

        jLabel24.setText("Apellido:");

        jLabel25.setText("Telefono:");

        jLabel26.setText("Direccion:");

        jLabel27.setText("Numero de orden:");

        lblRandom.setText("RANDOM");

        txtNombreCliente.setEnabled(false);

        txtApellidoCliente.setEnabled(false);

        txtTelefonoCliente.setEnabled(false);
        txtTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoClienteActionPerformed(evt);
            }
        });

        txtDireccionCliente.setEnabled(false);

        jLabel28.setText("Medio de pago: ");

        bgMedioPago.add(jRadioButton1);
        jRadioButton1.setText("Debito");
        jRadioButton1.setEnabled(false);

        bgMedioPago.add(jRadioButton2);
        jRadioButton2.setText("Credito");
        jRadioButton2.setEnabled(false);

        bgMedioPago.add(jRadioButton3);
        jRadioButton3.setText("Efectivo");
        jRadioButton3.setEnabled(false);

        jLabel30.setText("Rut:");

        txtRutCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutClienteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccionCliente))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel28))
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton3))
                            .addComponent(lblRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCliente)
                            .addComponent(txtApellidoCliente)
                            .addComponent(txtTelefonoCliente)
                            .addComponent(txtRutCliente))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRandom)
                    .addComponent(jLabel27))
                .addGap(11, 11, 11)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel28))
                .addContainerGap())
        );

        jButton1.setText("Confirmar compra");
        jButton1.setEnabled(false);

        javax.swing.GroupLayout jBoletaLayout = new javax.swing.GroupLayout(jBoleta.getContentPane());
        jBoleta.getContentPane().setLayout(jBoletaLayout);
        jBoletaLayout.setHorizontalGroup(
            jBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBoletaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jBoletaLayout.setVerticalGroup(
            jBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBoletaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jBoletaLayout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        btnPedido.setBackground(new java.awt.Color(255, 51, 153));
        btnPedido.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logoPedido.jpg"))); // NOI18N
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        lblImagen.setBackground(new java.awt.Color(255, 204, 153));
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.jpg"))); // NOI18N

        txtDesc.setEditable(false);
        txtDesc.setColumns(20);
        txtDesc.setFont(new java.awt.Font("Century Gothic", 2, 13)); // NOI18N
        txtDesc.setLineWrap(true);
        txtDesc.setRows(5);
        txtDesc.setText("Ven a maravillarte con tu sushi favorito, tenemos deliveriy para que puedas disfrutar en tu hogar de nuestros deliciosos productos! Hecha un vistazo a la variedad de sabores que te ofrecemos. Sabemos que te van a encantar...");
        jScrollPane1.setViewportView(txtDesc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Ingresar como Administrador");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        jPedido.setVisible(true);
        jPedido.setBounds(0, 0, 760, 730);
        jPedido.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jAdmin.setVisible(true);
        jAdmin.setBounds(0, 0, 700, 600);
        jAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
        jPedido.setVisible(false);
    }//GEN-LAST:event_jMSalirActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jAdmin.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnIngresarAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAdmiActionPerformed
        if (txtUsuAdmi.getText().equals(usuAdm) && txtPassAdmi.getText().equals(passAdm)){
            try {
                txtEditarAdmi.setEnabled(true);
                txtEliminarAdmi.setEnabled(true);
                txtNombreAgregarAdmi.setEnabled(true);
                txtPreNueAdmi.setEnabled(true);
                txtPrecioAgregarAdmi.setEnabled(true);
                tabProductoAdmi.setEnabled(true);
                btnAgregarAdmi.setEnabled(true);
                btnEliminarAdmin.setEnabled(true);
                btnActPreAdmi.setEnabled(true);
                cboTipoAdmi.setEnabled(true);
                txtPassAdmi.setText(null);
                txtUsuAdmi.setText(null);
                cargarTablaProducto(d.getProductos());
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
        }else{
            JOptionPane.showMessageDialog(
                    jAdmin, 
                    "Datos de usuario incorrectos", 
                    "Error en inicio de sesion", 
                    ERROR_MESSAGE
            );
            txtPassAdmi.setText(null);
            txtUsuAdmi.setText(null);
            txtUsuAdmi.requestFocus();
        }
    }//GEN-LAST:event_btnIngresarAdmiActionPerformed

    private void btnIngresarAdmiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarAdmiMouseReleased

    
    }//GEN-LAST:event_btnIngresarAdmiMouseReleased

    private void cboOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboOtrosActionPerformed

    }//GEN-LAST:event_cboOtrosActionPerformed

    private void txtEliminarAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarAdmiActionPerformed
       try {
           String filtro = txtEliminarAdmi.getText();
           List<Producto> lista = d.BuscarProducto(filtro);
           cargarTablaProducto(lista);
       } catch (SQLException ex) {
           Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_txtEliminarAdmiActionPerformed

    private void btnActPreAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActPreAdmiActionPerformed
       try {
           Producto p = new Producto();
           
           int id = p.getId();
           String nombre = p.getNombre();
           int tipo = p.getIdTipo();
           String strPrecioNuevo = txtEditarAdmi.getText();
           int precio = Integer.parseInt(strPrecioNuevo);
           
           Producto nuevo = new Producto(id, nombre, precio, tipo);
           d.actualizarPrecioProducto(nuevo);
           
           cargarTablaProducto(d.getProductos());
       } catch (SQLException ex) {
           Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnActPreAdmiActionPerformed

    private void btnAgregarAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAdmiActionPerformed
       try {
           Producto nuevo = new Producto();
           
           nuevo.setNombre(txtNombreAgregarAdmi.getText());
           
           String precioStr = txtPrecioAgregarAdmi.getText();
           int precio = Integer.parseInt(precioStr);
           
           Tipo t = (Tipo) cboTipoAdmi.getSelectedItem();
           int idTipo = t.getId();
           
           nuevo.setPrecio(precio);
           nuevo.setId(idTipo);
          
       
           d.crearProducto(nuevo);
           cargarTablaProducto(d.getProductos());
       } catch (SQLException ex) {
           Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnAgregarAdmiActionPerformed

    private void btnEliminarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAdminActionPerformed
       try {
           String strId = txtidEliminar.getText();
           int id = Integer.parseInt(strId);
           
           d.eliminarProducto(id);
           txtEliminarAdmi.setText(null);
           cargarTablaProducto(d.getProductos());
           JOptionPane.showMessageDialog(this, "Eliminado con exito");
       } catch (SQLException ex) {
           Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnEliminarAdminActionPerformed

    private void txtTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoClienteActionPerformed

    private void btnFinalizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizar1ActionPerformed
        jBoleta.setVisible(true);
        jBoleta.setBounds(0, 0, 600, 500);
        jBoleta.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnFinalizar1ActionPerformed

    private void btnFinalizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizar2ActionPerformed
        jBoleta.setVisible(true);
        jBoleta.setBounds(0, 0, 600, 500);
        jBoleta.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnFinalizar2ActionPerformed

    private void btnFinalizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizar3ActionPerformed
        jBoleta.setVisible(true);
        jBoleta.setBounds(0, 0, 600, 500);
        jBoleta.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnFinalizar3ActionPerformed

    private void lblSushi1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi1MouseReleased
        txtIngredientesSushi.setText("Camaron - Queso philadelphia - Palta  *  Sushi frio");
        lblIdSushi.setText("1");
        lblNombreSushi.setText("Camaron envuelto en palta");
        lblPrecioSushi.setText("2490");
        btnAgregar1.setEnabled(true);
        
    }//GEN-LAST:event_lblSushi1MouseReleased

    private void lblSushi2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi2MouseReleased
        txtIngredientesSushi.setText("Camaron - Queso philadelphia - Cibulette  *  Sushi caliente");
        lblIdSushi.setText("2");
        lblNombreSushi.setText("Camaron envuelto en tempura");
        lblPrecioSushi.setText("2390");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi2MouseReleased

    private void lblSushi3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi3MouseReleased
        txtIngredientesSushi.setText("Camaron - Queso philadelphia - palta  *  Sushi frio");
        lblIdSushi.setText("3");
        lblNombreSushi.setText("Camaron envuelto en cibulette");
        lblPrecioSushi.setText("2350");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi3MouseReleased

    private void lblSushi4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi4MouseReleased
        txtIngredientesSushi.setText("Kanikama - Queso philadelphia - Palta  *  Sushi frio");
        lblIdSushi.setText("4");
        lblNombreSushi.setText("Kanikama envuelto en palta");
        lblPrecioSushi.setText("2490");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi4MouseReleased

    private void lblSushi5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi5MouseReleased
        txtIngredientesSushi.setText("Kanikama - Queso philadelphia - Palmito  *  Sushi caliente");
        lblIdSushi.setText("5");
        lblNombreSushi.setText("Kanikama envuelto en tempura");
        lblPrecioSushi.setText("2390");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi5MouseReleased

    private void lblSushi6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi6MouseReleased
        txtIngredientesSushi.setText("Kanikama - Queso philadelphia - Palta  *  Sushi frio");
        lblIdSushi.setText("6");
        lblNombreSushi.setText("Kanikama envuelto en cibulette");
        lblPrecioSushi.setText("2350");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi6MouseReleased

    private void lblSushi7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi7MouseReleased
        txtIngredientesSushi.setText("Salmon - Queso philadelphia  *  Sushi frio");
        lblIdSushi.setText("7");
        lblNombreSushi.setText("Salmon envuelto en palta");
        lblPrecioSushi.setText("2890");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi7MouseReleased

    private void lblSushi8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi8MouseReleased
        txtIngredientesSushi.setText("Salmon - Queso philadelphia - Palta  *  Sushi caliente");
        lblIdSushi.setText("8");
        lblNombreSushi.setText("Salmon envuelto en tempura");
        lblPrecioSushi.setText("2890");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi8MouseReleased

    private void lblSushi9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi9MouseReleased
        txtIngredientesSushi.setText("Salmon - Queso philadelphia  *  Sushi frio");
        lblIdSushi.setText("9");
        lblNombreSushi.setText("Salmon envuelto en cibulette");
        lblPrecioSushi.setText("2790");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi9MouseReleased

    private void lblSushi10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi10MouseReleased
        txtIngredientesSushi.setText("Pollo - Queso philadelphia - Palta  *  Sushi frio");
        lblIdSushi.setText("10");
        lblNombreSushi.setText("Pollo envuelto en palta");
        lblPrecioSushi.setText("1990");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi10MouseReleased

    private void lblSushi11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi11MouseReleased
        txtIngredientesSushi.setText("Pollo - Queso philadelphia  *  Sushi caliente");
        lblIdSushi.setText("11");
        lblNombreSushi.setText("Pollo envuelto en tempura");
        lblPrecioSushi.setText("1990");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi11MouseReleased

    private void lblSushi12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi12MouseReleased
        txtIngredientesSushi.setText("Pollo - Queso philadelphia - Palta  *  Sushi frio");
        lblIdSushi.setText("12");
        lblNombreSushi.setText("Pollo envuelto en cibulette");
        lblPrecioSushi.setText("1990");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi12MouseReleased

    private void lblSushi13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi13MouseReleased
        txtIngredientesSushi.setText("Arroz con palta - Nori - Aceituna  *  Sushi frio");
        lblIdSushi.setText("13");
        lblNombreSushi.setText("PandiSushi");
        lblPrecioSushi.setText("2250");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi13MouseReleased

    private void lblSushi14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi14MouseReleased
        txtIngredientesSushi.setText("Arroz con colorante natural - Nori - Palmito  *  Sushi frio");
        lblIdSushi.setText("14");
        lblNombreSushi.setText("Flower sushi");
        lblPrecioSushi.setText("2490");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi14MouseReleased

    private void lblSushi15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi15MouseReleased
        txtIngredientesSushi.setText("Choclitos de cocktail - Nori - Palta  *  Sushi frio");
        lblIdSushi.setText("15");
        lblNombreSushi.setText("Owl sushi");
        lblPrecioSushi.setText("2590");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi15MouseReleased

    private void lblSushi16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi16MouseReleased
        txtIngredientesSushi.setText("Camaron - Queso philadelphia - Palta  "
                + "*  Sushi frio");
        lblIdSushi.setText("16");
        lblNombreSushi.setText("Camaron envuelto en pulpo");
        lblPrecioSushi.setText("2890");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi16MouseReleased

    private void lblSushi17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi17MouseReleased
        txtIngredientesSushi.setText("Salmon - Queso philadelphia - Palta - "
                + "Arroz con colorante natural - Nori  *  Sushi frio");
        lblIdSushi.setText("17");
        lblNombreSushi.setText("Colores cuadrado");
        lblPrecioSushi.setText("2790");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi17MouseReleased

    private void lblSushi18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSushi18MouseReleased
        txtIngredientesSushi.setText("Pollo - Lechuga morada - Palta  -  "
                + "Arroz con sesamo - Queso philadelphia  *  Sushi frio");
        lblIdSushi.setText("18");
        lblNombreSushi.setText("Sushiguesa");
        lblPrecioSushi.setText("3490");
        btnAgregar1.setEnabled(true);
    }//GEN-LAST:event_lblSushi18MouseReleased

    private void lblAgre1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgre1MouseReleased
        lblNombreAgregado.setText("Papas fritas pequeñas");
        lblPrecioAgregado.setText("1000");
        btnAgregar2.setEnabled(true);
    }//GEN-LAST:event_lblAgre1MouseReleased

    private void lblAgre2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgre2MouseReleased
        lblNombreAgregado.setText("Papas fritas medianas");
        lblPrecioAgregado.setText("1500");
        btnAgregar2.setEnabled(true);
    }//GEN-LAST:event_lblAgre2MouseReleased

    private void lblAgre3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgre3MouseReleased
        lblNombreAgregado.setText("Papas fritas grandes");
        lblPrecioAgregado.setText("2000");
        btnAgregar2.setEnabled(true);
    }//GEN-LAST:event_lblAgre3MouseReleased

    private void lblAgre4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgre4MouseReleased
        lblNombreAgregado.setText("Papas fritas familiares");
        lblPrecioAgregado.setText("2500");
        btnAgregar2.setEnabled(true);
    }//GEN-LAST:event_lblAgre4MouseReleased

    private void lblAgre5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgre5MouseReleased
        lblNombreAgregado.setText("4 Empanadas de queso");
        lblPrecioAgregado.setText("500");
        btnAgregar2.setEnabled(true);
    }//GEN-LAST:event_lblAgre5MouseReleased

    private void lblAgre6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgre6MouseReleased
        lblNombreAgregado.setText("8 Empanadas de queso");
        lblPrecioAgregado.setText("1000");
        btnAgregar2.setEnabled(true);
    }//GEN-LAST:event_lblAgre6MouseReleased

    private void lblAgre7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgre7MouseReleased
        lblNombreAgregado.setText("12 Empanadas de queso");
        lblPrecioAgregado.setText("1500");
        btnAgregar2.setEnabled(true);
    }//GEN-LAST:event_lblAgre7MouseReleased

    private void lblAgre8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgre8MouseReleased
        lblNombreAgregado.setText("8 Arrollado primavera");
        lblPrecioAgregado.setText("1290");
        btnAgregar2.setEnabled(true);
    }//GEN-LAST:event_lblAgre8MouseReleased

    private void lblAgre9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgre9MouseReleased
        lblNombreAgregado.setText("6 Gyosas de pollo");
        lblPrecioAgregado.setText("1990");
        btnAgregar2.setEnabled(true);
    }//GEN-LAST:event_lblAgre9MouseReleased

    private void lblAgre10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgre10MouseReleased
        lblNombreAgregado.setText("12 Gyosas de pollo");
        lblPrecioAgregado.setText("2590");
        btnAgregar2.setEnabled(true);
    }//GEN-LAST:event_lblAgre10MouseReleased

    private void lblAgre11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgre11MouseReleased
        lblNombreAgregado.setText("6 Gyosas de cerdo");
        lblPrecioAgregado.setText("1990");
        btnAgregar2.setEnabled(true);
    }//GEN-LAST:event_lblAgre11MouseReleased

    private void lblAgre12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgre12MouseReleased
        lblNombreAgregado.setText("12 Gyosas de pollo");
        lblPrecioAgregado.setText("2590");
        btnAgregar2.setEnabled(true);
    }//GEN-LAST:event_lblAgre12MouseReleased

    private void txtEliminarAdmiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminarAdmiKeyReleased
        try {
           String filtro = txtEliminarAdmi.getText();
           List<Producto> lista = d.BuscarProducto(filtro);
           cargarTablaProducto(lista);
           txtidEliminar.setText(null);
       } catch (SQLException ex) {
           Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_txtEliminarAdmiKeyReleased

    private void tabProductoAdmiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProductoAdmiMouseReleased
        if (evt.getClickCount()==2){
            try {
                int fila = tabProductoAdmi.getSelectedRow();
                String strId = tabProductoAdmi.getValueAt(fila, 0).toString();
                int id = Integer.parseInt(strId);
                
                Producto p = d.getProductoPorId(id);
                
                txtidEliminar.setText(Integer.toString(p.getId()));
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
        }
    }//GEN-LAST:event_tabProductoAdmiMouseReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtEliminarAdmi.setText(null);
        txtidEliminar.setText(null);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtidEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidEliminarActionPerformed

    private void txtEditarAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditarAdmiActionPerformed

    }//GEN-LAST:event_txtEditarAdmiActionPerformed

    private void txtPassAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassAdmiActionPerformed

    }//GEN-LAST:event_txtPassAdmiActionPerformed

    private void txtPassAdmiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassAdmiKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnIngresarAdmi.doClick();
        }
    }//GEN-LAST:event_txtPassAdmiKeyReleased

    private void cboTipoAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoAdmiActionPerformed
       
    }//GEN-LAST:event_cboTipoAdmiActionPerformed

    private void txtRutClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutClienteKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                String filtro = txtRutCliente.getText();
                List <Cliente> list = d.buscarClienteRut(filtro);
                
                if (filtro.equalsIgnoreCase(filtro)){
                
                }
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtRutClienteKeyReleased

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgMedioPago;
    private javax.swing.JButton btnActPreAdmi;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btnAgregarAdmi;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarAdmin;
    private javax.swing.JButton btnFinalizar1;
    private javax.swing.JButton btnFinalizar2;
    private javax.swing.JButton btnFinalizar3;
    private javax.swing.JButton btnIngresarAdmi;
    private javax.swing.JButton btnPedido;
    private javax.swing.JComboBox cboBebidas;
    private javax.swing.JComboBox cboCervezas;
    private javax.swing.JComboBox cboJugos;
    private javax.swing.JComboBox cboOtros;
    private javax.swing.JComboBox cboTipoAdmi;
    private javax.swing.JFrame jAdmin;
    private javax.swing.JFrame jBoleta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JFrame jPedido;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblAgre1;
    private javax.swing.JLabel lblAgre10;
    private javax.swing.JLabel lblAgre11;
    private javax.swing.JLabel lblAgre12;
    private javax.swing.JLabel lblAgre2;
    private javax.swing.JLabel lblAgre3;
    private javax.swing.JLabel lblAgre4;
    private javax.swing.JLabel lblAgre5;
    private javax.swing.JLabel lblAgre6;
    private javax.swing.JLabel lblAgre7;
    private javax.swing.JLabel lblAgre8;
    private javax.swing.JLabel lblAgre9;
    private javax.swing.JLabel lblIdSushi;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombreAgregado;
    private javax.swing.JLabel lblNombreBebida;
    private javax.swing.JLabel lblNombreSushi;
    private javax.swing.JLabel lblPreActAdmi;
    private javax.swing.JLabel lblPrecioAgregado;
    private javax.swing.JLabel lblPrecioSushi;
    private javax.swing.JLabel lblRandom;
    private javax.swing.JLabel lblSushi1;
    private javax.swing.JLabel lblSushi10;
    private javax.swing.JLabel lblSushi11;
    private javax.swing.JLabel lblSushi12;
    private javax.swing.JLabel lblSushi13;
    private javax.swing.JLabel lblSushi14;
    private javax.swing.JLabel lblSushi15;
    private javax.swing.JLabel lblSushi16;
    private javax.swing.JLabel lblSushi17;
    private javax.swing.JLabel lblSushi18;
    private javax.swing.JLabel lblSushi2;
    private javax.swing.JLabel lblSushi3;
    private javax.swing.JLabel lblSushi4;
    private javax.swing.JLabel lblSushi5;
    private javax.swing.JLabel lblSushi6;
    private javax.swing.JLabel lblSushi7;
    private javax.swing.JLabel lblSushi8;
    private javax.swing.JLabel lblSushi9;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnBebida;
    private javax.swing.JSpinner spnUniAgre;
    private javax.swing.JSpinner spnUniSushi;
    private javax.swing.JTabbedPane tab2;
    private javax.swing.JTable tabBoleta;
    private javax.swing.JTable tabProductoAdmi;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtEditarAdmi;
    private javax.swing.JTextField txtEliminarAdmi;
    private javax.swing.JTextArea txtIngredientesSushi;
    private javax.swing.JTextField txtNombreAgregarAdmi;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtPassAdmi;
    private javax.swing.JTextField txtPreNueAdmi;
    private javax.swing.JTextField txtPrecioAgregarAdmi;
    private javax.swing.JLabel txtPrecioBebida;
    private javax.swing.JTextField txtRutCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtUsuAdmi;
    private javax.swing.JTextField txtidEliminar;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaProducto(List<Producto> productos) {
       try {
           TMAdmin modelPro = new TMAdmin(productos);
           tabProductoAdmi.setModel(modelPro);
       } catch (SQLException ex) {
           Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    private void cargarCombo(){
       try {
           List <Producto> productos = d.getProductos();
           
           cboBebidas.removeAllItems();
           
           for (Producto p : productos){
               if(p.getIdTipo() == 3){
                   cboBebidas.addItem(p);
               }else if (p.getIdTipo() == 4){
                   cboJugos.addItem(p);
               }else if (p.getIdTipo() == 5){
                   cboCervezas.addItem(p);
               }else if (p.getIdTipo() == 6){
               cboOtros.addItem(p);
               }
           }
       } catch (SQLException ex) {
           Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
