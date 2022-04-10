package client.web.web;

import client.api.model.CustomerResponseDto;
import client.api.servie.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    ClientService service;

    @GetMapping("/clients/{id}")
    public CustomerResponseDto obtenirClientParId(@PathVariable(value = "id") String id) {
        return service.findCustomerById(id);
    }
}
