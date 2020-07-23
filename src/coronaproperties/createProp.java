package coronaproperties;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Melvin K
 */
public class createProp {
    private static class Property {
        //fields
        private String propertyPrimaryKey;
        private String propertyType;
        private String addressNum;
        private String addressStreet;
        private String addressCity;
        private String addressCode;
        private double value;
        private boolean constructionComplete;
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
    createProp(String propertyPrimaryKey, String propertyType, String addressNum, String addressStreet, String addressCity, String addressCode, double value, boolean construction, String useOfProperty, int room, int garage, int bath, double floorArea, double landArea, double rates, String description, String telephone, String email) {
        propertyInfo = new Property();
        propertyInfo.propertyPrimaryKey = propertyPrimaryKey;
        propertyInfo.propertyType = propertyType;
        propertyInfo.addressNum = addressNum;
        propertyInfo.addressStreet = addressStreet;
        propertyInfo.addressCity = addressCity;
        propertyInfo.addressCode = addressCode;
        propertyInfo.value = value;
        propertyInfo.constructionComplete = construction;
        propertyInfo.useOfProperty = useOfProperty;
        propertyInfo.room = room;
        propertyInfo.garage = garage;
        propertyInfo.bath = bath;
        propertyInfo.floorArea = floorArea;
        propertyInfo.landArea = landArea;
        propertyInfo.rates = rates;
        propertyInfo.description = description;
        propertyInfo.telephone = telephone;
        propertyInfo.email = email;
        writeData();
    }

    private static void writeData() {
        String indRec = propertyInfo.propertyPrimaryKey.concat("#").concat(propertyInfo.propertyType).concat("#").concat(propertyInfo.addressNum).concat("#").concat(propertyInfo.addressStreet).concat("#").concat(propertyInfo.addressCity).concat("#").concat(propertyInfo.addressCode).concat("#").concat(Double.toString(propertyInfo.value).concat("#").concat(Boolean.toString(propertyInfo.constructionComplete)).concat("#").concat(propertyInfo.useOfProperty).concat("#").concat(Integer.toString(propertyInfo.room)).concat("#").concat(Integer.toString(propertyInfo.garage)).concat("#").concat(Integer.toString(propertyInfo.bath)).concat("#").concat(Double.toString(propertyInfo.floorArea)).concat("#").concat(Double.toString(propertyInfo.landArea)).concat("#").concat(Double.toString(propertyInfo.rates)).concat("#").concat(propertyInfo.description).concat("#").concat(propertyInfo.telephone).concat("#").concat(propertyInfo.email).concat("\n"));
        File f = new File("src/CoronaProperties.txt");
        try {
            FileWriter writter = null;
            if (f.createNewFile()) {
                writter = new FileWriter(f);
            } else {
                writter = new FileWriter(f, true);
                writter.write(indRec);
                writter.close();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
