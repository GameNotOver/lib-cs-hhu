import javax.swing.JOptionPane;
public class AdditionTest 
{
/** Main method */
public static void main(String[] args) 
{
     //���������������int���ͣ�
     int n1 = (int) (System.currentTimeMillis() % 100);
     int n2 = (int) (System.currentTimeMillis() * 7 % 10);
     //��ʾ�û�������
     String answerString = JOptionPane.showInputDialog(
                       "What is " + n1 + " + " + n2 + "?");
     int answer = Integer.parseInt(answerString);
     //������
     String result = n1 + " + " + n2 + " = " + answer + " is " 
                       + (n1 + n2 == answer);
     JOptionPane.showMessageDialog(null, result);
}
}

