package hello.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Objects;


@ApiModel(description = "")
public class Robot {

    private Robot ninja = null;

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("ninja")
    public Robot getNinja() {
        return ninja;
    }

    public void setNinja(Robot active) {
        this.ninja = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Robot entity = (Robot) o;
        return Objects.equals(ninja, entity.ninja);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(ninja);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).toString();
    }
}
