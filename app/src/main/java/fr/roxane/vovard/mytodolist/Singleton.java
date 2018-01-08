package fr.roxane.vovard.mytodolist;

/**
 * Created by rvovard on 08/01/2018.
 */

public final class Singleton {

    private static volatile Singleton instance = null;

    private String xxx;
    private int yyy;

    private Singleton(){
        super();
    }
}
