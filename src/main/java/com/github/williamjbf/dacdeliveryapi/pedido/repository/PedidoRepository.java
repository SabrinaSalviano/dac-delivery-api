package com.github.williamjbf.dacdeliveryapi.pedido.repository;

import com.github.williamjbf.dacdeliveryapi.pedido.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
