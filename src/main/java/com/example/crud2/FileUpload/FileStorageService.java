package com.example.crud2.FileUpload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileStorageService {

    @Value("${file.upload-dir}")
    private String uploadDir;

    @Autowired
    public FileStorageService() {
    }

    public void uploadFile(String fileName, MultipartFile file) throws IOException {
        Path filePath = Paths.get(uploadDir, fileName);
        File destFile = filePath.toFile();

        if (!destFile.exists()) {
            destFile.getParentFile().mkdirs();
        }

        file.transferTo(destFile);
    }
}
