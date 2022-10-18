package br.com.maromo.livraria.controller;

import br.com.maromo.livraria.model.Cliente;
import br.com.maromo.livraria.repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.GONE)
    public void delete(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.GONE)
    public Cliente atualizar(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
