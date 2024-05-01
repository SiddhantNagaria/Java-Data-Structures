import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Examples {
//    public static void main(String[] args) {
//        Pattern p = Pattern.compile("nee",Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("neetargetNeeString");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);}}
        public static void main(String[] args) {
            Pattern p = Pattern.compile("[nee]",Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher("neetargetNeeString");
            int ctr=0;
            while(m.find())
            {
                System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
                ctr++;
            }
            System.out.println(ctr);

//        Pattern p = Pattern.compile("[^nee]",Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("neetaNeeS");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

            //[0-9][^A-Z]
//        Pattern p = Pattern.compile("[^a-z]");
//        Matcher m = p.matcher("neet1arg3etN4ee5String");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);
//"nee|tar|eta|tne"
//        Pattern p = Pattern.compile("nee|tar|eta|tne",Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("neetargetNeeStringeta");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

//        Pattern p = Pattern.compile("^Good", Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("good boys always learn sincerely");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

//        Pattern p = Pattern.compile("^Good", Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("good boys always learn good");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

//        Pattern p = Pattern.compile("^Good", Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("good boys always learn good");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

//        Pattern p = Pattern.compile("^Good Boy", Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("good boys always learn sincerely");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

//        Pattern p = Pattern.compile("ing$",Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("StingStringneetargetNeeStringing");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

//        Pattern p = Pattern.compile("^May|ena$|[^zZ|^0-9]");
//        Matcher m = p.matcher("Maya6nk zSax4ena");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

//        Pattern p = Pattern.compile("[^\\d]",Pattern.CASE_INSENSITIVE);// \d
//        Matcher m = p.matcher("5nee1234ta5rg6et7Ne8eSt9ring0");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

//        Pattern p = Pattern.compile("\\s",Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("neetar getNeeS tring");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

//        Pattern p = Pattern.compile("\\bnee",Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("neetargetNeeString");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

//        Pattern p = Pattern.compile("ing\\b",Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("ingneetargetNeeString");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

//        Pattern p = Pattern.compile("n+",Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("nee target Nee String");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

//        Pattern p = Pattern.compile("n+",Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("nN ee target Nee String");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

//        Pattern p = Pattern.compile("\\d");
//        Matcher m = p.matcher("ne2et6ar8get9Nee7Str5ing0");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

//        Pattern p = Pattern.compile("[a-z|A-D|0-9|$]");
//        Matcher m = p.matcher("1“TeacherS Can open the door, buT you must enter it yourself.”1 $ Chinese proverb");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);
        }
    }

