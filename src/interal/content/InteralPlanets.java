package interal.content;

import arc.graphics.*;
import arc.util.*;
import mindustry.content.*;
import mindustry.graphics.g3d.*;
import mindustry.type.*;
import mindustry.maps.planet.*;
import mindustry.game.*;

public class InteralPlanets{
    public static Planet
    feistade, intra;

    public static void load(){
        feistade = new Planet("feistade", Planets.sun, 4f, 6){{
            bloom = true;
            accessible = false;
            orbitRadius = 350f;

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
        intra = new Planet("intra", feistade, 1f, 2){{
            generator = new SerpuloPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 6);
            cloudMeshLoader = () -> new MultiMesh(
                new HexSkyMesh(this, 11, 0.15f, 0.13f, 5, Color.valueOf("8ae4ff");.a(0.75f), 2, 0.45f, 0.9f, 0.38f)
            );

            launchCapacityMultiplier = 1f;
            sectorSeed = 7;
            allowWaves = true;
            allowWaveSimulation = true;
            allowSectorInvasion = true;
            allowLaunchSchematics = true;
            enemyCoreSpawnReplace = true;
            allowLaunchLoadout = true;
            prebuildBase = false;
            ruleSetter = r -> {
                r.waveTeam = Team.blue;
                r.placeRangeCheck = false;
                r.showSpawns = true;
            };
            iconColor = Color.valueOf("3789c4");
            atmosphereColor = Color.valueOf("8ae4ff");
            atmosphereRadIn = 0.02f;
            atmosphereRadOut = 0.3f;
            startSector = 7;
            alwaysUnlocked = true;
            landCloudColor = Color.valueOf("8ae4ff");
        }};
    }
}