package net.vitacraft.discord2fa_fabric;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.vitacraft.discord2fa.CommonClass;

public class Discord2FA implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        CommonClass cc = new CommonClass("fabric");
        cc.testMethod();
    }
}
