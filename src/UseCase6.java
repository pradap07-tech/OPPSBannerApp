public class UseCase6 {
   public static String[] getOpattern(){
    return new String[]{
        "   ***   ",
        " **   ** ",     
        " *     * ",
        " *     * ",
        " *     * ",
        " **   ** ",
        "   ***   "
    };

   }
   public static String[] getPpattern(){
    return new String[]{
        " *****  ",
        " **   * ",
        " **   * ",
        " ***    ",
        " **     ",
        " **     ",
        " **     "
    };

   }
   public static String[] getSpattern(){
    return new String[]{
        "  *****  ",
        " **   ** ",
        " **      ",
        "  *****   ",
        "      **  ",
        " **   **  ",
        "  *****   "
    };

   }
    public static void main(String[] args) {
        String[] lines = new String[7];

        String[] opattern=getOpattern();
        String[] ppattern=getPpattern();
        String[] spattern=getSpattern();


        for (int i = 0; i < lines.length; i++) {
            lines[i] = opattern[i] + " " + ppattern[i] + " " + ppattern[i] + " " + spattern[i];
        }
        for (String line : lines) {
            System.out.println(line);
        }

    }
}