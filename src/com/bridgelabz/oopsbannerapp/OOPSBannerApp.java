package com.bridgelabz.oopsbannerapp;


    	public class OOPSBannerApp {
    	    public static void main(String[] args) {
    	        String[] lines = {
    	                String.join("  ",
    	                        "   ***  ", "    ***  ", " ****** ", "     *****"),
    	                String.join("  ",
    	                        " **   **", "  **   **", " **    **", "  **    "),
    	                String.join("  ",
    	                        "**     **", "**     **", "** ", "  **", "**"),
    	                String.join("  ",
    	                        "**     **", "**     **", "**    **", "   **   "),
    	                String.join("  ",
    	                        "**     **", "**     **", "******    ", "   ***"),
    	                String.join("  ",
    	                        "**     **", "**     **", "**    ", "          **"),
    	                String.join("  ",
    	                        "**     **", "**     **", "**    ", "           **"),
    	                String.join("  ",
    	                        " **   **", "  **   **", " **    ", "          **"),
    	                String.join("  ",
    	                        "   ***   ", "   ***   ", "**    ", "     *****")
    	        };

    	        for (String line : lines) {
    	            System.out.println(line);
    	        String[] oPattern = getOPattern();
    	        String[] pPattern = getPPattern();
    	        String[] sPattern = getSPattern();

    	        for (int i = 0; i < oPattern.length; i++) {
    	            System.out.println(oPattern[i] + oPattern[i] + pPattern[i] + sPattern[i]);
    	        }
    	    }

    	    }
    	    public static String[] getOPattern() {
    	        return new String[]{
    	                "   ***    ",
    	                " **   **  ",
    	                "**     ** ",
    	                "**     ** ",
    	                "**     ** ",
    	                "**     ** ",
    	                "**     ** ",
    	                " **   **  ",
    	                "   ***    "
    	        };
    	    }

    	    public static String[] getPPattern() {
    	        return new String[]{
    	                "******    ",
    	                "**    **  ",
    	                "**     ** ",
    	                "**    **  ",
    	                "******    ",
    	                "**        ",
    	                "**        ",
    	                "**        ",
    	                "**        "
    	        };
    	    }

    	    public static String[] getSPattern() {
    	        return new String[]{
    	                "    ***** ",
    	                "  **      ",
    	                "**        ",
    	                "  **      ",
    	                "    ***   ",
    	                "      **  ",
    	                "        ** ",
    	                "      **   ",
    	                " *****     "
    	        };
    	    }
    	}
    
