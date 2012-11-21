/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewPDDLProjectDialog.java
 *
 * Created on Jun 4, 2012, 12:48:37 PM
 */

package itSIMPLE;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultTreeModel;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;
import util.fileio.FileOutput;

/**
 *
 * @author sanpedro
 */
public class NewPDDLProblemDialog extends javax.swing.JDialog
{
    private File projectFolder;
    private String problemName;
    private ItTree projectsTree;

    /** Creates new form NewPDDLProjectDialog */
    public NewPDDLProblemDialog(java.awt.Frame parent, boolean modal, ItTree theprojectsTree) {
        super(parent, modal);
        initComponents();
        projectsTree = theprojectsTree;
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        newProblemFileNameTextField = new javax.swing.JTextField();
        canceljButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New PDDL Problem");
        setLocationByPlatform(true);

        jLabel1.setText("File Name:");

        newProblemFileNameTextField.setText("newproblem.pddl");

        canceljButton.setText("Cancel");
        canceljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceljButtonActionPerformed(evt);
            }
        });

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(newProblemFileNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canceljButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(newProblemFileNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canceljButton)
                    .addComponent(okButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void canceljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceljButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_canceljButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        problemName = newProblemFileNameTextField.getText().trim().replace(" ", "");
        
        if (!problemName.trim().equals("")){
            //check if there is a file extension
            if (!problemName.endsWith(".pddl")){
                problemName +=".pddl";
            }

            ItTreeNode selectedNode = (ItTreeNode)projectsTree.getLastSelectedPathComponent();
            //Problem Instance files
            Element problemInstancesRoot = selectedNode.getData();
            ItTreeNode treeProblemInstPDDL = selectedNode;
            ItTreeNode projectNode = (ItTreeNode)selectedNode.getParent();
            DefaultTreeModel treeModel = (DefaultTreeModel)projectsTree.getModel();

            String filePath = projectNode.getReference().getChildText("filePath");
            String tpath = filePath;
            File theitProjectFile = new File(tpath);
            tpath = tpath.replaceFirst(theitProjectFile.getName(), "");                                       
            String path = tpath + problemName;


            //check if name already exists as domain file
            File file=new File(path);
            boolean exists = file.exists();
            // It returns false if File or directory does not exist
            if (!exists) {

                System.out.println("creating file : " + exists);

                String projectName = projectNode.getData().getChildText("name");
                
                String problemContent = "(define (problem "+ problemName.replaceFirst(".pddl", "") +")\n"+
                        "(:domain "+projectName+")\n"+
                        "(:objects\n\n"+
                        ")\n"+
                        "(:init\n\n"+
                        ")\n"+
                        "(:goal\n\n"+
                        ")\n"+
                        ")";                        

                FileOutput.saveFile(path, problemContent);

                //create new pddl problem 
                File eachfile = new File(path);                                                
                String filename = eachfile.getName();

                Element problemInstance = new Element("pddlproblem");
                //problemInstance.setText(filename);
                problemInstance.setAttribute("filename", filename);
                problemInstance.setAttribute("file", eachfile.getAbsolutePath());
                Element thename = new Element("name");
                thename.setText(filename);
                problemInstance.addContent(thename);
                problemInstancesRoot.addContent(problemInstance);

                ItTreeNode nodeProblemInstPDDL = new ItTreeNode(filename,problemInstance, null, null);
                nodeProblemInstPDDL.setIcon(new ImageIcon("resources/images/problem.png"));
                treeModel.insertNodeInto(nodeProblemInstPDDL, treeProblemInstPDDL, treeProblemInstPDDL.getChildCount());
                
                this.dispose();

            }
            else{
                JOptionPane.showMessageDialog(this,"<html>File '"+problemName+"' already exists in the project. Please specify another file name. </html>");
            }            
            
        }                
    }//GEN-LAST:event_okButtonActionPerformed

//    /**
//    * @param args the command line arguments
//    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                NewPDDLProjectDialog dialog = new NewPDDLProjectDialog(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton canceljButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField newProblemFileNameTextField;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

}
