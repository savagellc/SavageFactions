package com.massivecraft.factions.addon.upgradeaddon;

import com.massivecraft.factions.SavageFactions;
import com.massivecraft.factions.addon.FactionsAddon;

import java.util.Set;

public abstract class FactionsUpgradeAddon extends FactionsAddon {

    public FactionsUpgradeAddon(SavageFactions plugin) {
        super(plugin);
    }

    public void loadUpgrades(){

        /*
        for (Upgrade upgrade : upgradesToLoad()) {
            plugin.getUpgradeManager().addUpgrade().(upgrade);
        }
         */

    }

    /**
     * Method to define upgrades you want to load.
     * @return Set of upgrades you want to load.
     */
    public abstract Set<Upgrade> upgradesToLoad();
}
