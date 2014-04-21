package com.wandrell.tabletop.rpg.pendragon.util;

public class DefaultTextValue implements TextValue {

    private final String key;
    private final String value;

    public DefaultTextValue(final String key, final String value) {
	super();
	this.key = key;
	this.value = value;
    }

    @Override
    public String getKey() {
	return key;
    }

    @Override
    public String getValue() {
	return value;
    }

}
