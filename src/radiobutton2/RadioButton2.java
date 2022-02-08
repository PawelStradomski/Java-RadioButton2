
package radiobutton2;
/**
 * @author pawelstradomski
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton2 extends JFrame
{

    public RadioButton2()
    {
        super("RadioButton: ulepszona metoda");
        this.setBounds(600, 400, 400, 200);
        initComponent();
        this.setDefaultCloseOperation(3);   
    }
    public void initComponent()
    {
        this.getContentPane().add(panel1, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.SOUTH);
        this.getContentPane().add(panel3, BorderLayout.CENTER);
        
        panel2.add(etykieta);
        
        budujButtonSize("mały", 15);
        budujButtonSize("sredni", 25);
        budujButtonSize("duzy", 35);
        
        budujButtonColor("czerwony", Color.RED);
        budujButtonColor("niebieski", Color.BLUE);
        
    }
    public void budujButtonSize(String nazwa, final int rozmiar)
    {
        JRadioButton przelacznik = new JRadioButton(nazwa);
        przelacznik.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                etykieta.setFont(new Font("Serif", Font.ITALIC, rozmiar));
            }
        });
        panel1.add(przelacznik);
        groupSize.add(przelacznik);
    }
    public void budujButtonColor(String nazwa, final Color k)
    {
        JRadioButton przelacznik = new JRadioButton(nazwa);
        przelacznik.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                etykieta.setForeground(k);
            }
        });
        
        panel3.add(przelacznik);
        groupColor.add(przelacznik);
    }
    JLabel etykieta = new JLabel("testCzcionki");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    ButtonGroup groupSize = new ButtonGroup();
    ButtonGroup groupColor = new ButtonGroup();

    
    public static void main(String[] args) {
       new RadioButton2().setVisible(true);
    }
    
}
