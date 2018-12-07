package lv.ctco.notepad;

/**
 * Created by maira.maksimova01 on 12/7/2018.
 */
public interface Expirable {

    boolean isExpired();

    default void dismiss(){
        System.out.println("Dismiss is not implemented");
    }

}
