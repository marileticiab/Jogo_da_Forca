package gui;

import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Jogo;

public class Panel_Jogo extends javax.swing.JPanel {

    //variável que armazena o frame que irá "mostrá-lo"
    private Frame_Principal framePai;
    //variável que armazena o jogo em si
    private Jogo newJogo;
    //vetor vazio -> irá add a letra em sua devida posição, caso o jogador a informe
    private char[] vetLetras;
    //variável para acessar a palavra-segredo
    private String palavra;
    
    //construtor
    public Panel_Jogo(Frame_Principal principalF, Jogo novoJogo) {
        
        initComponents();
        
        //qual frame irá usar
        this.framePai = principalF;
        
        //informa jogo
        this.newJogo = novoJogo;
        
        //instanciando o vetor de letras
        this.vetLetras = new char[novoJogo.getPalavra().length()];
        
        //mostrando no painel - início do jogo
        this.errosTxt2.setText("0");
        this.tenatativasTxt2.setText("0");
        this.dicaTxt2.setText(novoJogo.getDica());
        
        //acessando a palavra-segredo 
        this.palavra = novoJogo.getPalavra();
    }
    
    private void verificaLetra(String letra) {
        
        //transformando String em int
        int errosInt = Integer.parseInt(errosTxt2.getText());
        int tentativaInt = Integer.parseInt(tenatativasTxt2.getText());
        
        //add tentativa
        tentativaInt++;
       
        //a palavra é dividida em vetor de caracteres 
        char[] vetPalavra = newJogo.getPalavra().toCharArray();
        
        //a letra informada é transformada de String para Char (pois é somente um caracter)
        char l = letra.charAt(0);
        
        //auxiliar para verificação de acertos
        boolean acerto = false;
        
        //verificando letra 
        for(int i = 0; i <= vetPalavra.length-1; i++){
            
            //vê se a letra informada coincide com alguma outra da palavra-segredo
            if(vetPalavra[i] == l){
                acerto = true;//houve acerto
                
                //iguala as posições para mostrar a palavra
                vetLetras[i] = vetPalavra[i];
            }
        }
        
        //cria String a partir do vetor estático de char 
        String palavraImpressa = new String(vetLetras);
        segredoLabel.setText(palavraImpressa); //imprimir palavra no panel
         
        //não houve acerto
        if(acerto == false){
            
                //add erro
                errosInt++;
            
                //remove imagem existente no label da forca
                forcaLabel.removeAll();
                
                //add uma parte do corpo do boneco
                if(errosInt == 1){
                    ImageIcon icone1 = new ImageIcon(getClass().getResource("/imagens_jogo/cabeca.png"));
                    forcaLabel.setIcon(icone1);
                }
                
                if(errosInt == 2){
                    ImageIcon icone2 = new ImageIcon(getClass().getResource("/imagens_jogo/tronco.png"));
                    forcaLabel.setIcon(icone2);
                }
                
                if(errosInt == 3){
                    ImageIcon icone3 = new ImageIcon(getClass().getResource("/imagens_jogo/braco_dir.png"));
                    forcaLabel.setIcon(icone3);
                }
                
                if(errosInt == 4){
                    ImageIcon icone4 = new ImageIcon(getClass().getResource("/imagens_jogo/braco_esq.png"));
                    forcaLabel.setIcon(icone4);
                }
                
                if(errosInt == 5){
                    ImageIcon icone5 = new ImageIcon(getClass().getResource("/imagens_jogo/perna_dir.png"));
                    forcaLabel.setIcon(icone5);
                }
                
                if(errosInt == 6){
                    ImageIcon icone6 = new ImageIcon(getClass().getResource("/imagens_jogo/perna_esq.png"));
                    forcaLabel.setIcon(icone6);
                }
            }
      
       //mudando no painel[int para String]
       errosTxt2.setText(Integer.toString(errosInt));
       tenatativasTxt2.setText(Integer.toString(tentativaInt));
        
       //verifica se há vencedor
       if(verificaVencedor(errosInt, palavraImpressa) == true){
           //para o execução do programa, caso exista
           System.exit(0);
       }
    }
    
    private boolean verificaVencedor(int erros, String palavraSegredo) {
        
        if(erros == 6){
            //jogador 1 venceu
            JOptionPane.showMessageDialog(null,"VENCEDOR: \n JOGADOR 1"); //mensagem
            return true;
        }else{
            if(palavraSegredo.equals(palavra)){
                //jogador 2 venceu
                JOptionPane.showMessageDialog(null,"VENCEDOR: \n JOGADOR 2"); //mensagem
                return true;
            }else{
                return false;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jogador2_Painel = new javax.swing.JPanel();
        letraTxt = new javax.swing.JTextField();
        dicaLabel = new javax.swing.JLabel();
        errosLabel = new javax.swing.JLabel();
        tentativaLabel = new javax.swing.JLabel();
        rodadaLabel = new javax.swing.JLabel();
        jogado2Label = new javax.swing.JLabel();
        jogoLabel = new javax.swing.JLabel();
        dicaTxt2 = new javax.swing.JLabel();
        tenatativasTxt2 = new javax.swing.JLabel();
        errosTxt2 = new javax.swing.JLabel();
        verificaBnt = new javax.swing.JButton();
        forcaLabel = new javax.swing.JLabel();
        segredoLabel = new javax.swing.JLabel();

        jogador2_Painel.setBackground(new java.awt.Color(255, 255, 204));

        letraTxt.setBackground(new java.awt.Color(255, 255, 204));
        letraTxt.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        letraTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraTxtActionPerformed(evt);
            }
        });

