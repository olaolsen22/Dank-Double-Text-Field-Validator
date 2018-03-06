import javafx.scene.control.TextField;

public class NumberTextField extends TextField {
    public NumberTextField() {
    }

    public void replaceText(int i, int i1, String string) {
        if ((this.getText() + string).matches("(\\d*(?:\\.\\d*)?)")) {
            super.replaceText(i, i1, string);
        }

    }

    public void replaceSelection(String string) {
        super.replaceSelection(string);
    }
}
