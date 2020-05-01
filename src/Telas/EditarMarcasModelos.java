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
public class EditarMarcasModelos extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditarMarcasModelos
     */
    public EditarMarcasModelos() {
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
        txt_NovoModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_AntigaMarca = new javax.swing.JTextField();
        txt_NovaMarca = new javax.swing.JTextField();
        txt_AntigoModelo = new javax.swing.JTextField();
        btn_Editar = new javax.swing.JButton();
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
        jLabel1.setText("Editar MarcasModelos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 45));

        txt_NovoModelo.setBackground(new java.awt.Color(23, 153, 255));
        txt_NovoModelo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_NovoModelo.setForeground(new java.awt.Color(255, 255, 255));
        txt_NovoModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NovoModelo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_NovoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 210, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Digite a marca:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Digite o modelo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Digite o novo modelo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Digite a nova marca:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txt_AntigaMarca.setBackground(new java.awt.Color(23, 153, 255));
        txt_AntigaMarca.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_AntigaMarca.setForeground(new java.awt.Color(255, 255, 255));
        txt_AntigaMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_AntigaMarca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_AntigaMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 190, -1));

        txt_NovaMarca.setBackground(new java.awt.Color(23, 153, 255));
        txt_NovaMarca.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_NovaMarca.setForeground(new java.awt.Color(255, 255, 255));
        txt_NovaMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NovaMarca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_NovaMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 210, -1));

        txt_AntigoModelo.setBackground(new java.awt.Color(23, 153, 255));
        txt_AntigoModelo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_AntigoModelo.setForeground(new java.awt.Color(255, 255, 255));
        txt_AntigoModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_AntigoModelo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_AntigoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 210, -1));

        btn_Editar.setBackground(new java.awt.Color(23, 153, 255));
        btn_Editar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_Editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Editar.setText("Editar");
        btn_Editar.setBorder(null);
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, 30));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/background3.jpg"))); // NOI18N
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 410, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        
        Connection con = null;
        PreparedStatement pst = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/cad_detran" + "?useLegacyDatetimeCode=false&serverTimezone=America/Sao_Paulo";//Nesta linha teve ERRO, tive que por o "?useLegacyDatetimeCode=false&serverTimezone=America/Sao_Paulo"; para funcionar;
            con =  DriverManager.getConnection(url, "root", "");
            String alterar = "UPDATE marca_modelo SET nome_marca = ?, nome_modelo = ? WHERE nome_marca = ? and nome_modelo = ?";
            pst = con.prepareStatement(alterar);
            pst.setString(1, txt_NovaMarca.getText());
            pst.setString(2, txt_NovoModelo.getText());
            pst.setString(3, txt_AntigaMarca.getText());
            pst.setString(4, txt_AntigoModelo.getText());
            int retorno = pst.executeUpdate();
            if(retorno > 0){
                JOptionPane.showMessageDialog(null, "Marca e Modelo editados com sucesso. ");
            }
       
        }
        catch(SQLException e1){
            JOptionPane.showMessageDialog(null, "Verifique sua base de dados. " + e1);
        }
        catch(Exception e2){
            JOptionPane.showMessageDialog(null, "Erro ao editar Marca e Modelo. " + e2);
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
           
    }//GEN-LAST:event_btn_EditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_AntigaMarca;
    private javax.swing.JTextField txt_AntigoModelo;
    private javax.swing.JTextField txt_NovaMarca;
    private javax.swing.JTextField txt_NovoModelo;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
