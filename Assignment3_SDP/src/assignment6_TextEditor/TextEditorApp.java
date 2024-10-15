package assignment6_TextEditor;

public class TextEditorApp {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        TextEditor editor = new TextEditor(characterFactory);

        editor.insertCharacter('A', "Arial", 12, 10, 20);
        editor.insertCharacter('B', "Arial", 12, 15, 20);
        editor.insertCharacter('C', "Arial", 12, 20, 20);
        editor.insertCharacter('D', "Times New Roman", 14, 25, 20);

        editor.renderDocument();
    }
}