public class ConvertSeconds 
{
  /** Main method */
  public static void main(String[] args) 
  {
  int totalSeconds = 10000;

  int totalMinutes = totalSeconds / 60;
  int hours = totalMinutes / 60;
  int minutes = totalMinutes % 60;  
  int seconds = totalSeconds % 60;

  // �������һ��
  System.out.println(totalSeconds + " = " 
      + hours + ":" + minutes + ":" + seconds);

  // �����������
  System.out.printf("%d = %d:%d:%d\n", 
      totalSeconds, hours, minutes, seconds);
  }
}