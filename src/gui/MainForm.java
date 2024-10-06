
package gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;
import logic.Pedido;
import logic.formatosApp;


public class MainForm extends javax.swing.JFrame {
    
    
    private final Pedido util = new Pedido();
    private Pedido CurrentPedido = new Pedido();
    private final DocumentFilter formatoTelefono = formatosApp.formatoTelefono;
    private final DocumentFilter formatoCantidad = formatosApp.formatoCantidad;
    private final DocumentFilter formatoCodigoPrenda = formatosApp.formatoCodigoPrenda;
    private final DocumentFilter formatoID = formatosApp.formatoID;
    

    public MainForm() {
        
        initComponents();
        DireccionTxt.setEnabled(false);
        DireccionTxt1.setEnabled(false);
        
        PedidosFrame.addChangeListener((ChangeEvent e) -> {
            // Obtener el índice de la pestaña seleccionada actualmente
            int selectedIndex = PedidosFrame.getSelectedIndex();
            if(selectedIndex == 1){
                UpdateListedTable();
            }
        });
        
        
       ((AbstractDocument) codigoPrendaTxt.getDocument()).setDocumentFilter(formatoCodigoPrenda);
       ((AbstractDocument) cantidadTxt.getDocument()).setDocumentFilter(formatoCantidad);
       ((AbstractDocument) TelefonoTxt.getDocument()).setDocumentFilter(formatoTelefono);
       
       //Formato de pestaña de busqueda
       ((AbstractDocument) codigoPrendaTxt1.getDocument()).setDocumentFilter(formatoCodigoPrenda);
       ((AbstractDocument) cantidadTxt1.getDocument()).setDocumentFilter(formatoCantidad);
       ((AbstractDocument) TelefonoTxt1.getDocument()).setDocumentFilter(formatoTelefono);
       ((AbstractDocument) TelefonoBusquedaTxt.getDocument()).setDocumentFilter(formatoTelefono);
       
       //Formato pestaña comparacion
       ((AbstractDocument) IDBusquedaTxt.getDocument()).setDocumentFilter(formatoID);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PedidosFrame = new javax.swing.JTabbedPane();
        RegistroPedidos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tallaCbx = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TipoCamisetaCbx = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        TipoPedidoCbx = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cantidadTxt = new javax.swing.JFormattedTextField();
        codigoPrendaTxt = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DireccionTxt = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        MetodoPagoCbx = new javax.swing.JComboBox<>();
        TelefonoTxt = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        ClienteTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        AgregarBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ListadoPedidos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PedidoTable = new javax.swing.JTable();
        BusquedaPedidos = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tallaCbx1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        TipoCamisetaCbx1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        TipoPedidoCbx1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        cantidadTxt1 = new javax.swing.JFormattedTextField();
        codigoPrendaTxt1 = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DireccionTxt1 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        MetodoPagoCbx1 = new javax.swing.JComboBox<>();
        TelefonoTxt1 = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        ClienteTxt1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        EditarBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        EditTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        TelefonoBusquedaTxt = new javax.swing.JFormattedTextField();
        BuscarBtn = new javax.swing.JButton();
        ComparacionPedidos = new javax.swing.JPanel();
        IDBusquedaTxt = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        BuscarBtn1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        ConsolaTxt = new javax.swing.JTextArea();
        OrdenamientoPedidos = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        OrdenamientoTable = new javax.swing.JTable();
        OrdenamientoMergeBtn = new javax.swing.JButton();
        OrdenamientoInsertBtn = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XDesign");
        setName("XDesing"); // NOI18N

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel1.setText("Salud Plus S.A");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PedidosFrame.setBackground(new java.awt.Color(255, 255, 255));
        PedidosFrame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        RegistroPedidos.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Tipo de camiseta: ");

        jLabel4.setText("Talla: ");

        tallaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "S", "M", "L", "XL", "2XL" }));
        tallaCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tallaCbxActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad");

        TipoCamisetaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------Seleccione un opcion------", "Lisa manga larga", "Polo manga corta", "Estampado manga corta", "Lisa manga corta", "Deportiva manga larga", "Deportiva manga corta", "Deportiva sin mangas" }));

        jLabel6.setText("Codigo prenda:");

        TipoPedidoCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccione una opcion---", "Recoger en tienda", "Envío a domicilio" }));
        TipoPedidoCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoPedidoCbxActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo pedido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cantidadTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                .addComponent(codigoPrendaTxt)))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TipoCamisetaCbx, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tallaCbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(TipoPedidoCbx, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TipoCamisetaCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tallaCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(codigoPrendaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TipoPedidoCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Dirección:");

        DireccionTxt.setColumns(20);
        DireccionTxt.setLineWrap(true);
        DireccionTxt.setRows(5);
        jScrollPane1.setViewportView(DireccionTxt);

        jLabel9.setText("Metodo de pago: ");

        MetodoPagoCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Seleccione una opcion----", "Efectivo", "Sinpe móvil", "Transferencia bancaria", "Tarjeta de débito/crédito" }));

        TelefonoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoTxtActionPerformed(evt);
            }
        });

        jLabel10.setText("Numero de telefono del cliente:");

        ClienteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteTxtActionPerformed(evt);
            }
        });

        jLabel11.setText("Nombre cliente: ");

        AgregarBtn.setText("Agregar");
        AgregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addComponent(MetodoPagoCbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TelefonoTxt)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClienteTxt)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AgregarBtn)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MetodoPagoCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AgregarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Registro de nuevos pedidos");

        javax.swing.GroupLayout RegistroPedidosLayout = new javax.swing.GroupLayout(RegistroPedidos);
        RegistroPedidos.setLayout(RegistroPedidosLayout);
        RegistroPedidosLayout.setHorizontalGroup(
            RegistroPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistroPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroPedidosLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroPedidosLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        RegistroPedidosLayout.setVerticalGroup(
            RegistroPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistroPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(RegistroPedidosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PedidosFrame.addTab("Registro", RegistroPedidos);

        ListadoPedidos.setBackground(new java.awt.Color(255, 255, 255));

        PedidoTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(PedidoTable);

        javax.swing.GroupLayout ListadoPedidosLayout = new javax.swing.GroupLayout(ListadoPedidos);
        ListadoPedidos.setLayout(ListadoPedidosLayout);
        ListadoPedidosLayout.setHorizontalGroup(
            ListadoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        ListadoPedidosLayout.setVerticalGroup(
            ListadoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListadoPedidosLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addGap(163, 163, 163))
        );

        PedidosFrame.addTab("Listado", ListadoPedidos);

        BusquedaPedidos.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Tipo de camiseta: ");

        jLabel13.setText("Talla: ");

        tallaCbx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "S", "M", "L", "XL", "2XL" }));
        tallaCbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tallaCbx1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Cantidad");

        TipoCamisetaCbx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------Seleccione un opcion------", "Lisa manga larga", "Polo manga corta", "Estampado manga corta", "Lisa manga corta", "Deportiva manga larga", "Deportiva manga corta", "Deportiva sin mangas" }));
        TipoCamisetaCbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoCamisetaCbx1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Codigo prenda:");

        TipoPedidoCbx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccione una opcion---", "Recoger en tienda", "Envío a domicilio" }));
        TipoPedidoCbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoPedidoCbx1ActionPerformed(evt);
            }
        });

        jLabel16.setText("Tipo pedido:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TipoCamisetaCbx1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tallaCbx1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantidadTxt1)
                            .addComponent(codigoPrendaTxt1)))
                    .addComponent(TipoPedidoCbx1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TipoCamisetaCbx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tallaCbx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(codigoPrendaTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TipoPedidoCbx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(439, 439, 439))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setText("Dirección:");

        DireccionTxt1.setColumns(20);
        DireccionTxt1.setLineWrap(true);
        DireccionTxt1.setRows(5);
        jScrollPane3.setViewportView(DireccionTxt1);

        jLabel18.setText("Metodo de pago: ");

        MetodoPagoCbx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Seleccione una opcion----", "Efectivo", "Sinpe móvil", "Transferencia bancaria", "Tarjeta de débito/crédito" }));

        TelefonoTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoTxt1ActionPerformed(evt);
            }
        });

        jLabel19.setText("Numero de telefono del cliente:");

        ClienteTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteTxt1ActionPerformed(evt);
            }
        });

        jLabel20.setText("Nombre cliente: ");

        EditarBtn.setText("Editar");
        EditarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(MetodoPagoCbx1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TelefonoTxt1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClienteTxt1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EditarBtn)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MetodoPagoCbx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TelefonoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClienteTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EditTable.setModel(new javax.swing.table.DefaultTableModel(
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
        EditTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(EditTable);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setText("Busqueda por telefono");

        TelefonoBusquedaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoBusquedaTxtActionPerformed(evt);
            }
        });

        BuscarBtn.setText("Buscar");
        BuscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TelefonoBusquedaTxt)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarBtn))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TelefonoBusquedaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarBtn)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BusquedaPedidosLayout = new javax.swing.GroupLayout(BusquedaPedidos);
        BusquedaPedidos.setLayout(BusquedaPedidosLayout);
        BusquedaPedidosLayout.setHorizontalGroup(
            BusquedaPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BusquedaPedidosLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
        );
        BusquedaPedidosLayout.setVerticalGroup(
            BusquedaPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BusquedaPedidosLayout.createSequentialGroup()
                .addGroup(BusquedaPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PedidosFrame.addTab("Busqueda", BusquedaPedidos);

        ComparacionPedidos.setBackground(new java.awt.Color(255, 255, 255));

        IDBusquedaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDBusquedaTxtActionPerformed(evt);
            }
        });

        jLabel22.setText("Busqueda de pedido por ID:");

        BuscarBtn1.setText("Buscar");
        BuscarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBtn1ActionPerformed(evt);
            }
        });

        ConsolaTxt.setEditable(false);
        ConsolaTxt.setBackground(new java.awt.Color(255, 255, 255));
        ConsolaTxt.setColumns(20);
        ConsolaTxt.setRows(5);
        jScrollPane5.setViewportView(ConsolaTxt);

        javax.swing.GroupLayout ComparacionPedidosLayout = new javax.swing.GroupLayout(ComparacionPedidos);
        ComparacionPedidos.setLayout(ComparacionPedidosLayout);
        ComparacionPedidosLayout.setHorizontalGroup(
            ComparacionPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComparacionPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ComparacionPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ComparacionPedidosLayout.createSequentialGroup()
                        .addGroup(ComparacionPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IDBusquedaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addGroup(ComparacionPedidosLayout.createSequentialGroup()
                        .addComponent(BuscarBtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ComparacionPedidosLayout.setVerticalGroup(
            ComparacionPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComparacionPedidosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(ComparacionPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ComparacionPedidosLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IDBusquedaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BuscarBtn1)))
                .addContainerGap(328, Short.MAX_VALUE))
        );

        PedidosFrame.addTab("Comparacion", ComparacionPedidos);

        OrdenamientoPedidos.setBackground(new java.awt.Color(255, 255, 255));

        OrdenamientoTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(OrdenamientoTable);

        OrdenamientoMergeBtn.setText("Ordenamiento descendente");
        OrdenamientoMergeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenamientoMergeBtnActionPerformed(evt);
            }
        });

        OrdenamientoInsertBtn.setText("Ordenamiento ascendente");
        OrdenamientoInsertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenamientoInsertBtnActionPerformed(evt);
            }
        });

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel23.setText("<html>\n<p style=\"text-wrap: wrap\">\nEl ordenamiento ascendente se hace en base al numero telefonico de los clientes. Utilizando el metodo de ordenamiento por insercion.\n</p>\n</html>");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel24.setText("<html> <p style=\"text-wrap: wrap\"> El ordenamiento descendente se hace en base al codigo de prenda del producto solicitado. Utilizando el metodo de ordenamiento merge sort. </p> </html>");

        jLabel25.setText("<html>\n<h1>\nOrdenamiento\n</h1>\n</html>");

        javax.swing.GroupLayout OrdenamientoPedidosLayout = new javax.swing.GroupLayout(OrdenamientoPedidos);
        OrdenamientoPedidos.setLayout(OrdenamientoPedidosLayout);
        OrdenamientoPedidosLayout.setHorizontalGroup(
            OrdenamientoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrdenamientoPedidosLayout.createSequentialGroup()
                .addGroup(OrdenamientoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrdenamientoPedidosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6))
                    .addGroup(OrdenamientoPedidosLayout.createSequentialGroup()
                        .addGroup(OrdenamientoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OrdenamientoPedidosLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(OrdenamientoMergeBtn))
                            .addGroup(OrdenamientoPedidosLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(OrdenamientoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(OrdenamientoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OrdenamientoInsertBtn)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 173, Short.MAX_VALUE)))
                .addContainerGap())
        );
        OrdenamientoPedidosLayout.setVerticalGroup(
            OrdenamientoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrdenamientoPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OrdenamientoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(OrdenamientoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrdenamientoMergeBtn)
                    .addComponent(OrdenamientoInsertBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PedidosFrame.addTab("Ordenamiento", OrdenamientoPedidos);

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PedidosFrame)
                .addContainerGap())
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PedidosFrame)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TelefonoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoTxtActionPerformed

    private void ClienteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteTxtActionPerformed

    private void AgregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBtnActionPerformed
        
        if(!TipoCamisetaIsEmpty() && !TallaIsEmpty() 
                && !cantidadTxt.getText().isEmpty() 
                && !codigoPrendaTxt.getText().isEmpty()
                && !TipoPedidoIsEmpty()
                && !MetodoPagoIsEmpty()
                && !TelefonoTxt.getText().isEmpty()
                
                ){
        
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de continuar?",
                                                      "Confirmación", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
             try {
                 
                Pedido pedido = new Pedido
                (TipoCamisetaCbx.getSelectedItem().toString(), 
                    tallaCbx.getSelectedItem().toString(), 
                    Integer.parseInt(cantidadTxt.getText()), 
                    codigoPrendaTxt.getText(), 
                    TipoPedidoCbx.getSelectedItem().toString(), 
                    MetodoPagoCbx.getSelectedItem().toString(), 
                    DireccionTxt.getText(),
                    Integer.parseInt(TelefonoTxt.getText()), 
                    ClienteTxt.getText());
                 Thread.sleep(10);
                 
                 cantidadTxt.setText("");
                 DireccionTxt.setText("");
                 ClienteTxt.setText("");
                 codigoPrendaTxt.setText("");
                 TelefonoTxt.setText("");
                 
                 MetodoPagoCbx.setSelectedIndex(0);
                 TipoCamisetaCbx.setSelectedIndex(0);
                 TipoPedidoCbx.setSelectedIndex(0);
                 tallaCbx.setSelectedIndex(0);
                 
             } catch (InterruptedException ex) {
                 Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
             }
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Ha cancelado la acción");
        }
            
        }else{
            JOptionPane.showMessageDialog(null, "No ha ingresado algunos datos del pedido");
        }
        
    }//GEN-LAST:event_AgregarBtnActionPerformed

    private void EditarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBtnActionPerformed
         if (!TipoCamisetaIsEmpty1() && !TallaIsEmpty1()
            && !cantidadTxt1.getText().isEmpty()
            && !codigoPrendaTxt1.getText().isEmpty()
            && !TipoPedidoIsEmpty1()
            && !MetodoPagoIsEmpty1()
            && !TelefonoTxt1.getText().isEmpty()) {

        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de continuar?",
                "Confirmación", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            try {
                CurrentPedido.setFormaPago((String) MetodoPagoCbx1.getSelectedItem());
                CurrentPedido.setTipo((String) TipoCamisetaCbx1.getSelectedItem());
                CurrentPedido.setTipoPedido((String) TipoPedidoCbx1.getSelectedItem());
                CurrentPedido.setTalla((String) tallaCbx1.getSelectedItem());
                CurrentPedido.setCantidad(Integer.parseInt(cantidadTxt1.getText()));
                CurrentPedido.setDireccion(DireccionTxt1.getText());
                CurrentPedido.setCodigoDiseno(codigoPrendaTxt1.getText());
                CurrentPedido.setNumeroCliente(Integer.parseInt(TelefonoTxt1.getText()));
                CurrentPedido.setNombreCliente(ClienteTxt1.getText());

                util.editarPedido(CurrentPedido, Pedido.getPedidos().indexOf(CurrentPedido));

                // Esperar un momento para asegurarse de que la tabla se actualice
                Thread.sleep(10);

                // Limpiar los campos de texto
                cantidadTxt.setText("");
                DireccionTxt.setText("");
                ClienteTxt.setText("");
                codigoPrendaTxt.setText("");
                TelefonoTxt.setText("");

                // Restablecer los JComboBox a sus valores predeterminados
                MetodoPagoCbx.setSelectedIndex(0);
                TipoCamisetaCbx.setSelectedIndex(0);
                TipoPedidoCbx.setSelectedIndex(0);
                tallaCbx.setSelectedIndex(0);
                 
             } catch (InterruptedException ex) {
                 Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
             }
            
            UpdateSearchTable(util.generarModeloTabla(Integer.parseInt(TelefonoBusquedaTxt.getText())));
            
        } else {
            JOptionPane.showMessageDialog(null, "Ha cancelado la acción");
        }
            
        }else{
            JOptionPane.showMessageDialog(null, "No ha ingresado algunos datos del pedido");
        }
        
    
    }//GEN-LAST:event_EditarBtnActionPerformed

    private void ClienteTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteTxt1ActionPerformed

    private void TelefonoTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoTxt1ActionPerformed

    private void TipoPedidoCbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoPedidoCbx1ActionPerformed
       if(TipoPedidoCbx1.getSelectedItem().toString().equals("Envío a domicilio")){
            DireccionTxt1.setEnabled(true);
        }else{
            DireccionTxt1.setEnabled(false);
        }
    }//GEN-LAST:event_TipoPedidoCbx1ActionPerformed

    private void tallaCbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tallaCbx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tallaCbx1ActionPerformed

    private void TipoPedidoCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoPedidoCbxActionPerformed
        if(TipoPedidoCbx.getSelectedItem().toString().equals("Envío a domicilio")){
            DireccionTxt.setEnabled(true);
        }else{
            DireccionTxt.setEnabled(false);
        }
    }//GEN-LAST:event_TipoPedidoCbxActionPerformed

    private void tallaCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tallaCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tallaCbxActionPerformed

    private void TipoCamisetaCbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoCamisetaCbx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoCamisetaCbx1ActionPerformed

    private void EditTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditTableMouseClicked
    CurrentPedido = getPedidoFromArray(EditTable.getSelectedRow());
    
    // Actualizar CurrentPedido con los nuevos valores
    cantidadTxt1.setText(String.valueOf(CurrentPedido.getCantidad()));
    DireccionTxt1.setText(CurrentPedido.getDireccion());
    ClienteTxt1.setText(CurrentPedido.getNombreCliente());
    codigoPrendaTxt1.setText(CurrentPedido.getCodigoDiseno());

        ((AbstractDocument) TelefonoTxt1.getDocument()).setDocumentFilter(null);
        // Asignar el valor al JTextField
        TelefonoTxt1.setText(String.valueOf(CurrentPedido.getNumeroCliente()));
        ((AbstractDocument) TelefonoTxt1.getDocument()).setDocumentFilter(formatoTelefono);
        
    // Actualizar los JComboBox con el valor actual del pedido
    setSelectedComboBoxItem(MetodoPagoCbx1, CurrentPedido.getFormaPago());
    setSelectedComboBoxItem(TipoCamisetaCbx1, CurrentPedido.getTipo());
    setSelectedComboBoxItem(TipoPedidoCbx1, CurrentPedido.getTipoPedido());
    setSelectedComboBoxItem(tallaCbx1, CurrentPedido.getTalla());
    }//GEN-LAST:event_EditTableMouseClicked

    private void BuscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBtnActionPerformed
        UpdateSearchTable(util.generarModeloTabla(Integer.parseInt(TelefonoBusquedaTxt.getText())));
    }//GEN-LAST:event_BuscarBtnActionPerformed

    private void TelefonoBusquedaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoBusquedaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoBusquedaTxtActionPerformed

    private void IDBusquedaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDBusquedaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDBusquedaTxtActionPerformed

    private void BuscarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBtn1ActionPerformed
        Pedido pedido = Pedido.getPedidoByID(Integer.parseInt(IDBusquedaTxt.getText()));
        if(pedido == null){
            JOptionPane.showMessageDialog(null,"No existe ningun pedido con ese ID", "Seleccione otro ID", JOptionPane.WARNING_MESSAGE);
        }else{
            ConsolaTxt.setText("\n\n"
                    + "ID\n"
                    + pedido.getID() +"\n"
                    + "Cantidad\n"
                    + pedido.getCantidad()+"\n"
                    + "Valor binario\n"
                    + pedido.cantidadBinario() +"\n"
                    + "");
            
        }
    }//GEN-LAST:event_BuscarBtn1ActionPerformed

    private void OrdenamientoMergeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenamientoMergeBtnActionPerformed
        OrdenamientoTable.setModel(util.ordenarPedidosPorCodigoDiseno());
    }//GEN-LAST:event_OrdenamientoMergeBtnActionPerformed

    private void OrdenamientoInsertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenamientoInsertBtnActionPerformed
        OrdenamientoTable.setModel(util.ordenarPedidosPorNumeroCliente());
    }//GEN-LAST:event_OrdenamientoInsertBtnActionPerformed

    private boolean TipoCamisetaIsEmpty(){
        return TipoCamisetaCbx.getSelectedIndex() <= 0;
    }
    
    private boolean TipoCamisetaIsEmpty1(){
        return TipoCamisetaCbx1.getSelectedIndex() <= 0;
    }
    private boolean TallaIsEmpty(){
        return tallaCbx.getSelectedIndex() <= 0;
    }
    
    private boolean TallaIsEmpty1(){
        return tallaCbx1.getSelectedIndex() <= 0;
    }
    
    
    private boolean TipoPedidoIsEmpty(){
        return TipoPedidoCbx.getSelectedIndex() <= 0; 
    }
    
    private boolean TipoPedidoIsEmpty1(){
        return TipoPedidoCbx1.getSelectedIndex() <= 0; 
    }
    
    private boolean MetodoPagoIsEmpty(){
        return MetodoPagoCbx.getSelectedIndex() <= 0;
    }
    
    private boolean MetodoPagoIsEmpty1(){
        return MetodoPagoCbx1.getSelectedIndex() <= 0;
    }
    
    private void UpdateListedTable(){
        PedidoTable.setModel(util.generarModeloTabla());
    }
    
    private void UpdateSearchTable(DefaultTableModel model){
        EditTable.setModel(model);
    }
    
    private Pedido getPedidoFromArray(int i){
        
        Object index = EditTable.getValueAt(i,0);
        var pedidos = Pedido.getPedidos();
        
        for(Pedido pedido : pedidos){
            if(pedido.getID() == Integer.parseInt(index.toString())){
                return pedido;
            }
        }
        return null;
    }
    
    private void setSelectedComboBoxItem(JComboBox<String> comboBox, String value) {
    for (int i = 0; i < comboBox.getItemCount(); i++) {
        if (comboBox.getItemAt(i).equals(value)) {
            comboBox.setSelectedIndex(i);
            break;
        }
    }
}
    
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBtn;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton BuscarBtn;
    private javax.swing.JButton BuscarBtn1;
    private javax.swing.JPanel BusquedaPedidos;
    private javax.swing.JTextField ClienteTxt;
    private javax.swing.JTextField ClienteTxt1;
    private javax.swing.JPanel ComparacionPedidos;
    private javax.swing.JTextArea ConsolaTxt;
    private javax.swing.JTextArea DireccionTxt;
    private javax.swing.JTextArea DireccionTxt1;
    private javax.swing.JTable EditTable;
    private javax.swing.JButton EditarBtn;
    private javax.swing.JFormattedTextField IDBusquedaTxt;
    private javax.swing.JPanel ListadoPedidos;
    private javax.swing.JComboBox<String> MetodoPagoCbx;
    private javax.swing.JComboBox<String> MetodoPagoCbx1;
    private javax.swing.JButton OrdenamientoInsertBtn;
    private javax.swing.JButton OrdenamientoMergeBtn;
    private javax.swing.JPanel OrdenamientoPedidos;
    private javax.swing.JTable OrdenamientoTable;
    private javax.swing.JTable PedidoTable;
    private javax.swing.JTabbedPane PedidosFrame;
    private javax.swing.JPanel RegistroPedidos;
    private javax.swing.JFormattedTextField TelefonoBusquedaTxt;
    private javax.swing.JFormattedTextField TelefonoTxt;
    private javax.swing.JFormattedTextField TelefonoTxt1;
    private javax.swing.JComboBox<String> TipoCamisetaCbx;
    private javax.swing.JComboBox<String> TipoCamisetaCbx1;
    private javax.swing.JComboBox<String> TipoPedidoCbx;
    private javax.swing.JComboBox<String> TipoPedidoCbx1;
    private javax.swing.JFormattedTextField cantidadTxt;
    private javax.swing.JFormattedTextField cantidadTxt1;
    private javax.swing.JFormattedTextField codigoPrendaTxt;
    private javax.swing.JFormattedTextField codigoPrendaTxt1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox<String> tallaCbx;
    private javax.swing.JComboBox<String> tallaCbx1;
    // End of variables declaration//GEN-END:variables
}
