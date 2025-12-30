package com.bridgelabz.oopsbannerapp;



import java.util.Arrays;

public class OOPSBannerApp {
    static class CharacterPatternMap {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return this.character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[]{
                new CharacterPatternMap('o', new String[]{
                        "   ***    ",
                        " **   **  ",
                        "**     ** ",
                        "**     ** ",
                        "**     ** ",
                        "**     ** ",
                        "**     ** ",
                        " **   **  ",
                        "   ***    "
                }),
                new CharacterPatternMap('p', new String[]{
                        "******    ",
                        "**    **  ",
                        "**     ** ",
                        "**    **  ",
                        "******    ",
                        "**        ",
                        "**        ",
                        "**        ",
                        "**        "
                }),
                new CharacterPatternMap('s', new String[]{
                        "    ***** ",
                        "  **      ",
                        "**        ",
                        "  **      ",
                        "    ***   ",
                        "      **  ",
                        "        ** ",
                        "      **   ",
                        " *****     "
                }),
        };
    }

    public static String[] getCharacterPatternMap(char ch, CharacterPatternMap[] charMaps) {
        String[] charPattern = {};
        for (CharacterPatternMap characterPatternMap : charMaps) {
            if (characterPatternMap.getCharacter() == ch) {
                charPattern = characterPatternMap.getPattern();
            }
        }
        if (charPattern.length == 0) {
            charPattern = new String[]{
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " "
            };
        }
        return charPattern;
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        char[] chars = message.toLowerCase().toCharArray();

        for (int row = 0; row < 9; row++) {
            for (char ch : chars) {
                String[] pattern = getCharacterPatternMap(ch, charMaps);
                System.out.print(pattern[row]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        System.out.println(charMaps.length);
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}