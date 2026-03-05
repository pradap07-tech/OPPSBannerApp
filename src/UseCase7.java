
public class UseCase7 {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

   
    public static String[] getCharacterPattern(CharacterPatternMap[] maps, char ch) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    public static void printBanner(String word, CharacterPatternMap[] maps) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);
                String[] pattern = getCharacterPattern(maps, ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    
    public static void main(String[] args) {

      
        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };

        String[] S = {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };

        CharacterPatternMap oMap = new CharacterPatternMap('O', O);
        CharacterPatternMap pMap = new CharacterPatternMap('P', P);
        CharacterPatternMap sMap = new CharacterPatternMap('S', S);

        CharacterPatternMap[] maps = {oMap, pMap, sMap};

        printBanner("OOPS", maps);
    }
}