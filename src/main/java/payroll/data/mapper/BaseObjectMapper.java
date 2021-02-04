package payroll.data.mapper;

import java.util.List;

public class BaseObjectMapper<input, output> implements ObjectMapper<input, output> {
    @Override
    public List<output> convertList(List<input> objList) {
        return null;
    }
}
