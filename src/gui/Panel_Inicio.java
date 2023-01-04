package gui;

import modelo.Jogo;
import gui.Frame_Principal;

public class Panel_Inicio extends javax.swing.JPanel {

    //variável que armazena o frame que irá "mostrá-lo"
    private Frame_Principal framePai;
   
    //construtor
    public Panel_Inicio(Frame_Principal principalF) {
       initComponents();
       this.framePai = principalF;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dicaTxt = new javax.swing.JTextField();
        palavraSegredoTxt = new javax.swing.JTextField();
        dicaLabel = new javax.swing.JLabel();
        palavraSegredoLabel = new javax.swing.JLabel();
        iniciaBnt = new javax.swing.JButton();
        jogado1Label = new javax.swing.JLabel();
        jogoLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(255, 255, 204));

        dicaTxt.setBackground(new java.awt.Color(255, 255, 204));
        dicaTxt.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        dicaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dicaTxtActionPerformed(evt);
            }
        });

        palavraSegredoTxt.setBackground(new java.awt.Color(255, 255, 204));
        palavraSegredoTxt.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        palavraSegredoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palavraSegredoTxtActionPerformed(evt);
            }
        });

        dicaLabel.setBackground(new java.awt.Color(255, 204, 204));
        dicaLabel.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        dicaLabel.setText("Informe a dica:");

        palavraSegredoLabel.setBackground(new java.awt.Color(255, 204, 204));
        palavraSegredoLabel.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        palavraSegredoLabel.setText("Informe a palavra:");

        iniciaBnt.setBackground(new java.awt.Color(204, 204, 255));
        iniciaBnt.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        iniciaBnt.setText("INICIAR JOGO");
        iniciaBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciaBntActionPerformed(evt);
            }
        });

        jogado1Label.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jogado1Label.setText("Jogador 1");

        jogoLabel.setFont(new java.awt.Font("SimSun-ExtB", 1, 48)); // NOI18N
        jogoLabel.setForeground(new java.awt.Color(204, 204, 255));
        jogoLabel.setText("JOGO DA FORCA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jogado1Label)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dicaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(palavraSegredoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dicaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(palavraSegredoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jogoLabel)))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iniciaBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jogoLabel)
                .addGap(103, 103, 103)
                .addComponent(jogado1Label)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(palavraSegredoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(palavraSegredoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dicaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dicaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)))
                .addComponent(iniciaBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dicaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dicaTxtActionPerformed

    }//GEN-LAST:event_dicaTxtActionPerformed

    private void palavraSegredoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palavraSegredoTxtActionPerformed
     
    }//GEN-LAST:event_palavraSegredoTxtActionPerformed

    private void iniciaBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciaBntActionPerformed
        //botão de iniciar
        
        //acessa a palavra e a dica informada pelo usuário
        String palavra = palavraSegredoTxt.getText();
        String dica = dicaTxt.getText();

        //cria novo jogo
        Jogo novoJogo = new Jogo(palavra, dica);
        
        //mudar de painel
        framePai.trocaPanel(new Panel_Jogo(framePai, novoJogo));
    }//GEN-LAST:event_iniciaBntActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dicaLabel;
    private javax.swing.JTextField dicaTxt;
    private javax.swing.JButton iniciaBnt;
    private javax.swing.JLabel jogado1Label;
    private javax.swing.JLabel jogoLabel;
    private javax.swing.JLabel palavraSegredoLabel;
    private javax.swing.JTextField palavraSegredoTxt;
    // End of variables declaration//GEN-END:variables
}
