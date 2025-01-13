package examples.generics.superclassmethodcalltest;

public class WookieParty<T extends Wookie> {
    T wookie;

    WookieParty(T wookie) {
        this.wookie = wookie;
    }

    public T getWookie() {
        return wookie;
    }

    public void speak(T wookie) {
        wookie.whine();
    }
}
