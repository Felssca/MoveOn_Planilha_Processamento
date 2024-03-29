/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import IO.CarreArquivosCompTabelas;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import util.Validacoes;

/**
 *
 * @author felipe
 */
public class JTela extends javax.swing.JFrame {

    /**
     * Creates new form JTela
     */
    JFileChooser fileDialog = null;

    String INPUT_caminhoArquivoNumero_01;
    String OUTPUT_caminhoPlanilha01;
    String fileNamePlanilha_01;
    final int planilha01 = 01;

    String INPUT_caminhoArquivoNumero_02;
    String OUTPUT_caminhoPlanilha02;
    String fileNamePlanilha_02;
    final int planilha02 = 03;

    String fileNamePlanilha_03;
    String OUTPUT_planilha03;

    String logSistema = "";
    String arquivoAvisoChooser = "Selecione apenas os arquivos .xlsx";
    String arquivoAvisoChooser03 = "Selecione a pasta de resultado";

    CarreArquivosCompTabelas arquivosCompTabelas;

    public JTela() {
        initComponents();
    //    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imgages/bola.jpg"));;
   //     ImageIcon icon = new ImageIcon(image);
    //    setIconImage(icon.getImage());
        arquivosCompTabelas = new CarreArquivosCompTabelas();
        limparLog();
    }

    public void acrescentarLogSistema(String log) {

        logSistema += log + "\n";
        textAreaLog.setText(logSistema);

    }

    private void limparLog() {

        logSistema = "";

    }

    /*
    A��o global botao    */
    private void acoesIniciaisBotoes(JTextField jTexField, int planilha) {

        int aproved;
        jTexField.setText("");
        fileDialog = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fileDialog.setAcceptAllFileFilterUsed(false);
        fileDialog.setMultiSelectionEnabled(false);
        fileDialog.setDialogTitle(arquivoAvisoChooser);
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter(arquivoAvisoChooser, "xlsx");
        fileDialog.addChoosableFileFilter(extensionFilter);
        aproved = fileDialog.showSaveDialog(null);

        if (aproved == JFileChooser.APPROVE_OPTION) {

            if (planilha == 1) {

                INPUT_caminhoArquivoNumero_01 = fileDialog.getSelectedFile().toString();
                fileNamePlanilha_01 = fileDialog.getSelectedFile().getName();
                jTexField.setText(INPUT_caminhoArquivoNumero_01);
                acrescentarLogSistema(INPUT_caminhoArquivoNumero_01);
            } else {
                INPUT_caminhoArquivoNumero_02 = fileDialog.getSelectedFile().toString();
                fileNamePlanilha_02 = fileDialog.getSelectedFile().getName();
                jTexField.setText(INPUT_caminhoArquivoNumero_02);
                acrescentarLogSistema(INPUT_caminhoArquivoNumero_02);

            }

        }

    }

    /*
    A��o do bot�o OUTpUT
     */
    private void botaoCaminhoOut() {

        int selecao;

        fileDialog = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fileDialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileDialog.setAcceptAllFileFilterUsed(false);
        fileDialog.setMultiSelectionEnabled(false);
        fileDialog.setDialogTitle(arquivoAvisoChooser03);

        selecao = fileDialog.showSaveDialog(null);

        if (selecao == JFileChooser.APPROVE_OPTION) {

            OUTPUT_planilha03 = fileDialog.getSelectedFile().getAbsolutePath();
            OUTPUT_caminhoPlanilha01 = fileDialog.getSelectedFile().getAbsolutePath();
            OUTPUT_caminhoPlanilha02 = fileDialog.getSelectedFile().getAbsolutePath();
            campoPlanilha3.setText(OUTPUT_planilha03);
            acrescentarLogSistema(OUTPUT_planilha03);

        }
    }

