package com.STLSmash.client.panels;

import com.STLSmash.client.Armor;
import com.STLSmash.client.Weapon;
import com.STLSmash.client.panels.details.BackgroundDetails;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import org.gwtbootstrap3.client.ui.TabPanel;
import org.gwtbootstrap3.client.ui.gwt.CellTable;
import org.gwtbootstrap3.client.ui.html.Div;

import java.util.Arrays;
import java.util.List;

/**
 * Created by GENJIJODU on 3/10/2016.
 */
public class EquipmentPanel extends Composite {
    interface EquipmentPanelUiBinder extends UiBinder<Div, EquipmentPanel> { }
    private static EquipmentPanelUiBinder uiBinder = GWT.create(EquipmentPanelUiBinder.class);

    @UiField
    CellTable armorTable;

    List<Armor> armorList;
    List<Weapon> weaponList;

    public EquipmentPanel() {
        initWidget(uiBinder.createAndBindUi(this));

        initItems();
    }

    private void initItems() {
        initArmor();
        initWeapons();
    }

    private void initArmor() {
        armorList = Arrays.asList(
                new Armor("Padded", Armor.ArmorSize.LIGHT, 5,"gp", 11, false, 999, false, 0, true, 8),
                new Armor("Leather", Armor.ArmorSize.LIGHT, 10,"gp", 11, false, 199, false, 0, false, 10),
                new Armor("Studded Leather", Armor.ArmorSize.LIGHT, 45,"gp", 12, false, 199, false, 0, false, 13),
                new Armor("Hide", Armor.ArmorSize.MEDIUM, 10,"gp", 12, true, 2, false, 0, false, 20),
                new Armor("Chain Shirt", Armor.ArmorSize.MEDIUM, 50,"gp", 13, true, 2, false, 0, false, 20),
                new Armor("Scale Mail", Armor.ArmorSize.MEDIUM, 50,"gp", 13, true, 2, false, 0, true, 45),
                new Armor("Breast Plate", Armor.ArmorSize.MEDIUM, 400,"gp", 13, true, 2, false, 0, false, 20),
                new Armor("Half Plate", Armor.ArmorSize.MEDIUM, 750,"gp", 15, true, 2, false, 0, true, 40),
                new Armor("Ring Mail", Armor.ArmorSize.HEAVY, 30,"gp", 14, true, 0, false, 0, true, 40),
                new Armor("Chain Mail", Armor.ArmorSize.HEAVY, 75,"gp", 16, true, 0, true, 13, true, 55),
                new Armor("Splint", Armor.ArmorSize.HEAVY, 200,"gp", 17, true, 0, true, 15, true, 60),
                new Armor("Plate", Armor.ArmorSize.HEAVY, 1500,"gp", 18, true, 0, true, 15, true, 65),
                new Armor("Shield", Armor.ArmorSize.SHIELD, 10,"gp", 2, false, 999, false, 0, false, 6)
        );
    }

    private void initWeapons() {
        weaponList = Arrays.asList(
                new Weapon("Club", Weapon.Type.SIMPLE, Weapon.Range.MELEE, 1, "sp", "1d4 Bludgeoning", 2, "Light"),
                new Weapon("Dager", Weapon.Type.SIMPLE, Weapon.Range.MELEE, 2, "gp", "1d4 Piercing", 2, "Light"),
                new Weapon("Greatclub", Weapon.Type.SIMPLE, Weapon.Range.MELEE, 2, "sp", "1d4 Piercing", 2, "Light")
        );
    }

}
