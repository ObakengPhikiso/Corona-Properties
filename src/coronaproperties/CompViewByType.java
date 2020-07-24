package coronaproperties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;

/**
 *
 * @author Melvin K
 */
public class CompViewByType {
    private static class Property {
        //fields
        private String propertyPrimaryKey;
        private String propertyType;
        private String addressNum;
        private String addressStreet;
        private String addressCity;
        private String addressCode;
        private double value;
        private String constructionStatus;
        private String useOfProperty;
        private int room;
        private int garage;
        private int bath;
        private double floorArea;
        private double landArea;
        private double rates;
        private String description;
        private String telephone;
        private String email;
    }
    private static Property propertyInfo;
    private static DecimalFormat df = new DecimalFormat("R ###,###,###,###,###,###.00");
    CompViewByType(String propertyType1, String propertyType2) {
        displayData(propertyType1, propertyType2);
    }

    private static void displayData(String propertyType1, String propertyType2) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/home/username/CoronaProperties.txt"));
            String rec = reader.readLine();
            String remain = "";

            while (rec != null) {
                propertyInfo = new Property();

                propertyInfo.propertyPrimaryKey = rec.substring(0, rec.indexOf("#"));
                remain = rec.substring(rec.indexOf("#") + 1, rec.length());

                propertyInfo.propertyType = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.addressNum = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.addressStreet = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.addressCity = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.addressCode = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.value = Double.parseDouble(remain.substring(0, remain.indexOf("#")));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.constructionStatus = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.useOfProperty = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.room = Integer.parseInt(remain.substring(0, remain.indexOf("#")));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.garage = Integer.parseInt(remain.substring(0, remain.indexOf("#")));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.bath = Integer.parseInt(remain.substring(0, remain.indexOf("#")));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.floorArea = Double.parseDouble(remain.substring(0, remain.indexOf("#")));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.landArea = Double.parseDouble(remain.substring(0, remain.indexOf("#")));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.rates = Double.parseDouble(remain.substring(0, remain.indexOf("#")));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.description = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.telephone = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                propertyInfo.email = remain;

                //First Type
                if (propertyType1.compareToIgnoreCase(propertyInfo.propertyType) == 0) {
                    System.out.println(propertyInfo.propertyPrimaryKey + "\t" + propertyInfo.propertyType + "\t" + propertyInfo.addressNum + "\t" + propertyInfo.addressStreet + "\t" + propertyInfo.addressCity + "\t" + propertyInfo.addressCode + "\t" + df.format(propertyInfo.value) + "\t" + propertyInfo.constructionStatus + "\t" + propertyInfo.useOfProperty + "\t" + propertyInfo.room + "\t" + propertyInfo.garage + "\t" + propertyInfo.bath + "\t" + propertyInfo.floorArea + "\t" + propertyInfo.landArea + "\t" + df.format(propertyInfo.rates) + "\t" + propertyInfo.description + "\t" + propertyInfo.telephone + "\t" + propertyInfo.email);
                }

                //Second Type
                if (propertyType2.compareToIgnoreCase(propertyInfo.propertyType) == 0) {
                    System.out.println(propertyInfo.propertyPrimaryKey + "\t" + propertyInfo.propertyType + "\t" + propertyInfo.addressNum + "\t" + propertyInfo.addressStreet + "\t" + propertyInfo.addressCity + "\t" + propertyInfo.addressCode + "\t" + df.format(propertyInfo.value) + "\t" + propertyInfo.constructionStatus + "\t" + propertyInfo.useOfProperty + "\t" + propertyInfo.room + "\t" + propertyInfo.garage + "\t" + propertyInfo.bath + "\t" + propertyInfo.floorArea + "\t" + propertyInfo.landArea + "\t" + df.format(propertyInfo.rates) + "\t" + propertyInfo.description + "\t" + propertyInfo.telephone + "\t" + propertyInfo.email);
                }

                rec = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
