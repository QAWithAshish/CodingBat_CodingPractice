package String_2;

/* A sandwich is two pieces of bread with something in between.
   Return the string that is between the first and last appearance of "bread" in the given string,
   or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""

*/

public  class String_2_getSandwich {

    public static String getSandwich(String str) {
        int firstIndex = str.indexOf("bread");
        int lastIndex = str.lastIndexOf("bread");

        if (firstIndex != -1 && lastIndex != -1 && firstIndex < lastIndex) {
            StringBuilder sb = new StringBuilder(str);
            sb.delete(0, firstIndex + "bread".length());
            sb.delete(lastIndex - firstIndex - "bread".length(), sb.length());
            return sb.toString();
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));    // Output: "jam"
        System.out.println(getSandwich("xxbreadjambreadyy")); // Output: "jam"
        System.out.println(getSandwich("xxbreadyy"));         // Output: ""
    }

}
