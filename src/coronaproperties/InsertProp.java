package coronaproperties;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Melvin K
 */
public class InsertProp {
    private static class Property {
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
        Property nextNode;
    }
    private static Property head = null, aux, newNode;
    InsertProp() {
        readDataToQueue();
        if (insertNodeFromQueue()) {
            moveDataToFile();
        }
    }

    private static void readDataToQueue() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/home/username/CoronaProperties.txt"));
            String rec = reader.readLine();
            String remain = "";

            while (rec != null) {
                newNode = new Property();

                newNode.propertyPrimaryKey = rec.substring(0, rec.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.propertyType = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.addressNum = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.addressStreet = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.addressCity = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.addressCode = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.value = Double.parseDouble(remain.substring(0, remain.indexOf("#")));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.constructionComplete = Boolean.parseBoolean(remain.substring(0, remain.indexOf("#")));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.useOfProperty = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.room = Integer.parseInt(remain.substring(0, remain.indexOf("#")));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.garage = Integer.parseInt(remain.substring(0, remain.indexOf("#")));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.bath = Integer.parseInt(remain.substring(0, remain.indexOf("#")));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.floorArea = Double.parseDouble(remain.substring(0, remain.indexOf("#")));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.landArea = Double.parseDouble(remain.substring(0, remain.indexOf("#")));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.rates = Double.parseDouble(remain.substring(0, remain.indexOf("#")));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.description = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.telephone = remain.substring(0, remain.indexOf("#"));
                remain = remain.substring(remain.indexOf("#") + 1, remain.length());

                newNode.email = remain;

                newNode.nextNode = null;
                if (head == null) {
                    head = newNode;
                } else {
                    aux.nextNode = newNode;
                }
                aux = newNode;
                rec = reader.readLine();

            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean insertNodeFromQueue() {

        boolean inserted = false;

        int position = Integer.parseInt(JOptionPane.showInputDialog("What position do you want to insert a new property?: "));

        newNode = new Property();
        newNode.propertyPrimaryKey = JOptionPane.showInputDialog("Enter property primary key: ");

        if (!checkBeforeInsert(newNode.propertyPrimaryKey)) {
            aux = head;

            newNode.propertyPrimaryKey = JOptionPane.showInputDialog("Enter new property primary key: ");

            newNode.propertyType = JOptionPane.showInputDialog("Enter property type number: ");
            newNode.addressNum = JOptionPane.showInputDialog("Enter property address number: ");
            newNode.addressStreet = JOptionPane.showInputDialog("Enter property address street: ");
            newNode.addressCity = JOptionPane.showInputDialog("Enter property address city: ");
            newNode.addressCode = JOptionPane.showInputDialog("Enter property address code: ");
            double value = Double.parseDouble(JOptionPane.showInputDialog("Enter property value: "));
            boolean constructionComplete = Boolean.parseBoolean(JOptionPane.showInputDialog("Enter property construction status: "));
            newNode.useOfProperty = JOptionPane.showInputDialog("Enter property use of property: ");
            int room = Integer.parseInt(JOptionPane.showInputDialog("Enter number of room(s) for property: "));
            int garage = Integer.parseInt(JOptionPane.showInputDialog("Enter number of garage(s) for property: "));
            int bath = Integer.parseInt(JOptionPane.showInputDialog("Enter number of bath(s) for property: "));
            double floorArea = Double.parseDouble(JOptionPane.showInputDialog("Enter floor area for property: "));
            double landArea = Double.parseDouble(JOptionPane.showInputDialog("Enter land area for property: "));
            double rates = Double.parseDouble(JOptionPane.showInputDialog("Enter rates for property: "));
            newNode.description = JOptionPane.showInputDialog("Enter description for property: ");
            newNode.telephone = JOptionPane.showInputDialog("Enter telephone for property: ");
            newNode.email = JOptionPane.showInputDialog("Enter email for property: ");

            newNode.nextNode = null;
            int counter = 1;
            if (position == 1) {
                newNode.nextNode = head;
                head = newNode;
            } else {
                while (counter < position - 1) {
                    counter++;
                    aux = aux.nextNode;
                }
                newNode.nextNode = aux.nextNode;
                aux.nextNode = newNode;
            }
            inserted = true;
            JOptionPane.showMessageDialog(null, "Record inserted successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Property number ALREADY exists!");
        }
//        Menu aMenu = new Menu();
//        aMenu.setLocationRelativeTo(null);
//        aMenu.setVisible(true);

        return inserted;
    }

    private static boolean checkBeforeInsert(String propertyPrimaryKey) {
        boolean exists = false;
        aux = head;
        do {
            if (aux.propertyPrimaryKey.compareTo(propertyPrimaryKey) == 0) {
                exists = true;
            }
            aux = aux.nextNode;
        } while (aux != null);
        return exists;
    }

    private static void moveDataToFile() {
        File f = new File("/home/username/CoronaProperties.txt");
        String indRec = "";
        aux = head;
        try {
            FileWriter writter = new FileWriter(f);
            do {
                indRec = aux.propertyPrimaryKey.concat("#").concat(aux.propertyType).concat("#").concat(aux.addressNum).concat("#").concat(aux.addressStreet).concat("#").concat(aux.addressCity).concat("#").concat(aux.addressCode).concat("#").concat(Double.toString(aux.value).concat("#").concat(Boolean.toString(aux.constructionComplete)).concat("#").concat(aux.useOfProperty).concat("#").concat(Integer.toString(aux.room)).concat("#").concat(Integer.toString(aux.garage)).concat("#").concat(Integer.toString(aux.bath)).concat("#").concat(Double.toString(aux.floorArea)).concat("#").concat(Double.toString(aux.landArea)).concat("#").concat(Double.toString(aux.rates)).concat("#").concat(aux.description).concat("#").concat(aux.telephone).concat("#").concat(aux.email).concat("\n"));
                writter.write(indRec);
                aux = aux.nextNode;
            } while (aux != null);
            writter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
