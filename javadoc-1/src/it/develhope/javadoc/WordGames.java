package it.develhope.javadoc;

/**
 * This is a class about Tester's class that I think use the inheritance Has-a
 *
 * @author ToniF
 */
public class WordGames{
    /**
     * This function print the string "Hello" plus another random string(word)
     *
     * @param word random string in description
     * @return the sum of two Strings
     */
    public String addHelloWorld(String word){
        String ciao = "Hello "+word;
        return ciao;
    }

    /**
     * This method print automatically two randoms Strings that you will put
     *
     * @param name    maybe you want to write your name as String
     * @param surname maybe you want to write your surname as String
     * @return the string that contain the name,space and surname
     */
    public String getFullName(String name,String surname){
        String nameSur = name+" "+surname;
        System.out.println(nameSur);
        return nameSur;
    }


}