    private void processarArquivo() {

        CarreArquivosCompTabelas arquivosCompTabelas = new CarreArquivosCompTabelas();
        List<String> paths = new ArrayList<>();

        paths.add(INPUT_caminhoArquivoNumero_01);
        paths.add(INPUT_caminhoArquivoNumero_02);

        List<String> pathsOut = new ArrayList<>();
        pathsOut.add(OUTPUT_planilha03);

        if (preCheckagem(paths, 1) == false) {
            painelAviso("Os caminhos das planilhas est�o incorretos, favor selecionar um arquivo v�lido", "Caminhos inv�lidos");
        } else if (preCheckagem(pathsOut, 2) == false) {
            painelAviso("A pasta de saida esta incorreta, selecione um caminho v�lido", "Caminho Sa�da");
        } else {

            arquivosCompTabelas.setINPUTcaminhoPlanilha01(INPUT_caminhoArquivoNumero_01);
            arquivosCompTabelas.setOUTPUTcaminhoPlanilha01(OUTPUT_caminhoPlanilha01 + "//" + "PROCESSADO_" + fileNamePlanilha_01);

            arquivosCompTabelas.setINPUTcaminhoPlanilha02(INPUT_caminhoArquivoNumero_02);
            arquivosCompTabelas.setOUTPUTcaminhoPlanilha02(OUTPUT_caminhoPlanilha02 + "//" + "PROCESSADO_" + fileNamePlanilha_02);

            fileNamePlanilha_03 = "Resultado_Final.xlsx";

            arquivosCompTabelas.setOUTPUTplanilha03(OUTPUT_planilha03 + "//" + fileNamePlanilha_03);

            acrescentarLogSistema("------------------------");
            acrescentarLogSistema("PROCESSANDO SEMESTRE UM");

            try {
                arquivosCompTabelas.carregarTabelasSemestreUm();
                acrescentarLogSistema("------------------OK");
            } catch (Exception e) {
                painelErro(e.getMessage(), "Erro ao gerar tabela 1");
            }

            acrescentarLogSistema("-------------------------");
            acrescentarLogSistema("PROCESSANDO SEMESTRE DOIS");

            try {
                arquivosCompTabelas.carregarTabelasSemestreDois();
                acrescentarLogSistema("------------------OK");
            } catch (Exception e) {
                painelErro(e.getMessage(), "Erro ao gerar tabela 2");
            }

            acrescentarLogSistema("-------------------------");
            acrescentarLogSistema("PROCESSANDO RESULTADO");

            try {
                arquivosCompTabelas.processarResultadosTabelasTres();
                painelOK("Arquivos criados com sucesso!!!", "Arquivos Criados");
                acrescentarLogSistema("------------------OK");
            } catch (Exception e) {
                painelErro(e.getMessage(), "Erro ao gerar tabela final");
            }
        }

    }

    private void painelAviso(String mensagem, String titulo) {

        JOptionPane.showMessageDialog(this,
                mensagem,
                titulo,
                JOptionPane.WARNING_MESSAGE);
    }

    private void painelErro(String mensagem, String titulo) {

        JOptionPane.showMessageDialog(this,
                mensagem,
                titulo,
                JOptionPane.ERROR_MESSAGE);

    }

    private void painelOK(String mensagem, String titulo) {

        JOptionPane.showMessageDialog(this,
                mensagem,
                titulo,
                JOptionPane.INFORMATION_MESSAGE);
    }

