package coronaproperties;

import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author Melvin K
 */
public class Driver {
    public static void main(String[] args) {
//        LoadingScreen sc = new LoadingScreen();
        RecordProp aRecordProp = new RecordProp();
        aRecordProp.setTitle("Add New Property");
        aRecordProp.setOpacity((float) 0.9);
        aRecordProp.setBackground(new Color(0, 0, 0, 0));
        aRecordProp.setIconImage(Toolkit.getDefaultToolkit().
                getImage(SetJFrame_Icon.class.getResource("/icons/icons8_House_100px.png")));
        aRecordProp.setLocationRelativeTo(null);
        aRecordProp.setVisible(true);
    }

}
