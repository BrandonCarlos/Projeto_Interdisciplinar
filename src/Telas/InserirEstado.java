/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Brandon Carlos
 */
public class InserirEstado extends javax.swing.JInternalFrame {

    /**
     * Creates new form InserirEstado
     */
    public InserirEstado() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Abreviatura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_NomeEstado = new javax.swing.JTextField();
        btn_Inserir = new javax.swing.JButton();
        wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(23, 153, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inserindo estados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 45));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Abreviatura:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txt_Abreviatura.setBackground(new java.awt.Color(23, 153, 255));
        txt_Abreviatura.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_Abreviatura.setForeground(new java.awt.Color(255, 255, 255));
        txt_Abreviatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Abreviatura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Abreviatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, 60, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nome do estado:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, -1));

        txt_NomeEstado.setBackground(new java.awt.Color(23, 153, 255));
        txt_NomeEstado.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_NomeEstado.setForeground(new java.awt.Color(255, 255, 255));
        txt_NomeEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NomeEstado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_NomeEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 155, 140, -1));

        btn_Inserir.setBackground(new java.awt.Color(23, 153, 255));
        btn_Inserir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_Inserir.setForeground(new java.awt.Color(255, 255, 255));
        btn_Inserir.setText("Inserir");
        btn_Inserir.setBorder(null);
        btn_Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InserirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Inserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, 30));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/background3.jpg"))); // NOI18N
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 390, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InserirActionPerformed
        
        Connection con = null;
        PreparedStatement pst = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/cad_detran" + "?useLegacyDatetimeCode=false&serverTimezone=America/Sao_Paulo";//Nesta linha teve ERRO, tive que por o "?useLegacyDatetimeCode=false&serverTimezone=America/Sao_Paulo"; para funcionar;
            con = DriverManager.getConnection(url, "root", "");
            String insertando = "INSERT INTO estado (id_abreviatura, nome_estado) VALUES(?, ?)";
            pst = con.prepareStatement(insertando);
            pst.setString(1, txt_Abreviatura.getText());
            pst.setString(2, txt_NomeEstado.getText());           
            int retorno = pst.executeUpdate();
                       
            if(retorno > 0){
                JOptionPane.showMessageDialog(null, "Estado inserido com sucesso. ");
            }
                    
        }
        catch(SQLException e1){
            JOptionPane.showMessageDialog(null, "Verifique sua base de dados. " + e1);
        }
        catch(Exception e2){
            JOptionPane.showMessageDialog(null, "Erro ao inserir o estado. " + e2);
        }
        finally{
            try{
                if(con != null){
                    con.close();
                    con = null;                  
                }
                if(pst != null){
                    pst.close();
                    pst = null;
                }
                    
            }
            catch(Exception e3){
            
            }
        }
        
    }//GEN-LAST:event_btn_InserirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Inserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Abreviatura;
    private javax.swing.JTextField txt_NomeEstado;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
