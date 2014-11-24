package GWV_Blatt_06;

import java.awt.Point;
import java.util.*;

public class CrosswordPuzzle {

    private char[][] puzzle;

    private CrosswordSpace[] slots;

    private Crosswordvalue[] words;

    private int[][] letterUsage;

    private int numBacktracks;

    public static final char BLANK = ' ';
    public static final char FILLED = '#';

    public CrosswordPuzzle(char[][] puzzle, CrosswordSpace[] slots, Crosswordvalue[] words) {
        this.puzzle = puzzle;
        this.slots = slots;
        this.words = words;
    }

    private void reinitialize() {
        letterUsage = new int[puzzle.length][puzzle[0].length];
        numBacktracks = 0;
    }

    public void solve() {
        reinitialize();

        if (fillPuzzle(0)) {
            System.out.println("Solution found!");
            System.out.println("Backtracks: " + numBacktracks);
        } else {
            System.out.println("No solution found!");
        }
    }

    private boolean fillPuzzle(int slot) {

        if (slot == slots.length) {
            return true;
        }

        for (Crosswordvalue word : words) {

            if (wordFitsInSlot(word, slots[slot])) {
                putWordInSlot(word, slots[slot]);

                if (fillPuzzle(slot + 1)) {
                    return true;
                }

                removeWordFromSlot(word, slots[slot]);
            }
        }
        return true;
    }

    private void putWordInSlot(Crosswordvalue w, CrosswordSpace slot) {
        Point position = new Point(slot.getStart());

        for (int i = 0; i < slot.getLength(); i++) {

            puzzle[position.x][position.y] = w.getWord().charAt(i);

            letterUsage[position.x][position.y]++;

            position.x += slot.getDirection().x;
            position.y += slot.getDirection().y;
        }

        // Mark the word as USED:
        w.setUsed(true);
    }

    private boolean wordFitsInSlot(Crosswordvalue w, CrosswordSpace slot) {

        if (w.getWord().length() != slot.getLength() || w.isUsed()) {
            return false;
        }

        Point position = new Point(slot.getStart());

        for (int i = 0; i < slot.getLength(); i++) {

            if (puzzle[position.x][position.y] != BLANK && puzzle[position.x][position.y] != w.getWord().charAt(i)) {
                return false;
            }

            // Advance to the next position in the slot:
            position.x += slot.getDirection().x;
            position.y += slot.getDirection().y;
        }

        return true;
    }

    private void removeWordFromSlot(Crosswordvalue w, CrosswordSpace slot) {
        Point position = new Point(slot.getStart());

        for (int i = 0; i < slot.getLength(); i++) {

            letterUsage[position.x][position.y]--;

            if (letterUsage[position.x][position.y] == 0) {
                puzzle[position.x][position.y] = BLANK;
            }

            position.x += slot.getDirection().x;
            position.y += slot.getDirection().y;
        }

        w.setUsed(false);
    }

    public void printPuzzle() {
        printPuzzleBorder();

        for (int row = 0; row < puzzle.length; row++) {
            System.out.print("|");
            for (int col = 0; col < puzzle[row].length; col++) {
                System.out.print(puzzle[row][col] + "|");
            }
            System.out.println();
        }

        printPuzzleBorder();

        System.out.println();
    }

    private void printPuzzleBorder() {
        for (int i = 0; i < puzzle[0].length * 2 + 1; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