    private boolean preCheckagem(List<String> paths, int tipoValidacao) {
        boolean isChecked = false;

        //1 - campos e arquivos
        //2 - saida local;
        Validacoes validacoes = new Validacoes();

        if (tipoValidacao == 1) {
            for (String path : paths) {
                isChecked = validacoes.isPathEmptXlsx(path);
                if (isChecked == false) {
                    return false;
                }
            }

            for (String path : paths) {
                isChecked = validacoes.isPathValidXlsx(path);
                if (isChecked == false) {
                    return false;
                }

            }
        } else {
            for (String path : paths) {
                isChecked = validacoes.isPathEmptXlsx(path);
                if (isChecked == false) {
                    return false;
                }

            }

        }
        return isChecked;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCaminhosArquivos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoPlanilha01 = new javax.swing.JTextField();
        campoPlanilha02 = new javax.swing.JTextField();
        btnSelecionarCaminho01 = new javax.swing.JButton();
        BtnSelecionarCaminho02 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        painelSaida = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        campoPlanilha3 = new javax.swing.JTextField();
        btnSelecionarCaminhoOut = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        painelLog = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaLog = new javax.swing.JTextArea();
        painelBotaoClassificar = new javax.swing.JPanel();
        btnClassificacao = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MoveON Planilhas");
        setAlwaysOnTop(true);
        setResizable(false);

        painelCaminhosArquivos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Planilha 1");

        jLabel2.setText("Planilha 2");

        campoPlanilha01.setForeground(new java.awt.Color(51, 153, 0));
        campoPlanilha01.setText("Ecolha a planilha 1");
        campoPlanilha01.setDisabledTextColor(new java.awt.Color(0, 102, 51));
        campoPlanilha01.setEnabled(false);
        campoPlanilha01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPlanilha01ActionPerformed(evt);
            }
        });

        campoPlanilha02.setText("Ecolha a planilha 2");
        campoPlanilha02.setDisabledTextColor(new java.awt.Color(51, 153, 0));
        campoPlanilha02.setEnabled(false);
        campoPlanilha02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPlanilha02ActionPerformed(evt);
            }
        });

        btnSelecionarCaminho01.setBackground(new java.awt.Color(204, 204, 204));
        btnSelecionarCaminho01.setForeground(new java.awt.Color(0, 102, 102));
        btnSelecionarCaminho01.setText("Selecionar P1");
        btnSelecionarCaminho01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarCaminho01ActionPerformed(evt);
            }
        });

        BtnSelecionarCaminho02.setBackground(new java.awt.Color(204, 204, 204));
        BtnSelecionarCaminho02.setForeground(new java.awt.Color(0, 102, 102));
        BtnSelecionarCaminho02.setText("Selecionar P2");
        BtnSelecionarCaminho02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelecionarCaminho02ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCaminhosArquivosLayout = new javax.swing.GroupLayout(painelCaminhosArquivos);
        painelCaminhosArquivos.setLayout(painelCaminhosArquivosLayout);
        painelCaminhosArquivosLayout.setHorizontalGroup(
            painelCaminhosArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCaminhosArquivosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCaminhosArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49)
                .addGroup(painelCaminhosArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoPlanilha01, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(campoPlanilha02))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCaminhosArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnSelecionarCaminho02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSelecionarCaminho01, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        painelCaminhosArquivosLayout.setVerticalGroup(
            painelCaminhosArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCaminhosArquivosLayout.createSequentialGroup()
                .addGroup(painelCaminhosArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelCaminhosArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoPlanilha01, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(btnSelecionarCaminho01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCaminhosArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoPlanilha02, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSelecionarCaminho02, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel3.setLabelFor(this);
        jLabel3.setText("Escolha as planilhas para serem classificadas");

        painelSaida.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Escolher Sa�da");

        campoPlanilha3.setText("Caminho dos arquivos que ser�o copilados");
        campoPlanilha3.setDisabledTextColor(new java.awt.Color(191, 102, 42));
        campoPlanilha3.setEnabled(false);

        btnSelecionarCaminhoOut.setForeground(new java.awt.Color(191, 102, 42));
        btnSelecionarCaminhoOut.setText("Selecionar");
        btnSelecionarCaminhoOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarCaminhoOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSaidaLayout = new javax.swing.GroupLayout(painelSaida);
        painelSaida.setLayout(painelSaidaLayout);
        painelSaidaLayout.setHorizontalGroup(
            painelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPlanilha3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelecionarCaminhoOut, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelSaidaLayout.setVerticalGroup(
            painelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(campoPlanilha3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecionarCaminhoOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(painelSaidaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(18, 18, 18))
        );

        jLabel6.setLabelFor(this);
        jLabel6.setText("Escolha a pasta dos arquivos copilados");

        painelLog.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textAreaLog.setBackground(new java.awt.Color(0, 0, 0));
        textAreaLog.setColumns(20);
        textAreaLog.setForeground(new java.awt.Color(0, 153, 51));
        textAreaLog.setRows(5);
        jScrollPane2.setViewportView(textAreaLog);

        javax.swing.GroupLayout painelLogLayout = new javax.swing.GroupLayout(painelLog);
        painelLog.setLayout(painelLogLayout);
        painelLogLayout.setHorizontalGroup(
            painelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        painelLogLayout.setVerticalGroup(
            painelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );

        painelBotaoClassificar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnClassificacao.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnClassificacao.setText("Classificar");
        btnClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassificacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotaoClassificarLayout = new javax.swing.GroupLayout(painelBotaoClassificar);
        painelBotaoClassificar.setLayout(painelBotaoClassificarLayout);
        painelBotaoClassificarLayout.setHorizontalGroup(
            painelBotaoClassificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotaoClassificarLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btnClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotaoClassificarLayout.setVerticalGroup(
            painelBotaoClassificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        menuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ajuda");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Sobre");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(painelLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelCaminhosArquivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelBotaoClassificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCaminhosArquivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelBotaoClassificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(painelLog, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarCaminho01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarCaminho01ActionPerformed

        acoesIniciaisBotoes(campoPlanilha01, planilha01);


    }//GEN-LAST:event_btnSelecionarCaminho01ActionPerformed

    private void BtnSelecionarCaminho02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelecionarCaminho02ActionPerformed
        // TODO add your handling code here:
        acoesIniciaisBotoes(campoPlanilha02, planilha02);
    }//GEN-LAST:event_BtnSelecionarCaminho02ActionPerformed

    private void btnSelecionarCaminhoOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarCaminhoOutActionPerformed
        // TODO add your handling code here:
        botaoCaminhoOut();
    }//GEN-LAST:event_btnSelecionarCaminhoOutActionPerformed

    private void btnClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificacaoActionPerformed
        try {   // TODO add your handling code here
            processarArquivo();
        } catch (Exception ex) {
            Logger.getLogger(JTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnClassificacaoActionPerformed

    private void campoPlanilha01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPlanilha01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPlanilha01ActionPerformed

    private void campoPlanilha02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPlanilha02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPlanilha02ActionPerformed

    //checar antes de processar
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
            java.util.logging.Logger.getLogger(JTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JTela().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSelecionarCaminho02;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton btnClassificacao;
    private javax.swing.JButton btnSelecionarCaminho01;
    private javax.swing.JButton btnSelecionarCaminhoOut;
    private javax.swing.JTextField campoPlanilha01;
    private javax.swing.JTextField campoPlanilha02;
    private javax.swing.JTextField campoPlanilha3;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel painelBotaoClassificar;
    private javax.swing.JPanel painelCaminhosArquivos;
    private javax.swing.JPanel painelLog;
    private javax.swing.JPanel painelSaida;
    private javax.swing.JTextArea textAreaLog;
    // End of variables declaration//GEN-END:variables

}
