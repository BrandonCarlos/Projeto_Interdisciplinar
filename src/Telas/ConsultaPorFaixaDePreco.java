package Telas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Brandon Carlos
 */
public class ConsultaPorFaixaDePreco extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaPorFaixaDePreco
     */
    public ConsultaPorFaixaDePreco() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_MaiorPreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_MenorPreco = new javax.swing.JTextField();
        btn_Procurar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaPorFaixaDePreco = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(23, 153, 255));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Consulta por faixa de preço");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 45));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Digite o maior preço:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, -1));

        txt_MaiorPreco.setBackground(new java.awt.Color(23, 153, 255));
        txt_MaiorPreco.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_MaiorPreco.setForeground(new java.awt.Color(255, 255, 255));
        txt_MaiorPreco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_MaiorPreco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_MaiorPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 130, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Digite o menor preço:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, -1));

        txt_MenorPreco.setBackground(new java.awt.Color(23, 153, 255));
        txt_MenorPreco.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_MenorPreco.setForeground(new java.awt.Color(255, 255, 255));
        txt_MenorPreco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_MenorPreco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_MenorPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 130, -1));

        btn_Procurar.setBackground(new java.awt.Color(23, 153, 255));
        btn_Procurar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_Procurar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Procurar.setText("Procurar");
        btn_Procurar.setBorder(null);
        btn_Procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProcurarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Procurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 133, 130, 30));

        TabelaPorFaixaDePreco.setBackground(new java.awt.Color(23, 153, 255));
        TabelaPorFaixaDePreco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TabelaPorFaixaDePreco.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        TabelaPorFaixaDePreco.setForeground(new java.awt.Color(255, 255, 255));
        TabelaPorFaixaDePreco.setModel(new DefaultTableModel());
        TabelaPorFaixaDePreco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(TabelaPorFaixaDePreco);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 760, 170));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Veiculos cadastrados");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 700, -1));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/background3.jpg"))); // NOI18N
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 780, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProcurarActionPerformed
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try{
            ((DefaultTableModel)TabelaPorFaixaDePreco.getModel()).setRowCount(0);
            ((DefaultTableModel)TabelaPorFaixaDePreco.getModel()).setColumnCount(8);
            
            Object cabecalhos[] = {"Id_Veiculo", "Preço", "Ano", "Marca", "Modelo", "Placa", "Estado", "Loja Veiculo"};
            ((DefaultTableModel)TabelaPorFaixaDePreco.getModel()).setColumnIdentifiers(cabecalhos);
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/cad_detran" + "?useLegacyDatetimeCode=false&serverTimezone=America/Sao_Paulo";//Nesta linha teve ERRO, tive que por o "?useLegacyDatetimeCode=false&serverTimezone=America/Sao_Paulo"; para funciona;
            con = DriverManager.getConnection(url, "root", "");
            String query = "SELECT * FROM veiculo WHERE preco >= ? and preco <= ?";
            pst = con.prepareStatement(query);
            pst.setFloat(1, Float.parseFloat(txt_MenorPreco.getText()));
            pst.setFloat(2, Float.parseFloat(txt_MaiorPreco.getText()));
            rs = pst.executeQuery();
            
            Object dados[] = new Object[8];
            while(rs.next()){
                int id_veiculo = rs.getInt("id_veiculo");
                float preco = rs.getFloat("preco");
                Date data = rs.getDate("ano");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String placah = rs.getString("placa");
                String estado = rs.getString("estado");
                String loja = rs.getString("loja_veic");
                
                dados[0] = id_veiculo;
                dados[1] = preco;
                dados[2] = data;
                dados[3] = marca;
                dados[4] = modelo;
                dados[5] = placah;
                dados[6] = estado;
                dados[7] = loja;
                ((DefaultTableModel)TabelaPorFaixaDePreco.getModel()).addRow(dados);
               
            }
        
        }
        catch(SQLException e1){
            JOptionPane.showMessageDialog(null, "Verifique sua base de dados. " + e1);
            
        }
        catch(Exception e2){
            JOptionPane.showMessageDialog(null, "Não foi possivel mostrar o veiculo. " + e2);
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
                if(rs != null){
                    rs.close();
                    rs = null;
                }
                
            }
            catch(Exception e3){
            
            }
            
        }
        
        
    }//GEN-LAST:event_btn_ProcurarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaPorFaixaDePreco;
    private javax.swing.JButton btn_Procurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_MaiorPreco;
    private javax.swing.JTextField txt_MenorPreco;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
