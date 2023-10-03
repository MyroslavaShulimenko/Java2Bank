package com.example.bankproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Value
@Builder
@Data
@AllArgsConstructor
public class ClientDto {
    String id;

    String status;

    String taxСode;

    String firstName;

    String lastName;

    String email;

    String address;

    String phone;

    //  String createdAt;

}
//@Component
//@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.CONSTRUCTOR,
//        imports = {LocalDate.class})
//public interface ClientMapper {
//    @Mapping(target = "createdAt", expression = "java(new LocalDate(System.currentTimeMillis()))")
//    @Mapping(target = "status", source = "status", qualifiedByName = "ToUpperCase")
//    Client mapToEntity(ClientDto clientDto);
//    @Named("ToUpperCase")
//    default StatusState statusToUpperCase(String status) {
//        return StatusState.valueOf(status.toUpperCase());
//    }
//    @IterableMapping(qualifiedByName = "mapClientToDto")
//    List<ClientDto> mapToListDto(List<Client> clients);
//    @Named("mapClientToDto")
//    ClientDto mapToDto(Client save);