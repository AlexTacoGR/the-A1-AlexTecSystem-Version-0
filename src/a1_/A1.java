import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.*;       //this is the import for the GUI creation
import java.awt.*; //this is for the gui to have a kind of list
import java.io.*; 

public class A1 {
    public static void main(String[] args) throws FileNotFoundException  { //this is a void + throws FileNotFoundException 

        int SV = 0; //systeams version

        int user_login_tryes = 3;
        boolean does_user_have_access = false;
        String user_ADMIN_password = "ADMIN";
        String user_user1_password = "1234";

        while (does_user_have_access == false ) {
            System.out.println("user must input login password");

            Scanner userinput = new Scanner(System.in); // this is in order to create a 'Scanner', in other words an input 

            System.out.println("enter login password: ");

            String userinput_password = userinput.nextLine(); //this here reads the users input

            if (userinput_password.equals(user_ADMIN_password)) {
                System.out.println("passord accepted");


                
                // this from here on out is the main system for ADMIN
                while (true){
                    Scanner SI1 = new Scanner(System.in); // this is in order to create a 'Scanner', in other words an input 

                    System.out.println("=======AlexTecSystems=======");
                    System.out.println("System version: " + SV);                  // system starting UI
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("/nt");
                    System.out.println("/ngui");
                    System.out.println("/ngui1");
                    System.out.println("/x");
                    System.out.println("/ot");
                    System.out.println("/ots");

                    System.out.print(">");
                    String userinput1 = SI1.nextLine(); //this here reads the users input

                    if (userinput1.equals("/nt")) {  //creating a new text document
                        try { // this is a try command
                            Scanner SI2 = new Scanner(System.in); // this is in order to create a 'Scanner', in other words an input
                            System.out.println("name new .txt file");
                            System.out.println(">");
                            String userinput2 = SI2.nextLine(); //this here reads the users input
                            //making a new txt file
                            FileWriter myWriter = new FileWriter(userinput2 + (".txt"));
                            System.out.println("type the contents of the file");
                            String userinput3 = SI2.nextLine(); //this here reads the users input
                            myWriter.write(userinput3);
                            myWriter.close();
                            System.out.println("new txt file was succesfuly created");
                            System.out.println(" "); 
                        } catch (Exception e) {
                            System.out.println("ERROR CODE 1"); //first error code
                        }
                        
                    }
                    if (userinput1.equals("/ngui")) {    //creating a GUI
                        JFrame frame = new JFrame("GUI");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(600,600);   //sets GUI's size
                        JButton button = new JButton("test1");//this create the conents of the button
                        frame.getContentPane().add(button); // Adds Button to content pane of frame
                        frame.setVisible(true); //sets if the GUI is visible or not 

                        
                    }
                    if (userinput1.equals("/ngui1")) { //creating a GUI 1

                        //Creating the Frame
                        JFrame frame = new JFrame("GUI1 (chat frame)");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(800, 400);

                        //Creating the MenuBar and adding components
                        JMenuBar mb = new JMenuBar(); //this here creates the menu bar
                        JMenu m1 = new JMenu("FILE"); //this here create the 'templete' for the text of the menu button
                        JMenu m2 = new JMenu("Help"); //this here create the 'templete' for the text of the menu button
                        JMenu m3 = new JMenu("my TEST menu");
                        mb.add(m1); //this here adds the menu buttons to the menu bar
                        mb.add(m2); //this here adds the menu buttons to the menu bar
                        mb.add(m3);
                        JMenuItem m11 = new JMenuItem("Open"); //this here creates the 'templete for the buttons' inside the menu buttons
                        JMenuItem m22 = new JMenuItem("Save as"); //this here creates the 'templete for the buttons' inside the menu buttons
                        JMenuItem m31 = new JMenuItem("test item1");
                        JMenuItem m32 = new JMenuItem("test item2");
                        m1.add(m11); // this here adds the menu items to the menu buttons
                        m1.add(m22); // this here adds the menu items to the menu buttons
                        m3.add(m31);
                        m3.add(m32);

                        //Creating the panel at bottom and adding components
                        JPanel panel = new JPanel(); // the panel is not visible in output
                        JLabel label = new JLabel("Enter Text");
                        JTextField tf = new JTextField(10); // accepts upto 10 characters
                        JButton send = new JButton("Send");
                        JButton reset = new JButton("Reset");
                        JButton test_button = new JButton("test_Button");
                        panel.add(label); // Components Added using Flow Layout
                        panel.add(tf); //these all add the buttons and labels to hte bottom pannel
                        panel.add(send);
                        panel.add(reset);
                        panel.add(test_button);

                        // Text Area at the Center
                        JTextArea ta = new JTextArea();

                        //Adding Components to the frame.
                        frame.getContentPane().add(BorderLayout.SOUTH, panel);
                        frame.getContentPane().add(BorderLayout.NORTH, mb);
                        frame.getContentPane().add(BorderLayout.CENTER, ta);
                        frame.setVisible(true);
                        
                    }
                    if (userinput1.equals("/x")) {
                        System.out.println("=0==                0===");
                        System.out.println(" =0=0              ==0= ");
                        System.out.println("  =00=            ===0  ");
                        System.out.println("   ===0          000=   ");
                        System.out.println("    =00=        =0=0    ");
                        System.out.println("     0===      =0=0     ");
                        System.out.println("      0=0=    0==0      ");
                        System.out.println("       =00=  ====       ");
                        System.out.println("        =000=0=0        ");
                        System.out.println("       =0==  =00=       ");
                        System.out.println("      ==0=    00=0      ");
                        System.out.println("     0000      0==0     ");
                        System.out.println("    =0==        00==    ");
                        System.out.println("   ==0=          0===   ");
                        System.out.println("  000=            ==0=  ");
                        System.out.println(" =0==              0=0= ");
                        System.out.println("0==0                ==0=");
                    }
                    if (userinput1.equals("/ot")) {    //opening and reading a text file
                        System.out.println("accesing file...");
                        System.out.println(" ");
                        File text = new File("C:\\Users\\Metaxa Fashion\\Documents\\NetBeansProjects\\A1_\\" + "test.txt");
                        Scanner scnr = new Scanner(text); //Creating Scanner instance to read File in Java
                        int lineNumber = 1;
                        while(scnr.hasNextLine()){   //TEST
                            String line = scnr.nextLine();
                            System.out.println("line " + lineNumber + " :" + line);
                            lineNumber++;
                        }      
                        System.out.println(" ");
                        System.out.println(" ");

                        
                    }
                    if (userinput1.equals("/ots")) {
                        Scanner SI2 = new Scanner(System.in); // this is in order to create a 'Scanner', in other words an input
                        System.out.println("enter the name of the file you want to open(without the .txt)");
                        System.out.print(">");
                        String userinput2 = SI2.nextLine(); //this here reads the users input
                        System.out.println("accesing file...");
                        System.out.println(" ");
                        File text = new File("C:\\Users\\Metaxa Fashion\\Documents\\NetBeansProjects\\A1_\\" + userinput2 + ".txt");
                        Scanner scnr = new Scanner(text); //Creating Scanner instance to read File in Java
                        int lineNumber = 1;
                        while(scnr.hasNextLine()){   //TEST
                            String line = scnr.nextLine();
                            System.out.println("line " + lineNumber + " :" + line);
                            lineNumber++;
                        }      
                        System.out.println(" ");
                        System.out.println(" ");
                    }

                }


                
            } else {
                if (userinput_password.equals(user_user1_password)) {   //users 1 login
                    while (true) {
                        Scanner SI1 = new Scanner(System.in); // this is in order to create a 'Scanner', in other words an input 

                        System.out.println("=======AlexTecSystems=======");
                        System.out.println("System version: " + SV);                  // system starting UI
                        System.out.println(" ");
                        System.out.println(" ");

                        System.out.println(">");
                        String userinput1 = SI1.nextLine(); //this here reads the users input
                        
                        

                        
                    }

                    
                } else {
                    if (user_login_tryes > 0) {
                    System.out.println("password denied");
                    
                    user_login_tryes = user_login_tryes - 1;
                    System.out.println("remaining tryes: " + user_login_tryes);
                } else {
                    System.out.println("password denied");
                    System.exit(user_login_tryes);
                }
                    
                }
                
            }

        }
    }
    
}
