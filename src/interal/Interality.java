package interal;

import arc.*;
import arc.util.*;
import literality.content.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;

public class Interality extends Mod{

    public Interality(){
    
    }

    @Override
    public void loadContent(){
        Log.info("Loading literal content.");
        InteralPlanets.load();
    }

}
