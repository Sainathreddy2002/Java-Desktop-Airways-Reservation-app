import java.awt.Dimension;
import java.awt.*; 
import java.awt.event.*; 
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Myproject 
{  
    //Map<String> m=new HashMap<>();
 Myproject() throws FileNotFoundException
 {  
    JFrame f= new JFrame("WELCOME TO INDIAN AIRWAYS");
    JPanel jp=new JPanel();   
    jp.setBounds(0,0,480,360);
    JPasswordField p1;  
    JTextField t1,t2,t3;
    JLabel l1,l2,l3,l4;
    JButton b1,b2,b3;
    jp.setBackground(Color.GRAY);
    //icon of frame
    Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");    
    f.setIconImage(icon); 
    //buttons
    b1=new JButton("LOGIN");
    b1.setBounds(30,250,100,30);
    b2=new JButton("FORGOT PASSWORD");
    b2.setBounds(140,250,180,30);
    b3=new JButton("SIGN UP");
    b3.setBounds(330,250,100,30);
    b1.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,12));
    b2.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,12));
    b3.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,12));
    //labels created
    l1=new JLabel("PROFILE ID:");
    l1.setBounds(90,100,80,30);
    l2=new JLabel("PASSWORD:");
    l2.setBounds(90,150,80,30);
    l3=new JLabel("WELCOME TO ONLINE AIRWAY RESERVATION");
    l3.setBounds(8,5,500,30);
   // l3.setForeground(Color.WHITE);
    l3.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,20));
    l1.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,13));
    l2.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,13));
    l4=new JLabel();
    l4.setBounds(150,200,200,30);
    l4.setForeground(Color.RED);
    //l1.setOpaque(true);
    //l2.setOpaque(true);
   // l3.setOpaque(true);
    //l1.setBackground(Color.RED);
    //l2.setBackground(Color.RED);
    //l3.setBackground(Color.WHITE); 
    //textfield  
    t1=new JTextField();  
    t1.setBounds(170,100,150,30);  
    //t2=new JTextField();  
    p1=new JPasswordField();//t2.setBounds(150,150, 200,30);
    p1.setBounds(170,150,150,30);
    t3=new JTextField();
    //t3.setBounds(150,200,200,30);
    //t3.setEditable(false);
    //jpanelayout
    //jp.setLayout(new BorderLayout());
    //add to frame
    jp.add(b1);
    jp.add(b2);
    jp.add(b3); 
    jp.add(l1);jp.add(l2);jp.add(l3);jp.add(l4); 
    jp.add(t1); jp.add(p1);jp.add(t3);
    f.add(jp); 
    //jp.setLayout(new BorderLayout());
    jp.setLayout(new BorderLayout());
    JLabel background=new JLabel(new ImageIcon("sec.gif"));
    jp.add(background);
    background.setLayout(new FlowLayout());
    background.setBounds(0,0,480,360);   
    f.setSize(480,360); 
    //f.setBackground 
   // f.setLayout(null);  
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //String ls=t1.getText();
    //String ps=t2.getText();
    b1.addActionListener( new ActionListener()
      {
        public void actionPerformed(ActionEvent event)
   {
     File inputFile = new File("passwords.txt");
     
     String userNameInput = t1.getText();
     String passwordInput = String.valueOf(p1.getPassword());
     
     try {
            Scanner in = new Scanner(new File("passwords.txt"));
            while (in.hasNextLine())
            {
              String s = in.nextLine();  
              String[] sArray = s.split(",");          
              if (userNameInput.equals(sArray[0]) && passwordInput.equals(sArray[1]))
              {
               f.dispose();
               new Login();
              }
              else
              {
                l4.setText("INVALID ID OR PASSWORD");
              }
            }
            
            in.close(); 
        }    
        catch (FileNotFoundException e)
           {
            l4.setText("ERROR");
           }              
    
   }
});
    b2.addActionListener( new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
            f.dispose();
            new Forgotpass();  
        }
      });
       b3.addActionListener( new ActionListener()
      {
        public void actionPerformed(ActionEvent e) 
        {
            f.dispose();
            
            new Newacc();
            //catch(FileNotFoundException cd){System.out.print("file");}
        }
      });       
} 
public static void main(String[] args) throws FileNotFoundException
  {
    try{ new Myproject();}
    catch(FileNotFoundException qw){System.out.println("error");}
 } 
} 


//frame for forgot password button
class Forgotpass 
{
    //fp is object for Forgotpass class
    //JFrame fp=new JFrame();
    Forgotpass()
    {
        JFrame fp=new JFrame();
        JButton fb1,fb2,fb3,fb4;
        JPanel fjp=new JPanel();
        fjp.setBounds(0,0,600,600);
        JTextField ftf1,ftf2,ftf3;
        JLabel fl1,fl2,fl3,fl4,fl5,ftf4,fl6;
        JPasswordField fp1,fp2;
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");    
        fp.setIconImage(icon); 
        //buttons 
        fb3=new JButton("CLOSE");
        fb2=new JButton("CHANGE PASSWORD");
        fb3.setBounds(100,450,80,30);
        fb2.setBounds(100,400,170,30);
        fb4=new JButton("GET OTP");
        fb4.setBounds(100,350,100,30);
        fb3.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,13));
        fb2.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,13));
        fb4.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,13));
        //textfields
        ftf1=new JTextField();
        ftf1.setBounds(160,100,120,30);
        fp1=new JPasswordField();
        fp2=new JPasswordField();
        //ftf2=new JTextField();
        fp1.setBounds(160,150,120,30);//ftf2.setBounds(160,150,120,30);
        //ftf3=new JTextField();
        fp2.setBounds(160,200,120,30);//ftf3.setBounds(200,200,120,30);
        ftf4=new JLabel();
        ftf4.setBounds(200,280,170,30);
            JTextField txto=new JTextField();
            txto.setBounds(160,250,50,30);
            fjp.add(txto);
        //ftf4.setEditable(false);
        //labelss
        fl1=new JLabel("ENTER GMAIL ID:");
        fl2=new JLabel("ENTER NEW PASSWORD:");
        fl3=new JLabel("CONFIRM PASSWORD:");
        fl4=new JLabel("OTP");
        fl1.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,12));
        fl2.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,12));
        fl3.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,12));
        fl4.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,12));
        fl1.setBounds(10,100,150,30);
        fl2.setBounds(10,150,150,30);
        fl3.setBounds(10,200,150,30);
        fl4.setBounds(10,250,100,30);
        //fl5.setBounds(100,300,170,30);
        //add to frame
        fjp.add(ftf1);fjp.add(fp1);fjp.add(fp2);fjp.add(ftf4);fjp.add(fb4);
        fjp.add(fb3);
        fjp.add(fb2);
        fjp.add(fl1);fjp.add(fl2);
        fjp.add(fl3);
        fjp.add(fl4);
        // fp.add(fjp);
        fjp.setLayout(new BorderLayout());
        fjp.setLayout(new BorderLayout());
        JLabel fback=new JLabel(new ImageIcon("fp.jpg"));
        fback.setLayout(new FlowLayout());
         fback.setBounds(0,0,600,600); 
          fjp.add(fback);
        //fp.add(fjp);
        fp.setTitle("NEW PASSWORD");
        fp.setVisible(true);
        fp.setLayout(null);
        fp.setSize(600,600);
        fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fp.add(fjp);
        fb4.addActionListener( new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
             if(ftf1.getText().equals(""))
            {    
                ftf4.setText("ENTER VALID ID");
            }
           //else{ftf4.setText("ACCOUNT CREATED");} 
            else if(String.valueOf(fp1.getPassword()).equals(""))
            {
                 ftf4.setText("PASSWORD REQUIRED");
            } 
             else if(!String.valueOf(fp1.getPassword()).equals(String.valueOf(fp2.getPassword())))
            {
                 ftf4.setText("PASSWORD'S DIDNT MATCH");
            } 
            //else{ftf4.setText("PASSWORD CHANGED");} 

        }
      });       
        fb3.addActionListener( new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
           try{ 
            	new Myproject();
            	fp.dispose();
            }

             catch(FileNotFoundException qw){System.out.println("error");} 
        }
      });     
         fb2.addActionListener( new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
             ftf4.setText("PASSWORD CHANGED"); 
        }
      });       
    }
} 


