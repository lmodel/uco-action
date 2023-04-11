package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An action lifecycle is an action pattern consisting of an ordered set of multiple actions or subordinate action lifecycles."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ActionLifecycle extends Action {

  private ArrayOfAction phase;

}