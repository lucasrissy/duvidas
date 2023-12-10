package com.devsuperior.ecommerce.DTO.Mapper;

import com.devsuperior.ecommerce.DTO.ClientDTO;
import com.devsuperior.ecommerce.Entities.Client;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper extends ModelMapper {


        public ClientDTO convertToDTO(Client client){
            return map(client,ClientDTO.class);
        }

        public Client convertToEntity(ClientDTO clientDTO){
            return map(clientDTO,Client.class);
        }
}


