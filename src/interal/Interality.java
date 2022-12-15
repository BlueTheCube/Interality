package interal;

import arc.*;
import arc.util.*;
import interal.content.*;
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
        InteralPlanets.load();
    }

}
