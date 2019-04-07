package com.cjburkey.storeyboi;

import com.cjburkey.storeyboi.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("WeakerAccess")
@Mod(modid = StoreyBoi.MODID, name = StoreyBoi.NAME, version = StoreyBoi.VERSION)
public class StoreyBoi {

    public static final String MODID = "storeyboi";
    public static final String NAME = "StoreyBoi";
    public static final String VERSION = "0.1.0";
    private static final String PROXY_BASE = "com.cjburkey.storeyboi.proxy.";

    public static final Logger LOG = LogManager.getLogger(MODID);

    @SidedProxy(clientSide = PROXY_BASE + "ClientProxy", serverSide = PROXY_BASE + "ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void construct(FMLConstructionEvent e) {
        proxy.construct(e);
    }

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent e) {
        proxy.preinit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent e) {
        proxy.postinit(e);
    }

}
