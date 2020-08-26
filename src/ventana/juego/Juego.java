package ventana.juego;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Juego extends javax.swing.JFrame {

    public Juego() {
        initComponents();
        btnDoblarApuesta.setEnabled(false);
        btnPlantarse.setEnabled(false);
        btnPedirCarta.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCartaCroupier4 = new javax.swing.JLabel();
        lblCartaCroupier1 = new javax.swing.JLabel();
        lblCartaCroupier2 = new javax.swing.JLabel();
        lblCartaCroupier3 = new javax.swing.JLabel();
        lblCarta5 = new javax.swing.JLabel();
        lblCarta4 = new javax.swing.JLabel();
        lblCarta3 = new javax.swing.JLabel();
        lblCarta2 = new javax.swing.JLabel();
        lblCarta1 = new javax.swing.JLabel();
        btnPlantarse = new javax.swing.JButton();
        lblTotalCroupier = new javax.swing.JLabel();
        btnDoblarApuesta = new javax.swing.JButton();
        btnComenzarPartida = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblTotalUsuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnPedirCarta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setMaximumSize(new java.awt.Dimension(800, 630));
        setMinimumSize(new java.awt.Dimension(800, 630));
        setPreferredSize(new java.awt.Dimension(800, 630));
        getContentPane().setLayout(null);

        lblCartaCroupier4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblCartaCroupier4);
        lblCartaCroupier4.setBounds(300, 160, 50, 70);

        lblCartaCroupier1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblCartaCroupier1);
        lblCartaCroupier1.setBounds(300, 160, 50, 70);

        lblCartaCroupier2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCartaCroupier2.setToolTipText("");
        getContentPane().add(lblCartaCroupier2);
        lblCartaCroupier2.setBounds(360, 160, 50, 70);

        lblCartaCroupier3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCartaCroupier3.setToolTipText("");
        getContentPane().add(lblCartaCroupier3);
        lblCartaCroupier3.setBounds(430, 160, 50, 70);

        lblCarta5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarta5.setToolTipText("");
        getContentPane().add(lblCarta5);
        lblCarta5.setBounds(510, 310, 50, 70);

        lblCarta4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarta4.setToolTipText("");
        getContentPane().add(lblCarta4);
        lblCarta4.setBounds(440, 310, 50, 70);

        lblCarta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarta3.setToolTipText("");
        getContentPane().add(lblCarta3);
        lblCarta3.setBounds(370, 310, 50, 70);

        lblCarta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarta2.setToolTipText("");
        getContentPane().add(lblCarta2);
        lblCarta2.setBounds(300, 310, 50, 70);

        lblCarta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblCarta1);
        lblCarta1.setBounds(230, 310, 50, 70);

        btnPlantarse.setText("Plantarse");
        btnPlantarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlantarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlantarse);
        btnPlantarse.setBounds(30, 40, 90, 25);

        lblTotalCroupier.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCroupier.setText("0");
        getContentPane().add(lblTotalCroupier);
        lblTotalCroupier.setBounds(670, 60, 30, 20);

        btnDoblarApuesta.setText("Doblar apuesta");
        btnDoblarApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoblarApuestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnDoblarApuesta);
        btnDoblarApuesta.setBounds(140, 40, 120, 25);

        btnComenzarPartida.setText("Comenzar partida");
        btnComenzarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnComenzarPartida);
        btnComenzarPartida.setBounds(430, 30, 150, 40);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario   =");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(600, 30, 60, 20);

        lblTotalUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalUsuario.setText("0");
        getContentPane().add(lblTotalUsuario);
        lblTotalUsuario.setBounds(670, 30, 30, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Croupier =");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(600, 60, 60, 20);

        btnPedirCarta.setText("Pedir carta");
        btnPedirCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedirCartaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPedirCarta);
        btnPedirCarta.setBounds(280, 40, 100, 25);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Apuesta");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 500, 70, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(120, 500, 90, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Acumulado");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.lightGray));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(550, 500, 90, 30);

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(660, 500, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventana/imagenes/mesa.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(920, 602));
        jLabel1.setMinimumSize(new java.awt.Dimension(920, 602));
        jLabel1.setPreferredSize(new java.awt.Dimension(920, 602));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 780, 602);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int[] corazones = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0};
    int[] treboles = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0};
    int[] diamantes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0};
    int[] picas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0};
    String tipoPalo = "", respuesta = "";
    int totalUsuario = 0, totalCroupier = 0, cartaGenerada = 0, croupier1 = 0,
            numeroDeMazo = 0, carta = 0, cartasCroupier = 0, contador = 0,
            contdoble = 0, usuarioTieneAs = 0, croupierTieneAs = 0;
    double apuesta = 0, acum = 0;
    Random random = new Random();

    private void btnComenzarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarPartidaActionPerformed
        if (jTextField1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese apuesta");
        } else {
            lblCartaCroupier4.setIcon(new ImageIcon(getClass().getResource(
                    "/dorso/dorso.jpg")));

            lblCartaCroupier4.setVisible(true);
            btnDoblarApuesta.setEnabled(false);
            btnPlantarse.setEnabled(false);
            btnComenzarPartida.setVisible(false);
            cartasCroupier = 0;
            totalUsuario = 0;
            totalCroupier = 0;
            croupier1 = 0;
            carta = 0;
            contador = 0;
            contdoble = 0;
            croupierTieneAs = 0;
            usuarioTieneAs = 0;
            lblTotalUsuario.setText("0");
            lblTotalCroupier.setText("0");
            lblCarta3.setIcon(new ImageIcon());
            lblCarta4.setIcon(new ImageIcon());
            lblCarta5.setIcon(new ImageIcon());
            lblCartaCroupier3.setIcon(new ImageIcon());

            apuesta = Integer.parseInt(jTextField1.getText());

            jTextField2.setText("" + acum);

            for (int i = 1; i < 5; i++) {
                // Verifico si tengo que setear las cartas del croupier
                if (i > 2) {
                    cartasCroupier = 1;
                }

                numeroDeMazo = random.nextInt(4) + 1;
                cartaGenerada = random.nextInt(14);

                switch (numeroDeMazo) {
                    case 1:
                        if (corazones[cartaGenerada] == 0) {
                            while (corazones[cartaGenerada] == 0) {
                                cartaGenerada = random.nextInt(14);
                            }
                        }

                        carta = corazones[cartaGenerada];
                        corazones[cartaGenerada] = 0;
                        tipoPalo = "corazon";

                        if (i == 4) {
                            croupier1 = carta;
                        }

                        if (carta == 1) {
                            if (i < 3) {
                                usuarioTieneAs = 1;
                            } else {
                                croupierTieneAs = 1;
                            }
                        }

                        if (cartasCroupier == 1) {
                            if (carta > 10) {
                                totalCroupier += 10;
                            } else {
                                totalCroupier += carta;
                            }
                        } else {
                            if (carta >= 10) {
                                totalUsuario += 10;
                            } else {
                                totalUsuario += carta;
                            }
                        }
                        break;
                    case 2:
                        if (treboles[cartaGenerada] == 0) {
                            while (treboles[cartaGenerada] == 0) {
                                cartaGenerada = random.nextInt(14);
                            }
                        }

                        carta = treboles[cartaGenerada];
                        treboles[cartaGenerada] = 0;
                        tipoPalo = "trebol";

                        if (i == 4) {
                            croupier1 = carta;
                        }

                        if (carta == 1) {
                            if (i < 3) {
                                usuarioTieneAs = 1;
                            } else {
                                croupierTieneAs = 1;
                            }
                        }

                        if (cartasCroupier == 1) {
                            if (carta >= 10) {
                                totalCroupier += 10;
                            } else {
                                totalCroupier += carta;
                            }
                        } else {
                            if (carta >= 10) {
                                totalUsuario += 10;
                            } else {
                                totalUsuario += carta;
                            }
                        }
                        break;
                    case 3:
                        if (picas[cartaGenerada] == 0) {
                            while (picas[cartaGenerada] == 0) {
                                cartaGenerada = random.nextInt(14);
                            }
                        }

                        carta = picas[cartaGenerada];
                        picas[cartaGenerada] = 0;
                        tipoPalo = "picas";

                        if (i == 4) {
                            croupier1 = carta;
                        }

                        if (carta == 1) {
                            if (i < 3) {
                                usuarioTieneAs = 1;
                            } else {
                                croupierTieneAs = 1;
                            }
                        }

                        if (cartasCroupier == 1) {
                            if (carta >= 10) {
                                totalCroupier += 10;
                            } else {
                                totalCroupier += carta;
                            }
                        } else {
                            if (carta >= 10) {
                                totalUsuario += 10;
                            } else {
                                totalUsuario += carta;
                            }
                        }
                        break;
                    case 4:
                        if (diamantes[cartaGenerada] == 0) {
                            while (diamantes[cartaGenerada] == 0) {
                                cartaGenerada = random.nextInt(14);
                            }
                        }

                        carta = diamantes[cartaGenerada];
                        diamantes[cartaGenerada] = 0;
                        tipoPalo = "rombo";

                        if (i == 4) {
                            croupier1 = carta;
                        }

                        if (carta == 1) {
                            if (i < 3) {
                                usuarioTieneAs = 1;
                            } else {
                                croupierTieneAs = 1;
                            }
                        }

                        if (cartasCroupier == 1) {
                            if (carta >= 10) {
                                totalCroupier += 10;
                            } else {
                                totalCroupier += carta;
                            }
                        } else {
                            if (carta >= 10) {
                                totalUsuario += 10;
                            } else {
                                totalUsuario += carta;
                            }
                        }
                        break;
                }

                switch (i) {
                    case 1:
                        lblCarta1.setIcon(new ImageIcon(getClass().getResource(
                                "/cartas/" + tipoPalo + "_"
                                + carta + ".jpg")));
                        break;
                    case 2:
                        lblCarta2.setIcon(new ImageIcon(getClass().getResource(
                                "/cartas/" + tipoPalo + "_"
                                + carta + ".jpg")));
                        break;
                    case 3:
                        lblCartaCroupier1.setIcon(new ImageIcon(getClass().getResource(
                                "/cartas/" + tipoPalo + "_"
                                + carta + ".jpg")));
                        break;
                    case 4:
                        lblCartaCroupier2.setIcon(new ImageIcon(getClass().getResource(
                                "/cartas/" + tipoPalo + "_" + carta + ".jpg")));
                        break;
                }
            }

            lblTotalUsuario.setText("" + totalUsuario);
            lblTotalCroupier.setText("" + croupier1);

            if (totalUsuario == 21) {
                lblCartaCroupier4.setVisible(false);
                btnDoblarApuesta.setEnabled(false);
                btnPlantarse.setEnabled(false);
                btnPedirCarta.setEnabled(false);
                btnComenzarPartida.setVisible(true);
                jTextField1.setText("");
                lblCartaCroupier4.setVisible(false);
                acum += apuesta*2;

                JOptionPane.showMessageDialog(null, "Blackjack!! Gana el usuario."
                        + " Se dobla la apuesta automáticamente");
                //apuesta *= 2;
                
            } else if (totalCroupier == 21) {
                lblCartaCroupier4.setVisible(false);
                lblTotalCroupier.setText("" + totalCroupier);
                btnDoblarApuesta.setEnabled(false);
                btnPlantarse.setEnabled(false);
                btnPedirCarta.setEnabled(false);
                btnComenzarPartida.setVisible(true);
                jTextField1.setText("");           

                JOptionPane.showMessageDialog(null, "Blackjack!! Gana el croupier.");
            } else if (usuarioTieneAs == 1 && totalUsuario == 11) {
                lblCartaCroupier4.setVisible(false);
                btnDoblarApuesta.setEnabled(false);
                btnPlantarse.setEnabled(false);
                btnPedirCarta.setEnabled(false);
                btnComenzarPartida.setVisible(true);
                jTextField1.setText("");
                lblTotalUsuario.setText("21");
                acum += apuesta*2;
                lblTotalCroupier.setText(""+totalCroupier);

                JOptionPane.showMessageDialog(null, "Blackjack!! Gana el usuario."
                        + " Se dobla la apuesta automáticamente");
                //apuesta *= 2;
                
                lblCartaCroupier4.setVisible(false);
            } else if (croupierTieneAs == 1 && totalCroupier == 11) {
                lblCartaCroupier4.setVisible(false);
                btnDoblarApuesta.setEnabled(false);
                btnPlantarse.setEnabled(false);
                btnPedirCarta.setEnabled(false);
                btnComenzarPartida.setVisible(true);
                jTextField1.setText("");
                lblTotalCroupier.setText("21");
                lblTotalUsuario.setText("" + totalUsuario);
                

                JOptionPane.showMessageDialog(null, "Blackjack!! Gana el croupier.");
            }

            btnDoblarApuesta.setEnabled(true);
            btnPlantarse.setEnabled(true);
            btnPedirCarta.setEnabled(true);
        }
    }//GEN-LAST:event_btnComenzarPartidaActionPerformed

    private void btnPedirCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirCartaActionPerformed

        numeroDeMazo = random.nextInt(4) + 1;
        cartaGenerada = random.nextInt(14);
        btnDoblarApuesta.setEnabled(false);

        switch (numeroDeMazo) {
            case 1:
                if (corazones[cartaGenerada] == 0) {
                    while (corazones[cartaGenerada] == 0) {
                        cartaGenerada = random.nextInt(14);
                    }
                }

                carta = corazones[cartaGenerada];

                if (carta >= 10) {
                    totalUsuario += 10;
                } else {
                    totalUsuario += carta;
                }

                corazones[cartaGenerada] = 0;
                tipoPalo = "corazon";
                break;
            case 2:
                if (treboles[cartaGenerada] == 0) {
                    while (treboles[cartaGenerada] == 0) {
                        cartaGenerada = random.nextInt(14);
                    }
                }

                carta = treboles[cartaGenerada];
                treboles[cartaGenerada] = 0;

                if (carta >= 10) {
                    totalUsuario += 10;
                } else {
                    totalUsuario += carta;
                }

                tipoPalo = "trebol";
                break;
            case 3:
                if (picas[cartaGenerada] == 0) {
                    while (picas[cartaGenerada] == 0) {
                        cartaGenerada = random.nextInt(14);
                    }
                }

                carta = picas[cartaGenerada];
                picas[cartaGenerada] = 0;

                if (carta >= 10) {
                    totalUsuario += 10;
                } else {
                    totalUsuario += carta;
                }

                tipoPalo = "picas";
                break;
            case 4:
                if (diamantes[cartaGenerada] == 0) {
                    while (diamantes[cartaGenerada] == 0) {
                        cartaGenerada = random.nextInt(14);
                    }
                }

                carta = diamantes[cartaGenerada];
                diamantes[cartaGenerada] = 0;
                tipoPalo = "rombo";

                if (carta >= 10) {
                    totalUsuario += 10;
                } else {
                    totalUsuario += carta;
                }
                break;
        }

        lblTotalUsuario.setText("" + totalUsuario);
        contador++;

        switch (contador) {
            case 1:
                lblCarta3.setIcon(new ImageIcon(getClass().getResource(
                        "/cartas/" + tipoPalo + "_" + carta + ".jpg")));
                break;
            case 2:
                lblCarta4.setIcon(new ImageIcon(getClass().getResource(
                        "/cartas/" + tipoPalo + "_" + carta + ".jpg")));
                break;
            case 3:
                lblCarta5.setIcon(new ImageIcon(getClass().getResource(
                        "/cartas/" + tipoPalo + "_" + carta + ".jpg")));
                btnPedirCarta.setEnabled(false);
                break;
        }

        if (totalUsuario == 21) {
            lblCartaCroupier4.setVisible(false);
            lblTotalCroupier.setText("" + totalCroupier);
            btnDoblarApuesta.setEnabled(false);
            btnPlantarse.setEnabled(false);
            btnPedirCarta.setEnabled(false);
            btnComenzarPartida.setVisible(true);
            acum += apuesta;
            jTextField1.setText("");
            JOptionPane.showMessageDialog(null, "Blackjack!! Gana el usuario.");
        }

        if (totalUsuario > 21) {
            lblCartaCroupier4.setVisible(false);
            lblTotalCroupier.setText("" + totalCroupier);
            btnDoblarApuesta.setEnabled(false);
            btnPlantarse.setEnabled(false);
            btnPedirCarta.setEnabled(false);
            btnComenzarPartida.setVisible(true);
            jTextField1.setText("");
            JOptionPane.showMessageDialog(null, "Gana el croupier");
        }
    }//GEN-LAST:event_btnPedirCartaActionPerformed

    private void btnPlantarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlantarseActionPerformed
        if (totalCroupier < 16) {
            numeroDeMazo = random.nextInt(4) + 1;
            cartaGenerada = random.nextInt(14);

            switch (numeroDeMazo) {
                case 1:
                    if (corazones[cartaGenerada] == 0) {
                        while (corazones[cartaGenerada] == 0) {
                            cartaGenerada = random.nextInt(14);
                        }
                    }

                    carta = corazones[cartaGenerada];
                    corazones[cartaGenerada] = 0;
                    tipoPalo = "corazon";

                    if (carta >= 10) {
                        totalCroupier += 10;
                    } else {
                        totalCroupier += carta;
                    }
                    break;
                case 2:
                    if (treboles[cartaGenerada] == 0) {
                        while (treboles[cartaGenerada] == 0) {
                            cartaGenerada = random.nextInt(14);
                        }
                    }

                    carta = treboles[cartaGenerada];
                    treboles[cartaGenerada] = 0;
                    tipoPalo = "trebol";

                    if (carta >= 10) {
                        totalCroupier += 10;
                    } else {
                        totalCroupier += carta;
                    }
                    break;
                case 3:
                    if (picas[cartaGenerada] == 0) {
                        while (picas[cartaGenerada] == 0) {
                            cartaGenerada = random.nextInt(14);
                        }
                    }

                    carta = picas[cartaGenerada];
                    picas[cartaGenerada] = 0;
                    tipoPalo = "picas";

                    if (carta >= 10) {
                        totalCroupier += 10;
                    } else {
                        totalCroupier += carta;
                    }
                    break;
                case 4:
                    if (diamantes[cartaGenerada] == 0) {
                        while (diamantes[cartaGenerada] == 0) {
                            cartaGenerada = random.nextInt(14);
                        }
                    }

                    carta = diamantes[cartaGenerada];
                    diamantes[cartaGenerada] = 0;
                    tipoPalo = "rombo";

                    if (carta >= 10) {
                        totalCroupier += 10;
                    } else {
                        totalCroupier += carta;
                    }
                    break;
            }

            lblCartaCroupier3.setIcon(new ImageIcon(getClass().getResource(
                    "/cartas/" + tipoPalo + "_" + carta + ".jpg")));
        }

        lblTotalCroupier.setText("" + totalCroupier);

        if (totalCroupier <= 21 && totalCroupier > totalUsuario || totalUsuario > 21) {
            lblCartaCroupier4.setVisible(false);
            btnDoblarApuesta.setEnabled(false);
            btnPlantarse.setEnabled(false);
            btnPedirCarta.setEnabled(false);
            btnComenzarPartida.setVisible(true);
            jTextField1.setText("");

            JOptionPane.showMessageDialog(null, "Gana el Croupier");
        } else if (totalUsuario <= 21 && totalUsuario > totalCroupier || totalCroupier > 21) {
            lblCartaCroupier4.setVisible(false);
            btnDoblarApuesta.setEnabled(false);
            btnPlantarse.setEnabled(false);
            btnPedirCarta.setEnabled(false);
            btnComenzarPartida.setVisible(true);
            jTextField1.setText("");
            acum += apuesta;

            JOptionPane.showMessageDialog(null, "Gana el Usuario");
        } else if (totalUsuario == totalCroupier) {
            lblCartaCroupier4.setVisible(false);
            btnDoblarApuesta.setEnabled(false);
            btnPlantarse.setEnabled(false);
            btnPedirCarta.setEnabled(false);
            btnComenzarPartida.setVisible(true);
            jTextField1.setText("");

            JOptionPane.showMessageDialog(null, "Empate!! El total apostado es retornado");
        }
    }//GEN-LAST:event_btnPlantarseActionPerformed

    private void btnDoblarApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoblarApuestaActionPerformed
        contdoble++;
        if (contdoble == 1) {
            apuesta = apuesta * 2;
            jTextField1.setText("" + apuesta);
        } else if (contdoble > 1) {
            JOptionPane.showMessageDialog(null, "Solo se puede doblar apuesta una vez");
        }
    }//GEN-LAST:event_btnDoblarApuestaActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzarPartida;
    private javax.swing.JButton btnDoblarApuesta;
    private javax.swing.JButton btnPedirCarta;
    private javax.swing.JButton btnPlantarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblCarta1;
    private javax.swing.JLabel lblCarta2;
    private javax.swing.JLabel lblCarta3;
    private javax.swing.JLabel lblCarta4;
    private javax.swing.JLabel lblCarta5;
    private javax.swing.JLabel lblCartaCroupier1;
    private javax.swing.JLabel lblCartaCroupier2;
    private javax.swing.JLabel lblCartaCroupier3;
    private javax.swing.JLabel lblCartaCroupier4;
    private javax.swing.JLabel lblTotalCroupier;
    private javax.swing.JLabel lblTotalUsuario;
    // End of variables declaration//GEN-END:variables
}
