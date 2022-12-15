package literality.content;

import arc.graphics.*;
import arc.util.*;
import mindustry.content.*;
import mindustry.graphics.g3d.*;
import mindustry.type.*;

public class LiteralPlanets{
    public static Planet
    feistade;

    public static void load(){
        feistade = new Planet("feistade", Planets.sun, 4f, 6){{
            bloom = true;
            accessible = false;
            orbitRadius = 200f;

            meshLoader = () -> new SunMesh(
                this, 4,
                5, 0.3, 1.7, 1.2, 1,
                1.1f,
                Color.valueOf("d9f7ff"),
                Color.valueOf("ccefff"),
                Color.valueOf("bfebff"),
                Color.valueOf("aee4fc"),
                Color.valueOf("a2dbfc"),
                Color.valueOf("99daff")
            );
        }};
    }
}