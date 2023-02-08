package br.com.softpethouse.api.account.mapper;

import br.com.softpethouse.api.account.dto.TypeAccountDto;
import br.com.softpethouse.api.account.dto.TypeAccountDtoOut;
import br.com.softpethouse.api.account.entity.TypeAccountEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface TypeAccountMapper {

    List<TypeAccountDtoOut> toDtoList(List<TypeAccountEntity> entities);

    TypeAccountDtoOut toDto(TypeAccountEntity entity);

    @InheritInverseConfiguration(name = "toDto")
    TypeAccountEntity toEntity(TypeAccountDto dto);

    void updateEntityFromDto(TypeAccountDto dto, @MappingTarget TypeAccountEntity entity);

    void updateDtoFromEntity(TypeAccountEntity entity, @MappingTarget TypeAccountDtoOut dto);

}
