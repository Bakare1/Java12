package NumberFormat;


import java.text.NumberFormat;
import java.util.Locale;

public class MyNumberFormat {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCompactNumberInstance(Locale.US,NumberFormat.Style.SHORT);
        NumberFormat fmt = NumberFormat.getPercentInstance();
        System.out.println(fmt.format(0.55));

        System.out.println(format.format(42_000));
        System.out.println(format.format(42_000_000));

    }
}
