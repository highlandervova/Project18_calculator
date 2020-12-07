package main;

public class Calc extends javax.swing.JFrame {

    private String first     = null;
    private String second    = null;
    private String operation = null;
    private String result    = null;
    
    public Calc() {
        initComponents();
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText(jTextField1.getText() + "1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText(jTextField1.getText() + "2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jTextField1.setText("");
        jLabel1.setText("");
        first     = null;
        second    = null;
        operation = null;
        result    = null;
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        String s = jTextField1.getText();
        if (s.length() > 0) {
            jTextField1.setText(s.substring(0, s.length()-1));
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if (!jTextField1.getText().contains(".")) {
            jTextField1.setText(jTextField1.getText() + ".");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String s = jTextField1.getText();
        if (!s.equals("0") && !s.equals("")) {
            if (s.charAt(0) == '-') {
                jTextField1.setText(s.substring(1));
            } else {
                jTextField1.setText("-" + s);
            }
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String s = jTextField1.getText();
        if (s.length() > 0) {
            second    = null;
            result    = null;
            this.first = s;
            this.operation = "+";
            jLabel1.setText(this.first + " " + this.operation);
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        String s = jTextField1.getText();
        if (s.length() > 0 && first != null && operation != null && result == null) {
            this.second = jTextField1.getText();
            Double doubleResult = null;
            switch(operation) {
                case "+":
                    doubleResult = Double.valueOf(first) + Double.valueOf(second);
                    break;
            }
            result = doubleResult.toString();
            if (result.endsWith(".0")) {
                result = result.substring(0, result.length()-2);
            }
            jTextField1.setText(result);
            jLabel1.setText(first + " " + operation + " " + second + " = " + result);
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        char c = evt.getKeyChar();
        String s = jTextField1.getText();
        jTextField1.setText(s.substring(0, s.length()-1));
        switch(c) {
            case '1':
                jButton1ActionPerformed(null);
                break;
            case '2':
                jButton2ActionPerformed(null);
                break;
            case '+':
                jButton4ActionPerformed(null);
                break;
            case '=':
                jButton22ActionPerformed(null);
                break;
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
