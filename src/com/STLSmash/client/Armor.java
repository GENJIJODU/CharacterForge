package com.STLSmash.client;

/**
 * Created by GENJIJODU on 4/9/2016.
 */
public class Armor implements Item {

    public enum ArmorSize {
        LIGHT, MEDIUM, HEAVY, SHIELD
    }


    private String name;
    private ArmorSize size;
    private int cost;
    private String costUnit;
    private int armorClass;
    private boolean hasMaxDexMod;
    private int maxDexMod = 100;
    private boolean hasStrReq;
    private int strReq = 0;
    private boolean hasStealthDisadv;
    private int weight;

    @Override
    public String getCostUnit() {
        return costUnit;
    }

    public void setCostUnit(String costUnit) {
        this.costUnit = costUnit;
    }

    public Armor(String name,
                 ArmorSize size,
                 int cost,
                 String costUnit,
                 int armorClass,
                 boolean hasMaxDexMod,
                 int maxDexMod,
                 boolean hasStrReq,
                 int strReq,
                 boolean hasStealthDisadv,
                 int weight) {
        this.name = name;
        this.size = size;
        this.cost = cost;
        this.costUnit = costUnit;
        this.armorClass = armorClass;
        this.hasMaxDexMod = hasMaxDexMod;
        this.maxDexMod = maxDexMod;
        this.hasStrReq = hasStrReq;
        this.strReq = strReq;
        this.hasStealthDisadv = hasStealthDisadv;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(ArmorSize size) {
        this.size = size;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public void setHasMaxDexMod(boolean hasMaxDexMod) {
        this.hasMaxDexMod = hasMaxDexMod;
    }

    public void setMaxDexMod(int maxDexMod) {
        this.maxDexMod = maxDexMod;
    }

    public void setHasStrReq(boolean hasStrReq) {
        this.hasStrReq = hasStrReq;
    }

    public void setStrReq(int strReq) {
        this.strReq = strReq;
    }

    public void setHasStealthDisadv(boolean hasStealthDisadv) {
        this.hasStealthDisadv = hasStealthDisadv;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ArmorSize getSize() {
        return size;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public boolean isHasMaxDexMod() {
        return hasMaxDexMod;
    }

    public int getMaxDexMod() {
        return maxDexMod;
    }

    public boolean isHasStrReq() {
        return hasStrReq;
    }

    public int getStrReq() {
        return strReq;
    }

    public boolean isHasStealthDisadv() {
        return hasStealthDisadv;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
