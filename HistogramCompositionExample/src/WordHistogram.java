import java.util.HashMap;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;


public class WordHistogram implements Iterable<String> {

    private HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
    private static String string = "rui rui rui campelo campelo campelo test abs abc";
    private String[] words = string.split(" ");


    public void createWordHistogram() {

        words = string.split(" ");
        int value;

        for (String key : words) {

            if (!hashMap.containsKey(key)) {

                value = 0;
                for (String word : words) {

                    if (word.equals(key)) {
                        value += 1;
                    }
                }
                hashMap.put(key,value);
                //System.out.println(key + " " + value);
            }
        }




    }


    @Override
    public Iterator<String> iterator() {

        return hashMap.keySet().iterator();

    }

    public int getKey(String word) {
        return hashMap.get(word);
    }


    public void print() {
        for (String word : hashMap.keySet()) {

            System.out.println(word + " " + getKey(word));
        }
    }

}
