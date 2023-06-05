import javax.swing.*;
class ArrayAndMatrix
{
    public static void main(String[]args)
    {
        //Variables
        boolean repeatLoop2 = true;
        int sn=0;
        while(repeatLoop2 = true)
        {
            sn = Integer.parseInt(JOptionPane.showInputDialog("Type the number of students:"));
            if(sn < 1)
            {
                JOptionPane.showMessageDialog(null, "Min. 1 student.");
            }
            else
            {
                repeatLoop2 = false;
                break;
            }
        } 
        
        String arrayTest[] = new String [sn], finalMessage="";
        double matrixFinal[][] = new double [sn][5];
        boolean approved[] = new boolean[sn];
        boolean repeatLoop;

        //Data Input
        JOptionPane.showMessageDialog(null, "Min. grade value: 0, Max. grade value: 10");
        for(int i=0, studentNumb=1; i<matrixFinal.length && studentNumb<=matrixFinal.length; i++, studentNumb++)
        {
            arrayTest[i] = JOptionPane.showInputDialog("Type the student " + studentNumb + " full name:");
            for(int qrtResult=0, qrtNumb=1; qrtResult<4 && qrtNumb<=4; qrtResult++, qrtNumb++)
            {   
                repeatLoop = true;
                while(repeatLoop = true)
                {
                    try
                    {
                        matrixFinal[i][qrtResult] = Double.parseDouble(JOptionPane.showInputDialog("Type " + arrayTest[i] +  " grade for quarter " + qrtNumb +":"));
                        if(matrixFinal[i][qrtResult] < 0 || matrixFinal[i][qrtResult] > 10)
                        {
                            JOptionPane.showMessageDialog(null, "Invalid Grade\nType the correct value between 0 and 10");
                        } 
                    
                        else
                        {
                            repeatLoop = false;
                            break;
                        }

                    }
                    catch(NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "Invalid character");
                    }

                }
    
            }
        }

        //Processing
        for(int i=0; i<matrixFinal.length; i++)
        {
            matrixFinal[i][4] = (matrixFinal[i][3] + matrixFinal[i][2] + matrixFinal[i][1] + matrixFinal[i][0])/4;
        }
        
        for(int i=0; i<approved.length; i++)
        {
            if(matrixFinal[i][4]>=6)
            {
                approved[i] = true;
            }
            else
            {
                approved[i] = false;
            }
        }

        for(int i=0; i<matrixFinal.length; i++)
        {
            finalMessage = finalMessage + "Student: " + arrayTest[i] + "  Final Grade: " + String.format("%.2f", matrixFinal[i][4]) + "  Approved: " + approved[i] + "\n";
        }

        //Data Output
        JOptionPane.showMessageDialog(null, finalMessage);

        System.exit(0);
    }
}
