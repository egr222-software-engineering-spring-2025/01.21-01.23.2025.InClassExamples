public class DrawFigures {
    public static void main(String[] args) {
        drawDiamond();
        System.out.println();
        drawX();
        System.out.println();
        drawRocket();
    }

    public static void drawDiamond() {
        drawTriangle();
        drawV();
    }

    public static void drawX() {
        drawV();
        drawTriangle();
    }

    public static void drawRocket() {
        drawTriangle();
        drawBox();
        System.out.println("|United|");
        System.out.println("|States|");
        drawBox();
        drawTriangle();
    }

    public static void drawTriangle() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }

    public static void drawV() {
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }

    public static void drawBox() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
}