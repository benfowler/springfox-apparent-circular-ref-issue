package hello.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Objects;


@ApiModel(description = "")
public class Pirate {

    private Monkey monkey = null;

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("monkey")
    public Monkey getMonkey() {
        return monkey;
    }

    public void setMonkey(Monkey monkey) {
        this.monkey = monkey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pirate entity = (Pirate) o;
        return Objects.equals(monkey, entity.monkey);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(monkey);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).toString();
    }
}
