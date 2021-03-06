package codigo;

import java.awt.Image;
import java.util.Random;
import javafx.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zaruk
 */
public class Ahorcado extends javax.swing.JFrame {
     String palabraOculta = "CE TYS";
    int contadorFallos = 0;
    int vida=1;
    
    
    String [] listaPalabras={"UNIVERSIDAD","BONDAD","ORDENADOR","TAZA","TECLADO","PANTALLA","TECLA","CORTINA","ABRIGO"};
    
    /**
     * Creates new form Ahorcado
     */
    public Ahorcado() {
        initComponents();
        palabraOculta= eligePalabra(listaPalabras);
        System.out.println(palabraOculta);
        escribe_guiones();
    }
    private void escribe_guiones(){
        String auxiliar="";
        for (int i=0; i<palabraOculta.length(); i++){
            auxiliar= auxiliar + "_ ";
        }
        palabraGuiones.setText(auxiliar);
    }
    private String eligePalabra( String [] lista){
        Random aleatorio = new Random();
        return lista[aleatorio.nextInt(lista.length)];
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     private void chequeaBoton(JButton boton){
        chequeaLetra(boton.getText());
        boton.setEnabled(false);
    }
    
    private void chequeaLetra(String letra){
       String auxiliar = palabraGuiones.getText();
        if (palabraOculta.contains(letra)&& vida ==1){
            //si la letra esta se quita un guion y se sustituye
           
            
            
            for(int i=0; i<palabraOculta.length(); i++){
                if (palabraOculta.charAt(i)== letra.charAt(0) ){
                    System.out.println(i);
                    auxiliar = auxiliar.substring(0, 2*i)+ letra
                            + auxiliar.substring(2*i+1);
                    
                }
            }
            palabraGuiones.setText(auxiliar);
        }
        else{
            //la letra no est?? y hay que aumentar el contador de fallos
            //y cambiar la imagen del ahorcado
            contadorFallos++;
            dibujaImagen();
        }
    }
    
    public void dibujaImagen(){
        String nombreImagen = "";
        if(!palabraGuiones.getText().contains("_ ")&& vida == 1){
            nombreImagen = "/Imagenes/acertaste.jpg"; 
            
        }
        else{
                
        switch (contadorFallos){//switch instrucci??n que tienen todos los lenguajes de programaci??n
            case 0: nombreImagen = "/Imagenes/ahorcado_1.png"; break;
            case 1: nombreImagen = "/Imagenes/ahorcado_2.png"; break;
            case 2: nombreImagen = "/Imagenes/ahorcado_3.png"; break;
            case 3: nombreImagen = "/Imagenes/ahorcado_4.png"; break;
            case 4: nombreImagen = "/Imagenes/ahorcado_5.png"; break;
            case 5: nombreImagen = "/Imagenes/ahorcado_6.png"; break;
            default : nombreImagen = "/Imagenes/ahorcado72.png"; break;
         
        }
        if (contadorFallos>=7) {
            //al darle a correcion cuenta como un fallo m??s, en verdad puedes darle a cualquier tecla
            nombreImagen = "/Imagenes/game_over.jpg";
            palabraGuiones.setText(palabraOculta);
            vida = 0;
            
            
        } else {            }
        }    
        //cargar la im??gen correspondiente en el jLable del imagenahorcado
        ImageIcon miImagen = new ImageIcon(
        new ImageIcon(getClass().getResource(nombreImagen)).getImage()
                .getScaledInstance(imagenAhorcado.getWidth(), 
                        imagenAhorcado.getHeight(), Image.SCALE_DEFAULT)
        );
        imagenAhorcado.setIcon(miImagen);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        palabraGuiones = new javax.swing.JLabel();
        imagenAhorcado = new javax.swing.JLabel();
        boton_A = new javax.swing.JButton();
        boton_B = new javax.swing.JButton();
        boton_C = new javax.swing.JButton();
        boton_D = new javax.swing.JButton();
        boton_E = new javax.swing.JButton();
        boton_F = new javax.swing.JButton();
        boton_G = new javax.swing.JButton();
        boton_H = new javax.swing.JButton();
        boton_I = new javax.swing.JButton();
        boton_J = new javax.swing.JButton();
        boton_K = new javax.swing.JButton();
        boton_L = new javax.swing.JButton();
        boton_M = new javax.swing.JButton();
        boton_N = new javax.swing.JButton();
        boton_?? = new javax.swing.JButton();
        boton_O = new javax.swing.JButton();
        boton_P = new javax.swing.JButton();
        boton_Q = new javax.swing.JButton();
        boton_R = new javax.swing.JButton();
        boton_S = new javax.swing.JButton();
        boton_T = new javax.swing.JButton();
        boton_U = new javax.swing.JButton();
        boton_V = new javax.swing.JButton();
        boton_W = new javax.swing.JButton();
        boton_X = new javax.swing.JButton();
        boton_Y = new javax.swing.JButton();
        boton_Z = new javax.swing.JButton();
        boton_chequea = new javax.swing.JButton();
        Correcci??n = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        palabraGuiones.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        palabraGuiones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        palabraGuiones.setText("_ _ _ _ _ ");
        palabraGuiones.setToolTipText("");
        palabraGuiones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        boton_A.setText("A");
        boton_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AActionPerformed(evt);
            }
        });

        boton_B.setText("B");
        boton_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_BActionPerformed(evt);
            }
        });

        boton_C.setText("C");
        boton_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_CActionPerformed(evt);
            }
        });

        boton_D.setText("D");
        boton_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_DActionPerformed(evt);
            }
        });

        boton_E.setText("E");
        boton_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_EActionPerformed(evt);
            }
        });

        boton_F.setText("F");
        boton_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_FActionPerformed(evt);
            }
        });

        boton_G.setText("G");
        boton_G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_GActionPerformed(evt);
            }
        });

        boton_H.setText("H");
        boton_H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_HActionPerformed(evt);
            }
        });

        boton_I.setText("I");
        boton_I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_IActionPerformed(evt);
            }
        });

        boton_J.setText("J");
        boton_J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_JActionPerformed(evt);
            }
        });

        boton_K.setText("K");
        boton_K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_KActionPerformed(evt);
            }
        });

        boton_L.setText("L");
        boton_L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_LActionPerformed(evt);
            }
        });

        boton_M.setText("M");
        boton_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_MActionPerformed(evt);
            }
        });

        boton_N.setText("N");
        boton_N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_NActionPerformed(evt);
            }
        });

        boton_??.setText("??");
        boton_??.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_??ActionPerformed(evt);
            }
        });

        boton_O.setText("O");
        boton_O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_OActionPerformed(evt);
            }
        });

        boton_P.setText("P");
        boton_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_PActionPerformed(evt);
            }
        });

        boton_Q.setText("Q");
        boton_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_QActionPerformed(evt);
            }
        });

        boton_R.setText("R");
        boton_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_RActionPerformed(evt);
            }
        });

        boton_S.setText("S");
        boton_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_SActionPerformed(evt);
            }
        });

        boton_T.setText("T");
        boton_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_TActionPerformed(evt);
            }
        });

        boton_U.setText("U");
        boton_U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_UActionPerformed(evt);
            }
        });

        boton_V.setText("V");
        boton_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_VActionPerformed(evt);
            }
        });

        boton_W.setText("W");
        boton_W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_WActionPerformed(evt);
            }
        });

        boton_X.setText("X");
        boton_X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_XActionPerformed(evt);
            }
        });

        boton_Y.setText("Y");
        boton_Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_YActionPerformed(evt);
            }
        });

        boton_Z.setText("Z");
        boton_Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ZActionPerformed(evt);
            }
        });

        boton_chequea.setText("??Estar?? bien?");
        boton_chequea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_chequeaActionPerformed(evt);
            }
        });

        Correcci??n.setText("Correci??n");
        Correcci??n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Correcci??nActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(imagenAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(palabraGuiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(boton_A, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton_C, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton_D, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton_E, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton_F, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton_G, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton_H, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton_I, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 67, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(boton_J, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_K, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_L, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_M, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_N, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_??, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_O, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_P, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(boton_R, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_S, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_T, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_U, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_V, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_W, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_X, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_Z, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(boton_chequea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Correcci??n, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(palabraGuiones, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagenAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_A, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_C, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_F, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_H, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_G, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_D, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_I, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_E, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_J, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_K, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_L, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_M, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_N, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_??, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_O, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_P, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_R, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_T, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_W, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_X, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_S, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_U, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_Z, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_V, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_chequea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Correcci??n, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AActionPerformed
        // TODO add your handling code here:
            chequeaBoton((JButton)evt.getSource());//evt es el evento //te dice qui??n ha realizado el evento(el boton exacto al hacer clic en el)//a esto se le llama castear
    }//GEN-LAST:event_boton_AActionPerformed

    private void boton_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_RActionPerformed
        // TODO add your handling code here:
            chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_RActionPerformed

    private void boton_NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_NActionPerformed
        // TODO add your handling code here:
            chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_NActionPerformed

    private void boton_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_BActionPerformed
        // TODO add your handling code here:
            chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_BActionPerformed

    private void boton_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_CActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_CActionPerformed

    private void boton_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_DActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_DActionPerformed

    private void boton_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_EActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_EActionPerformed

    private void boton_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_FActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_FActionPerformed

    private void boton_GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_GActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_GActionPerformed

    private void boton_HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_HActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_HActionPerformed

    private void boton_IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_IActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_IActionPerformed

    private void boton_JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_JActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_JActionPerformed

    private void boton_KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_KActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_KActionPerformed

    private void boton_LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_LActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_LActionPerformed

    private void boton_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_MActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_MActionPerformed

    private void boton_??ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_??ActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_??ActionPerformed

    private void boton_OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_OActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_OActionPerformed

    private void boton_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_PActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_PActionPerformed

    private void boton_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_QActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_QActionPerformed

    private void boton_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_SActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_SActionPerformed

    private void boton_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_TActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_TActionPerformed

    private void boton_UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_UActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_UActionPerformed

    private void boton_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_VActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_VActionPerformed

    private void boton_WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_WActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_WActionPerformed

    private void boton_XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_XActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_XActionPerformed

    private void boton_YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_YActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_YActionPerformed

    private void boton_ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ZActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_ZActionPerformed

    private void boton_chequeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_chequeaActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton_chequeaActionPerformed

    private void Correcci??nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Correcci??nActionPerformed
        // TODO add your handling code here:
        chequeaBoton((JButton)evt.getSource());
         
    }//GEN-LAST:event_Correcci??nActionPerformed
    
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
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ahorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Correcci??n;
    private javax.swing.JButton boton_A;
    private javax.swing.JButton boton_B;
    private javax.swing.JButton boton_C;
    private javax.swing.JButton boton_D;
    private javax.swing.JButton boton_E;
    private javax.swing.JButton boton_F;
    private javax.swing.JButton boton_G;
    private javax.swing.JButton boton_H;
    private javax.swing.JButton boton_I;
    private javax.swing.JButton boton_J;
    private javax.swing.JButton boton_K;
    private javax.swing.JButton boton_L;
    private javax.swing.JButton boton_M;
    private javax.swing.JButton boton_N;
    private javax.swing.JButton boton_O;
    private javax.swing.JButton boton_P;
    private javax.swing.JButton boton_Q;
    private javax.swing.JButton boton_R;
    private javax.swing.JButton boton_S;
    private javax.swing.JButton boton_T;
    private javax.swing.JButton boton_U;
    private javax.swing.JButton boton_V;
    private javax.swing.JButton boton_W;
    private javax.swing.JButton boton_X;
    private javax.swing.JButton boton_Y;
    private javax.swing.JButton boton_Z;
    private javax.swing.JButton boton_chequea;
    private javax.swing.JButton boton_??;
    private javax.swing.JLabel imagenAhorcado;
    private javax.swing.JLabel palabraGuiones;
    // End of variables declaration//GEN-END:variables
}
