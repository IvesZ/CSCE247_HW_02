public class Knight implements Observer {
    private Subject watchman;

    /**
     * take in a Subject and registerObserver in watchman as Knight
     * @param watchman is a subject
     */
    public Knight(Subject watchman)
    {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    /**
     * print different action in different case
     * @param warning an int number
     */
    @Override
    public void update(int warning) {
        System.out.print("Knight: ");
        if(warning == 1)
            System.out.println("Helps everyone get home safe");
        else if (warning == 2)
            System.out.println("Prepares for battle");
    }
}
