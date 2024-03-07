import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Jogo extends javax.swing.JFrame {
    private javax.swing.JButton bttn1;
    private javax.swing.JButton bttn2;
    private javax.swing.JButton bttn3;
    private javax.swing.JButton bttn4;
    private javax.swing.JButton bttn5;
    private javax.swing.JButton bttn6;
    private javax.swing.JButton bttn7;
    private javax.swing.JButton bttn8;
    private javax.swing.JButton bttn9;
    private javax.swing.JLabel pontuacaoO;
    private javax.swing.JLabel pontuacaoX;
    Jogador jd = new Jogador();
    Jogador ju = new Jogador();
    int contador = 0;

    public Jogo(String jogadorX, String jogadorO) {
        ju.setName(jogadorX);
        jd.setName(jogadorO);
        initComponents();
    }
    private void reset(){
        contador = 0;
        bttn1.setText("");
        bttn2.setText("");
        bttn3.setText("");
        bttn4.setText("");
        bttn5.setText("");
        bttn6.setText("");
        bttn7.setText("");
        bttn8.setText("");
        bttn9.setText("");
    }
    private void fim(){
        if(contador==9){
            JOptionPane.showMessageDialog(null, "FIM DE JOGO", "FIM DE JOGO", JOptionPane.INFORMATION_MESSAGE);
            bttn1.setText("");
            bttn2.setText("");
            bttn3.setText("");
            bttn4.setText("");
            bttn5.setText("");
            bttn6.setText("");
            bttn7.setText("");
            bttn8.setText("");
            bttn9.setText("");
        }
    }
    private void ponto(Jogador j, javax.swing.JLabel pontuador){
        JOptionPane.showMessageDialog(null, "Fim de Jogo!!\nVencedor:" + j.getName());
        j.setPonto();
        pontuador.setText(String.valueOf(j.getPonto()));
        reset();
        contador=0;
    }

    private Jogo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }               
    private void initComponents() {
        bttn4 = new javax.swing.JButton();
        bttn4.setFont(new java.awt.Font("Segoe UI", 1, 20)); 
        bttn1 = new javax.swing.JButton();
        bttn1.setFont(new java.awt.Font("Segoe UI", 1, 20)); 
        bttn2 = new javax.swing.JButton();
        bttn2.setFont(new java.awt.Font("Segoe UI", 1, 20)); 
        bttn6 = new javax.swing.JButton();
        bttn6.setFont(new java.awt.Font("Segoe UI", 1, 20)); 
        bttn3 = new javax.swing.JButton();
        bttn3.setFont(new java.awt.Font("Segoe UI", 1, 20)); 
        bttn5 = new javax.swing.JButton();
        bttn5.setFont(new java.awt.Font("Segoe UI", 1, 20)); 
        bttn8 = new javax.swing.JButton();
        bttn8.setFont(new java.awt.Font("Segoe UI", 1, 20)); 
        bttn9 = new javax.swing.JButton();
        bttn9.setFont(new java.awt.Font("Segoe UI", 1, 20)); 
        bttn7 = new javax.swing.JButton();
        bttn7.setFont(new java.awt.Font("Segoe UI", 1, 20));
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        pontuacaoX = new javax.swing.JLabel();
        pontuacaoO = new javax.swing.JLabel();
        JButton sairBTTN = new JButton();
        JButton reiniciarBTTN = new JButton();
        bttn1.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn1ActionPerformed(evt);
            }
        });
        bttn2.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                bttn2ActionPerformed(evt);
            }
        });
        bttn3.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                bttn3ActionPerformed(evt);
            }
        });
        bttn4.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                bttn4ActionPerformed(evt);
            }
        });
        bttn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn5ActionPerformed(evt);
            }
        });
        bttn6.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                bttn6ActionPerformed(evt);
            }
        });
        bttn7.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                bttn7ActionPerformed(evt);
            }
        });
        bttn8.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                bttn8ActionPerformed(evt);
            }
        });
        bttn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn9ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText(jd.getName() + " - O");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText(ju.getName() + " - X");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("X -");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("PONTUAÇÃO");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel5.setForeground(new java.awt.Color(102, 153, 0));
        jLabel5.setText("O -");

        pontuacaoX.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        pontuacaoX.setForeground(new java.awt.Color(255, 0, 0));
        pontuacaoX.setText("0");

        pontuacaoO.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        pontuacaoO.setForeground(new java.awt.Color(102, 153, 0));
        pontuacaoO.setText("0");

        sairBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        sairBTTN.setText("SAIR");
        sairBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTTNActionPerformed(evt);
            }
        });

        reiniciarBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        reiniciarBTTN.setText("REINICIAR");
        reiniciarBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarBTTNActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pontuacaoO, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pontuacaoX, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttn7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttn8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bttn1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bttn4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bttn5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bttn2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttn9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttn3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttn6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reiniciarBTTN)
                        .addGap(57, 57, 57)
                        .addComponent(sairBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(pontuacaoX, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pontuacaoO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttn2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttn4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttn9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reiniciarBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        pack();
    }                      
    private void bttn1ActionPerformed(java.awt.event.ActionEvent evt){
        if(bttn1.getText().isEmpty()){
            if(counter()%2 != 0){
                bttn1.setText("X");
                bttn1.setForeground(new java.awt.Color(204, 0, 0));
                if(bttn1.getText().equals(bttn2.getText()) && bttn1.getText().equals(bttn3.getText())){
                    ponto(ju, pontuacaoX);
                }else if(bttn1.getText().equals(bttn4.getText()) && bttn1.getText().equals(bttn7.getText())){
                    ponto(ju, pontuacaoX);
                }else if(bttn1.getText().equals(bttn5.getText()) && bttn1.getText().equals(bttn9.getText())){
                    ponto(ju, pontuacaoX);
                }
            }else{
                bttn1.setText("O");
                bttn1.setForeground(new java.awt.Color(51, 153, 0));
                if(bttn1.getText().equals(bttn2.getText()) && bttn1.getText().equals(bttn3.getText())){
                    ponto(jd, pontuacaoO);
                }else if(bttn1.getText().equals(bttn4.getText()) && bttn1.getText().equals(bttn7.getText())){
                    ponto(jd, pontuacaoO);
                }else if(bttn1.getText().equals(bttn5.getText()) && bttn1.getText().equals(bttn9.getText())){
                    ponto(jd, pontuacaoO);
                }
            }
            fim();
        }
    }
    private void bttn2ActionPerformed(ActionEvent evt){
        if(bttn2.getText().isEmpty()){
            if(counter()%2 != 0){
                bttn2.setText("X");
                bttn2.setForeground(new Color(204, 0, 0));
                if(bttn2.getText().equals(bttn1.getText()) && bttn2.getText().equals(bttn3.getText())){
                    ponto(ju, pontuacaoX);
                }else if(bttn2.getText().equals(bttn5.getText()) && bttn2.getText().equals(bttn8.getText())){
                    ponto(ju, pontuacaoX);
                }
            }else{
                bttn2.setText("O");
                bttn2.setForeground(new Color(51, 153, 0));
                if(bttn2.getText().equals(bttn1.getText()) && bttn2.getText().equals(bttn3.getText())){
                    ponto(jd, pontuacaoO);
                }else if(bttn2.getText().equals(bttn5.getText()) && bttn2.getText().equals(bttn8.getText())){
                    ponto(jd, pontuacaoO);
                }
            }
            fim();
        }
    }
    private void bttn3ActionPerformed(java.awt.event.ActionEvent evt){
        if(bttn3.getText().isEmpty()){
            if(counter()%2 != 0){
                bttn3.setText("X");
                bttn3.setForeground(new java.awt.Color(204, 0, 0));
                if(bttn3.getText().equals(bttn2.getText()) && bttn3.getText().equals(bttn1.getText())){
                    ponto(ju, pontuacaoX);
                }else if(bttn3.getText().equals(bttn5.getText()) && bttn3.getText().equals(bttn7.getText())){
                    ponto(ju, pontuacaoX);
                }else if(bttn3.getText().equals(bttn6.getText()) && bttn3.getText().equals(bttn9.getText())){
                    ponto(ju, pontuacaoX);
                }
            }else{
                bttn3.setText("O");
                bttn3.setForeground(new java.awt.Color(51, 153, 0));
                if(bttn3.getText().equals(bttn2.getText()) && bttn3.getText().equals(bttn1.getText())){
                    ponto(jd, pontuacaoO);
                }else if(bttn3.getText().equals(bttn5.getText()) && bttn3.getText().equals(bttn7.getText())){
                    ponto(jd, pontuacaoO);
                }else if(bttn3.getText().equals(bttn6.getText()) && bttn3.getText().equals(bttn9.getText())){
                    ponto(jd, pontuacaoO);
                }
            }
            fim();
        }
    }
    private void bttn4ActionPerformed(java.awt.event.ActionEvent evt){
        if(bttn4.getText().isEmpty()){
            if(counter()%2 != 0){
                bttn4.setText("X");
                bttn4.setForeground(new java.awt.Color(204, 0, 0));
                if(bttn4.getText().equals(bttn5.getText()) && bttn4.getText().equals(bttn6.getText())){
                    ponto(ju, pontuacaoX);
                }else if(bttn4.getText().equals(bttn1.getText()) && bttn4.getText().equals(bttn7.getText())){
                    ponto(ju, pontuacaoX);
                }
            }else{
                bttn4.setText("O");
                bttn4.setForeground(new java.awt.Color(51, 153, 0));
                if(bttn4.getText().equals(bttn5.getText()) && bttn4.getText().equals(bttn6.getText())){
                    ponto(jd, pontuacaoO);
                }else if(bttn4.getText().equals(bttn1.getText()) && bttn4.getText().equals(bttn7.getText())){
                    ponto(jd, pontuacaoO);
                }
            }
            fim();
        }
    }
    private void bttn5ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if(bttn5.getText().isEmpty()){
            if(counter()%2 != 0){
                bttn5.setText("X");
                bttn5.setForeground(new java.awt.Color(204, 0, 0));
                if(bttn5.getText().equals(bttn4.getText()) && bttn5.getText().equals(bttn6.getText())){
                    ponto(ju, pontuacaoX);
                }else if(bttn5.getText().equals(bttn2.getText()) && bttn5.getText().equals(bttn8.getText())){
                    ponto(ju, pontuacaoX);
                }else if(bttn5.getText().equals(bttn3.getText()) && bttn5.getText().equals(bttn7.getText())){
                    ponto(ju, pontuacaoX);
                }
            }else{
                bttn5.setText("O");
                bttn5.setForeground(new java.awt.Color(51, 153, 0));
                if(bttn5.getText().equals(bttn4.getText()) && bttn5.getText().equals(bttn6.getText())){
                    ponto(jd, pontuacaoO);
                }else if(bttn5.getText().equals(bttn2.getText()) && bttn5.getText().equals(bttn8.getText())){
                    ponto(jd, pontuacaoO);
                }else if(bttn5.getText().equals(bttn3.getText()) && bttn5.getText().equals(bttn7.getText())){
                    ponto(jd, pontuacaoO);
                }
            }
            fim();
        }
    }                                     
    private void bttn6ActionPerformed(java.awt.event.ActionEvent evt){
        if(bttn6.getText().isEmpty()){
            if(counter()%2 != 0){
                bttn6.setText("X");
                bttn6.setForeground(new java.awt.Color(204, 0, 0));
                if(bttn6.getText().equals(bttn3.getText()) && bttn6.getText().equals(bttn9.getText())){
                    ponto(ju, pontuacaoX);
                }else if(bttn6.getText().equals(bttn5.getText()) && bttn6.getText().equals(bttn4.getText())){
                    ponto(ju, pontuacaoX);
                }
            }else{
                bttn6.setText("O");
                bttn6.setForeground(new java.awt.Color(51, 153, 0));
                if(bttn6.getText().equals(bttn4.getText()) && bttn6.getText().equals(bttn5.getText())){
                    ponto(jd, pontuacaoO);
                }else if(bttn6.getText().equals(bttn3.getText()) && bttn6.getText().equals(bttn9.getText())){
                    ponto(jd, pontuacaoO);
                }
            }
            fim();
        }
    }
    private void bttn7ActionPerformed(java.awt.event.ActionEvent evt){
        if(bttn7.getText().isEmpty()){
            if(counter()%2 != 0){
                bttn7.setText("X");
                bttn7.setForeground(new java.awt.Color(204, 0, 0));
                if(bttn7.getText().equals(bttn5.getText()) && bttn7.getText().equals(bttn3.getText())){
                    ponto(ju, pontuacaoX);
                }else if(bttn7.getText().equals(bttn8.getText()) && bttn7.getText().equals(bttn9.getText())){
                    ponto(ju, pontuacaoX);
                }else if(bttn7.getText().equals(bttn4.getText()) && bttn7.getText().equals(bttn1.getText())){
                    ponto(ju, pontuacaoX);
                }
            }else{
                bttn7.setText("O");
                bttn7.setForeground(new java.awt.Color(51, 153, 0));
                if(bttn7.getText().equals(bttn5.getText()) && bttn7.getText().equals(bttn3.getText())){
                    ponto(jd, pontuacaoO);
                }else if(bttn7.getText().equals(bttn8.getText()) && bttn7.getText().equals(bttn9.getText())){
                    ponto(jd, pontuacaoO);
                }else if(bttn7.getText().equals(bttn4.getText()) && bttn7.getText().equals(bttn1.getText())){
                    ponto(jd, pontuacaoO);
                }
            }
            fim();
        }
    }
    private void bttn8ActionPerformed(java.awt.event.ActionEvent evt){
        if(bttn8.getText().isEmpty()){
            if(counter()%2 != 0){
                bttn8.setText("X");
                bttn8.setForeground(new java.awt.Color(204, 0, 0));
                if(bttn8.getText().equals(bttn7.getText()) && bttn8.getText().equals(bttn9.getText())){
                    ponto(ju, pontuacaoX);
                }else if(bttn8.getText().equals(bttn5.getText()) && bttn8.getText().equals(bttn2.getText())){
                    ponto(ju, pontuacaoX);
                }
            }else{
                bttn8.setText("O");
                bttn8.setForeground(new java.awt.Color(51, 153, 0));
                if(bttn8.getText().equals(bttn7.getText()) && bttn8.getText().equals(bttn9.getText())){
                    ponto(jd, pontuacaoO);
                }else if(bttn8.getText().equals(bttn5.getText()) && bttn8.getText().equals(bttn2.getText())){
                    ponto(jd, pontuacaoO);
                }
            }
            fim();
        }
    }
    private void bttn9ActionPerformed(java.awt.event.ActionEvent evt){
        if(bttn9.getText().isEmpty()){
            if(counter()%2 != 0){
                bttn9.setText("X");
                bttn9.setForeground(new java.awt.Color(204, 0, 0));
                if(bttn9.getText().equals(bttn6.getText()) && bttn9.getText().equals(bttn3.getText())){
                    ponto(ju, pontuacaoX);
                }else if(bttn9.getText().equals(bttn7.getText()) && bttn9.getText().equals(bttn8.getText())){
                    ponto(ju, pontuacaoX);
                }else if(bttn9.getText().equals(bttn5.getText()) && bttn9.getText().equals(bttn1.getText())){
                    ponto(ju, pontuacaoX);
                }
            }else{
                bttn9.setText("O");
                bttn9.setForeground(new java.awt.Color(51, 153, 0));
                if(bttn9.getText().equals(bttn8.getText()) && bttn9.getText().equals(bttn7.getText())){
                    ponto(jd, pontuacaoO);
                }else if(bttn9.getText().equals(bttn6.getText()) && bttn9.getText().equals(bttn3.getText())){
                    ponto(jd, pontuacaoO);
                }else if(bttn9.getText().equals(bttn5.getText()) && bttn1.getText().equals(bttn9.getText())){
                    ponto(jd, pontuacaoO);
                }
            }
            fim();
        }
    }                                
    private void sairBTTNActionPerformed(java.awt.event.ActionEvent evt) { 
        if(jd.getPonto()>ju.getPonto()){
            JOptionPane.showMessageDialog(null, "Encerrando!!\nVencedor: " + jd.getName());
            dispose();
            System.exit(0);
        }else if(jd.getPonto()< ju.getPonto()){
            JOptionPane.showMessageDialog(null, "Encerrando!!\nVencedor: " + ju.getName());
            dispose();
            System.exit(0);
        }else if(jd.getPonto() == ju.getPonto()){
            JOptionPane.showMessageDialog(null, "Encerrando!!\nEmpatou!");
            dispose();
            System.exit(0);
        }
    }
    private void reiniciarBTTNActionPerformed(java.awt.event.ActionEvent evt) {                                              
        reset();
    }                                             
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }  
    public int counter(){
        contador+=1;
        return contador;
    }                                 
}