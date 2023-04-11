package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An action estimation facet is a grouping of characteristics unique to decision-focused approximation aspects for an action that may potentially be performed."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ActionEstimationFacet extends Facet {

  private String estimatedCost;
  private String estimatedEfficacy;
  private String estimatedImpact;
  private String objective;

}