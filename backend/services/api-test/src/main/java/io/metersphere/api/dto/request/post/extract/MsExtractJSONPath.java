package io.metersphere.api.dto.request.post.extract;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class MsExtractJSONPath extends MsExtractCommon {
    public MsExtractJSONPath() {
        setType(MsExtractType.JSON_PATH);
    }
}