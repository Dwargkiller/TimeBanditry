
package dwargkiller.timebanditry;

import static dwargkiller.timebanditry.TimeBanditry.MODID;
import static dwargkiller.timebanditry.TimeBanditry.MOD_NAME;
import static dwargkiller.timebanditry.TimeBanditry.VERSION;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MODID, name = MOD_NAME, version = VERSION)
public class TimeBanditry {

  public static final String MODID = "TimeBanditry";

  public static final String MOD_NAME = "Time Banditry";

  public static final String VERSION = "1.7.10-A1";

  @Instance(MODID)
  public static TimeBanditry instance;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
  }

  @EventHandler
  public void init(FMLInitializationEvent event) {
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent event) {
  }
}
