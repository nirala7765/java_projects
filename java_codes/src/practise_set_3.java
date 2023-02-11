public class practise_set_3 {
    public static void main(String[] args) {
        /*
      //1. Write a Java program to convert a string to lowercase.
        String sc = "Ram Is A Good boy";
        System.out.println(sc.toLowerCase());
       // 2. Write a Java program to replace spaces with underscores.
        String sc1 = "Ram is a good boy";
        sc1 = sc1.replace(" ","_");
        System.out.println(sc1);
        //System.out.println(sc.replace(" ","_"));
        //3. Write a Java program to fill in a letter template which looks like below:
        //// letter = “Dear <|name|>, Thanks a lot”
        String letter = "Dear <name> Thanks alot";
        letter = letter.replace("<name>","Sachin");
        System.out.println(letter);

        //4. Write a Java program to detect double and triple spaces in a string.

        String Template = "Ramayan is a holy book  ";
        System.out.println(Template.indexOf("  "));
        System.out.println(Template.indexOf("   "));
        //5.letter sequence
        String tqletter = "Dear Babu \n\t I hope You are fine there \nThanks!";
        System.out.println(tqletter);

         */

        //6. perform all functions of Strings

        String str = "Ganga is  tallest river in india";
        String str1 = "Seeta was Rama's Wife";
        System.out.println(str.charAt(3));
        System.out.println(str.codePointAt(0));
        System.out.println(str.codePointBefore(5));
        System.out.println(str.codePointCount(0,8));
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareToIgnoreCase(str1));
        System.out.println(str.contains("largest"));
        System.out.println(str.contains("tallest"));
        System.out.println(str.contentEquals("Ganga is  tallest river in india"));
        System.out.println(str.contentEquals("gello"));
        System.out.println(str.contentEquals(str1));
        char[] mystr = {'h','e','l','l','o'};
       String mystr2 ="";
       mystr2 = mystr2.copyValueOf(mystr,0,5);
        System.out.println(mystr2);
        System.out.println(str.endsWith("india"));
        System.out.println(str.endsWith("ia"));
        System.out.println(str.endsWith("i"));
        System.out.println(str.startsWith("Ganga"));
        System.out.println(str.startsWith("G"));
        System.out.println(str.startsWith("a"));
        System.out.println(str.equals("ganga"));
        System.out.println(str.equals("Ganga is  tallest river in india"));
        String str2 = "Ganga is  tallest river in india";
        System.out.println(str.equals(str2));
        System.out.println(str.equals(mystr2));

        System.out.println(str.equalsIgnoreCase("ganga is  tallest river in india"));
        System.out.println(str.hashCode());
        System.out.println(str.indexOf("G"));
        System.out.println(str.indexOf("i"));
        System.out.println(str.length());
        System.out.println(str.matches("Ganga is  tallest river in india"));
        System.out.println(str.matches("Ganga is  tallest river in a"));
        System.out.println(str.offsetByCodePoints(4,6));
        //System.out.println(str.regionMatches());
        System.out.println(str.replace("Ganga","yamuna"));
        System.out.println(str.replaceFirst("i","l"));
        System.out.println(str.replaceAll("i","I"));
        System.out.println(str.split("Ganga is  tallest river in india"));
        System.out.println(str.subSequence(3,5));
        System.out.println(str.substring(6,32));
        System.out.println(str.isEmpty());
        String str3 = "";
        System.out.println(str3.isEmpty());
        System.out.println(str.isBlank());
        System.out.println(str3.isBlank());
        System.out.println(str.toCharArray());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.toString());
        String str4 =  "     Rahu re abab    ";
        System.out.println(str4.trim()); //remove spaces from both the ends
        System.out.println(str.valueOf("ganga "));




    }
}
