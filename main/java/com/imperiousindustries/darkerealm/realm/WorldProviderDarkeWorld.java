package com.imperiousindustries.darkerealm.realm;

import com.imperiousindustries.darkerealm.DarkeRealm;
import com.imperiousindustries.darkerealm.realm.biomes.BiomeDarkeForest;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderGenerate;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WorldProviderDarkeWorld extends WorldProvider{

	@Override
	public String getDimensionName() {
		return "The Darke Realm";
	}

	 /**
     * creates a new world chunk manager for WorldProvider
     */
    public void registerWorldChunkManager()
    {
        this.worldChunkMgr = new WorldChunkManagerHell(new BiomeDarkeForest(), 1.0F);
        this.dimensionId = DarkeRealm.DarkeDimID;
    }

    /**
     * Returns a new chunk provider which generates chunks for this world
     */
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderDarkeWorld(this.worldObj, this.worldObj.getSeed(), true);
    }

    /**
     * Returns array with sunrise/sunset colors
     */
    @SideOnly(Side.CLIENT)
    public float[] calcSunriseSunsetColors(float par1, float par2)
    {
        return null;
    }

    @SideOnly(Side.CLIENT)
    public boolean isSkyColored()
    {
        return true;
    }

    /**
     * True if the player can respawn in this dimension (true = overworld, false = nether).
     */
    public boolean canRespawnHere()
    {
        return true;
    }

    /**
     * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
     */
    public boolean isSurfaceWorld()
    {
        return true;
    }
}
