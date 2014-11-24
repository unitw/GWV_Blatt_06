package GWV_Blatt_06;

import java.awt.Point;
import java.util.*;

public class CrosswordPuzzleSolver {

    public static void main(String[] args) {
        char[][] easyPuzzle = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '},};

        Crosswordvalue[] words = {
            new Crosswordvalue("add"),
            new Crosswordvalue("ado"),
            new Crosswordvalue("age"),
            new Crosswordvalue("ago"),
            new Crosswordvalue("aid"),
            new Crosswordvalue("ail"),
            new Crosswordvalue("aim"),
            new Crosswordvalue("air"),
            new Crosswordvalue("and"),
            new Crosswordvalue("any"),
            new Crosswordvalue("ape"),
            new Crosswordvalue("apt"),
            new Crosswordvalue("arc"),
            new Crosswordvalue("are"),
            new Crosswordvalue("ark"),
            new Crosswordvalue("arm"),
            new Crosswordvalue("art"),
            new Crosswordvalue("ash"),
            new Crosswordvalue("ask"),
            new Crosswordvalue("auk"),
            new Crosswordvalue("awe"),
            new Crosswordvalue("awl"),
            new Crosswordvalue("aye"),
            new Crosswordvalue("bad"),
            new Crosswordvalue("bag"),
            new Crosswordvalue("ban"),
            new Crosswordvalue("bat"),
            new Crosswordvalue("bee"),
            new Crosswordvalue("boa"),
            new Crosswordvalue("ear"),
            new Crosswordvalue("eel"),
            new Crosswordvalue("eft"),
            new Crosswordvalue("far"),
            new Crosswordvalue("fat"),
            new Crosswordvalue("fit"),
            new Crosswordvalue("lee"),
            new Crosswordvalue("oaf"),
            new Crosswordvalue("rat"),
            new Crosswordvalue("tar"),
            new Crosswordvalue("tie")
        };

        CrosswordSpace[] slots = {
            new CrosswordSpace(new Point(0, 0), new Point(1, 0), 3),
            new CrosswordSpace(new Point(0, 1), new Point(1, 1), 3),
            new CrosswordSpace(new Point(0, 2), new Point(1, 2), 3),
            new CrosswordSpace(new Point(4, 1), new Point(0, 1), 2),
            new CrosswordSpace(new Point(3, 6), new Point(0, 1), 2),
            new CrosswordSpace(new Point(0, 4), new Point(1, 0), 2),};

        CrosswordPuzzle puzzle = new CrosswordPuzzle(easyPuzzle, slots, words);

    }

}
