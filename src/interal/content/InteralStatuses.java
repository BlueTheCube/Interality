package interal.content;

import mindustry.type.*;
import mindustry.content.*;

public class InteralStatuses {
	public static StatusEffect speedie;

	public void load() {
		speedie = new StatusEffect("speedie") {{
			speedMultiplier = 2.5f;
            reloadMultiplier = 1.5f;
            healthMultiplier = 0.9f;
		}};
	}
}