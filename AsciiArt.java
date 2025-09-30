/**
 * CSCD 210 Lab 1 - ASCII Art
 *
 * Replace this comment with your own description of the picture you choose
 * to draw.  Your program should use System.out.println (and optionally
 * System.out.print) to produce a picture made entirely of keyboard
 * characters (ASCII art).
 *
 * See README.md for detailed instructions.
 */
public class AsciiArt {
    static void print(String string) {
        System.out.print(string);
    }
    static void println(String string) {
        System.out.println(string);
    }

    static void cakeLayer() {
        println("  |  ___   |");
        println("  | |___|  |");
        println("  +---------+");
    }
    static void birthdayCake() {
        println("     i i i");
        println("   __|_|_|__");
        cakeLayer();
        cakeLayer();
    }

    static void castleWindows() {
        println(" | []  []  [] |");
    }
    static void castle() {
        println("  |^^|    |^^|");
        println("  |  |____|  |");
        println(" /____________\\");
        castleWindows();
        castleWindows();
        println(" |     __     |");
        println(" |    |  |    |");
        println(" +------------+");
    }

    static void catQuote(String quote) {
        println("      /\\_/\\");
        println("     ( o.o )   \"" + quote + "!\"");
        println("      > ^ <");
    }
    static void catQuotes() {
        catQuote("Meow");
        println("");
        catQuote("Hiss");
        println("");
        catQuote("Meow");
    }

    static void checkerboardLine() {
        println("+---+---+---+");
    }
    static void filledSquare() {
        print("|###");
    }
    static void emptySquare() {
        print("|   ");
    }
    static void endLine() {
        println("|");
    }
    static void checkerboard() {
        checkerboardLine();
        filledSquare(); emptySquare(); filledSquare(); endLine();
        checkerboardLine();
        emptySquare(); filledSquare(); emptySquare(); endLine();
        checkerboardLine();
        filledSquare(); emptySquare(); filledSquare(); endLine();
        checkerboardLine();
    }

    static void robotLegs() {
        println("   | || |");
    }
    static void pixelRobot() {
        println("   [====]");
        println("  | .  . |");
        println("  |  --  |");
        println("   \\____/");
        robotLegs();
        robotLegs();
        println("   |____|");
    }

    static void bodyLine() {
        println("     |  ||||  |");
    }
    static void breakerLine() {
        println("     +----------+");
    }
    static void rocketNose() {
        println("         /\\");
        println("        /  \\");
        println("       /||||\\");
        println("      /||||||\\");
        println("     /  ||||  \\");
    }
    static void rocketSlash() {
        rocketNose();
        println("     |  ||||  |   \"Blast off!\"");
        breakerLine();
        bodyLine();
        bodyLine();
        breakerLine();
        bodyLine();
        bodyLine();
        breakerLine();
        rocketNose();
    }

    public static void main(String[] args) {
        rocketSlash();
    }
}