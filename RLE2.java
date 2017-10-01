package RLE2;

/**
 * Created by asolo on 9/24/2017.
 */
public class RLE2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String inString;

        if (args[0] == null || args[0].length() == 0)
        {
            System.out.println("");
            return;
        } else
        {
            inString = args[0];
        }

        //System.out.println("Входящая строка " + inString);

        if (Character.isDigit(inString.charAt(0)))
        {
            System.out.println("");
            return;
        }

        for (int i = 1; i < inString.length() - 1; i++)
        {
            if (Character.isDigit(inString.charAt(i))
                    && Character.isDigit(inString.charAt(i + 1)))
            {
                System.out.println("");
                return;
            }
        }

        for (int i = 0; i < inString.length() - 1; i++)
        {
            if (inString.charAt(i) == inString.charAt(i + 1))
            {
                System.out.println("");
                return;
            }
        }

        for (int i = 0; i < inString.length(); i++)
        {
            if (i == inString.length() - 1 && !Character.isDigit(inString.charAt(i)))
            {
                sb.append(inString.charAt(i));
            } else if (!Character.isDigit(inString.charAt(i)))
            {
                if (Character.isDigit(inString.charAt(i + 1)))
                {
                    String onesymbol = String.valueOf(inString.charAt(i + 1));
                    int num = Integer.parseInt(onesymbol);
                    for (int j = 0; j < num; j++)
                    {
                        sb.append(inString.charAt(i));
                    }
                } else {
                    sb.append(inString.charAt(i));
                }
            }
        }

        System.out.println(sb.toString());
    }
}

