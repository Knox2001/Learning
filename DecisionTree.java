import javax.swing.*;
class DecisionTreeTest
{
	public static void main(String entrada[])
	{
		int number;
		char operation=0;
		String message="", messageInput="Type 1 for Odd/Even\nType 2 for Negative/Positive";
		//Data Input
		number = Integer.parseInt(JOptionPane.showInputDialog("Type an integer number"));
		operation = JOptionPane.showInputDialog(messageInput).charAt(0);
		
		//Processing
		switch(operation){
			case '1':
			{
				if (number % 2 == 0){
					message = message + number + " is Even.\n";
					}
				else{
					message = message + number + " is Odd.\n";
					}
				break;
			}
				
			case '2':
			{
				if (number > 0){
					message = message + number + " is Positive.\n";
				}
				else{
					message = message + number + " isn't Positive.\n";
				}
				break;
			}
			default: JOptionPane.showMessageDialog(null, "Invalid Option");
			}
			
			//Data Output
			if(operation=='1'||operation=='2'){
				JOptionPane.showMessageDialog(null, message);
			}
			
			System.exit(0);
			
	}
	
}
		
	
