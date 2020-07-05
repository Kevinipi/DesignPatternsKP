package _6_state._99_exercice;

public class Demo {
    private  static ClickEvent clickEvent;

    public static void main(String[] args) {
        Watch watch = new Watch();

        //Condition clic A
        watch.clickedA(clickEvent);
        watch.clickedB(clickEvent);
        //Conditionclci B
        watch.clickedA(clickEvent);
        watch.clickedB(clickEvent);
        watch.clickedB(clickEvent);

        watch.showTime();// 1:2

    }
}
