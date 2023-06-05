import javax.swing.*;
class activity01
{
    public static void main(String[] args)
    {
        //Variables
        int numb1, numb2, result=0, result2=1;
        String message1, message2 = "", message3, op;
        char test;
    
        //Data Input
        numb1 = Integer.parseInt(JOptionPane.showInputDialog("Type the 1st number:"));
        numb2 = Integer.parseInt(JOptionPane.showInputDialog("Type the 2nd number:"));
        op = JOptionPane.showInputDialog("Continue?\nType yes or no");
        
        //Processing and Data Output
        switch(op)
        {
            case "yes":
            {
                for(int i=1; i<=numb2; i++)
                {
                    result2 *= numb1;
                }

                message1 = "The multiplication of " + numb1 + " by itself " + numb2 + " times is: " + result2;

                if(numb1>0 && numb2>0)
                {
                    result = numb2*numb1;
                    message2 = "The product of " + numb1 + " and " + numb2 + " are: " + result;
                }

                message3 = message2 + "\n" + message1;
                JOptionPane.showMessageDialog(null, message3);
                break;
            }

            case "no":
            {
                JOptionPane.showMessageDialog(null, "Aborted Process");
                System.exit(0);
            }

            default: JOptionPane.showMessageDialog(null, "Invalid Option");
        }
       
        System.exit(0);

    }
}
