package Lesson31.Test2;

import java.io.IOException;

public interface ReadFileInterface {

    void setFileName(String fullFileName) throws IOException;

    String getFileContent();

    void join() throws InterruptedException;

    void start();
}
