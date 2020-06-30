package _1_decorator._99_exercice;


public class Demo {
    public static void main(String[] args) {
        // exemple de données à sauvegarder encrypter et compressé
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        FileDataSource fileDataSource = new FileDataSource("OutputDemo.txt");

        EncryptorDecorator encryptorDecorator = new EncryptorDecorator();
        CompressorDecorator compressorDecorator = new CompressorDecorator();
        String encrypted = encryptorDecorator.encode(salaryRecords);
        String encryptedAndCompressed = compressorDecorator.compress(encrypted);
        fileDataSource.writeData(encryptedAndCompressed);

        //TODO refactoriser en utilisant le pattern decorator

        String readDataWithDecorator = fileDataSource.readData();

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(readDataWithDecorator);
        System.out.println("- Decoded --------------");
        System.out.println(encryptorDecorator.decode(compressorDecorator.decompress(readDataWithDecorator)));
    }
}