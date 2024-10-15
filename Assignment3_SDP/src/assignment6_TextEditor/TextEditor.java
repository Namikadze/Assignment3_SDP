package assignment6_TextEditor;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<Character> characters = new ArrayList<>();
    private CharacterFactory characterFactory;

    public TextEditor(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }

    public void insertCharacter(char value, String font, int size, int x, int y) {
        Character character = characterFactory.getCharacter(value, font, size);
        character.display(x, y);
        characters.add(character);
    }

    public void renderDocument() {
        System.out.println("Rendering document...");
        for (Character character : characters) {
            // Rendering happens, assuming coordinates are already handled elsewhere.
        }
    }
}