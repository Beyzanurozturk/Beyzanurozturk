package text;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Text implements ActionListener {
JFrame window=new JFrame("Kaydetme");
JTextField icerikTextField=new JTextField();
JLabel icerikLabel=new JLabel("İçerik:");
JButton kaydetButton=new JButton("Kaydet");
JLabel blank=new JLabel(); 
FileWriter fileWriter;

public class Text(){
    
    GridLayout g1=new GridLayout();
    g1.setColumns(2);
    g1.setRows(3);
    
    window.setLayout(g1);
    
    kaydetButton.addActionListener(this);
    
    window.add(icerikLabel);
    window.add(icerikTextField);
    window.add(blank);
    window.add(kaydetButton);
    
    window.setSize(300, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    
    
}


  
    public static void main() {


    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand()==kaydetButton.getActionCommand()){
            try{
                fileWriter=new FileWriter("odev.txt");
                fileWriter.write(icerikLabel.getText() + " : "+icerikTextField.getText());
                fileWriter.close();
                JOptionPane.showMessageDialog(null, "Dosyaya Başarıyla Yazdırıldı!");
            }
            catch(Exception e){ JOptionPane.showMessageDialog(null, e+"");
            }
        }

    }
    
    }

