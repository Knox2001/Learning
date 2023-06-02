import javax.swing.*;
class RepetitionStructure
{
	public static void main(String[]args)
	{
		int number;
		char operation=0;
		String message="", messageInput="Type 1 : 'For' Repetition\nType 2 : 'While' Repetition\nType 3 : 'Do/While' Repetition";
		//Data Input
		number = Integer.parseInt(JOptionPane.showInputDialog("Type an integer number"));
		operation = (JOptionPane.showInputDialog(messageInput)).charAt(0);
		//Processing
		switch(operation)
		{
				case '1':
				{
					message = message + "Multiplication Table of " + number +" using 'For': \n\n";
					for(int i=1; i<=10; i=i+1)
					{
						message = message + number + " x " + i + " = " + number*i+ "\n";
					}
					break;
				}
				case '2':
				{
					message = message + "Multiplication Table of "+ number +" using 'Whilte': \n\n";
					int i=1;
					while(i<=10)
					{
						message = message + number + " x " + i + " = " + number*i+ "\n";
						i = i+1;
					}
					break;
				}
				case '3':
				{
					message = message + "Multiplication Table of "+ number +" using 'Do/While': \n\n";
					int i=1;
					do
					{
						message = message + number + " x " + i + " = " + number*i+ "\n";
						i=i+1;
					}
					while(i<=10);
					break;
				}
				default: JOptionPane.showMessageDialog(null, "Invalid Option");
		}
		//Data Output
		if (operation >='1' && operation<='3' )
		{
			JOptionPane.showMessageDialog(null, message);
		}
		System.exit(0);
	}
}
					
		
