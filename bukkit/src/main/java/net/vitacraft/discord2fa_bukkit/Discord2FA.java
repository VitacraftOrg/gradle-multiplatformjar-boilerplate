package net.vitacraft.discord2fa_bukkit;

import net.vitacraft.discord2fa.*;
import org.bukkit.plugin.java.JavaPlugin;

public class Discord2FA extends JavaPlugin  {

    @Override
    public void onEnable() {
        CommonClass cc = new CommonClass("bukkit");
        cc.testMethod();
    }

    @Override
    public void onDisable() {

    }

}
