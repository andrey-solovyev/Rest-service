package payroll.data.mapper;

import java.util.List;

public interface ObjectMapper<input,output> {
    output convert(input obj);
    List<output> convertList(List<input> objList);

}
