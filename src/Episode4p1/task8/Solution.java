package Episode4p1.task8;

/*
Запомни и выведи
*/

public class Solution {
    public static void main(String[] args) {
        printMessage(new ItsMessage());
    }
    public static void printMessage(ItsMessage itsMessage){
        System.out.println(itsMessage.getDescription());
    }
    public static class ItsMessage {
        private static String description = "BOOM";
        public String getDescription(){
            return (description);
        };
    }
}



/*
Затем создадим статический метод public void printMessage(ItsMessage itsMessage) — он выведет описание нашей идеи на экран.

В классе Solution создать public static класс ItsMessage
В классе ItsMessage создать метод public String getDescription(), который будет возвращать любой непустой текст
В классе Solution создай статический метод public void printMessage(ItsMessage itsMessage),
который будет выводить на экран описание идеи - это то, что возвращает метод getDescription
 */