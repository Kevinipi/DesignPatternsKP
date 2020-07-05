package _6_state._99_exercice.state;

import _6_state._99_exercice.*;

public class EditHourState implements StateInterface {

    private Watch watch;

    public EditHourState(Watch watch) {
        this.watch = watch;
    }

    @Override
    public void clickedA(ClickEvent clickEvent) {
        this.watch.changeState(new EditMinutesState(this.watch));
    }

    @Override
    public void clickedB(ClickEvent clickEvent) {
        this.watch.incrementHours();
    }
}
