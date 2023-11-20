package ra.academy.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

@Configuration
public class StorageConfig {
    private final String uploadFirebaseConfigPath = "K:\\Java\\springcontroller\\src\\main\\resources\\upload-firebase-injava-firebase-adminsdk-iw96c-7e58ec5e73.json";

    @Bean
    public Storage storage() throws IOException {
        InputStream inputStream = Files.newInputStream(Paths.get(uploadFirebaseConfigPath));
        return StorageOptions.newBuilder()
                .setCredentials(GoogleCredentials.fromStream(inputStream))
                .build()
                .getService();
    }
}
