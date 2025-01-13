package examples.generics.superclassmethodcalltest;

public class WookieMain {
    public static void main(String[] args) {
        Wookie w = new Wookie();
        Chubacca<Wookie> chubacca = new Chubacca<>(w);

        WookieParty<Wookie> psyGig = new WookieParty<>(chubacca);
        psyGig.speak(chubacca);
    }
}
