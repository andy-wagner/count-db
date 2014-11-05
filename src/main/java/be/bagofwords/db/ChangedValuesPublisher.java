package be.bagofwords.db;

public interface ChangedValuesPublisher {

    public void registerListener(ChangedValuesListener listener);

    void deregisterListener(ChangedValuesListener listener);
}
