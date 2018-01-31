package sample;

public enum Level {

    HIRAGANA("hiragana"),
    KATAKANA("katakana"),
    JLPT5("jlpt5"),
    JLPT4("jlpt4"),
    JLPT3("jlpt3"),
    JLPT2("jlpt2"),
    JLPT1("jlpt1");

    final String source;

    Level(String levelLink) {
        this.source = levelLink;
    }

    public String getSource() {
        return source;
    }
}
