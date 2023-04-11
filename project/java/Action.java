package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An action is something that may be done or performed."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Action extends UcoObject {

  private List<Action> subaction;
  private UcoObject environment;
  private UcoObject performer;
  private List<UcoObject> error;
  private List<UcoObject> instrument;
  private List<UcoObject> object;
  private List<UcoObject> participant;
  private List<UcoObject> result;
  private List<Location> location;
  private String endTime;
  private String startTime;
  private String actionCount;
  private String actionStatus;

}