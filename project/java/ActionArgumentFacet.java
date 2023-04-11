package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An action argument facet is a grouping of characteristics unique to a single parameter of an action."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ActionArgumentFacet extends Facet {

  private String argumentName;
  private String value;

}