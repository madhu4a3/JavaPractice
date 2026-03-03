package geeks;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

class StopWords { private static String RESULT_FNAME = "Output.txt";

    public static Boolean isStopWord(String word, String[] stopWords)
    {
        boolean found = false;  
        for(String w: stopWords){
        	if(w.equalsIgnoreCase(word))
        	found = true;
        	break;
        }
        return found;
    }

    public static int compareWords(String word1, String word2)
    {
        return word1.compareToIgnoreCase(word2);
    }

    public static String[] readStopWords(String stopWordsFilename) 
    {
        
    	  String[] stopWords = null;
        try
        {
           
        	Scanner stopWordsFile = new Scanner(new File(stopWordsFilename));
            stopWordsFile.useDelimiter(Pattern.compile("[ \n\r\t,.;:?!'\"]+"));
           // int numStopWords = 0;
          

            
            		
            List<String> sw = new ArrayList<String>();
            int i;
            stopWords = new String[sw.size()];
            for (i = 0; stopWordsFile.hasNext(); i++)
                sw.add(stopWordsFile.next());
            System.out.println("no of stop words: "+i);
            stopWords = sw.toArray(stopWords);
            for(String s: stopWords)
            	System.out.println("stop word: " +s);
            stopWordsFile.close();
        }
        catch (FileNotFoundException e)
        {
            System.err.println(e.getMessage());
            System.exit(-1);
        }

        return stopWords;
     }

    public static void removeStopWords(String textFilename, String[] stopWords)
    {
        String word;
        Scanner textFile = null;
        PrintWriter outFile = null;
        

        try
        {
            textFile = new Scanner(new File(textFilename));
            textFile.useDelimiter(Pattern.compile("[ \n\r\t,.;:?!'\"]+"));

            outFile = new PrintWriter(new File(RESULT_FNAME));

            while (textFile.hasNext())
            {
                word = textFile.next();

                if (isStopWord(word, stopWords))
                    System.out.print(word + " ");
                else
                    outFile.print(word + " ");
            }

            System.out.println("Output File " + RESULT_FNAME);
        }
        catch (FileNotFoundException e)
        {
            System.err.println(e.getMessage());
            System.exit(-1);
        }
        finally
        {
            textFile.close();
            outFile.close();
        }
    }

    public static void main(String[] arg)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input StopWord File: ");
        String[] stopWords = readStopWords(keyboard.next());

        System.out.print("Input file from which stopword to be removed: ");
        removeStopWords(keyboard.next(), stopWords);

    }
}
