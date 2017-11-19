package mc.structgen.dungeon.rooms;

import mc.structgen.dungeon.map.DungeonMap;
import mc.structspawn.manager.StructSpawn;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
//TODO: add doors when generating
public class SimpleRoom extends DungeonRoom {
    public SimpleRoom(DungeonMap dungeonMap) {
        super(dungeonMap);
    }

    @Override
    public void draw(ChunkPos chunkPos, int y, World world) {
        StructSpawn.generateStructure(world, new BlockPos(chunkPos.getXStart(),y,chunkPos.getZStart()), "debug:bighollowring");
    }
}
