package main.java.com.demo;

public enum StudyStatus {
    DRAFT("드래프트"),
    STARTED("수타투"),
    ENDED("엔도");

    private final String value;

    StudyStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
