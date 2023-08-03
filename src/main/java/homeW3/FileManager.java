package homeW3;

import java.io.*;

public class FileManager {
    public String readFile(String filePath) throws IOException {
        BufferedReader reader = null;
        StringBuilder content = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Файл не найден.");
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return content.toString();
    }

    public void writeFile(String filePath, String content) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(content);
        } catch (IOException e) {
            throw new IOException("Ошибка при записи файла.");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    public void copyFile(String sourceFilePath, String destinationFilePath) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(sourceFilePath);
            outputStream = new FileOutputStream(destinationFilePath);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } catch (IOException e) {
            throw new IOException("Ошибка при копировании файла.");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
