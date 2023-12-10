package com.devsuperior.ecommerce.DTO;

import jakarta.persistence.OneToMany;
import org.springframework.stereotype.Component;

@Component
public class ClientDTO {

    private Long idDto;
    private String nameDto;
    private String emailDto;
    private String phoneDto;

    public ClientDTO(){

    }

    public ClientDTO(Long idDto, String nameDto, String emailDto, String phoneDto) {
        this.idDto = idDto;
        this.nameDto = nameDto;
        this.emailDto = emailDto;
        this.phoneDto = phoneDto;
    }

    public Long getIdDto() {
        return idDto;
    }

    public void setIdDto(Long idDto) {
        this.idDto = idDto;
    }

    public String getNameDto() {
        return nameDto;
    }

    public void setNameDto(String nameDto) {
        this.nameDto = nameDto;
    }

    public String getEmailDto() {
        return emailDto;
    }

    public void setEmailDto(String emailDto) {
        this.emailDto = emailDto;
    }

    public String getPhoneDto() {
        return phoneDto;
    }

    public void setPhoneDto(String phoneDto) {
        this.phoneDto = phoneDto;
    }
}
