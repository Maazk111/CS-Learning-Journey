public class Main {
    public static void main(String[] args) {
        System.out.println("String Methods");

        String name = "Harry";
        // System.out.println(name);
//        int value = name.length();
        //System.out.println(value);

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //String ustring = name.toUpperCase();
        //System.out.println(ustring);

//        String nonTrimmedString = "     Harry     ";
//        System.out.println(nonTrimmedString);
//
//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);

//        System.out.println(name.substring(2));
//        System.out.println(name.substring(2,4));

//        System.out.println(name.replace('r', 'p'));
//        System.out.println(name.replace("a","pyy"));

//        System.out.println(name.startsWith("Har"));
//        System.out.println(name.endsWith("dd"));

        //System.out.println(name.charAt(4));

        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry", 4));
        System.out.println(modifiedName.lastIndexOf("y", 7));

        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("HarRY"));

//        System.out.println("I am escape sequence\tdouble quote");

    }
}