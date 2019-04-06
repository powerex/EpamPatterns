package task4.prototype;

public class WikiArticle implements Cloneable {

    private String title;
    private StringBuilder text;

    public WikiArticle(String title, String text) {
        this.title = title;
        this.text = new StringBuilder(text);
    }

    public void append(String appendix) {
        text.append("\n" + appendix);
    }

    public void rewrite(String newTitle, String newText) {
        title = newTitle;
        text = new StringBuilder(newText);
    }

    public void printArticle() {
        System.out.println("Title: " + title);
        System.out.println("===============================");
        System.out.println(text.toString());
        System.out.println("\n\n");
    }

    @Override
    public WikiArticle clone() throws CloneNotSupportedException {
        return new WikiArticle(this.title, this.text.toString());
    }
}
