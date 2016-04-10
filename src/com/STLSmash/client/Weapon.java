package com.STLSmash.client;

/**
 * Created by GENJIJODU on 4/10/2016.
 */
public class Weapon implements Item {

    public enum Type {
        SIMPLE, MARTIAL
    }

    public enum Range {
        MELEE, RANGED
    }

    public enum DmgType {
        BLUDGEONING, PIERCING, SLASHING
    }

    private String name;
    private Type type;
    private Range range;
    private int cost;
    private String costUnit;
    private String damage;
    private int weight;
    private String properties;

    public Weapon(String name,
                  Type type,
                  Range range,
                  int cost,
                  String costUnit,
                  String damage,
                  int weight,
                  String properties) {
        this.name = name;
        this.type = type;
        this.range = range;
        this.cost = cost;
        this.costUnit = costUnit;
        this.damage = damage;
        this.weight = weight;
        this.properties = properties;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setCostUnit(String costUnit) {
        this.costUnit = costUnit;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Range getRange() {
        return range;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public String getCostUnit() {
        return costUnit;
    }

    public String getDamage() {
        return damage;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public String getProperties() {
        return properties;
    }
}
