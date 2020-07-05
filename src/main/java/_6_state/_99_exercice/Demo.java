package _6_state._99_exercice;

import _6_state._99_exercice.state.ShowState;

public class Demo {
    public static void main(String[] args) {
        Watch watch = new Watch();
        watch.clickButton1();
        watch.clickButton2();
        watch.clickButton2();//2h

        watch.clickButton1();
        watch.clickButton2();
        watch.clickButton2();
        watch.clickButton2();//minutes

        watch.showTime();// 2:3
    }
}
