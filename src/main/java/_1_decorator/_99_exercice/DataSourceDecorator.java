package _1_decorator._99_exercice;

public class DataSourceDecorator implements DataSource {

    protected DataSource dataDecorator;


    @Override
    public void writeData(String data) {
        dataDecorator.writeData(data);
    }

    public DataSourceDecorator (DataSource dataSource) {
        this.dataDecorator = dataSource;
    }

    @Override
    public String readData() {
        return dataDecorator.readData();
    }
}
