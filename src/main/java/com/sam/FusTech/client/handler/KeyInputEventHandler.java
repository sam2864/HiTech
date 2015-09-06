package com.sam.FusTech.client.handler;

import com.sam.FusTech.client.settings.Keybindings;
import com.sam.FusTech.reference.Key;
import com.sam.FusTech.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;



public class KeyInputEventHandler
{
    private static Key getPressedKeybinding()
    {
        if (Keybindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        else if (Keybindings.release.isPressed())
        {
            return Key.RELEASE;
        }

        return Key.UNKNOWN; // This returns Unknown no matter what. why?!   TODO Fix key handler
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeybinding());
    }
}