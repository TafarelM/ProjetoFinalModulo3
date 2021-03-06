package view;

import ulti.SoNumeros;
import javax.swing.JOptionPane;
import model.bean.Disciplina;
import model.dao.DisciplinaDAO;
/**
 *
 * @author Tafar
 */
public class FrmCadastrarDisciplina extends javax.swing.JDialog {

    /**
     * Creates new form FrmCadastrarDisciplina
     */
    int modoEscopo;
    Disciplina d = new Disciplina();

    public FrmCadastrarDisciplina(Disciplina disciplina, Integer modo) {
        initComponents();
        
        txtCargahoraria.setDocument(new SoNumeros());
        txtNumeroVagas.setDocument(new SoNumeros());

        this.setModal(true);

        d = disciplina;
        modoEscopo = modo;

        if (modo == 1) {
            //cadastrar
            this.setTitle("Cadastrar Disciplina");
            btnSalvar.setText("Salvar");
            btnFechar.setText("Fechar");

        } else if (modo == 2) {
            //editar
            this.setTitle("Editar Disciplina");
            btnSalvar.setText("Editar");
            btnFechar.setText("Cancelar");

            txtId.setText(Integer.toString(disciplina.getId()));
            txtNome.setText(disciplina.getNome());
            txtCargahoraria.setText(Integer.toString(disciplina.getCargaHoraria()));
            txtCurso.setText(disciplina.getCurso());
            txtNumeroVagas.setText(Integer.toString(disciplina.getNumeroVagas()));
            cbPeriodo.setSelectedItem(disciplina.getPeriodo());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumeroVagas = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        txtCargahoraria = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        cbPeriodo = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Disciplina");

        jLabel2.setText("Nome");

        jLabel3.setText("Caga Horaria");

        jLabel4.setText("Curso");

        jLabel5.setText("Numero de Vagas");

        jLabel6.setText("Periodo");

        cbPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite" }));
        cbPeriodo.setSelectedIndex(-1);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        lblId.setText("Código");

        txtId.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblId)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCargahoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNumeroVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cbPeriodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(txtNome))
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargahoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNumeroVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Disciplina disciplina = new Disciplina();
        DisciplinaDAO dao = new DisciplinaDAO();

        if (modoEscopo == 1) {
            if(txtNome.getText().trim().length() < 2){
                JOptionPane.showMessageDialog(null, "Campo Nome é obrigatorio.");
                txtNome.requestFocus();
                return;
            }
            if(txtCargahoraria.getText().trim().length() < 1){
                JOptionPane.showMessageDialog(null, "Carga horária é um campo obrigatorio.");
                txtCargahoraria.requestFocus();
                return;
            }
            if(txtCurso.getText().trim().length() < 2){
                JOptionPane.showMessageDialog(null, "Curso é um campo obrigatorio.");
                txtCurso.requestFocus();
                return;
            }
            if(txtNumeroVagas.getText().trim().length() < 1){
                JOptionPane.showMessageDialog(null, "Numero de vagas é um campo obrigatorio.");
                txtNumeroVagas.requestFocus();
                return;
            }
            if(cbPeriodo.getSelectedIndex() < 0){
                JOptionPane.showMessageDialog(null, "Periodo é um campo obrigatorio.");
                cbPeriodo.requestFocus();
                return;
            }   

            disciplina.setNome(txtNome.getText());
            disciplina.setCargaHoraria(Integer.parseInt(txtCargahoraria.getText()));
            disciplina.setCurso(txtCurso.getText());
            disciplina.setNumeroVagas(Integer.parseInt(txtNumeroVagas.getText()));
            disciplina.setPeriodo(cbPeriodo.getSelectedItem().toString());

            dao.salvar(disciplina);

            txtNome.setText(null);
            txtCargahoraria.setText(null);
            txtCurso.setText(null);
            txtNumeroVagas.setText(null);
            cbPeriodo.setSelectedIndex(-1);

        } else if (modoEscopo == 2) {
            if(txtNome.getText().trim().length() < 2){
                JOptionPane.showMessageDialog(null, "Campo Nome é obrigatorio.");
                txtNome.requestFocus();
                return;
            }
            if(txtCargahoraria.getText().trim().length() < 1){
                JOptionPane.showMessageDialog(null, "Carga horária é um campo obrigatorio.");
                txtCargahoraria.requestFocus();
                return;
            }
            if(txtCurso.getText().trim().length() < 2){
                JOptionPane.showMessageDialog(null, "Curso é um campo obrigatorio.");
                txtCurso.requestFocus();
                return;
            }
            if(txtNumeroVagas.getText().trim().length() < 1){
                JOptionPane.showMessageDialog(null, "Numero de vagas é um campo obrigatorio.");
                txtNumeroVagas.requestFocus();
                return;
            }
            if(cbPeriodo.getSelectedIndex() < 0){
                JOptionPane.showMessageDialog(null, "Periodo é um campo obrigatorio.");
                cbPeriodo.requestFocus();
                return;
            } 
            
            d.setNome(txtNome.getText());
            d.setCargaHoraria(Integer.parseInt(txtCargahoraria.getText()));
            d.setCurso(txtCurso.getText());
            d.setNumeroVagas(Integer.parseInt(txtNumeroVagas.getText()));
            d.setPeriodo(cbPeriodo.getSelectedItem().toString());

            dao.editar(d);

            this.dispose();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadastrarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastrarDisciplina(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbPeriodo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtCargahoraria;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroVagas;
    // End of variables declaration//GEN-END:variables
}
