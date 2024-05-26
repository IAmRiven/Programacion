import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Alumnado
 */
public class FrameMoveGeometricalFigures extends javax.swing.JFrame {

    /**
     * Creates new form FrameMoveGeometricalFigures
     */

    ArrayList<Drawable> figures = new ArrayList<>();

    public FrameMoveGeometricalFigures() {
        initComponents();
        figures.add(new Rectangle(Color.BLUE, 20, 50, 100, 30));
        figures.add(new Rectangle(Color.RED, 20, 100, 100, 30));
        figures.add(new Line(Color.YELLOW, 20, 150, 60, 150));
        figures.add(new Line(Color.ORANGE, 20, 160, 60, 160));
        figures.add(new Oval(Color.blue, 90, 200, 200, 90));
        figures.add(new Triangle(Color.GREEN, 120, 160, 150, 120, 190, 110));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButtonL = new javax.swing.JButton();
        jButtonR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonL.setText("<<");
        jButtonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLActionPerformed(evt);
            }
        });

        jButtonR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonR.setText(">>");
        jButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(jButtonL)
                                .addGap(62, 62, 62)
                                .addComponent(jButtonR)
                                .addContainerGap(212, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(379, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButtonL, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonR))
                                .addGap(65, 65, 65)));

        pack();
    }// </editor-fold>

    private void jButtonLActionPerformed(java.awt.event.ActionEvent evt) {
        for (Drawable figure : figures) {
            figure.moverIzquierda();
            figure.draw(getGraphics());
        }
        repaint();
    }

    private void jButtonRActionPerformed(java.awt.event.ActionEvent evt) {
        for (Drawable figure : figures) {
            figure.moverDerecha();
            figure.draw(getGraphics());
        }
        repaint();
    }

    /**
     * @param args the command line arguments
     */

    public void paint(Graphics g) {
        super.paint(g);
        for (Drawable figure : figures) {
            figure.draw(g);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameMoveGeometricalFigures.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMoveGeometricalFigures.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMoveGeometricalFigures.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMoveGeometricalFigures.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMoveGeometricalFigures().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButtonL;
    private javax.swing.JButton jButtonR;
    // End of variables declaration
}