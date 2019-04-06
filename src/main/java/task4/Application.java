package task4;

import task4.prototype.WikiArticle;

public class Application {

    public static void main(String[] args) throws CloneNotSupportedException {
        WikiArticle original = new WikiArticle("Flat Earth",
                "The flat Earth model is an archaic conception of Earth's shape as a plane or disk. " +
                        "Many ancient cultures subscribed to a flat Earth cosmography, " +
                        "including Greece until the classical period, the Bronze Age and " +
                        "Iron Age civilizations of the Near East until the Hellenistic period, " +
                        "India until the Gupta period (early centuries AD), and China until the 17th century.");


        original.printArticle();


        WikiArticle review = original.clone();
        review.append("The idea of a spherical Earth appeared in Greek philosophy with Pythagoras (6th century BC), " +
                "although most pre-Socratics (6th–5th century BC) retained the flat Earth model. " +
                "Aristotle provided evidence for the spherical shape of the Earth on empirical grounds by around 330 BC. " +
                "Knowledge of the spherical Earth gradually began to spread beyond the Hellenistic world from then on.");


        review.printArticle();

        original.rewrite("Earth not flat", "Ask for spacemans )");

        original.printArticle();

        WikiArticle trueArticle = original.clone();
        trueArticle.append("1. The Moon");
        trueArticle.append("2. Ships and the horizon");
        trueArticle.append("3. Varying star constellations");
        trueArticle.append("4. Shadows and sticks");
        trueArticle.append("5. Seeing farther from higher");
        trueArticle.append("6. Ride a plane");
        trueArticle.append("7. Look at other planets");
        trueArticle.append("8. The existence of time zones");
        trueArticle.append("9. The pull of gravity");
        trueArticle.append("10. Images from space");

        original.printArticle();
        trueArticle.printArticle();
        original = trueArticle;
        original.printArticle();

    }

}