//frame for new account button
class Newacc 
{
    //njf is object for Newacc class
    JFrame njf=new JFrame();
    Newacc()  
    {
        JButton nb1,nb2,nb3;
        JPanel njp=new JPanel();   
        njp.setBounds(0,0,500,500);
        JPasswordField np1,np2;
        JTextField ntf1,ntf2,ntf3;
        JLabel nl1,nl2,nl3,nl4,ntf4;
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");    
        njf.setIconImage(icon);
        Map<String,String> m=new HashMap<>();
       // Set set=m.keySet();
       /*try{
        
        Scanner sc = new Scanner(new File("passwords.txt"));
        while (sc.hasNextLine())
         {
            String s = sc.nextLine();  
            String[] arr = s.split(",");
            m.put(arr[0],arr[1]);
            
            //Set<String> set=m.keySet();
           
        }}

       catch(Exception cd){System.out.print("file not found");}
       Set<String> set=m.keySet();*/
        //BUTTONS
        nb1=new JButton("NA1");
        nb1.setBounds(100,250,80,30);
        nb2=new JButton("CREATE ACCOUNT");
        nb2.setBounds(100,250,160,30);
        nb3=new JButton("CLOSE");
        nb3.setBounds(100,400,80,30);
         nb3.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,13));
        nb2.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,13));
        //TEXTFIELDS
        ntf1=new JTextField();
        ntf1.setBounds(160,100,150,30);
        np1=new JPasswordField();
        np1.setBounds(160,150,150,30);
        //ntf2=new JTextField();
        //ntf2.setBounds(200,150,80,30);
        np2=new JPasswordField();
        np2.setBounds(160,200,150,30);
        //ntf3=new JTextField();
        //ntf3.setBounds(200,200,80,30);
        ntf4=new JLabel();
        ntf4.setBounds(100,300,250,30);
        //ntf4.setEditable(false);
        //LABELS
        nl1=new JLabel("ID:");
        nl1.setBounds(10,100,120,30);
        nl2=new JLabel("PASSWORD:");
        nl2.setBounds(10,150,120,30);
        nl3=new JLabel("CONFIRM PASSWORD:");
        nl3.setBounds(10,200,150,30);
        nl4=new JLabel();
        nl4.setBounds(10,200,150,30);
        nl3.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,13));
        nl1.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,13));
        nl2.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,13));
        //ADDING BUTTONS
        njp.add(ntf1);njp.add(np1);njp.add(np2);njp.add(ntf4);
        njp.add(nb2);njp.add(nb1);njp.add(nb3);
        njp.add(nl1);njp.add(nl2);njp.add(nl3);njp.add(nl4);
        njf.setTitle("CREATE YOUR NEW ACCOUNT");
        njf.setVisible(true);
        njp.setLayout(new BorderLayout());
        JLabel newaccbg=new JLabel(new ImageIcon("signup.jpg"));
        newaccbg.setLayout(new FlowLayout());
        newaccbg.setBounds(0,0,500,500); 
         njp.add(newaccbg);
         njf.add(njp); 
        njf.setLayout(null);
        njf.setSize(500,500);
        njf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nb2.addActionListener( new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
             if(ntf1.getText().equals(""))
            {    
                ntf4.setText("ENTER VALID ID");
            }
             else if(String.valueOf(np1.getPassword()).equals(""))
            {
                 ntf4.setText("PASSWORD REQUIRED");
            } 
             else if(!String.valueOf(np1.getPassword()).equals(String.valueOf(np2.getPassword())))
            {
                 ntf4.setText("PASSWORD'S DIDNT MATCH");
            } 
            else{
            	    try{ 
                           Scanner scan = new Scanner(new File("passwords.txt"));
                          String sd= ntf1.getText();
                         
                         while (scan.hasNextLine())
                           {
                              String s = scan.nextLine();  
                              String[] arr = s.split(",");
                             try{ m.put(arr[0],arr[1]);}
                             catch(Exception sid){System.out.println("file is empty");}
                            Set<String> set=m.keySet();
                             try{
                               
                             if(set.contains(sd)) 
                             {
                        
                                  ntf4.setText("ACCOUNT ALREADY EXISTS");
                                  break;
                             }
                                
                              }
                              catch(Exception qwer){System.out.print("error 2");}          
                                //catch(Exception qwer){System.out.print("error 2");}
                                
                            }
                             FileWriter fw=new FileWriter("passwords.txt",true);
                            String newid=ntf1.getText();
                            String newpass=String.valueOf(np1.getPassword());    
                            fw.write("\n"+newid+","+newpass);   
                            fw.close();
                            ntf4.setText("ACCOUNT CREATED");
                             
                            scan.close();
                             
                            System.out.print(m);

                       }
                       catch(Exception qwee)
                       {qwee.printStackTrace();
                        System.out.println(qwee);
                    }            
            	} 

        }
      });
      nb3.addActionListener( new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
             try{ 
            	new Myproject();
            	njf.dispose();
            }

             catch(FileNotFoundException qw){System.out.println("error");}
        }
      });               
    }
} 
class Login
{
    //ljf is obj for login class
  //public  int pri;
    public  ArrayList<Integer> pri =new ArrayList<Integer>();
public Login()
{
   JFrame f2=new JFrame();  
    JButton lb1,lb2,lb3;
    JLabel labl1,labl2,labl3,labl4,labl5;
    JTable jt;
    String Start[]={"HYDERABAD","BANGALORE","MUMBAI","DELHI","CHENNAI"};
    String Date[]={"29 MAY 2021","30 MAY 2021","31 MAY 2021"};
    String Seats[]={"1","2","3","4"};
    ArrayList<Integer> ali =new ArrayList<Integer>();
     Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");    
    f2.setIconImage(icon); 
    //buttons
    //lb1=new JButton("GET FLIGHTS");
    lb2=new JButton("GET FLIGHTS");
    //lb1.setBounds(350,470,130,30);
    lb2.setBounds(300,400,130,30);
    lb3= new JButton("BACK");
    lb3.setBounds(150,400,80,30);
    //combo boxes
    //cb1=new JComboBox(Start);
    JComboBox<String> cb1 = new JComboBox<>(Start);
    cb1.setBounds(20,50,120,20);
   JComboBox<String> cb2 = new JComboBox<>(Start);
    cb2.setSelectedIndex(3);
    cb2.setBounds(180,50,120,20);
    JComboBox<String> cb3 = new JComboBox<>(Date);
    cb3.setBounds(350,50,120,20);
     JComboBox<String> cb4 = new JComboBox<>(Seats);
    cb4.setBounds(20,150,50,20);
    //labels
    labl1=new JLabel("FROM");
    labl2=new JLabel("TO");
    labl3=new JLabel("DATE");
    labl4=new JLabel("SEATS");
    labl5=new JLabel();
    //JLabel labl5=new JLabel("TOTAL PRICE:");
    labl1.setBounds(20,30,60,20);
    labl2.setBounds(180,30,60,20);
    labl3.setBounds(350,30,50,20);
    labl4.setBounds(20,130,50,20);
    labl1.setForeground(Color.BLACK);
    labl2.setForeground(Color.BLACK);
    labl4.setForeground(Color.BLACK);
    labl3.setForeground(Color.BLACK);
    labl5.setBounds(90,150,250,20);
    labl5.setForeground(Color.RED);

    //labl5.setBounds(90,130,100,20);
    //textfield
    JTextField txtfld=new JTextField();
    txtfld.setBounds(190,130,80,20);
    txtfld.setEditable(false);
    //panels   
    JPanel p1=new JPanel();
    p1.setLayout(null); 
    p1.setBackground(Color.CYAN);
    p1.setBounds(0,0,500,500);
    //p1.add(lb1);
    p1.add(lb2);p1.add(lb3); 
    p1.add(cb1);p1.add(cb2);p1.add(cb3);p1.add(cb4);
    p1.add(labl1);p1.add(labl2);p1.add(labl3);p1.add(labl4);p1.add(labl5);
    //p1.add(txtfld); 
   // JPanel p2=new JPanel();
    JPanel pan3=new JPanel();
    pan3.setBounds(500,0,500,500);
    JLabel logbg2=new JLabel(new ImageIcon("travel1.jpg"));
    logbg2.setLayout(new FlowLayout());
    logbg2.setBounds(0,0,500,500); 
    pan3.add(logbg2);
    //tabbed pane 
    //JTabbedPane tp=new JTabbedPane();  
    //tp.setBounds(0,0,500,500);  
    //tp.add("ONE WAY",p1);  
   // tp.add("TWO WAY",p2);
   // f2.add(p3);      
    //f2.add(tp);
    f2.setBackground(Color.RED); 
    f2.add(p1); 
    f2.add(pan3);
    f2.setSize(1000,500);  
    f2.setTitle("FLIGHT BOOKING");
    f2.setLayout(null);  
    f2.setVisible(true); 
    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     ArrayList<String> al =new ArrayList<String>(); 
      //njf.setTitle("CREATE YOUR NEW ACCOUNT");
        //njf.setVisible(true);
        //njp.setLayout(new BorderLayout());
        JLabel logbg=new JLabel(new ImageIcon("travel.jpg"));
        logbg.setLayout(new FlowLayout());
        logbg.setBounds(0,0,500,500); 
         p1.add(logbg);
      lb3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               try{ 
            	new Myproject();
            	f2.dispose();
            }

             catch(FileNotFoundException qw){System.out.println("error");}
            } 
        }); 
    cb1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            
              int ind=cb1.getSelectedIndex();
               // s=s+Start[ind];
                cb2.removeItem(Start[ind]);
                al.add(Start[ind]);
                System.out.println(al);
            } 
        });
    lb2.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            try{
            String s=al.get(0);
            cb2.addItem(s);
            al.remove(s);
          }
          catch(Exception wee)
          {
            System.out.println("ERROR CORRECTED");
            labl5.setText(" ");
          }

        
           if(cb1.getSelectedItem().equals("HYDERABAD") && cb2.getSelectedItem().equals("MUMBAI") ||cb1.getSelectedItem().equals("MUMBAI") && cb2.getSelectedItem().equals("HYDERABAD"))
         {
            if(cb3.getSelectedItem()=="29 MAY 2021")  
            { 
                JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                //p3.setBackground(Color.MAGENTA);
                String data[][]={{"AIR381","AIRINDIA","10:30","11:55","3144","29 MAY 2021"},{"AIR382","AIRINDIA","14:00","15:31","3144","29 MAY 2021"},{"AIR383","AIRINDIA","18:30","19:55","3144","29 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true); 
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                //System.out.println(ali.get(0));
                p3.add(sp);
                p3.add(lb4);
                f2.add(p3);
                int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                     ali.add(s1);
                     System.out.println(ali.get(0));
                     int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                     System.out.println(seat);
                     System.out.println(seat*(ali.get(0)));
                     pri.add(seat*(ali.get(0)));
                     System.out.println("price is "+pri.get(0));
                     String pricetot=String.valueOf(pri.get(0));
                     txtfld.setText(pricetot);
                     lb4.addActionListener(new ActionListener()
                    { 
                      public void actionPerformed(ActionEvent e)
                      {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                      }
                    });
               
               
            }

            else if(cb3.getSelectedItem()=="30 MAY 2021")   
            {
                JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR381","AIRINDIA","12:00","13:31","3200","30 MAY 2021"},{"AIR382","AIRINDIA","14:00","15:31","3200","30 MAY 2021"},{"AIR383","AIRINDIA","18:30","19:55","3200","30 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                //ali.clear();
                int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
             else if(cb3.getSelectedItem()=="31 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR381","AIRINDIA","2:30","4:00","3150","31 MAY 2021"},{"AIR382","AIRINDIA","14:00","15:31","3150","31 MAY 2021"},{"AIR383","AIRINDIA","18:30","19:55","3150","31 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
          }  
            else if((cb1.getSelectedItem().equals("HYDERABAD") && cb2.getSelectedItem().equals("DELHI")) ||(cb1.getSelectedItem().equals("DELHI") && cb2.getSelectedItem().equals("HYDERABAD")))
          {
            if(cb3.getSelectedItem()=="29 MAY 2021")  
            {
                
                 JButton lb4;
                 JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR360","AIRINDIA","11:30","13:45","4200","29 MAY 2021"},{"AIR361","AIRINDIA","16:00","17:15","4200","29 MAY 2021"},{"AIR362","AIRINDIA","19:30","20:45","4200","29 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }

            else if(cb3.getSelectedItem()=="30 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR360","AIRINDIA","16:00","18:45","4100","30 MAY 2021"},{"AIR361","AIRINDIA","16:00","17:15","4100","30 MAY 2021"},{"AIR362","AIRINDIA","19:30","20:45","4100","30 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
             else if(cb3.getSelectedItem()=="31 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR360","AIRINDIA","10:30","12:45","4150","31 MAY 2021"},{"AIR361","AIRINDIA","16:00","17:15","4150","31 MAY 2021"},{"AIR362","AIRINDIA","19:30","20:45","4150","31 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
          }
          else if((cb1.getSelectedItem().equals("HYDERABAD") && cb2.getSelectedItem().equals("CHENNAI")) ||(cb1.getSelectedItem().equals("CHENNAI") && cb2.getSelectedItem().equals("HYDERABAD")))  
          {
             if(cb3.getSelectedItem()=="29 MAY 2021")  
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR318","AIRINDIA","14:40","15:50","3500","29 MAY 2021"},{"AIR319","AIRINDIA","15:20","16:30","3500","29 MAY 2021"},{"AIR320","AIRINDIA","18:30","19:40","3500","29 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }

            else if(cb3.getSelectedItem()=="30 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR318","AIRINDIA","9:00","10:10","3400","30 MAY 2021"},{"AIR319","AIRINDIA","12:00","13:10","3400","30 MAY 2021"},{"AIR320","AIRINDIA","17:00","18:10","3400","30 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
             else if(cb3.getSelectedItem()=="31 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR318","AIRINDIA","10:50","12:00","3400","31 MAY 2021"},{"AIR319","AIRINDIA","17:40","18:50","3400","31 MAY 2021"},{"AIR320","AIRINDIA","22:30","29:40","3400","31 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
          }
           else if((cb1.getSelectedItem().equals("HYDERABAD") && cb2.getSelectedItem().equals("BANGALORE")) ||(cb1.getSelectedItem().equals("BANGALORE") && cb2.getSelectedItem().equals("HYDERABAD")))
          {
             if(cb3.getSelectedItem()=="29 MAY 2021")  
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR340","AIRINDIA","10:00","11:05","3100","29 MAY 2021"},{"AIR341","AIRINDIA","12:30","13:35","3100","29 MAY 2021"},{"AIR342","AIRINDIA","19:40","20:45","3100","29 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }

            else if(cb3.getSelectedItem()=="30 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR340","AIRINDIA","8:00","9:05","2950","30 MAY 2021"},{"AIR341","AIRINDIA","19:00","20:05","2950","30 MAY 2021"},{"AIR342","AIRINDIA","22:00","29:05","2950","30 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
             else if(cb3.getSelectedItem()=="31 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR340","AIRINDIA","16:00","17:05","3010","31 MAY 2021"},{"AIR341","AIRINDIA","9:00","10:05","3010","31 MAY 2021"},{"AIR342","AIRINDIA","20:00","21:05","3010","31 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
           }
          else if ((cb1.getSelectedItem().equals("DELHI") && cb2.getSelectedItem().equals("BANGALORE")) ||(cb1.getSelectedItem().equals("BANGALORE") && cb2.getSelectedItem().equals("DELHI")))
          {
             if(cb3.getSelectedItem()=="29 MAY 2021")  
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR410","AIRINDIA","10:30","13:10","4000","29 MAY 2021"},{"AIR411","AIRINDIA","15:00","17:40","4000","29 MAY 2021"},{"AIR412","AIRINDIA","19:10","21:50","4000","29 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }

            else if(cb3.getSelectedItem()=="30 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR410","AIRINDIA","18:30","21:10","3990","30 MAY 2021"},{"AIR411","AIRINDIA","8:30","11:10","3990","30 MAY 2021"},{"AIR412","AIRINDIA","16:00","18:40","3990","30 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
             else if(cb3.getSelectedItem()=="31 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR410","AIRINDIA","9:30","12:10","4200","31 MAY 2021"},{"AIR411","AIRINDIA","15:30","18:10","4200","31 MAY 2021"},{"AIR412","AIRINDIA","12:00","14:40","4200","31 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
          }   
           else if ((cb1.getSelectedItem().equals("DELHI") && cb2.getSelectedItem().equals("MUMBAI")) ||(cb1.getSelectedItem().equals("MUMBAI") && cb2.getSelectedItem().equals("DELHI")))
           {
             if(cb3.getSelectedItem()=="29 MAY 2021")  
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR345","AIRINDIA","6:30","8:35","2750","29 MAY 2021"},{"AIR346","AIRINDIA","18:30","20:35","2750","29 MAY 2021"},{"AIR347","AIRINDIA","21:20","29:31","2750","29 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }

            else if(cb3.getSelectedItem()=="30 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR345","AIRINDIA","10:30","12:35","2800","30 MAY 2021"},{"AIR346","AIRINDIA","15:20","17:31","2800","30 MAY 2021"},{"AIR347","AIRINDIA","19:10","21:15","2800","30 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
             else if(cb3.getSelectedItem()=="31 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR345","AIRINDIA","17:30","19:35","2900","31 MAY 2021"},{"AIR346","AIRINDIA","19:40","21:45","2900","31 MAY 2021"},{"AIR345","AIRINDIA","20:50","22:55","2900","31 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
           }
           else if ((cb1.getSelectedItem().equals("DELHI") && cb2.getSelectedItem().equals("CHENNAI")) ||(cb1.getSelectedItem().equals("CHENNAI") && cb2.getSelectedItem().equals("DELHI")))
           {
            if(cb3.getSelectedItem()=="29 MAY 2021")  
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR410","AIRINDIA","9:30","12:20","3800","29 MAY 2021"},{"AIR411","AIRINDIA","13:40","16:30","3800","29 MAY 2021"},{"AIR412","AIRINDIA","18:50","21:40","3800","29 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }

            else if(cb3.getSelectedItem()=="30 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR410","AIRINDIA","5:30","8:20","3750","30 MAY 2021"},{"AIR411","AIRINDIA","9:30","12:20","3750","30 MAY 2021"},{"AIR412","AIRINDIA","12:20","13:10","3750","30 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
             else if(cb3.getSelectedItem()=="31 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR410","AIRINDIA","9:00","11:50","3850","31 MAY 2021"},{"AIR411","AIRINDIA","12:30","15:20","3850","31 MAY 2021"},{"AIR412","AIRINDIA","10:00","12:50","3850","31 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
           }
           else if ((cb1.getSelectedItem().equals("BANGALORE") && cb2.getSelectedItem().equals("CHENNAI")) ||(cb1.getSelectedItem().equals("CHENNAI") && cb2.getSelectedItem().equals("BANGALORE")))
           {
             if(cb3.getSelectedItem()=="29 MAY 2021")  
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR510","AIRINDIA","10:30","11:20","2700","29 MAY 2021"},{"AIR511","AIRINDIA","11:00","11:50","2700","29 MAY 2021"},{"AIR512","AIRINDIA","19:40","20:30","2700","29 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }

            else if(cb3.getSelectedItem()=="30 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR510","AIRINDIA","8:30","9:20","2750","30 MAY 2021"},{"AIR511","AIRINDIA","20:30","21:20","2750","30 MAY 2021"},{"AIR512","AIRINDIA","29:00","29:50","2750","30 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
             else if(cb3.getSelectedItem()=="31 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR510","AIRINDIA","22:00","29:20","2850","31 MAY 2021"},{"AIR511","AIRINDIA","20:00","20:50","2850","31 MAY 2021"},{"AIR512","AIRINDIA","4:20","5:10","2850","31 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
           }
           else if ((cb1.getSelectedItem().equals("BANGALORE") && cb2.getSelectedItem().equals("MUMBAI")) ||(cb1.getSelectedItem().equals("MUMBAI") && cb2.getSelectedItem().equals("BANGALORE")))
           {
            if(cb3.getSelectedItem()=="29 MAY 2021")  
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR395","AIRINDIA","10:30","12:10","3300","29 MAY 2021"},{"AIR396","AIRINDIA","13:30","15:10","3300","29 MAY 2021"},{"AIR397","AIRINDIA","3:00","4:40","3300","29 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }

            else if(cb3.getSelectedItem()=="30 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR395","AIRINDIA","9:00","10:40","3400","30 MAY 2021"},{"AIR396","AIRINDIA","5:30","7:10","3400","30 MAY 2021"},{"AIR397","AIRINDIA","10:00","11:40","3400","30 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
             else if(cb3.getSelectedItem()=="31 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR395","AIRINDIA","8:31","10:05","3350","31 MAY 2021"},{"AIR396","AIRINDIA","5:00","6:40","3350","31 MAY 2021"},{"AIR397","AIRINDIA","10:15","11:55","3350","31 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
           }
           else if ((cb1.getSelectedItem().equals("MUMBAI") && cb2.getSelectedItem().equals("CHENNAI")) ||(cb1.getSelectedItem().equals("CHENNAI") && cb2.getSelectedItem().equals("MUMBAI")))
           {
             if(cb3.getSelectedItem()=="29 MAY 2021")  
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR411","AIRINDIA","10:30","12:30","3800","29 MAY 2021"},{"AIR412","AIRINDIA","12:00","14:00","3800","29 MAY 2021"},{"AIR413","AIRINDIA","15:40","17:40","3800","29 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }

            else if(cb3.getSelectedItem()=="30 MAY 2021")   
            {
                 JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR411","AIRINDIA","18:30","20:30","3850","30 MAY 2021"},{"AIR412","AIRINDIA","2:40","4:40","3850","30 MAY 2021"},{"AIR413","AIRINDIA","20:10","22:10","3850","30 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
             else if(cb3.getSelectedItem()=="31 MAY 2021")   
            {
                JButton lb4;
                JPanel p3=new JPanel();
                p3.setBounds(500,0,500,500);
                String data[][]={{"AIR411","AIRINDIA","9:30","11:30","3760","31 MAY 2021"},{"AIR412","AIRINDIA","10:50","12:50","3760","31 MAY 2021"},{"AIR413","AIRINDIA","20:50","22:50","3760","31 MAY 2021"}};
                String column[]={"FLIGHT_ID","NAME","DEPARTURE TIME","ARRIVAL TIME","PRICE","DATE"};
                JTable jt=new JTable(data,column);
                JScrollPane sp=new JScrollPane(jt);
                lb4=new JButton("NEXT");
                lb4.setBounds(800,60,70,30);
                jt.setBounds(500,30,900,400);
                jt.setCellSelectionEnabled(true);  
                ListSelectionModel select= jt.getSelectionModel();  
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                p3.add(sp);
                 p3.add(lb4);
                f2.add(p3);
                 int s1=Integer.parseInt(jt.getValueAt(0,4).toString());
                ali.add(s1);
                System.out.println(ali.get(0));
                int seat=Integer.parseInt(cb4.getSelectedItem().toString());
                System.out.println(seat);
                System.out.println(seat*(ali.get(0)));
                 pri.add(seat*(ali.get(0)));
                System.out.println("price is "+pri.get(0));
                String pricetot=String.valueOf(pri.get(0));
                txtfld.setText(pricetot);
                lb4.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        for (int i=0;i<seat;i=i+1)
                        {
                            if(i==0)
                            {
                                new Next(1);
                            }
                            else{new Next(0);}
                        }
                    }
                });
            }
           }
        }
         
  

    });
/*} 
public static void main(String[] args) {
    new Login();
}*/
 
}

 class Next
{
    public Next(int a)
 {
    if(a==0)
  {    
    JFrame fr=new JFrame();
    JPanel jpanel=new JPanel();   
    jpanel.setBounds(0,0,500,712);
    JButton but1;
    JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11;
     Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");    
    fr.setIconImage(icon); 
    JLabel laabl1,laabl2,laabl3,laabl4,laabl5,laabl6,laabl7,laabl8,laabl9,laabl10,laabl11,laabl12;
    //buttons
    but1=new JButton("SUBMIT");
    but1.setBounds(160,570,120,30);
    fr.setTitle("PASSENGER INFORMATION");
    //labels
    laabl1=new JLabel("NAME:");
    laabl2=new JLabel("AADHAR NUMBER:");
    laabl3=new JLabel("FLIGHT ID:");
    laabl4=new JLabel("FLIGHT NAME:");
    laabl5=new JLabel("FROM:");
    laabl6=new JLabel("TO:");
    laabl7=new JLabel("DATE:");
    laabl8=new JLabel("ARRIVAL TIME:");
    laabl9=new JLabel("DEPARTURE TIME:");
    laabl10=new JLabel("DATE OF BIRTH:");
    laabl11=new JLabel("GMAIL:");
     laabl12=new JLabel();
    laabl1.setBounds(10,20,150,20);
    laabl2.setBounds(10,70,150,20);
    laabl3.setBounds(10,120,150,20);
    laabl4.setBounds(10,170,150,20);
    laabl5.setBounds(10,220,150,20);
    laabl6.setBounds(10,270,150,20);
    laabl7.setBounds(10,320,150,20);
    laabl8.setBounds(10,370,150,20);
    laabl9.setBounds(10,420,150,20);
    laabl10.setBounds(10,470,150,20);
    laabl11.setBounds(10,520,150,20);
    laabl12.setBounds(160,620,190,20);
    //textfields
    txt1=new JTextField();
    txt2=new JTextField();
    txt3=new JTextField();
    txt4=new JTextField();
    txt5=new JTextField();
    txt6=new JTextField();
    txt7=new JTextField();
    txt8=new JTextField();
    txt9=new JTextField();
    txt10=new JTextField();
    txt11=new JTextField();
    txt1.setBounds(160,20,100,20);
    txt2.setBounds(160,70,100,20);
    txt3.setBounds(160,120,100,20);
    txt4.setBounds(160,170,100,20);
    txt5.setBounds(160,220,100,20);
    txt6.setBounds(160,270,100,20);
    txt7.setBounds(160,320,100,20);
    txt8.setBounds(160,370,100,20);
    txt9.setBounds(160,420,100,20);
    txt10.setBounds(160,470,100,20);
    txt11.setBounds(160,520,100,20);
    fr.add(but1);
    fr.add(laabl1);fr.add(laabl2);fr.add(laabl3);fr.add(laabl4);fr.add(laabl5);fr.add(laabl6);fr.add(laabl7);fr.add(laabl8);fr.add(laabl9);fr.add(laabl10);fr.add(laabl11);fr.add(laabl12);
    fr.add(txt1);fr.add(txt2);fr.add(txt3);fr.add(txt4);fr.add(txt5);fr.add(txt6);fr.add(txt7);fr.add(txt8);fr.add(txt9);fr.add(txt10);fr.add(txt11);
    fr.setTitle("WERT");
    jpanel.setLayout(new BorderLayout());
    JLabel bgpanel=new JLabel(new ImageIcon("inf.jpg"));
    jpanel.add(bgpanel);
    bgpanel.setLayout(new FlowLayout());
    bgpanel.setBounds(0,0,500,712);
    fr.add(jpanel); 
    fr.setSize(500,712);
    fr.setLayout(null);
    fr.setVisible(true);
     fr.setTitle("PASSENGER INFORMATION");
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    but1.addActionListener( new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
              if(txt1.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            }
            else if(txt2.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            }
             else if(txt3.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            } else if(txt1.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            } else if(txt4.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            } else if(txt5.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            } else if(txt6.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            }
             else if(txt7.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            }
             else if(txt8.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            }
             else if(txt9.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            }
             else if(txt10.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            }
             else if(!(txt11.getText().contains("@gmail.com")))
            {
               laabl12.setText("PLEASE ENTER VALID GMAIL ID");   
            }
             else
            {
              fr.dispose();
            }    
        }
      });   
   }
   else
   {
     JFrame fr=new JFrame();
    int price=0;
    Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");
     fr.setIconImage(icon);    
     JPanel jpanel=new JPanel();   
    jpanel.setBounds(0,0,500,712);
    JButton but1,but2;
    JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11;
    JLabel laabl1,laabl2,laabl3,laabl4,laabl5,laabl6,laabl7,laabl8,laabl9,laabl10,laabl11,laabl12;
    //buttons
    //but1=new JButton("SUBMIT");
    but2=new JButton("PAYMENT");
    but2.setBounds(160,570,120,30);
    //but1.setBounds(160,470,120,30);
    //labels
    laabl1=new JLabel("NAME:");
    laabl2=new JLabel("AADHAR NUMBER:");
    laabl3=new JLabel("FLIGHT ID:");
    laabl4=new JLabel("FLIGHT NAME:");
    laabl5=new JLabel("FROM:");
    laabl6=new JLabel("TO:");
    laabl7=new JLabel("DATE:");
    laabl8=new JLabel("ARRIVAL TIME:");
    laabl9=new JLabel("DEPARTURE TIME:");
    laabl10=new JLabel("DATE OF BIRTH:");
    laabl11=new JLabel("GMAIL:");
    laabl12=new JLabel();
    laabl1.setBounds(10,20,150,20);
    laabl2.setBounds(10,70,150,20);
    laabl3.setBounds(10,120,150,20);
    laabl4.setBounds(10,170,150,20);
    laabl5.setBounds(10,220,150,20);
    laabl6.setBounds(10,270,150,20);
    laabl7.setBounds(10,320,150,20);
    laabl8.setBounds(10,370,150,20);
    laabl9.setBounds(10,420,150,20);
    laabl10.setBounds(10,470,150,20);
    laabl11.setBounds(10,520,150,20);
    laabl12.setBounds(160,620,190,20);
    //textfields
    txt1=new JTextField();
    txt2=new JTextField();
    txt3=new JTextField();
    txt4=new JTextField();
    txt5=new JTextField();
    txt6=new JTextField();
    txt7=new JTextField();
    txt8=new JTextField();
    txt9=new JTextField();
    txt10=new JTextField();
    txt11=new JTextField();
    txt1.setBounds(160,20,100,20);
    txt2.setBounds(160,70,100,20);
    txt3.setBounds(160,120,100,20);
    txt4.setBounds(160,170,100,20);
    txt5.setBounds(160,220,100,20);
    txt6.setBounds(160,270,100,20);
    txt7.setBounds(160,320,100,20);
    txt8.setBounds(160,370,100,20);
    txt9.setBounds(160,420,100,20);
    txt10.setBounds(160,470,100,20);
    txt11.setBounds(160,520,100,20);
     fr.setTitle("PASSENGER INFORMATION");
    fr.add(but2);//fr.add(but2);
    fr.add(laabl1);fr.add(laabl2);fr.add(laabl3);fr.add(laabl4);fr.add(laabl5);fr.add(laabl6);fr.add(laabl7);fr.add(laabl8);fr.add(laabl9);fr.add(laabl10);fr.add(laabl11);fr.add(laabl12);
    fr.add(txt1);fr.add(txt2);fr.add(txt3);fr.add(txt4);fr.add(txt5);fr.add(txt6);fr.add(txt7);fr.add(txt8);fr.add(txt9);fr.add(txt10);fr.add(txt11);
    jpanel.setLayout(new BorderLayout());
    JLabel bgpanel=new JLabel(new ImageIcon("inf.jpg"));
    jpanel.add(bgpanel);
    bgpanel.setLayout(new FlowLayout());
    bgpanel.setBounds(0,0,500,712);
    fr.setSize(500,712);
    fr.add(jpanel);
    fr.setLayout(null);
    fr.setVisible(true);
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      but2.addActionListener( new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
            if(txt1.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            }
            else if(txt2.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            }
             else if(txt3.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            } else if(txt1.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            } else if(txt4.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            } else if(txt5.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            } else if(txt6.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            }
             else if(txt7.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            }
             else if(txt8.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            }
             else if(txt9.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            }
             else if(txt10.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            }
             else if(txt11.getText().equals(""))
            {
               laabl12.setText("PLEASE FILL ALL THE DETAILS");   
            }
             else
            {
              new Payment(pri.get(0));
              fr.dispose();
            }    
        }
      });    
   }
  }
 
}

 class Payment
{
 Payment(int price)
  {
    
    JFrame frame=new JFrame();
    JButton button1,button2;
    JComboBox combo2;
    JTextField text1;
    JLabel label1,label2;
    JRadioButton rb1,rb2,rb3,rb4;
    JPanel jpanel2=new JPanel();
    jpanel2.setBounds(0,0,650,400);
    //buttons
    button1=new JButton("TOTAL PRICE");
    button1.setBounds(470,40,120,20);
    button2=new JButton("PAY");
    button2.setBounds(290,330,60,20);
    //combobox
    String classes[]={"ECONOMY CLASS","FIRST CLASS","BUSINESS CLASS"};
     JComboBox<String> combo1 = new JComboBox<>(classes);
    combo1.setBounds(10,40,150,20);
    //textfields
    text1=new JTextField();
    text1.setBounds(310,40,140,20);
    text1.setEditable(false);
    //labels
    label1=new JLabel("ECONOMY CLASS:");
    label1.setBounds(190,40,120,20);
    label2=new JLabel("PAYMENT METHODS");
    label2.setBounds(10,80,250,20);
    //radio buttons
    rb1=new JRadioButton("CREDIT CARD");
    rb2=new JRadioButton("DEBIT CARD");
    rb3=new JRadioButton("PHONE PE");
    rb4=new JRadioButton("GPAY");
    rb1.setBounds(10,110,120,20);
    rb2.setBounds(10,140,100,20);
    rb3.setBounds(10,170,100,20);
    rb4.setBounds(10,200,100,20);
    ButtonGroup bgm=new ButtonGroup();
    bgm.add(rb1);bgm.add(rb2);bgm.add(rb3);bgm.add(rb4);
    //add to frame
    frame.add(button1); frame.add(button2);
    frame.add(rb1);frame.add(rb2);frame.add(rb3);frame.add(rb4);
    frame.add(combo1);
    frame.add(text1);
    frame.add(label1);frame.add(label2);
    frame.setTitle("PAYMENT METHODS");
    frame.setSize(650,400);
    jpanel2.setLayout(new BorderLayout());
    JLabel bgpanel2=new JLabel(new ImageIcon("visa.jpg"));
    jpanel2.add(bgpanel2);
    bgpanel2.setLayout(new FlowLayout());
    bgpanel2.setBounds(0,0,650,400);
    frame.add(jpanel2); 
    //frame.setTitle("PASSENGER INFORMATION");
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
             String classtype=combo1.getItemAt(combo1.getSelectedIndex()).toString();
             if(classtype=="BUSINESS CLASS")
             {
                double trek=price*(4.47);
                String r=String.valueOf(trek);
                label1.setText("BUSINESS CLASS");
                text1.setText(r);
             }
             else if(classtype=="FIRST CLASS")
             {
                double trek=price*(2.2);
                String r=String.valueOf(trek);
                label1.setText("FIRST CLASS");
                text1.setText(r);
                System.out.println(trek);
                 System.out.println(price);
             }
             else if(classtype=="ECONOMY CLASS")
             {
                double trek=price;
                String r=String.valueOf(trek);
                label1.setText("ECONOMY CLASS");
                text1.setText(r);
             }
             
            } 
        });
    button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
             if(rb1.isSelected())
             {
                //frame.dispose();
                new Card(0);
             }    
              else if(rb2.isSelected())
                {
                    //frame.dispose();
                    new Card(1); 
                }   

            }
             
             
        });

    }
   /* public static void main(String[] args) {
      new Payment(6288);
    }*/
    
}
class Card
{
    Card(int a)
    {
        if(a==0)
        {
         JFrame fram=new JFrame();
         JPanel jpanel1=new JPanel();   
         jpanel1.setBounds(0,0,600,343);
         JTextField ctx1,ctx2,ctx3;
         JPasswordField ctx4;
         JLabel clb1,clb2,clb3,clb4,clb5;
         JButton cbut1,cbut2;
         //button
         cbut1=new JButton("PAY");
         cbut1.setBounds(150,250,80,20);
         cbut2=new JButton("CLOSE");
         cbut2.setBounds(30,250,90,20);
         //textfields
         ctx1=new JTextField();
         ctx2=new JTextField();
         ctx3=new JTextField();
         ctx4=new JPasswordField();
          ctx1.setBounds(130,120,150,20);
         ctx2.setBounds(140,170,150,20);
         ctx3.setBounds(415,120,90,20);
         ctx4.setBounds(375,170,50,20);
         //labels
         clb1=new JLabel("CARD NUMBER:");
         clb2=new JLabel("CARD HOLDER NAME:");
         clb3=new JLabel("EXPIRY DATE:");
         clb4=new JLabel("CVV:");
         clb5=new JLabel();
         clb1.setBounds(10,120,120,20);
         clb1.setForeground(Color.WHITE);
         clb2.setBounds(10,170,130,20);
         clb3.setBounds(325,120,90,20);
         clb4.setBounds(325,170,50,20);
         clb5.setBounds(10,220,310,20);
        clb2.setForeground(Color.WHITE);clb3.setForeground(Color.WHITE);clb4.setForeground(Color.WHITE);;clb5.setForeground(Color.RED);
         fram.add(cbut1);
         fram.add(cbut2);
         fram.add(ctx1);fram.add(ctx2);fram.add(ctx3);fram.add(ctx4);
         fram.add(clb1);fram.add(clb2);fram.add(clb3);fram.add(clb4);fram.add(clb5);
         fram.setTitle("PAY WITH YOUR CREDIT CARD");
         fram.setSize(600,343);
         fram.setLayout(null);
         fram.setVisible(true);
         fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jpanel1.setLayout(new BorderLayout());
        JLabel bgpanel1=new JLabel(new ImageIcon("Hru.jpg"));
        jpanel1.add(bgpanel1);
        bgpanel1.setLayout(new FlowLayout());
        bgpanel1.setBounds(0,0,600,343);
        fram.add(jpanel1); 
         cbut1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               if(ctx1.getText().equals(""))
                {
                   clb5.setText("ENTER VALID CARD NUMBER"); 
                }
                 else if(ctx2.getText().equals(""))
                {
                   clb5.setText("ENTER VALID CARD HOLDER NAME"); 
                }
                 else if(ctx3.getText().equals(""))
                {
                   clb5.setText("ENTER VALID EXPIRY DATE"); 
                }
                 else if(String.valueOf(ctx4.getPassword()).equals(""))
                {
                   clb5.setText("ENTER VALID CVV"); 
                }
                else
                {
                    clb5.setText("PLEASE CHECK YOUR GMAIL FOR THE TICKETS");
                    new End();
                }
            }
             
        });
           cbut2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            { fram.dispose();
            
            }

        });
    } 
      else if(a==1)
        {
         JFrame fram=new JFrame();
        JPanel jpanel1=new JPanel();   
         jpanel1.setBounds(0,0,600,343);
         JTextField ctx1,ctx2,ctx3;
         JPasswordField ctx4;
         JLabel clb1,clb2,clb3,clb4,clb5;
         JButton cbut1,cbut2;
         //button
         cbut1=new JButton("PAY");
         cbut2=new JButton("CLOSE");
         cbut2.setBounds(30,250,90,20);
         cbut1.setBounds(150,250,80,20);
         //textfields
         ctx1=new JTextField();
         ctx2=new JTextField();
         ctx3=new JTextField();
         ctx4=new JPasswordField();
         ctx1.setBounds(130,120,150,20);
         ctx2.setBounds(140,170,150,20);
         ctx3.setBounds(415,120,90,20);
         ctx4.setBounds(375,170,50,20);
         //labels
         clb1=new JLabel("CARD NUMBER:");
         clb2=new JLabel("CARD HOLDER NAME:");
         clb3=new JLabel("EXPIRY DATE:");
         clb4=new JLabel("CVV:");
         clb5=new JLabel();
         clb1.setBounds(10,120,120,20);
         clb1.setForeground(Color.WHITE);
         clb2.setBounds(10,170,130,20);
         clb3.setBounds(325,120,90,20);
         clb4.setBounds(325,170,50,20);
         clb5.setBounds(10,220,310,20);
        clb2.setForeground(Color.WHITE);clb3.setForeground(Color.WHITE);clb4.setForeground(Color.WHITE);;clb5.setForeground(Color.RED);
         fram.add(cbut1);fram.add(cbut2);
         fram.add(ctx1);fram.add(ctx2);fram.add(ctx3);fram.add(ctx4);
         fram.add(clb1);fram.add(clb2);fram.add(clb3);fram.add(clb4);fram.add(clb5);
         fram.setTitle("PAY WITH YOUR DEBIT CARD");
         fram.setSize(600,343);
         fram.setLayout(null);
         fram.setVisible(true);
          jpanel1.setLayout(new BorderLayout());
        JLabel bgpanel1=new JLabel(new ImageIcon("Hru.jpg"));
        jpanel1.add(bgpanel1);
        bgpanel1.setLayout(new FlowLayout());
        bgpanel1.setBounds(0,0,600,343);
        fram.add(jpanel1); 
         fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cbut1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(ctx1.getText().equals(""))
                {
                   clb5.setText("ENTER VALID CARD NUMBER"); 
                }
                 else if(ctx2.getText().equals(""))
                {
                   clb5.setText("ENTER VALID CARD HOLDER NAME"); 
                }
                 else if(ctx3.getText().equals(""))
                {
                   clb5.setText("ENTER VALID EXPIRY DATE"); 
                }
                 else if(String.valueOf(ctx4.getPassword()).equals(""))
                {
                   clb5.setText("ENTER VALID CVV"); 
                }
                else
                {
                    clb5.setText("PLEASE CHECK YOUR GMAIL FOR THE TICKETS");
                    new End();
                }
            }
             
        });
          cbut2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            { fram.dispose();}

        } );
        } 
    }
}
}
class End
{
    End()
 {
    JFrame ef=new JFrame("THE END");
    JPanel ep=new JPanel();
    ep.setBackground(Color.BLACK);
    ep.setBounds(0,0,750,571);
    ep.setLayout(new BorderLayout());
    JLabel ebg=new JLabel(new ImageIcon("end2.jpg"));
    ep.add(ebg);
    ebg.setLayout(new FlowLayout());
    ebg.setBounds(0,0,750,571);
    ef.setSize(750,571);
    ef.add(ep);
    ef.setLayout(null);
    ef.setVisible(true);
    ef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}
