import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Toolkit;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setFont(new Font("Bell MT", Font.BOLD, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ramz8\\Pictures\\Saved Pictures\\R.png"));
		
	     String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$~%^&*(){}[]:'?/<.>,";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      
	     String combinedChars1= capitalCaseLetters + lowerCaseLetters ;
	      //String combinedChars1= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz" ;
	      String combinedChars7 = capitalCaseLetters +  specialCharacters;
	      String combinedChars8 = capitalCaseLetters +  numbers;
	      String combinedChars2 = capitalCaseLetters + lowerCaseLetters + specialCharacters ;
	      String combinedChars3 = capitalCaseLetters + lowerCaseLetters + numbers;
	      
	      String combinedChars4 =  lowerCaseLetters + specialCharacters;
	      String combinedChars5 =  lowerCaseLetters + specialCharacters + numbers;
	      String combinedChars10 =  capitalCaseLetters + specialCharacters + numbers;
	      
	      String combinedChars6 =  lowerCaseLetters + numbers;
	      
	      String combinedChars9  =  specialCharacters + numbers;
	       boolean b1clicked = false;
	      
	    
	      
	      Random random = new Random();
	  	int length =8;
	  	StringBuilder sb=new StringBuilder();
	  	char[] password = new char[length];
	
		
		setTitle("Welcome !!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 711);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 220, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label1 = new JLabel("        Password Generator");
		Label1.setForeground(new Color(255, 128, 64));
		Label1.setToolTipText("Generates Password with your inputs!");
		Label1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		Label1.setBounds(294, 42, 383, 45);
		contentPane.add(Label1);
		
		JLabel Label2 = new JLabel("Please enter the below details to generate password");
		Label2.setFont(new Font("Arial", Font.PLAIN, 15));
		Label2.setBounds(81, 134, 418, 27);
		contentPane.add(Label2);
		
		JLabel Lebel3 = new JLabel("Password Length\r\n [Mininum 8 - Max 124] :");
		Lebel3.setFont(new Font("Verdana", Font.BOLD, 15));
		Lebel3.setBounds(92, 184, 382, 45);
		contentPane.add(Lebel3);
		
		JLabel lblNewLabel_1 = new JLabel("Do you want to generate the password again ?");
		lblNewLabel_1.setFont(new Font("SimSun", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(92, 455, 473, 38);
		contentPane.add(lblNewLabel_1);
		
		textField1 = new JTextField();
		textField1.setBounds(513, 199, 181, 19);
		contentPane.add(textField1);
		textField1.setColumns(10);

		
		JCheckBox cbox1 = new JCheckBox("Do you want to include lower case letters");
		cbox1.setBackground(new Color(224, 220, 243));
		cbox1.setFont(new Font("Verdana", Font.ITALIC, 15));
		cbox1.setBounds(344, 246, 383, 21);
		contentPane.add(cbox1);
		
		JCheckBox cbox2 = new JCheckBox("Do you want to include upper case letters");
		cbox2.setBackground(new Color(224, 220, 243));
		cbox2.setFont(new Font("Verdana", Font.ITALIC, 15));
		cbox2.setBounds(344, 285, 383, 21);
		contentPane.add(cbox2);
		
		JCheckBox cbox3 = new JCheckBox("Do you want to include special symbols");
		cbox3.setBackground(new Color(224, 220, 243));
		cbox3.setFont(new Font("Verdana", Font.ITALIC, 15));
		cbox3.setBounds(344, 319, 383, 21);
		contentPane.add(cbox3);
		
		JCheckBox cbox4 = new JCheckBox("Do you want to include Numbers");
		cbox4.setBackground(new Color(224, 220, 243));
		cbox4.setFont(new Font("Verdana", Font.ITALIC, 15));
		cbox4.setBounds(344, 354, 383, 21);
		contentPane.add(cbox4);



		JButton Button1 = new JButton("Generate Password");
		Button1.setForeground(new Color(128, 0, 64));
		Button1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					
					int length=Integer.parseInt(textField1.getText());
					if((length<8) ||(length>126)) {
						JOptionPane.showMessageDialog(null,"Please enter a number between 8 to 126");
						System.out.println("Please enter a valid number");
						
					}
					else {
						
						//textField2.setText(" ");
						pwdgen(length);
						//Button1.setVisible(false);
						if(!b1clicked) {
							//Button1.setVisible(false);
						Button1.setEnabled(false);
						//String s=textField2.getSelectedText();
						sb.delete(0, length);
						
											
					}
						
				}
					
				}
				catch(NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Enter some number value in Password Length");
				}
				catch(Exception e1) {
					System.out.println(e1);
				}
			}

			private void pwdgen(int length) {
				// TODO Auto-generated method stub
				
				
				
				
				switch ((cbox1.isSelected() ?   1 : 0) +
				        (cbox2.isSelected() ? 2 : 0) +
				        (cbox3.isSelected() ?  4 : 0)+
				        (cbox4.isSelected() ?  8: 0) )
				{
				    case 0: // none selected
				    	
				    	//JOptionPane.showMessageDialog(null," You didn't select any values in the checkbox ");
				    	JOptionPane.showMessageDialog(cbox4, " You didn't select any values in the checkbox\n "+"\nRandom password generated!!");
				    	for (int i = 0; i < length; i++)
				    	{
				    		int randomIndex = random.nextInt(combinedChars.length());
				    		sb.append(combinedChars.charAt(randomIndex));
				    		textField2.setText(sb.toString());			            		            
				    		System.out.println(sb.toString());
            
				    	}
				    	break;
				    	
				    case 1: // lowercase selected
				    	
				    
				    	  for (int i = 0; i < length; i++)
					        {
				    		  
					            int randomIndex = random.nextInt(lowerCaseLetters.length());
					            sb.append(lowerCaseLetters.charAt(randomIndex));
					            textField2.setText(sb.toString());			            		            
					            System.out.println(sb.toString());
					            
					        }
				    	  
				    	  break;
				    
				    	
				    case 2: // uppercase selected
				    	  for (int i = 0; i < length; i++)
					        {
					            int randomIndex = random.nextInt(capitalCaseLetters.length());
					            sb.append(capitalCaseLetters.charAt(randomIndex));
					            textField2.setText(sb.toString());			            		            
					            System.out.println(sb.toString());
					            
					        }
				    	  break;
				    
				    case 3: // upper+lower
				    	  for (int i = 0; i < length; i++)
					        {
					            int randomIndex = random.nextInt(combinedChars1.length());
					            sb.append(combinedChars1.charAt(randomIndex));
					            textField2.setText(sb.toString());			            		            
					            System.out.println(sb.toString());
					            
					        }
				    	  break;
				    case 4: //  symbols
				    	  for (int i = 0; i < length; i++)
					        {
					            int randomIndex = random.nextInt(specialCharacters.length());
					            sb.append(specialCharacters.charAt(randomIndex));
					            textField2.setText(sb.toString());			            		            
					            System.out.println(sb.toString());
					            
					        }
				    	  break;
				    	
				    case 5: // lowercase+symbols
				    	  for (int i = 0; i < length; i++)
					        {
					            int randomIndex = random.nextInt(combinedChars4.length());
					            sb.append(combinedChars4.charAt(randomIndex));
					            textField2.setText(sb.toString());			            		            
					            System.out.println(sb.toString());
					            
					        }
				    	  break;
				    	
				    case 6: // uppercase+symbols
				    	  for (int i = 0; i < length; i++)
					        {
					            int randomIndex = random.nextInt(combinedChars7.length());
					            sb.append(combinedChars7.charAt(randomIndex));
					            textField2.setText(sb.toString());			            		            
					            System.out.println(sb.toString());
					            
					        }
				    	  break;
				    case 7: // lowercase+uppercase+symbols
				    	  for (int i = 0; i < length; i++)
					        {
					            int randomIndex = random.nextInt(combinedChars2.length());
					            sb.append(combinedChars2.charAt(randomIndex));
					            textField2.setText(sb.toString());			            		            
					            System.out.println(sb.toString());
					            
					        }
				    	  break;
				    	
				    
				    case 8: // numbers
				    	for (int i = 0; i < length; i++)
				        {
				            int randomIndex = random.nextInt(numbers.length());
				            sb.append(numbers.charAt(randomIndex));
				            textField2.setText(sb.toString());			            		            
				            System.out.println(sb.toString());
				            
				        }
			    	  break;
				    	
				    case 9: // lowercase+number
				    	for (int i = 0; i < length; i++)
				        {
				            int randomIndex = random.nextInt(combinedChars6.length());
				            sb.append(combinedChars6.charAt(randomIndex));
				            textField2.setText(sb.toString());			            		            
				            System.out.println(sb.toString());
				            
				        }
			    	  break;
				    	
				    case 10: //  uppercase + numbers
				    	for (int i = 0; i < length; i++)
				        {
				            int randomIndex = random.nextInt(combinedChars8.length());
				            sb.append(combinedChars8.charAt(randomIndex));
				            textField2.setText(sb.toString());			            		            
				            System.out.println(sb.toString());
				            
				        }
			    	  break;
				    	
				    case 11: // lowercase+uppercase+numbers
				    	for (int i = 0; i < length; i++)
				        {
				            int randomIndex = random.nextInt(combinedChars3.length());
				            sb.append(combinedChars3.charAt(randomIndex));
				            textField2.setText(sb.toString());			            		            
				            System.out.println(sb.toString());
				            
				        }
			    	  break;
				    	
				    case 12: // numbers+symbols
				    	for (int i = 0; i < length; i++)
				        {
				            int randomIndex = random.nextInt(combinedChars9.length());
				            sb.append(combinedChars9.charAt(randomIndex));
				            textField2.setText(sb.toString());			            		            
				            System.out.println(sb.toString());
				            
				        }
			    	  break;
				    	
				    	
				    case 13: //lowercase+symbols+numbers
				    	
				      	for (int i = 0; i < length; i++)
				        {
				            int randomIndex = random.nextInt(combinedChars5.length());
				            sb.append(combinedChars5.charAt(randomIndex));
				            textField2.setText(sb.toString());			            		            
				            System.out.println(sb.toString());
				            
				        }
			    	  break;
				    case 14: //lowercase+uppercase+symbols+numbers
				    	
				      	for (int i = 0; i < length; i++)
				        {
				            int randomIndex = random.nextInt(combinedChars2.length());
				            sb.append(combinedChars2.charAt(randomIndex));
				            textField2.setText(sb.toString());			            		            
				            System.out.println(sb.toString());
				            
				        }
			    	  break;
				    case 15: //lowercase+uppercase+symbols+numbers
    	
				    	for (int i = 0; i < length; i++)
				    	{
				    		int randomIndex = random.nextInt(combinedChars.length());
				    		sb.append(combinedChars.charAt(randomIndex));
				    		textField2.setText(sb.toString());			            		            
				    		System.out.println(sb.toString());
            
				    	}
				    	break;
				    
				}
				
				
				
				
				
				
				
				
			
				
				
				
				
				
				
				
				
	/*			
				
				if(cbox1.isSelected()) {

			        for (int i = 0; i < length; i++)
			        {
			            int randomIndex = random.nextInt(lowerCaseLetters.length());
			            sb.append(lowerCaseLetters.charAt(randomIndex));
			            textField2.setText(sb.toString());			            		            
			            System.out.println(sb.toString());
			            
			        }
				}
			        else if(cbox2.isSelected()) {
			        	 for (int i = 0; i < length; i++)
					        {
					            int randomIndex = random.nextInt(capitalCaseLetters.length());
					            sb.append(capitalCaseLetters.charAt(randomIndex));
					            textField2.setText(sb.toString());			            		            
					            System.out.println(sb.toString());
					            
					        }
			        }
			        else if(cbox3.isSelected()) {
			       	 for (int i = 0; i < length; i++)
				        {
				            int randomIndex = random.nextInt(specialCharacters.length());
				            sb.append(specialCharacters.charAt(randomIndex));
				            textField2.setText(sb.toString());			            		            
				            System.out.println(sb.toString());
				            
				        }
			        	
			        }
			        else if(cbox4.isSelected()) {
			          	 for (int i = 0; i < length; i++)
					        {
					            int randomIndex = random.nextInt(numbers.length());
					            sb.append(numbers.charAt(randomIndex));
					            textField2.setText(sb.toString());			            		            
					            System.out.println(sb.toString());
					            
					        }
			          	
			        	
			        }
			        else if((cbox1.isSelected())||(cbox2.isSelected())) {
			        
			        	 for (int i = 0; i < length; i++)
					        {
					            int randomIndex = random.nextInt(combinedChars1.length());
					            sb.append(combinedChars1.charAt(randomIndex));
					            textField2.setText(sb.toString());			            		            
					            System.out.println(sb.toString());
					            
					        }
			        }*/
				
				 
			}
		});
		
		Button1.setFont(new Font("Trebuchet MS", Font.BOLD, 22));

		
		Button1.setBounds(85, 395, 274, 50);
		contentPane.add(Button1);
		
		JButton Button2 = new JButton("RESET");
		Button2.setVisible(false);
		
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField1.setText("");
				textField2.setText(" ");
				cbox1.setSelected(false);
				cbox2.setSelected(false);
				cbox3.setSelected(false);
				cbox4.setSelected(false);
				Button2.setVisible(true);
				//RadioButton2.setEnabled(true);
				
				
			}
		});
		Button2.setBounds(243, 548, 85, 21);
		contentPane.add(Button2);
		
		textField2 = new JTextField();
		textField2.setForeground(new Color(255, 128, 0));
		textField2.setFont(new Font("SimSun", Font.BOLD, 15));
		textField2.setBounds(397, 406, 491, 36);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		JRadioButton RadioButton2 = new JRadioButton("No");
		RadioButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Thank you !!\n"+"Bye!!!");
			System.exit(0);
			}
		});
		RadioButton2.setBounds(371, 499, 103, 21);
		contentPane.add(RadioButton2);
		
		JRadioButton RadioButton1 = new JRadioButton("Yes");
		RadioButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				JOptionPane.showMessageDialog(RadioButton1, "Do you want to generate password with same selection criteria ?\n"+
			"\nYES ----> click Generate Password\n"+" \n RESET ----> Reset the selected Values\n " +"\n NO ----> Exit the application");
				
				RadioButton2.setSelected(false);
				Button2.setVisible(true);
				
				textField2.setText("");
				Button1.setEnabled(true);
				RadioButton1.setSelected(false);
				
				
			}
		});
		RadioButton1.setBounds(238, 499, 103, 21);
		contentPane.add(RadioButton1);
		
	
		}
}
