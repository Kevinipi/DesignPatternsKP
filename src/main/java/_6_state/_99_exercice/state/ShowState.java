package _6_state._99_exercice.state;

import _6_state._99_exercice.*;

public class ShowState implements StateInterface {

    private Watch watch;

    public ShowState(Watch watch) {
        this.watch = watch;
    }

    @Override
    public void clickedA(ClickEvent clickEvent) {
        this.watch.changeState(new EditHourState(this.watch));
    }

    @Override
    public void clickedB(ClickEvent clickEvent) {

    }
}
