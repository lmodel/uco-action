package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An action frequency facet is a grouping of characteristics unique to the frequency of occurrence for an action."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ActionFrequencyFacet extends Facet {

  private BigDecimal rate;
  private String scale;
  private String units;
  private String trend;

}