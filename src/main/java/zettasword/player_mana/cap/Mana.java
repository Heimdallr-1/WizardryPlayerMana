package zettasword.player_mana.cap;

import net.minecraft.entity.player.EntityPlayer;

import javax.annotation.Nullable;

public class Mana {

    @Nullable
    public static ISoul getSoul(EntityPlayer player){
        return player.getCapability(SoulProvider.SOUL_CAP, null);
    }
}
