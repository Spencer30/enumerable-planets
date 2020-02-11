package org.launchcode.enumerableplanets.data;

public enum Planets {
    MERCURY("Mercury", 88, 0),
    VENUS("Venus", 225, 0),
    EARTH("Earth", 365, 1),
    MARS("Mars", 687, 2),
    JUPITER("Jupiter", 4333, 79),
    SATURN("Saturn", 10759, 82),
    URANUS("Uranus", 30687, 27),
    NEPTUNE("Neptune", 60200, 14);

    private final String displayName;
    private final int yearLength;
    private final int numOfMoons;

    Planets(String displayName, int yearLength, int numOfMoons){
        this.displayName = displayName;
        this.yearLength = yearLength;
        this.numOfMoons = numOfMoons;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getYearLength() {
        return yearLength;
    }

    public int getNumOfMoons() {
        return numOfMoons;
    }
}
