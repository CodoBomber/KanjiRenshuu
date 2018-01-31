package sample;

public enum Level {

    HIRAGANA("hiragana", null),
    KATAKANA("katakana", null),
    JLPT5("jlpt5", new JLPT5()),
    JLPT4("jlpt4", new JLPT4()),
    JLPT3("jlpt3", new JLPT3()),
    JLPT2("jlpt2", new JLPT2()),
    JLPT1("jlpt1", new JLPT1());

    final String source;
    final JLPTFactory jlpt;

    Level(String levelLink, JLPTFactory jlpt) {
        this.source = levelLink;
        this.jlpt = jlpt;
    }

    public String getSource() {
        return source;
    }

    public JLPTFactory getJlpt() {
        return jlpt;
    }
}
