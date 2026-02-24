public class OOPSBannerUC6 {

    // Method to generate letter O
    public static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Method to generate letter P
    public static String[] getP() {
        return new String[]{
                "*****  ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      "
        };
    }

    // Method to generate letter S
    public static String[] getS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        // Print OOPS (O O P S)
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}