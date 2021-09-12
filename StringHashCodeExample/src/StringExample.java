public class StringExample {

    /** A hash function is any function that can be used to map data of arbitrary size to fixed-size values.
    The values returned by a hash function are called hash values, hash codes, digests, or simply
    hashes. The values are used to index a fixed-size table called a hash table. */


    public static void main(String[] args)
    {
        String blogName = "howToDoInJava.com";

        System.out.println( blogName.hashCode() );

        System.out.println( "hello world".hashCode() );
    }

    /** The hash code for a String object is computed as:
     s[0]*31^(n-1) + s[1]*31^(n-2) + … + s[n-1]
     where :
     s[i] – is the ith character of the string
     n – is the length of the string, and
     ^ – indicates exponentiation */

}
