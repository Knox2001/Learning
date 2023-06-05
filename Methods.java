import javax.swing.*;
class Methods
{
    public static float sum(float x, float y)
    {
        float auxiliar = x+y;
        return auxiliar;
        
    }

    public static float sub(float x, float y)
    {
        float aulixiar = x-y;
        return auxliar;
    }

    public static float mult(float x, float y)
    {
        float auxiliar = x*y;
        return auxiliar;
    }

    public static float div(float x, float y)
    {
        float auxiliar = x/y;
        return auxiliar;
    }

    public static void main(String[]args)
    {
        boolean repeatLoop = false;
        float inputNumber1 = 0, inputNumber2 = 0, outputResult = 0;
        char Op;
        do
        {
            try 
            {
                inputNumber1 = Float.parseFloat(JOptionPane.showInputDialog("Type the first number"));
                break;
            }  
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, "Invalid character");;
                repeatLoop = true;
            }
        }
        while(repeatLoop = true);

        repeatLoop = false;
        

        do
        {
            try
            {
                inputNumber2 = Float.parseFloat(JOptionPane.showInputDialog("Type the second number"));
                break;
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Invalid character");
            }
        }
        while(repeatLoop = true);

        repeatLoop = false;

        do
        {
            Op = JOptionPane.showInputDialog("1-Sum the two numbers.\n2-Subtract the 2nd from the 1st.\n3-Subtract the 1st from the 2nd.\n4-Multiplicate one by another.\n5-Divide the 1st by the 2nd.\n6-Divide the 2nd by the 1st.").charAt(0);
            if(Op != '1' && Op != '2' && Op != '3' && Op != '4' && Op != '5' && Op != '6')
            {
                JOptionPane.showMessageDialog(null, "Invalid Option");
                repeatLoop = true;
            }
            else
            {
                break;
            }    
        }
        while(repeatLoop = true);

        switch(Op)
        {
            case '1':
            {
                outputResult = sum(inputNumber1, inputNumber2);
                break;
            }
            case '2':
            {
                outputResult = sub(inputNumber1, inputNumber2);
                break;
            }
            case '3':
            {
                outputResult = sub(inputNumber2, inputNumber1);
                break;
            }
            case '4':
            {
                outputResult = mult(inputNumber1, inputNumber2);
                break;
            }
            case '5':
            {
                outputResult = div(inputNumber1, inputNumber2);
                break;
            }
            case '6':
            {
                outputResult = div(inputNumber2, inputNumber1);
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Result: " + String.format("%.3f", outputResult));
    
    }
}
