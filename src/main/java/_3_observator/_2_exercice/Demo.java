package _3_observator._2_exercice;

import _3_observator._1_notification.Editor;
import _3_observator._1_notification.EmailObserver;
import _3_observator._1_notification.FooObservable;
import _3_observator._1_notification.LogObserver;

public class Demo {
    public static void main(String[] args) {
        Bouton bouton = new Bouton();
        Application application = new Application();

        bouton.observe(application);
        //bouton.observe(new Application());

        try {
            //Call Function click
            application.init();
            bouton.clic();
        }catch (Exception e) {
            e.printStackTrace();
        }

       EventObserver eventObserver = new EventObserver();
       eventObserver.observe(application);
    }
}