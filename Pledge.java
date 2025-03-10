/*
 * Learning Team D
 * Duane Borchick
 * Tyrone Fields
 * Patrick de los Reyes
 * Luis Ramirez
 * Java II - Programming 421
 * Liwei Jiang
 $(licensePrefix)Oct 7 - Nov 10, 2014
 */
package charitypledge;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.JSONWriter;

/**
 *
 * @author patman
 */
public class Pledge extends javax.swing.JFrame {

    /**
     * Creates new form Pledge
     */
    public Pledge() {
        initComponents();
        tableRefresh();
    }
    
    public static String JSONFile = "C:\\Temp\\CharityJSON.json";
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        Amount = new javax.swing.JLabel();
        AmountTextField = new javax.swing.JTextField();
        CharityLabel = new javax.swing.JLabel();
        CharityComboBox = new javax.swing.JComboBox();
        SubmitButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        ViewButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PledgeViewTable = new javax.swing.JTable();
        DeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enter Pledge");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/charitypledge/logo.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Charity Pledge");

        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NameLabel.setText("Name");

        Amount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Amount.setText("Amount $");

        CharityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CharityLabel.setText("Charity");

        CharityComboBox.setEditable(true);
        CharityComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Add New..." }));
        CharityComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CharityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CharityComboBoxActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        ViewButton.setText("Refresh");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        PledgeViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Charity", "Contribution", "delete?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PledgeViewTable);

        DeleteButton.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 16, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Amount)
                                        .addGap(3, 3, 3)
                                        .addComponent(AmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(CharityLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(DeleteButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SubmitButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CharityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ViewButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitButton)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameLabel)
                            .addComponent(AmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Amount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CharityLabel)
                            .addComponent(CharityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SubmitButton)
                            .addComponent(DeleteButton)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitButton)
                    .addComponent(ViewButton))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(168, 168, 168)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(44, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           

    }                                          

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JFrame frame = new JFrame();
        int confirm = JOptionPane.showOptionDialog(frame,
                "Are You Sure to Close this Application?",
                "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }                                          

    private void CharityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             

        String name, charity, contribution; 
        name = NameTextField.getText(); 
        contribution = AmountTextField.getText(); 
        if(name.equals(""))
        {
         JOptionPane.showMessageDialog(rootPane, "Please enter your name. "); 
         return; 
        }
        if(contribution.equals(""))
        {
          JOptionPane.showMessageDialog(rootPane, "Please enter an amount. ");
          return;
        }
        if (CharityComboBox.getSelectedIndex() == 0) 
        {
           JOptionPane.showMessageDialog(rootPane, "Please select a charity. ");
           return;
        }
        else 
        {
            charity = CharityComboBox.getSelectedItem().toString();
            Object[] row = {name,charity,contribution,false}; 
            DefaultTableModel model = (DefaultTableModel) PledgeViewTable.getModel();
            model.addRow(row);
            String[] JSONrow = {"name", name, "charity", charity, "contribution", contribution};
            JsonWrite(JSONrow);
            // WriteDB(name, charity, contribution);
        }
    }                                            

    public void JsonImport() {

	try {
            InputStream foo = new FileInputStream(JSONFile);
            JSONTokener t = new JSONTokener(foo);
            JSONObject jsonObj = new JSONObject(t);
            foo.close();
            JSONArray jsonList = jsonObj.getJSONArray("contributors");
            for (int i = 0; i < jsonList.length(); i++) 
            {
                // loop array
                JSONObject objects = jsonList.getJSONObject(i);
                String nameField = objects.getString("name");
                String typeField = objects.getString("charity");
                String contributionField = objects.getString("contribution");
                // Add row to jTable
                loadPledgeTable(nameField, typeField, contributionField);
            }
	} catch (FileNotFoundException e) {
                    JSONWriter jsonWriter;
                    try {
                        jsonWriter = new JSONWriter(new FileWriter(JSONFile));
                        jsonWriter.object();
                        jsonWriter.key("contributors");
                        jsonWriter.array();
                        jsonWriter.endArray();
                        jsonWriter.endObject();
                        //jsonWriter.close();
                        tableRefresh();
                    } catch (IOException f) {
                        f.printStackTrace();
                    } catch (JSONException g) {
                        g.printStackTrace();
                    }
        } catch (IOException e) {
                e.printStackTrace();
        } catch (JSONException e) {
                e.printStackTrace();
        }
    }
    
    public void JsonWrite(String[] args) {

        String[] values = args;
        JSONObject obj = new JSONObject();
        JSONArray objArray = new JSONArray();
        try {
            if (args == null || values.length == 0) {
                throw new Exception("Noting to write to file");
            } else {
                String title = "";
                String value = "";
                
                for (int i = (values.length - 1); i >= 0; i--) {
                    if ((i % 2) ==0) {
                        title = values[i];
                        obj.put(title, value);
                    } else {
                        value = values[i];
                    }
                }
                objArray.put(obj);
            }
           
            try {
                try {
                    InputStream foo = new FileInputStream(JSONFile);
                    JSONTokener t = new JSONTokener(foo);
                    JSONObject json = new JSONObject(t);
                    foo.close();
                    FileWriter file = new FileWriter(JSONFile);
                    json.append("contributors", obj);
                    file.write(json.toString(5));
                    file.close();
                    tableRefresh();
                } catch (FileNotFoundException e) {
                    JSONWriter jsonWriter;
                    try {
                        jsonWriter = new JSONWriter(new FileWriter(JSONFile));
                        jsonWriter.object();
                        jsonWriter.key("contributors");
                        jsonWriter.array();
                        jsonWriter.endArray();
                        jsonWriter.endObject();
                        InputStream foo = new FileInputStream(JSONFile);
                        JSONTokener t = new JSONTokener(foo);
                        JSONObject json = new JSONObject(t);
                        foo.close();
                        FileWriter file = new FileWriter(JSONFile);
                        json.append("contributors", obj);
                        file.write(json.toString(5));
                        file.close();
                        tableRefresh();
                    } catch (IOException f) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                    e.printStackTrace();
            }
        } catch(Exception e) {
            int pic = JOptionPane.ERROR_MESSAGE; 
            JOptionPane.showMessageDialog(null, e,"",pic);
        }
    }
 
    private void loadPledgeTable(String name, String type, String contribution) {
                // Set Object[] variable and add row to jTable
                Object[] row =  {name,type,contribution};  
                DefaultTableModel model = (DefaultTableModel) PledgeViewTable.getModel();
                model.addRow(row);
    }
    
    public void tableRefresh() {
        DefaultTableModel model = (DefaultTableModel) PledgeViewTable.getModel();
        model.setRowCount(0);
        JsonImport();
    }
    
    public void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        int[] rowDelete; 
        rowDelete = PledgeViewTable.getSelectedRows();
        DefaultTableModel model = (DefaultTableModel) PledgeViewTable.getModel();
 
        for (int rows : rowDelete)
        { 
            model.removeRow(PledgeViewTable.convertColumnIndexToModel(rows));
        }
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JLabel Amount;
    private javax.swing.JTextField AmountTextField;
    private javax.swing.JComboBox CharityComboBox;
    private javax.swing.JLabel CharityLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    public javax.swing.JTable PledgeViewTable;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton ViewButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
