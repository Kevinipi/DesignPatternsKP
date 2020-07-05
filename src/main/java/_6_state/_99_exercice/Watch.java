package _6_state._99_exercice;

import _6_state._99_exercice.state.EditHourState;
import _6_state._99_exercice.state.EditMinutesState;
import _6_state._99_exercice.state.ShowState;

public class Watch implements ClickListenener {
    private int hours = 0;
    private int minutes = 0;

    private State state = State.SHOW;

    ShowState showState = new ShowState(this);

    /**
     * Generate constructor
     */
    public Watch() {
    }

    public void incrementHours() {
        hours++;
    }

    public void incrementMinutes() {
        minutes++;
    }

    public void showTime() {
        System.out.println(hours + ":" + minutes);
    }

    public void clickButton1() {
        switch (state) {
            case SHOW:
                state = State.EDIT_HOURS;
                break;
            case EDIT_HOURS:
                state = State.EDITS_MINUTES;
                break;
            case EDITS_MINUTES:
                state = State.SHOW;
                break;
        }
    }

    public void clickButton2() {
        switch (state) {
            case SHOW:
                // nothing
                break;
            case EDIT_HOURS:
                incrementHours();
                break;
            case EDITS_MINUTES:
                incrementMinutes();
                break;
        }
    }

    /**
     * Implements method Click Listener
     * @param clickEvent
     */
    @Override
    public void clickShow(ClickEvent clickEvent) {
        showState.clickShow(clickEvent);
    }

    @Override
    public void clickEditHour(ClickEvent clickEvent) {
        showState.clickEditHour(clickEvent);
    }

    @Override
    public void clickEditMinutes(ClickEvent clickEvent) {
        showState.clickEditMinutes(clickEvent);
    }
}
