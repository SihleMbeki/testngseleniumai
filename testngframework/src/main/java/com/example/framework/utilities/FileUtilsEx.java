package com.example.framework.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class FileUtilsEx {
    private FileUtilsEx() {
    }

    public static String readFile(String path) throws IOException {
        return Files.readString(Path.of(path));
    }
}
