package main.java.com.demo;

public class Study {
    private final StudyStatus status = StudyStatus.DRAFT;
    private final int limit;

    public Study(int limit) {
        if (limit < 0 ) {
            throw new IllegalStateException("limit 은 0 보다 커야 한다.");
        }

        this.limit = limit;
    }

    public StudyStatus getStatus() {
        return this.status;
    }

    public int getLimit() {
        return limit;
    }
}
