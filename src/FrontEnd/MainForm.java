package FrontEnd;

import java.awt.*;
import finalproject.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class MainForm extends javax.swing.JFrame {

    File f =null;
    
    public MainForm() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Input_image = new javax.swing.JLabel();
        GrayScale_iimage = new javax.swing.JLabel();
        ContrastEnhancement_image = new javax.swing.JLabel();
        Thresholding_Image = new javax.swing.JLabel();
        Dilation_image = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Object1 = new javax.swing.JLabel();
        Object2 = new javax.swing.JLabel();
        Object3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Erosion_image = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        GrayScale = new javax.swing.JButton();
        ConstrastEnhancement = new javax.swing.JButton();
        Erosion = new javax.swing.JButton();
        Dilation = new javax.swing.JButton();
        OpenImage = new javax.swing.JButton();
        Thresholding = new javax.swing.JButton();
        Quantification = new javax.swing.JButton();
        RegionExtraction = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(214, 217));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Blood Group Detection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output Image", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        Input_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Input_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Input_imageMouseClicked(evt);
            }
        });

        GrayScale_iimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GrayScale_iimage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrayScale_iimageMouseClicked(evt);
            }
        });

        ContrastEnhancement_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ContrastEnhancement_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContrastEnhancement_imageMouseClicked(evt);
            }
        });

        Thresholding_Image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Thresholding_Image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Thresholding_ImageMouseClicked(evt);
            }
        });

        Dilation_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Dilation_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dilation_imageMouseClicked(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        Object1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Object1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Object1MouseClicked(evt);
            }
        });

        Object2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Object2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Object2MouseClicked(evt);
            }
        });

        Object3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Object3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Object3MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Region Extracted Image");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Object1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(Object2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(Object3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Object2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Object1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Object3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Erosion_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Erosion_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Erosion_imageMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Input Image");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("GrayScale Image");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Threshoding Image");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Contrast Enhacement Image");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Dilation Image");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Erosion Image");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(65, 65, 65))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Input_image, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Dilation_image, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Erosion_image, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(GrayScale_iimage, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel15)
                                        .addGap(120, 120, 120)
                                        .addComponent(jLabel16)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ContrastEnhancement_image, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Thresholding_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel13)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GrayScale_iimage, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input_image, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContrastEnhancement_image, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Thresholding_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addGap(17, 17, 17)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Dilation_image, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Erosion_image, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jLayeredPane1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        GrayScale.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        GrayScale.setText("GrayScale");
        GrayScale.setFocusable(false);
        GrayScale.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GrayScale.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GrayScale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrayScaleActionPerformed(evt);
            }
        });

        ConstrastEnhancement.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ConstrastEnhancement.setText("Contrast Enhancement");
        ConstrastEnhancement.setFocusable(false);
        ConstrastEnhancement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ConstrastEnhancement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ConstrastEnhancement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConstrastEnhancementActionPerformed(evt);
            }
        });

        Erosion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Erosion.setText("Erosion");
        Erosion.setFocusable(false);
        Erosion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Erosion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Erosion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErosionActionPerformed(evt);
            }
        });

        Dilation.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Dilation.setText("Dilation");
        Dilation.setFocusable(false);
        Dilation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Dilation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Dilation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DilationActionPerformed(evt);
            }
        });

        OpenImage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        OpenImage.setText("Open Image");
        OpenImage.setFocusable(false);
        OpenImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OpenImage.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        OpenImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenImageActionPerformed(evt);
            }
        });

        Thresholding.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Thresholding.setText("Threholding");
        Thresholding.setFocusable(false);
        Thresholding.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Thresholding.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Thresholding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThresholdingActionPerformed(evt);
            }
        });

        Quantification.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Quantification.setText("Quantification");
        Quantification.setFocusable(false);
        Quantification.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Quantification.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Quantification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantificationActionPerformed(evt);
            }
        });

        RegionExtraction.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        RegionExtraction.setText("Region Extraction");
        RegionExtraction.setFocusable(false);
        RegionExtraction.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RegionExtraction.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        RegionExtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegionExtractionActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Compute");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(GrayScale, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(ConstrastEnhancement, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Erosion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Dilation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(OpenImage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Thresholding, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Quantification, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(RegionExtraction, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Quantification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegionExtraction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConstrastEnhancement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(Thresholding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dilation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Erosion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GrayScale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OpenImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(OpenImage)
                .addGap(18, 18, 18)
                .addComponent(GrayScale)
                .addGap(18, 18, 18)
                .addComponent(ConstrastEnhancement)
                .addGap(18, 18, 18)
                .addComponent(Thresholding, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Dilation)
                .addGap(18, 18, 18)
                .addComponent(Erosion)
                .addGap(18, 18, 18)
                .addComponent(RegionExtraction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Quantification)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel17.setText("RESULT");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**/

    private void OpenImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenImageActionPerformed
 
       resetAllField();
        
        try {
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            f = jfc.getSelectedFile();
            Image bi = ImageIO.read(f);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(195,62,Image.SCALE_DEFAULT));
            Input_image.setIcon(imageIcon);
            ImageIcon imageIcon2 = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(940,264,Image.SCALE_DEFAULT));
            jLabel10.setIcon(imageIcon2);

        } catch (Exception e) {  }

    }//GEN-LAST:event_OpenImageActionPerformed

    private void GrayScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrayScaleActionPerformed
        GrayscaleImage gs = new GrayscaleImage();
        gs.grayScale_image(f);
        try {
            File k = new File("C:\\FinalProject\\src\\Images\\GrayScale.png");
            Image bi = ImageIO.read(k);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(195,62,Image.SCALE_DEFAULT));
            GrayScale_iimage.setIcon(imageIcon);
        } catch (Exception e) {  }
        
    }//GEN-LAST:event_GrayScaleActionPerformed

    private void ConstrastEnhancementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConstrastEnhancementActionPerformed
        ContrastEnhancement ce = new ContrastEnhancement();
        ce.contrast_enhancement();
        try {
            File k = new File("C:\\FinalProject\\src\\Images\\cont_enhan.png");
            Image bi = ImageIO.read(k);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(195,62,Image.SCALE_DEFAULT));
            ContrastEnhancement_image.setIcon(imageIcon);
        } catch (Exception e) {  } 
    }//GEN-LAST:event_ConstrastEnhancementActionPerformed

    private void ThresholdingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThresholdingActionPerformed
        ThresoldImage th = new ThresoldImage();
        th.thresoldImage();
        try {
            File k = new File("C:\\FinalProject\\src\\Images\\Thresold.png");
            Image bi = ImageIO.read(k);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(195,62,Image.SCALE_DEFAULT));
            Thresholding_Image.setIcon(imageIcon);
        } catch (Exception e) {  } 
        
        
    }//GEN-LAST:event_ThresholdingActionPerformed

    private void DilationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DilationActionPerformed
         Dilation th = new Dilation();
        th.dilated_image();
        try {
            File k = new File("C:\\FinalProject\\src\\Images\\Dilation.png");
            Image bi = ImageIO.read(k);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(195,62,Image.SCALE_DEFAULT));
            Dilation_image.setIcon(imageIcon);
        } catch (Exception e) {  } 
        
    }//GEN-LAST:event_DilationActionPerformed

    private void ErosionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErosionActionPerformed

         Erosion th = new Erosion();
        th.erosion_image();
        try {
            File k = new File("C:\\FinalProject\\src\\Images\\Erosion.png");
            Image bi = ImageIO.read(k);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(195,62,Image.SCALE_DEFAULT));
            Erosion_image.setIcon(imageIcon);
        } catch (Exception e) {  } 
    
    }//GEN-LAST:event_ErosionActionPerformed

    private void RegionExtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegionExtractionActionPerformed
       
       Separating se= new Separating();
           se.separate_image(); //first separatin into 3 equal parts
   
           RegionExtraction re = new RegionExtraction(); 
           re.regionExtraction("Part1");
           re.regionExtraction("Part2");
           re.regionExtraction("Part3");
     try {
            File k1 = new File("C:\\FinalProject\\src\\Images\\ExtractPart1.png");
            File k2 = new File("C:\\FinalProject\\src\\Images\\ExtractPart2.png");
            File k3 = new File("C:\\FinalProject\\src\\Images\\ExtractPart3.png");
            
            Image b1 = ImageIO.read(k1);
            ImageIcon iI1 = new ImageIcon(new ImageIcon(b1).getImage().getScaledInstance(82,63,Image.SCALE_DEFAULT));
            Object1.setIcon(iI1);
            
            Image b2 = ImageIO.read(k2);
            ImageIcon iI2 = new ImageIcon(new ImageIcon(b2).getImage().getScaledInstance(82,63,Image.SCALE_DEFAULT));
            Object2.setIcon(iI2);
            
            Image b3 = ImageIO.read(k3);
            ImageIcon iI3 = new ImageIcon(new ImageIcon(b3).getImage().getScaledInstance(82,63,Image.SCALE_DEFAULT));
            Object3.setIcon(iI3);
              
     } catch (Exception e) {  } 
       
    }//GEN-LAST:event_RegionExtractionActionPerformed

    private void QuantificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantificationActionPerformed
        CheckGroup cg = new CheckGroup();
    boolean a = cg.CheckIfPositive("ExtractPart1");
    boolean b = cg.CheckIfPositive("ExtractPart2");
    boolean c = cg.CheckIfPositive("ExtractPart3");
  
 // ab+   ab-  a+  a-  b-  b+  o-  o+
          