        dicaLabel.setBackground(new java.awt.Color(255, 204, 204));
        dicaLabel.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        dicaLabel.setText("Dica:");

        errosLabel.setBackground(new java.awt.Color(255, 204, 204));
        errosLabel.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        errosLabel.setText("Erros:");

        tentativaLabel.setBackground(new java.awt.Color(255, 204, 204));
        tentativaLabel.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        tentativaLabel.setText("Tentativa:");

        rodadaLabel.setBackground(new java.awt.Color(255, 204, 204));
        rodadaLabel.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        rodadaLabel.setText("Letra:");

        jogado2Label.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jogado2Label.setText("Jogador 2");

        jogoLabel.setFont(new java.awt.Font("SimSun-ExtB", 1, 48)); // NOI18N
        jogoLabel.setForeground(new java.awt.Color(204, 204, 255));
        jogoLabel.setText("JOGO DA FORCA");

        dicaTxt2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dicaTxt2.setText("jLabel1");

        tenatativasTxt2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tenatativasTxt2.setText("jLabel1");

        errosTxt2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        errosTxt2.setText("jLabel1");

        verificaBnt.setBackground(new java.awt.Color(204, 204, 255));
        verificaBnt.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        verificaBnt.setText("VERIFICA");
        verificaBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificaBntActionPerformed(evt);
            }
        });

        forcaLabel.setBackground(new java.awt.Color(204, 204, 255));
        forcaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_jogo/forca.png"))); // NOI18N
        forcaLabel.setText("*");

        segredoLabel.setBackground(new java.awt.Color(204, 204, 255));
        segredoLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        javax.swing.GroupLayout jogador2_PainelLayout = new javax.swing.GroupLayout(jogador2_Painel);
        jogador2_Painel.setLayout(jogador2_PainelLayout);
        jogador2_PainelLayout.setHorizontalGroup(
            jogador2_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jogador2_PainelLayout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jogoLabel)
                .addGap(360, 360, Short.MAX_VALUE))
            .addGroup(jogador2_PainelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jogador2_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jogador2_PainelLayout.createSequentialGroup()
                        .addGroup(jogador2_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rodadaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jogador2_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(errosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tentativaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jogador2_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jogador2_PainelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jogador2_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tenatativasTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(errosTxt2)))
                            .addGroup(jogador2_PainelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(verificaBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jogador2_PainelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(letraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(dicaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jogado2Label)
                    .addComponent(dicaTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jogador2_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(forcaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segredoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(215, 215, 215))
        );
        jogador2_PainelLayout.setVerticalGroup(
            jogador2_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jogador2_PainelLayout.createSequentialGroup()
                .addGroup(jogador2_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jogador2_PainelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jogoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(forcaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(segredoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jogador2_PainelLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jogado2Label)
                        .addGap(43, 43, 43)
                        .addComponent(dicaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dicaTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jogador2_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tentativaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenatativasTxt2))
                        .addGap(7, 7, 7)
                        .addGroup(jogador2_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(errosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errosTxt2))
                        .addGap(85, 85, 85)
                        .addGroup(jogador2_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rodadaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(verificaBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jogador2_Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jogador2_Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void verificaBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificaBntActionPerformed
        
        //acessa a letra informada no painel
        verificaLetra(this.letraTxt.getText());
    }//GEN-LAST:event_verificaBntActionPerformed

    private void letraTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraTxtActionPerformed
       
        this.letraTxt.getText();
    }//GEN-LAST:event_letraTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dicaLabel;
    private javax.swing.JLabel dicaTxt2;
    private javax.swing.JLabel errosLabel;
    private javax.swing.JLabel errosTxt2;
    private javax.swing.JLabel forcaLabel;
    private javax.swing.JLabel jogado2Label;
    private javax.swing.JPanel jogador2_Painel;
    private javax.swing.JLabel jogoLabel;
    private javax.swing.JTextField letraTxt;
    private javax.swing.JLabel rodadaLabel;
    private javax.swing.JLabel segredoLabel;
    private javax.swing.JLabel tenatativasTxt2;
    private javax.swing.JLabel tentativaLabel;
    private javax.swing.JButton verificaBnt;
    // End of variables declaration//GEN-END:variables

}
