package payroll.data.mapper;


import org.graalvm.compiler.lir.CompositeValue;
import payroll.data.dto.PersonDto;
import org.springframework.stereotype.Component;

@Component
public interface PersonMapper {
    PersonDto toDto();
}
