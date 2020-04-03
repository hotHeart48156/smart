package framework.oss;

import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

public class AliyunStorageService extends StorageService {

    @Override
    public String upload(MultipartFile file) throws Exception {
        return null;
    }

    @Override
    public String upload(byte[] data, String path) {
        return null;
    }

    @Override
    public String upload(InputStream inputStream, String path) {
        return null;
    }
}
