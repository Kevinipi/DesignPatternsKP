package _6_state._99_exercice.state;

import _6_state._99_exercice.*;

public class ShowState implements ClickListenener {

    private Watch watch;

    public ShowState(Watch watch) {
        this.watch = watch;
    }


    @Override
    public void clickShow(ClickEvent clickEvent) {

    }

    @Override
    public void clickEditHour(ClickEvent clickEvent) {
        EditHourState editHourState = new EditHourState(watch);
        editHourState.clickEditHour(clickEvent);
    }

    @Override
    public void clickEditMinutes(ClickEvent clickEvent) {
        EditMinutesState editMinutesState = new EditMinutesState(watch);
        editMinutesState.clickEditMinutes(clickEvent);
    }
}
