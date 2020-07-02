package _3_observator._2_exercice;

public class Application implements Observer {

    private Bouton bouton;

    /**
     * Construction de l'application
     */
    public void init() {
        bouton = new Bouton();
    }

    /**
     * Enregistrement, méthode qui doit être déclenché lorsque l'on clic sur le bouton
     */
    public void enregistrer() {
        System.out.println("Enregistrement...");
    }

    @Override
    public void boutonEvent(String eventType, String event) {
        if(eventType.equals("click")){
            try {
                enregistrer();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
