package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("input.txt"));

        ArrayList<String> lines = new ArrayList<>();

        while (reader.hasNextLine()) {
            String str = reader.nextLine();
            if (!(str.length() == 0)) {
                String[] strSplit = str.trim().split("\\s+|\\s*,\\s*|\\;+|\\\"+|\\:+|\\[+|\\]+");

                List<String> list = Arrays.asList(strSplit);
                lines.addAll(list);
            }
        }

        String[] linesArray = lines.toArray(new String[0]);
        List<String> articles = new ArrayList<String>();
        for (int count = 0; count < linesArray.length; count++) {
            switch (linesArray[count]) {
                case "The":
                    articles.add("<article," + linesArray[count] + ">");
                    break;
                case "the":
                    articles.add("<article," + linesArray[count] + ">");
                    break;
                case "A":
                    articles.add("<article," + linesArray[count] + ">");
                    break;
                case "a":
                    articles.add("<article," + linesArray[count] + ">");
                    break;
                case "an":
                    articles.add("<article," + linesArray[count] + ">");
                    break;
            }
        }

        List<String> pronoun = new ArrayList<String>();
        for (int count = 0; count < linesArray.length; count++) {
            switch (linesArray[count]) {
                case "all":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "another":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "any":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "anybody":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "anyone":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "anything":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "as":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "aught":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "both":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "each":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "each other":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "either":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "enough":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "everybody":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "everyone":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "everything":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "few":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "he":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "her":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "hers":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "herself":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "him":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "himself":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "his":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "I":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "idem":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "it":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "its":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "itself":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "many":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "me":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "mine":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "most":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "my":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "myself":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "naught":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "neither":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "no one":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "nobody":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "none":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "nothing":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "nought":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "one":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "one another":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "other":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "others":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "ought":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "our":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "ours":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "ourself":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "ourselves":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "several":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "she":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "some":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "somebody":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "someone":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "something":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "somewhat":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "such":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "suchlike":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "that":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "thee":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "their":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "theirs":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "theirself":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "theirselves":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "them":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "themself":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "themselves":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "there":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "these":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "they":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "thine":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "this":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "those":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "thou":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "thy":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "thyself":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "us":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "we":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "what":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whatever":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whatnot":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whatsoever":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whence":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "where":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whereby":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "wherefrom":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "wherein":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whereinto":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whereof":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whereon":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "wherever":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "wheresoever":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whereto":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whereunto":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "wherewith":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "wherewithal":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whether":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "which":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whichever":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whichsoever":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "who":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whoever":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whom":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whomever":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whomso":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whomsoever":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whose":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whosever":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whosesoever":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whoso":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "whosoever":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "ye":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "yon":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "yonder":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "you":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "your":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "yours":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "yourself":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
                case "yourselves":
                    pronoun.add("<pronoun," + linesArray[count] + ">");
                    break;
            }
        }

        List<String> helpingVerb = new ArrayList<String>();
        for (int count = 0; count < linesArray.length; count++) {
            switch (linesArray[count]) {
                case "am":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "is":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "are":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "was":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "were":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "be":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "being":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "been":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "do":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "does":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "have":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "has":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "had":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "may":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "might":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "must":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "can":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "could":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "shall":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "should":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "will":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
                case "would":
                    helpingVerb.add("<Helping verb," + linesArray[count] + ">");
                    break;
            }
        }

        List<String> puntionMarks = new ArrayList<String>();
        for (int count = 0; count < linesArray.length; count++) {
            if (linesArray[count].contains(".")) {
                puntionMarks.add("<punctuation_marks," + linesArray[count] + ">");
            }
            if (linesArray[count].contains(",")) {
                puntionMarks.add("<punctuation_marks," + linesArray[count] + ">");
            }
            if (linesArray[count].contains("?")) {
                puntionMarks.add("<punctuation_marks," + linesArray[count] + ">");
            }
            if (linesArray[count].contains(";")) {
                puntionMarks.add("<punctuation_marks," + linesArray[count] + ">");
            }
            if (linesArray[count].contains(":")) {
                puntionMarks.add("<punctuation_marks," + linesArray[count] + ">");
            }
            if (linesArray[count].contains("!")) {
                puntionMarks.add("<punctuation_marks," + linesArray[count] + ">");
            }
            if (linesArray[count].contains("'")) {
                puntionMarks.add("<punctuation_marks," + linesArray[count] + ">");
            }
            if (linesArray[count].contains("(")) {
                puntionMarks.add("<punctuation_marks," + linesArray[count] + ">");
            }
            if (linesArray[count].contains(")")) {
                puntionMarks.add("<punctuation_marks," + linesArray[count] + ">");
            }
            if (linesArray[count].contains("[")) {
                puntionMarks.add("<punctuation_marks," + linesArray[count] + ">");
            }
            if (linesArray[count].contains("]")) {
                puntionMarks.add("<punctuation_marks," + linesArray[count] + ">");
            }
            if (linesArray[count].contains("{")) {
                puntionMarks.add("<punctuation_marks," + linesArray[count] + ">");
            }
            if (linesArray[count].contains("}")) {
                puntionMarks.add("<punctuation_marks," + linesArray[count] + ">");
            }
            if (linesArray[count].contains("/")) {
                puntionMarks.add("<punctuation_marks," + linesArray[count] + ">");
            }
            if (linesArray[count].contains("*")) {
                puntionMarks.add("<punctuation_marks," + linesArray[count] + ">");
            }
        }

        System.out.print("The Lexemes: ");
        System.out.println(lines);

        System.out.println();

        try {
            FileWriter myWriter = new FileWriter("output.txt");
            myWriter.write(articles.toString() + pronoun.toString() + helpingVerb.toString() + puntionMarks.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
