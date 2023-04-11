package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An array of action is an ordered list of references to things that may be done or performed."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ArrayOfAction extends UcoInherentCharacterizationThing {

  private Action action;

}