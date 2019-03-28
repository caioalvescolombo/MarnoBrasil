
package projeto;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class tela_principal extends javax.swing.JFrame {

    public tela_principal() {
        initComponents();
        
    }
    
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        menubar = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MAR - Mar no Brasil");
        setMaximumSize(new java.awt.Dimension(897, 596));
        setMinimumSize(new java.awt.Dimension(897, 596));
        setPreferredSize(new java.awt.Dimension(897, 596));
        setResizable(false);

        desktop.setBackground(new java.awt.Color(0, 119, 185));
        desktop.setMaximumSize(new java.awt.Dimension(880, 596));
        desktop.setMinimumSize(new java.awt.Dimension(880, 596));
        desktop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu6.setText("Cadastro Geral");

        jMenuItem1.setText("Novo Cadastro");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuItem2.setText("Gerenciar Cadastros");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        menubar.add(jMenu6);

        jMenu2.setText("Escola de Lideres");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem7.setText("Cadastrar Professor");
        jMenu2.add(jMenuItem7);

        jMenuItem3.setText("Cadastrar Alunos");
        jMenu2.add(jMenuItem3);

        jMenuItem5.setText("Chamada");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Criar Turma");
        jMenu2.add(jMenuItem6);

        jMenuItem4.setText("Gerenciar Alunos");
        jMenu2.add(jMenuItem4);

        jMenuItem14.setText("Gerenciar Professores");
        jMenu2.add(jMenuItem14);

        jMenuItem15.setText("Gerenciar Turmas");
        jMenu2.add(jMenuItem15);

        menubar.add(jMenu2);

        jMenu3.setText("Eventos");

        jMenuItem8.setText("Cadastrar Evento");
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Cadastrar Participantes");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Gerenciar Eventos");
        jMenu3.add(jMenuItem10);

        menubar.add(jMenu3);

        jMenu4.setText("Relatórios");

        jMenuItem11.setText("Relatório de Membros");
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("Relatório de Eventos");
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Relatório de Turmas");
        jMenu4.add(jMenuItem13);

        menubar.add(jMenu4);

        jMenu1.setText("Sobre");
        menubar.add(jMenu1);

        jMenu5.setText("Sair");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu5MousePressed(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        menubar.add(jMenu5);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Cadastrogeral geral = new Cadastrogeral();
        geral.setVisible(true);
        desktop.add(geral);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MousePressed
        int sair = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair?","Atenção!",JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu5MousePressed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_principal().setVisible(true);
            }
        });
    }

   private JDesktopPane telaPrincipal;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menubar;
    // End of variables declaration//GEN-END:variables
}
