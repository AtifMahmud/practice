/**
 * Practicing the EventHandling tutorial form thenewboston
 * @author Atif Mahmud
 *
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


//This is actulally not the Main per se
public class Main extends JFrame {
		
	 	// Create the fields
		private JTextField textOne;
		private JTextField textTwo;
		private JTextField textThree;
		private JPasswordField password;
		
		
		// Make the object
		public Main(){
	
			super("A Demo window");  // title
			setLayout(new FlowLayout()); // default window
			
			textOne = new JTextField(10); // 10 characters
			add(textOne);
			
			// add the text and password fields
			
			textTwo = new JTextField("textTwo");
			add(textTwo);
			
			textThree = new JTextField("textThree", 20);
			textThree.setEditable(false); // can't edit
			add(textThree);
			
			password = new JPasswordField("Password");
			add(password);
			
			TheHandler Handler = new TheHandler(); // create the Handler object
			
			// add action listener it to the fields
			textOne.addActionListener(Handler);
			textTwo.addActionListener(Handler);
			textThree.addActionListener(Handler);
			password.addActionListener(Handler);
			
			
		}
		
		
		private class TheHandler implements ActionListener {
		
			// Overriding the method (?)... 
			public void actionPerformed (ActionEvent event){
			
				String string = "";
				
				if (event.getSource()==textOne){
					string = string.format("FieldOne: %s", event.getActionCommand());
				}
				
				else if(event.getSource()==textTwo){
					string=string.format("FieldTwo: %s", event.getActionCommand());
				}
				
				else if(event.getSource()==textTwo){
					string=string.format("FieldThree: %s", event.getActionCommand());
				}
				
				else if(event.getSource()==password){
					string=string.format("Password: %s", event.getActionCommand());
				}
				
				// show the string in JOptionPane
				JOptionPane.showMessageDialog(null, string);
			}

				
			}
			
		}
	

