import javax.swing.JOptionPane;

public class Opa {
    public static void main(String[] args) {
        int firstAnswer = JOptionPane.showConfirmDialog(null, "У вас есть кандибобер", "Вопрос 1", JOptionPane.YES_NO_OPTION);
        int firstResponse;
        if (firstAnswer == JOptionPane.YES_OPTION) {
            firstResponse = 1;
        } else {
            firstResponse = 0;
        }
        int secondAnswer = JOptionPane.showConfirmDialog(null, "Вы балерина", "Вопрос 2", JOptionPane.YES_NO_OPTION);
        int secondResponse;
        if (secondAnswer == JOptionPane.YES_OPTION) {
            secondResponse = 1;
        } else {
            secondResponse = 0;
        }
        String message = "";
        if ((firstResponse == 1 ) & (secondResponse == 1)){
            message = "Ваша машина в другом культурном городе";
        }
        if ((firstResponse == 1 ) & (secondResponse == 0)){
            message = "Ваc зовут Ибрагим ";
        }
        if ((firstResponse == 0 ) & (secondResponse == 1)){
            message = "Вы женщина ";
        }
        if ((firstResponse == 0 ) & (secondResponse == 0)){
            message = "Алллах Акбар";
        }
        JOptionPane.showMessageDialog(null, message, "Ответы", JOptionPane.INFORMATION_MESSAGE);
    }
}