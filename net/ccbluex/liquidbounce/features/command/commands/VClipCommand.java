//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "mcp_stable-22-1.8.9"!

package net.ccbluex.liquidbounce.features.command.commands;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.ccbluex.liquidbounce.features.command.Command;
import net.ccbluex.liquidbounce.utils.MinecraftInstance;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"},
   d2 = {"Lnet/ccbluex/liquidbounce/features/command/commands/VClipCommand;", "Lnet/ccbluex/liquidbounce/features/command/Command;", "()V", "execute", "", "args", "", "", "([Ljava/lang/String;)V", "LiquidSense"}
)
public final class VClipCommand extends Command {
   public VClipCommand() {
      Exception lllllllllllllllllllIllllllIllIll = "vclip";
      Exception lllllllllllllllllllIllllllIllIlI = new String[0];
      super(lllllllllllllllllllIllllllIllIll, lllllllllllllllllllIllllllIllIlI);
   }

   public void execute(@NotNull String[] lllllllllllllllllllIlllllllIlIII) {
      Intrinsics.checkParameterIsNotNull(lllllllllllllllllllIlllllllIlIII, "args");
      if (lllllllllllllllllllIlllllllIlIII.length > 1) {
         try {
            boolean lllllllllllllllllllIlllllllIIlII = lllllllllllllllllllIlllllllIlIII[1];
            char lllllllllllllllllllIlllllllIIIll = false;
            byte lllllllllllllllllllIlllllllIIlIl = Double.parseDouble(lllllllllllllllllllIlllllllIIlII);
            EntityPlayerSP var10000 = access$getMc$p$s1046033730().thePlayer;
            Intrinsics.checkExpressionValueIsNotNull(var10000, "mc.thePlayer");
            Entity lllllllllllllllllllIlllllllIllII = var10000.isRiding() ? access$getMc$p$s1046033730().thePlayer.ridingEntity : (Entity)access$getMc$p$s1046033730().thePlayer;
            lllllllllllllllllllIlllllllIllII.setPosition(lllllllllllllllllllIlllllllIllII.posX, lllllllllllllllllllIlllllllIllII.posY + lllllllllllllllllllIlllllllIIlIl, lllllllllllllllllllIlllllllIllII.posZ);
            lllllllllllllllllllIlllllllIlIIl.chat("You were teleported.");
         } catch (NumberFormatException var6) {
            lllllllllllllllllllIlllllllIlIIl.chatSyntaxError();
         }

      } else {
         lllllllllllllllllllIlllllllIlIIl.chatSyntax("vclip <value>");
      }
   }

   // $FF: synthetic method
   public static final Minecraft access$getMc$p$s1046033730() {
      return MinecraftInstance.mc;
   }
}
