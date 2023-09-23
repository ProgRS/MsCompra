package github.luis.compra.controller;

import github.luis.compra.model.Pedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @PostMapping
    public ResponseEntity<Pedido> salvar (@RequestBody Pedido pedido){
        return  ResponseEntity.ok(pedido);
    }
}
