package hello.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@ApiModel(description = "")
public class Monkey {

    private Pirate pirate = null;

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("pirate")
    public Pirate getPirate() {
        return pirate;
    }

    public void setPirate(Pirate active) {
        this.pirate = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Monkey m = (Monkey) o;
        return Objects.equals(pirate, m.pirate);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(pirate);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).toString();
    }
}
