package assignment6_TextEditor;

public class Character {
    private final char value;
    private final String font;
    private final int size;

    public Character(char value, String font, int size) {
        this.value = value;
        this.font = font;
        this.size = size;
    }

    public void display(int x, int y) {
        System.out.println("Character: " + value + " displayed at (" + x + "," + y + ") with font: " + font + " and size: " + size);
    }
}