String BloodGroup="";
  if(a==true && b==true){BloodGroup+="AB";}
   else if(a==true && b==false){BloodGroup+="A";}
   else if(a==false && b==true){BloodGroup+="B";}
   else{BloodGroup+="O";}
 
 if(c==true){BloodGroup+="+";}
 else{BloodGroup+="-";}
 
jLabel17.setText(BloodGroup);
 System.out.println("\n\n\nBlood Group  :  "+BloodGroup);
    
    }//GEN-LAST:event_QuantificationActionPerformed

    private void Input_imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Input_imageMouseClicked
            try{ 
           Image bi = ImageIO.read(f);
           jLabel10.setSize(940,264);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(940,264,Image.SCALE_DEFAULT));
            jLabel10.setIcon(imageIcon);
           }
          catch(Exception e){}
    }//GEN-LAST:event_Input_imageMouseClicked

    private void GrayScale_iimageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrayScale_iimageMouseClicked
           try{ 
               File k = new File("C:\\FinalProject\\src\\Images\\GrayScale.png");
           Image bi = ImageIO.read(k);
           jLabel10.setSize(940,264);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(940,264,Image.SCALE_DEFAULT));
            jLabel10.setIcon(imageIcon);
           }
          catch(Exception e){}

    }//GEN-LAST:event_GrayScale_iimageMouseClicked

    private void ContrastEnhancement_imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContrastEnhancement_imageMouseClicked
        try{ 
           File k = new File("C:\\FinalProject\\src\\Images\\cont_enhan.png");
           Image bi = ImageIO.read(k);
           jLabel10.setSize(940,264);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(940,264,Image.SCALE_DEFAULT));
            jLabel10.setIcon(imageIcon);
           }
          catch(Exception e){}
    }//GEN-LAST:event_ContrastEnhancement_imageMouseClicked

    private void Thresholding_ImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Thresholding_ImageMouseClicked
        try{ 
            File k = new File("C:\\FinalProject\\src\\Images\\Thresold.png");
           Image bi = ImageIO.read(k);
           jLabel10.setSize(940,264);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(940,264,Image.SCALE_DEFAULT));
            jLabel10.setIcon(imageIcon);
           }
          catch(Exception e){}   
    }//GEN-LAST:event_Thresholding_ImageMouseClicked

    private void Dilation_imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dilation_imageMouseClicked
     try{ 
               File k = new File("C:\\FinalProject\\src\\Images\\Dilation.png");
           Image bi = ImageIO.read(k);
           jLabel10.setSize(940,264);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(940,264,Image.SCALE_DEFAULT));
            jLabel10.setIcon(imageIcon);
           }
          catch(Exception e){}
    }//GEN-LAST:event_Dilation_imageMouseClicked

    private void Erosion_imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Erosion_imageMouseClicked
       try{ 
           File k = new File("C:\\FinalProject\\src\\Images\\Erosion.png");
           Image bi = ImageIO.read(k);
           jLabel10.setSize(940,264);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(940,264,Image.SCALE_DEFAULT));
            jLabel10.setIcon(imageIcon);
           }
          catch(Exception e){}
    }//GEN-LAST:event_Erosion_imageMouseClicked

    private void Object1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Object1MouseClicked
          jLabel10.setSize(350,271);  
        try{ 
               File k = new File("C:\\FinalProject\\src\\Images\\ExtractPart1.png");
           Image bi = ImageIO.read(k);
           jLabel10.setSize(350,271);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(350,271,Image.SCALE_DEFAULT));
            jLabel10.setIcon(imageIcon);
           }
          catch(Exception e){}
    }//GEN-LAST:event_Object1MouseClicked

    private void Object2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Object2MouseClicked
            jLabel10.setSize(350,271); 
        try{ 
               File k = new File("C:\\FinalProject\\src\\Images\\ExtractPart2.png");
           Image bi = ImageIO.read(k);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(350,271,Image.SCALE_DEFAULT));
            jLabel10.setIcon(imageIcon);
           }
          catch(Exception e){}
        
    }//GEN-LAST:event_Object2MouseClicked

    private void Object3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Object3MouseClicked
            jLabel10.setSize(350,271);         
        try{ 
           File k = new File("C:\\FinalProject\\src\\Images\\ExtractPart3.png");
            Image bi = ImageIO.read(k);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(350,271,Image.SCALE_DEFAULT));
            jLabel10.setIcon(imageIcon);
           }
          catch(Exception e){}
        
    }//GEN-LAST:event_Object3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GrayscaleImage gs = new GrayscaleImage();
        gs.grayScale_image(f);
        ContrastEnhancement ce = new ContrastEnhancement();
        ce.contrast_enhancement();
        ThresoldImage th = new ThresoldImage();
        th.thresoldImage();
        Dilation th1 = new Dilation();
        th1.dilated_image();
        Erosion th2 = new Erosion();
        th2.erosion_image();
        Separating se= new Separating();
        se.separate_image(); //first separatin into 3 equal parts
   
           RegionExtraction re = new RegionExtraction(); 
           re.regionExtraction("Part1");
           re.regionExtraction("Part2");
           re.regionExtraction("Part3");
           
           
          CheckGroup cg = new CheckGroup();
    boolean a = cg.CheckIfPositive("ExtractPart1");
    boolean b = cg.CheckIfPositive("ExtractPart2");
    boolean c = cg.CheckIfPositive("ExtractPart3");
           
        
        try {
            File k = new File("C:\\FinalProject\\src\\Images\\GrayScale.png");
            Image bi = ImageIO.read(k);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(195,62,Image.SCALE_DEFAULT));
            GrayScale_iimage.setIcon(imageIcon);
        } catch (Exception e) {  }
        
        try {
            File k = new File("C:\\FinalProject\\src\\Images\\cont_enhan.png");
            Image bi = ImageIO.read(k);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(195,62,Image.SCALE_DEFAULT));
            ContrastEnhancement_image.setIcon(imageIcon);
        } catch (Exception e) {  } 
                                               
        try {
            File k = new File("C:\\FinalProject\\src\\Images\\Thresold.png");
            Image bi = ImageIO.read(k);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(195,62,Image.SCALE_DEFAULT));
            Thresholding_Image.setIcon(imageIcon);
        } catch (Exception e) {  } 
        
        try {
            File k = new File("C:\\FinalProject\\src\\Images\\Dilation.png");
            Image bi = ImageIO.read(k);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(195,62,Image.SCALE_DEFAULT));
            Dilation_image.setIcon(imageIcon);
        } catch (Exception e) {  }                                         


        try {
            File k = new File("C:\\FinalProject\\src\\Images\\Erosion.png");
            Image bi = ImageIO.read(k);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(195,62,Image.SCALE_DEFAULT));
            Erosion_image.setIcon(imageIcon);
        } catch (Exception e) {  } 
        
     try {
            File k1 = new File("C:\\FinalProject\\src\\Images\\ExtractPart1.png");
            File k2 = new File("C:\\FinalProject\\src\\Images\\ExtractPart2.png");
            File k3 = new File("C:\\FinalProject\\src\\Images\\ExtractPart3.png");
            
            Image b1 = ImageIO.read(k1);
            ImageIcon iI1 = new ImageIcon(new ImageIcon(b1).getImage().getScaledInstance(82,63,Image.SCALE_DEFAULT));
            Object1.setIcon(iI1);
            
            Image b2 = ImageIO.read(k2);
            ImageIcon iI2 = new ImageIcon(new ImageIcon(b2).getImage().getScaledInstance(82,63,Image.SCALE_DEFAULT));
            Object2.setIcon(iI2);
            
            Image b3 = ImageIO.read(k3);
            ImageIcon iI3 = new ImageIcon(new ImageIcon(b3).getImage().getScaledInstance(82,63,Image.SCALE_DEFAULT));
            Object3.setIcon(iI3);
              
     } catch (Exception e) {  } 
                                                     
   
 // ab+   ab-  a+  a-  b-  b+  o-  o+
          
