public class ShopOwner implements Observer{
    private Subject watchman;
    /**
     * take in a Subject and registerObserver in watchman as ShopOwner
     * @param watchman is a subject
     */
    public ShopOwner(Subject watchman)
    {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    /**
     * print different action in different case
     * @param warning an int number
     */
    @Override
    public void update(int warning)
    {
        System.out.print("Shop Owner: ");
        if(warning == 1)
            System.out.println("Close down shop and head home");
        else if (warning == 2)
            System.out.println("Drops everything and find nearest hideout");
    }
}
