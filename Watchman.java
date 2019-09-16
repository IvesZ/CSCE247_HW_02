import java.util.ArrayList;

public class Watchman implements Subject{

    int warning; //number of warning that issued
    ArrayList<Observer> observers; //a array list of Observer

    /** create an array list of Observer*/
    public Watchman()
    {
        observers = new ArrayList<Observer>();
    }

    /**
     *  add an observer to the list
     * @param observer an Observer
     */
    @Override
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    /**
     *  remove an observer to the list
     * @param observer an Observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * print the list
     */
    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(warning);
        }
    }

    /**
     * this method take one int number and call the method notifyObservers() to print output
     * @param warning an integer number 1 or 2
     */
    public void issueWarning(int warning){
        if(warning < 1 || warning > 2)//if warning is not 1 or 2 then change it to 1
            this.warning = 1;
        else
            this.warning = warning;
        System.out.printf("WARNING:  %s trumpets were played!\n",warning);
        notifyObservers();
    }
}