String BloodGroup="";
  if(a==true && b==true){BloodGroup+="  AB";}
   else if(a==true && b==false){BloodGroup+="  A";}
   else if(a==false && b==true){BloodGroup+="  B";}
   else{BloodGroup+="  O";}
 
 if(c==true){BloodGroup+=" +ve";}
 else{BloodGroup+=" -ve";}
 
jLabel17.setText(BloodGroup);
 System.out.println("\n\n\nBlood Group  :  "+BloodGroup);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConstrastEnhancement;
    private javax.swing.JLabel ContrastEnhancement_image;
    private javax.swing.JButton Dilation;
    private javax.swing.JLabel Dilation_image;
    private javax.swing.JButton Erosion;
    private javax.swing.JLabel Erosion_image;
    private javax.swing.JButton GrayScale;
    private javax.swing.JLabel GrayScale_iimage;
    private javax.swing.JLabel Input_image;
    private javax.swing.JLabel Object1;
    private javax.swing.JLabel Object2;
    private javax.swing.JLabel Object3;
    private javax.swing.JButton OpenImage;
    private javax.swing.JButton Quantification;
    private javax.swing.JButton RegionExtraction;
    private javax.swing.JButton Thresholding;
    private javax.swing.JLabel Thresholding_Image;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables


    private ImageIcon format = null;

    private void resetAllField() {
    jLabel17.setText("RESULT");
    }

}
