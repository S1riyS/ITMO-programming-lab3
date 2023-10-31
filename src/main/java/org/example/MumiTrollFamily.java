package org.example;

public enum MumiTrollFamily {
    MUMI("Муми-тролль"),
    MUMI_MAMA("Муми-мама"),
    MUMI_PAPA("Муми-папа");

    private final String displayName;

    MumiTrollFamily(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

