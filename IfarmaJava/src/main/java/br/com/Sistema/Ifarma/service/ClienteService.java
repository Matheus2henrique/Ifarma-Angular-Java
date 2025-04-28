package br.com.Sistema.Ifarma.service;

import br.com.Sistema.Ifarma.model.Cliente;
import br.com.Sistema.Ifarma.repository.ClienteRopository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRopository clienteRopository ;

    public ClienteService(ClienteRopository clienteRopository) {
        this.clienteRopository = clienteRopository;
    }

    public List<Cliente> listarClientes(){
        return clienteRopository.findAll();
    }

    public Cliente salvarCliente(Cliente cliente){
        return clienteRopository.save(cliente);
    }
}
