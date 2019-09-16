public class Teacher implements Observer{
    private Subject watchman;
    /**
     * take in a Subject and registerObserver in watchman as Teacher
     * @param watchman is a subject
     */
    public Teacher(Subject watchman)
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
        System.out.print("Teacher: ");
        if(warning == 1)
            System.out.println("Helps get every kid home safe");
        else if (warning == 2)
            System.out.println("Brings all students to the underground shelter");
    }
}
