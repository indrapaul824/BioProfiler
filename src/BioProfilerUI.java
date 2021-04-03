import javax.swing.*;

public class BioProfilerUI extends javax.swing.JFrame {
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTextArea profileTextArea;

    //creates a new form
    public BioProfilerUI() {
        initComponents();
    }

    private void initComponents() {

        JPanel jPanel1 = new JPanel ();
        JPanel jPanel2 = new JPanel ();
        JPanel jPanel3 = new JPanel ();
        JLabel jLabel1 = new JLabel ();
        JLabel jLabel2 = new JLabel ();
        JLabel jLabel3 = new JLabel ();
        JLabel jLabel4 = new JLabel ();
        nameTextField = new JTextField ();
        ageTextField = new JTextField ();
        JRadioButton genMaleRadio = new JRadioButton ();
        JRadioButton genFemaleRadio = new JRadioButton ();
        ButtonGroup genGroup = new ButtonGroup ();
        JButton instaButton = new JButton ();
        JButton linkedButton = new JButton ();
        JButton twitterButton = new JButton ();
        JScrollPane jScrollPane1 = new JScrollPane ();
        profileTextArea = new JTextArea ();
        JButton exitButton = new JButton ();
        JButton resetButton = new JButton ();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personal Bio Profiler");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("1. Enter Your Personal Information"));

        jLabel2.setText("Name");

        jLabel3.setText("Age");

        jLabel4.setText("Gender");

        nameTextField.setToolTipText ("Enter the name you want in the profile.");
        ageTextField.setToolTipText("Enter your age.");
        genFemaleRadio.setText("Female");
        genMaleRadio.setText("Male");
        genGroup.add (genFemaleRadio);
        genGroup.add (genMaleRadio);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameTextField)
                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent (genMaleRadio)
                                        .addComponent (genFemaleRadio))
                                .addGap(51, 51, 51))
        );

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(ageTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(genMaleRadio))
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(genFemaleRadio))
                                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36));
        jLabel1.setForeground(new java.awt.Color(153, 102, 0));
        jLabel1.setText("Bio Profiler       ");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("2. Choose What Kind of Profile"));

        instaButton.setText("Instagram");
        instaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instaButtonActionPerformed(evt);
            }
        });

        linkedButton.setText("LinkedIn");
        linkedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkedButtonActionPerformed(evt);
            }
        });

        twitterButton.setText("Twitter");
        twitterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twitterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(instaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(linkedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(twitterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{instaButton, linkedButton, twitterButton});

        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(instaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(linkedButton)
                                        .addComponent(twitterButton))
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]{instaButton, linkedButton, twitterButton});

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Generated Profile Bio"));

        profileTextArea.setColumns(20);
        profileTextArea.setLineWrap(true);
        profileTextArea.setRows(5);
        profileTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(profileTextArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(15, Short.MAX_VALUE))
        );

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(resetButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(exitButton))
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(144, 144, 144)
                                                .addComponent(jLabel1)))
                                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(exitButton)
                                        .addComponent(resetButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private String getNameEntered() {
        String name = nameTextField.getText().trim();

        if (name.length() == 0) {
            name = "Unknown";
        }
        return name;
    }

    private int getYearsEntered() {
        int years = 0;
        try {
            years = Integer.parseInt(ageTextField.getText().trim());
        } catch (NumberFormatException e) {
            years = 0;
        }
        return years;
    }

    private String getGenderEntered() {
        String gender = nameTextField.getText().trim();

        if (gender.length() == 0) {
            gender = "Unknown";
        }
        return gender;
    }

    public void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    public void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        nameTextField.setText("");
        ageTextField.setText("");
        profileTextArea.setText("");
    }

    public void instaButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //code that handles cat button click:

        User myUser = new Instagram(getNameEntered(), getYearsEntered(), getGenderEntered());

        String description = myUser.selfDescribe();
        profileTextArea.setText(description);
    }

    public void linkedButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //code that handles dog button clicks

        User myUser = new LinkedIn(getNameEntered(), getYearsEntered(), getGenderEntered());

        String description = myUser.selfDescribe();
        profileTextArea.setText(description);
    }

    private void twitterButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //code that handles goldfish button click
        User myUser = new Twitter(getNameEntered(), getYearsEntered(), getGenderEntered());

        String description = myUser.selfDescribe();
        profileTextArea.setText(description);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BioProfilerUI().setVisible(true);
            }
        });
    }

}