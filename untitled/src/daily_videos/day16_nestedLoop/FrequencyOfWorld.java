package daily_videos.day16_nestedLoop;

public class FrequencyOfWorld {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java";// farkli yazilmis kelimeleri ya buyuge ya da kucuge dondur
        String word = "Java";

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();


        int count = 0;

        while (sentence.contains(word)) {
            count++;
            sentence = sentence.replaceFirst(word, "");//
        }
        System.out.println(count);

    }

  }
    /*
    3. Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4

		  "Java Java Java Java"; // count = 0;
		  "Java Java Java";     // count = 1;
		  "Java Java";         // count = 2;
		  "Java";             // count =3;
          "";                // count = 4;
     */


