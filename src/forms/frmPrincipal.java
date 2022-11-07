/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.swing.JOptionPane;

/**
 *
 * @author luas_lp
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnCargar.setEnabled(false);
    }

   //declaramos variables globales para el manejo de cadenas 
    String cadenaA1, aux,cadenaB1, simbolo, aux2;
    int est=0, longitud1, longitud2, longtotal, apuntador=0;
    String arreglo1[];
    int arreglo2[];
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtSimbolo = new javax.swing.JTextField();
        txtCadena1 = new javax.swing.JTextField();
        txtCadena2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblCadena2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLeer = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblCadena1 = new javax.swing.JLabel();
        lblSimbolo = new javax.swing.JLabel();
        lblOperacion = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setText("L={w=w compara dos cadenas binarias}");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, 30));
        jPanel1.add(txtSimbolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 30, 30));

        txtCadena1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadena1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtCadena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 267, 30));
        jPanel1.add(txtCadena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 267, 30));

        jLabel1.setText("Simbolo de operacion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));
        jPanel1.add(lblCadena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 30, 20));

        jLabel3.setText("Segunda Cadena");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        btnLeer.setText("1) LEER CADENAS");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });
        jPanel1.add(btnLeer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 170, 50));

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 48)); // NOI18N
        jLabel9.setText("MAQUINA DE TURING");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        btnCargar.setText("2) GENERAR ");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 170, 50));

        jLabel4.setText("Primera Cadena");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));
        jPanel1.add(lblCadena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 30, 20));
        jPanel1.add(lblSimbolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 30, 20));

        lblOperacion.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        lblOperacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 450, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("#");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 30, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("#");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 30, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("#");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 30, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("#");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 30, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("#");
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 30, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("#");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 30, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("#");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 30, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("#");
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 30, -1));

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("#");
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 30, -1));

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("#");
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 30, -1));

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("#");
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 30, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("#");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 60, 40));

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("-");
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 30, -1));

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("-");
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 30, -1));

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("-");
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 30, -1));

        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("-");
        jPanel1.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 30, -1));

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("-");
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 30, -1));

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("-");
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 30, -1));

        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("-");
        jPanel1.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 30, -1));

        jTextField22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setText("-");
        jPanel1.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 30, -1));

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("-");
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 30, -1));

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("-");
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 30, -1));

        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("-");
        jPanel1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 30, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Caracteres");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Estado:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/comparacion.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 290, 160));

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 100, 50));

        btnRegresar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 100, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        //se guarda el simbolo
        simbolo = txtSimbolo.getText();

        //validaciones para el ingreso de las cadena1
        if(txtCadena1.getText().equals("")||txtCadena1.getText().equals(null))
        {
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar algun dato en la cadena 1");
            txtCadena1.grabFocus();
            
        }//se valida el simbolo de comparacion
        else if (simbolo.equals("")|| simbolo.equals(null) || !simbolo.equals("="))
        { 
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar el simbolo correcto de comparacion(=)");
            txtSimbolo.grabFocus();
        }//validaciones para el ingreso de las cadena2
        else if (txtCadena2.getText().equals("")||txtCadena2.getText().equals(null))
        {
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar algun dato en la cadena 2");
            txtCadena2.grabFocus();
        }else if(!validarCadena(txtCadena1.getText().trim())) //validacion de cadena binaria 1
        {
          JOptionPane.showMessageDialog(rootPane,"Debe ingresar valores binarios unicamente en la cadena 1");
          txtCadena1.grabFocus();
        }else if(!validarCadena(txtCadena2.getText().trim())) //validacion de cadena binaria 2
        {
          JOptionPane.showMessageDialog(rootPane,"Debe ingresar valores binarios unicamente en la cadena 2");
          txtCadena2.grabFocus();
        }
        else 
        {
            //se guarda la cadena ingresada en el primer txt
            cadenaA1=txtCadena1.getText();
            //se encuentra la longitud de la cadena 1
            longitud1 = cadenaA1.length();
            //se guarda la cadena 2
            cadenaB1 = txtCadena2.getText();
            //se encuentra la longitud de la cadena 2
            longitud2 = cadenaB1.length();

            
            //longitud del arreglo
            longtotal = longitud1 + longitud2 + 1;
            arreglo1= new String [longtotal+1];
            // condicion para el maximo de caracteres
            if(longtotal > 11)
            {
                JOptionPane.showMessageDialog(rootPane, "Las cadenas exceden el limite de caracteres, por el momento solo se permiten 11 caracteres en total");
            }else
            {
                //se llena el arreglo con la primera cadena
                for(int i =0; i<longitud1; i++)
                {
                    arreglo1[i]=""+cadenaA1.charAt(i);
                }   
                
                //se agrega el simbolo al arreglo
                arreglo1[longitud1]= ""+simbolo.charAt(0);
               
                //se agrega la segunda cadena al arreglo
                for(int j =0 + 1; j<=longitud2; j++)
                {
                    arreglo1[longitud1 + j]= ""+cadenaB1.charAt(j-1);
                }   
                iniciocajas1();
            }
        }
        binario();
        lblOperacion.setText("Comparando Cadenas, caracter por caracter...");
        btnCargar.setEnabled(true);
    }//GEN-LAST:event_btnLeerActionPerformed
    
    //funcion para convertir binario a decimal
    void binario()
    {
      int binario1 = Integer.parseInt(cadenaA1);
      int binario2 = Integer.parseInt(cadenaB1);
      int convert1[]= new int [10];
      int convert2[]= new int [10];
      int residuo1=0, resultado1 = 0, residuo2 = 0, resultado2 = 0;
      //for para encontrar el modulo del numero binario para luego dividirlo.
      for(int i = 0; i<longitud1; i++)
      {
          convert1[i] = binario1 % 10;
          binario1 /=10;
      }
      //el resultado de la division se multiplica por el residuio  y el valor del modulo.
      for(int i=longitud1; i>=0; i--)
      {
          resultado1 = (residuo1 * 2) + convert1[i];
          residuo1 = resultado1;
      }
      lblCadena1.setText(""+resultado1);
      
      //////////calculo para la cadena 2
      //for para encontrar el modulo del numero binario para luego dividirlo.
      for(int i = 0; i<longitud2; i++)
      {
          convert2[i] = binario2 % 10;
          binario2 /=10;
      }
      //el resultado de la division se multiplica por el residuio  y el valor del modulo.
      for(int i=longitud2; i>=0; i--)
      {
          resultado2 = (residuo2 * 2) + convert2[i];
          residuo2 = resultado2;
      }
      lblCadena2.setText(""+resultado2);
    }
    
    //funcion para validar las cadenas binarias
    public static boolean validarCadena(String datos)
    {
        return datos.matches("[0-1]*");
    }
    
    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        
        llenarcabezal();     
        switch(est){
            case 0:{
                q0();
                break;
            }
            case 1:{
                q1();
                break;
            }
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void txtCadena1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadena1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadena1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
    frmInicio fi = new frmInicio();
    fi.setVisible(true);
    this.setVisible(false);
    
    }//GEN-LAST:event_btnRegresarActionPerformed

    
    //funciones
    void iniciocajas1(){
        int pos=0;
        while (pos<longtotal){
            switch (pos){
                case 0:{
                    jTextField1.setText(arreglo1[0]);
                    break;}
                case 1:{
                    jTextField2.setText(arreglo1[1]);
                    break;}
                case 2:{
                    jTextField3.setText(arreglo1[2]);
                    break;}
                case 3:{
                    jTextField4.setText(arreglo1[3]);
                    break;}
                case 4:{
                    jTextField5.setText(arreglo1[4]);
                    break;}
                case 5:{
                    jTextField6.setText(arreglo1[5]);
                    break;}
                case 6:{
                    jTextField7.setText(arreglo1[6]);
                    break;}
                case 7:{
                    jTextField8.setText(arreglo1[7]);
                    break;}
                case 8:{
                    jTextField9.setText(arreglo1[8]);
                    break;}
                case 9:{
                    jTextField10.setText(arreglo1[9]);
                    break;}
                case 10:{
                    jTextField11.setText(arreglo1[10]);
                    break;}
            }
            pos++;
        }
           jTextField12.setText("^");
    }
    
    
    void llenarcabezal(){
        jTextField12.setText("-");
        jTextField13.setText("-");
        jTextField14.setText("-");
        jTextField15.setText("-");
        jTextField16.setText("-");
        jTextField17.setText("-");
        jTextField18.setText("-");
        jTextField19.setText("-");
        jTextField20.setText("-");
        jTextField21.setText("-");
        jTextField22.setText("-");
    }
    
    void cabezal(){
        switch(apuntador){
            case 0:{
                jTextField12.setText("^");
                 jTextField17.setText("^");
                break;
            }
             case 1:{
                jTextField13.setText("^");
                 jTextField18.setText("^");
                break;
             }
             case 2:{
                jTextField14.setText("^");
                 jTextField19.setText("^");
                break;
             }
             case 3:{
                jTextField15.setText("^");
                 jTextField20.setText("^");
                break;
             }
             case 4:{
                jTextField16.setText("^");
                break;
             }
             case 5:{
                jTextField17.setText("^");
                break;
             }
             case 6:{
                jTextField18.setText("^");
                break;
             }
             case 7:{
                jTextField19.setText("^");
                break;
             }
             case 8:{
                jTextField20.setText("^");
                break;
             }
             case 9:{
                jTextField21.setText("^");
                break;
             }
             case 10:{
                jTextField22.setText("^");
                break;
             }
        }
        jLabel6.setText("q"+est);
    }
    
    
    void movder(){
        apuntador++;   
    }
    
    void movizq(){
        apuntador= apuntador - 1;
    }
    
        //estados
    void q0()
    {
        cabezal();
        aux = arreglo1[apuntador];
        aux2 = arreglo1[apuntador+longitud1+1];
       if(aux.equals("0")&& aux2.equals("0")) 
        {
            est = 0;
            movder();
        }

        else if(aux.equals("1")&& aux2.equals("1")) 
        {
            est = 0;
            movder();
        }

        else if(aux.equals("=")) 
        {
            est = 1;
            movder();
            apuntador = longtotal;
        }else{
            cabezal();
            JOptionPane.showMessageDialog(this,"Las cadenas no son identicas; Cadenas no aceptadas");
            apuntador = 0;
            jLabel6.setText("q"+est);
        }
    }
    
    
    void q1()
    {
        cabezal();
        JOptionPane.showMessageDialog(this,"Las cadenas son identicas, Cadenas aceptadas");
        jLabel6.setText("q"+est);
        
    }
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblCadena1;
    private javax.swing.JLabel lblCadena2;
    private javax.swing.JLabel lblOperacion;
    private javax.swing.JLabel lblSimbolo;
    private javax.swing.JTextField txtCadena1;
    private javax.swing.JTextField txtCadena2;
    private javax.swing.JTextField txtSimbolo;
    // End of variables declaration//GEN-END:variables
}
