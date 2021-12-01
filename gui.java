import javax.swing.*;
public class gui {  
    public static void main(String[] args) {  
    JFrame f=new JFrame();//creating instance of JFrame  
              
    JButton b1=new JButton("Add New Book");//creating instance of JButton 
    JButton b2=new JButton("Issue Book") ;
    JButton b3=new JButton("Display Library") ;
    JButton b4=new JButton("Return Book") ;
    b1.setBounds(10,100,100, 40);//x axis, y axis, width, height  
    b2.setBounds(120,100,100, 40);
    b3.setBounds(240,100,100, 40);
    b4.setBounds(360,100,100, 40);

    f.add(b1);//adding button in JFrame  
    f.add(b2); 
    f.add(b3);  
    f.add(b4); 

    f.setSize(1000,1000);//400 width and 500 height  
    f.setLayout(null);//using no layout managers  
    f.setVisible(true);//making the frame visible  
    }  
    } 