package br.ufu.facom.esof.superpimsystem.view;

import br.ufu.facom.esof.superpimsystem.dao.DAOFactory;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import br.ufu.facom.esof.superpimsystem.model.Compromisso;
import br.ufu.facom.esof.superpimsystem.model.ThreadCompromisso;


public class CompromissoGUI extends javax.swing.JFrame {
     Compromisso atual;
     MaskFormatter maskHora;
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
     Principal p;
     ThreadCompromisso t;
    /** Creates new form CompromissoGUI */
    public CompromissoGUI(Principal p,ThreadCompromisso t) {
        super("Adicionar / Editar Compromissos");
        initComponents();
        setLocationRelativeTo(null);
        bExcluir.setEnabled(false);
        this.p = p;
        this.t = t;

    }

    public CompromissoGUI(Principal p,Compromisso atual,ThreadCompromisso t) {
        super("Adicionar / Editar Compromissos");
        initComponents();
        setLocationRelativeTo(null);
        this.atual = atual;
        this.p = p;
        this.t = t;
        
        
        CarregarCompromisso();

    }

    public void CarregarCompromisso(){
            java.util.Date date = null;
            try {
                date = atual.getData();
            } catch (Exception e) {
            }

            campoData.setDate(date);
            campoDetalhes.setText(atual.getDetalhes());
            campoHora.setText(atual.getHora());
            campoLocal.setText(atual.getLocal());
            notificar.setSelected(atual.isNotificacao());


        }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dias = new javax.swing.ButtonGroup();
        botaoOpcao = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        painelTabulado = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDetalhes = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        campoLocal = new javax.swing.JTextField();
        try{
            maskHora = new MaskFormatter("##:##");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Nao foi possivel inserir a mascara");
        }
        campoHora = 
        new JFormattedTextField(maskHora);
        ;
        jLabel4 = new javax.swing.JLabel();
        campoData = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        notificar = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/compromisso.png"))); // NOI18N
        jLabel1.setText("Adicionar / Editar Compromisso");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addCompromisso.png"))); // NOI18N
        jButton1.setText("Salvar");
        jButton1.setPreferredSize(new java.awt.Dimension(118, 60));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sign-Shutdown-icon.png"))); // NOI18N
        jButton2.setText("Fechar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ecluirCompromisso.png"))); // NOI18N
        bExcluir.setText("Excluir");
        bExcluir.setPreferredSize(new java.awt.Dimension(130, 60));
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campoDetalhes.setColumns(20);
        campoDetalhes.setRows(5);
        jScrollPane1.setViewportView(campoDetalhes);

        jLabel6.setText("Detalhes");

        jLabel4.setText("Hora");

        jLabel3.setText("Data");

        jLabel5.setText("Local");

        notificar.setText("Notificar-me por email");

        jLabel2.setText("OBS: Você receberá duas notificações: na véspera e no dia do evento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(notificar)
                            .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(163, 163, 163)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoHora, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)))
                            .addGap(23, 23, 23)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        painelTabulado.addTab("Compromisso", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(painelTabulado, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTabulado, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean testarConsistencia(){
        boolean ok = true;
        if(campoDetalhes.getText().equals("") || campoLocal.getText().equals("")){
            ok = false;
        }
        return ok;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            br.ufu.facom.esof.superpimsystem.dao.DAO d = br.ufu.facom.esof.superpimsystem.dao.DAOFactory.getInstance().getDAO(DAOFactory.COMPROMISSO);

            if (atual == null) {

                try {
                    sdf.format(campoData.getDate());
        
                    boolean consistencia = testarConsistencia();
                    if (!consistencia) {
                        JOptionPane.showMessageDialog(this, "Por favor verifique os dados.", "Erro", JOptionPane.ERROR_MESSAGE);
                    } else {
                        Compromisso add = new Compromisso(new java.sql.Date(campoData.getDate().getTime()), campoHora.getText(), campoLocal.getText(), campoDetalhes.getText(), notificar.isSelected());
                        d.salvar(add);
                        p.modeloComprimissos.limpar();
                        p.modeloComprimissos.addListaDeCompromisso(d.getAllComp());
                        p.modeloComprimissos.filtrarData("");
                        
                        t.addCom(p.modeloComprimissos.getCompromisso(p.modeloComprimissos.getRowCount()-1));
                        JOptionPane.showMessageDialog(this, "Compromisso salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Por favor corrija a data.", "Erro", JOptionPane.ERROR_MESSAGE);
                }


            } else {

                try {
                    sdf.format(campoData.getDate());
                    boolean consistencia = testarConsistencia();
                    if (!consistencia) {
                        JOptionPane.showMessageDialog(this, "Por favor verifique os dados.", "Erro", JOptionPane.ERROR_MESSAGE);
                    } else {
                        atual.setData(new java.sql.Date(campoData.getDate().getTime()));
                        atual.setDetalhes(campoDetalhes.getText());
                        atual.setHora(campoHora.getText());
                        atual.setLocal(campoLocal.getText());
                        atual.setNotificacao(notificar.isSelected());

                        d.update(atual);
                        p.modeloComprimissos.limpar();
                        p.modeloComprimissos.addListaDeCompromisso(d.getAllComp());
                        p.modeloComprimissos.filtrarData("");
                        t.addCom(atual);
                        JOptionPane.showMessageDialog(this, "Compromisso salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro: " + ex, "Erro!", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Por favor corrija a data.", "Erro", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }                                      

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        // TODO add your handling code here:
           try {
            br.ufu.facom.esof.superpimsystem.dao.DAO d = br.ufu.facom.esof.superpimsystem.dao.DAOFactory.getInstance().getDAO(DAOFactory.COMPROMISSO);
            d.delete(atual);
            p.modeloComprimissos.limpar();
            p.modeloComprimissos.addListaDeCompromisso(d.getAllComp());
            p.modeloComprimissos.filtrarData("");
            t.remCom(atual);
            JOptionPane.showMessageDialog(this, "Compromisso excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
         }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro: " + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
         }
    }//GEN-LAST:event_bExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bExcluir;
    private javax.swing.ButtonGroup botaoOpcao;
    private com.toedter.calendar.JDateChooser campoData;
    private javax.swing.JTextArea campoDetalhes;
    private javax.swing.JTextField campoHora;
    private javax.swing.JTextField campoLocal;
    private javax.swing.ButtonGroup dias;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox notificar;
    private javax.swing.JTabbedPane painelTabulado;
    // End of variables declaration//GEN-END:variables

}
