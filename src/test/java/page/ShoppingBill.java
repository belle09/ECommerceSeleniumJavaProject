/*package page;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShoppingBill extends Product {

    String expectedCartSubtotalPrice, expectedAvailability, actualAvailability;
    String newTotalAmt;
    double convertCartSubtotal, multiplyConvertCartSubtotal, totalAmt;
    double wholePrice;
    DecimalFormat decFormat;
    Matcher match;
    Pattern pattern;

    public String getNewTotalAmt() {
        return newTotalAmt;
    } // end method getNewTotalAmt()

    public void setNewTotalAmt(String newTotalAmt) {
        this.newTotalAmt = newTotalAmt;
    } // end method setNewTotalAmt()

    public void prodQty() {

        String group = null;
        String moneySign = "$";

        // get the regex
        pattern = Pattern.compile(RegexStrings.regexDigits);

        // get the value and match it with regex
        match = pattern.matcher(getExpectedPrice());
        match.find();
        wholePrice = Double.parseDouble(group);

        // used for rounding down whole price
        //decFormat = new DecimalFormat();
        //decFormat.setRoundingMode(RoundingMode.DOWN);
        //System.out.println("Decimal Format: " + decFormat.format(wholePrice));

        // double to String
        convertCartSubtotal = Double.parseDouble(String.valueOf(wholePrice));

        // multiply by quantity
        multiplyConvertCartSubtotal = convertCartSubtotal * 2;

        // concat symbol to integer value
        totalAmt = Double.valueOf(multiplyConvertCartSubtotal);
        newTotalAmt = moneySign.concat(String.valueOf(totalAmt));
        setNewTotalAmt(newTotalAmt);

    } // end method prodQty()

} // end class ShoppingBill
*/