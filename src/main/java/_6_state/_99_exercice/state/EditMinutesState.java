package _6_state._99_exercice.state;

import _6_state._99_exercice.ClickEvent;
import _6_state._99_exercice.ClickListenener;
import _6_state._99_exercice.StateInterface;
import _6_state._99_exercice.Watch;

public class EditMinutesState implements StateInterface {

    private  Watch watch;

    public EditMinutesState(Watch watch) {
        this.watch = watch;
    }

    @Override
    public void clickedA(ClickEvent clickEvent) {
        this.watch.changeState(new ShowState(this.watch));
    }

    @Override
    public void clickedB(ClickEvent clickEvent) {
        this.watch.incrementMinutes();
    }
}
