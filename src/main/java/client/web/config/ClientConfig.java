package client.web.config;

import client.api.feign.CustomerControllerApiClient;
import client.api.servie.ClientService;
import client.api.servie.ClientServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {
    @Bean
    ClientService getClientService(CustomerControllerApiClient apiClient) {
        return new ClientServiceImpl(apiClient);
    }
}
